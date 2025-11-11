package vn.tusaamf.tmdb.domain.usecase.tv

import androidx.paging.PagingSource
import androidx.paging.PagingState
import vn.tusaamf.tmdb.data.model.dto.TvDTO
import vn.tusaamf.tmdb.data.model.dto.extension.toTvDTOList
import vn.tusaamf.tmdb.domain.repository.MediaRepository
import java.io.IOException

class TVAiringTodayPagingSource(
    internal val repository: MediaRepository
) : PagingSource<Int, TvDTO>() {
    override fun getRefreshKey(state: PagingState<Int, TvDTO>): Int? {
        return state.anchorPosition?.let { anchorPositon ->
            val anchorPage = state.closestPageToPosition(anchorPosition = anchorPositon)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, TvDTO> {
        val page = params.key ?: 1
        return try {
            val response = repository.tvAiringToday(page = page)

            val tvSeriesList = if (response.isSuccessful) {
                response.body()?.results.orEmpty().toTvDTOList()
            } else {
                emptyList()
            }

            LoadResult.Page(
                data = tvSeriesList,
                prevKey = if (page == 1) null else page - 1,
                nextKey = if (tvSeriesList.isEmpty()) null else page + 1
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        }
    }
}