package vn.tusaamf.tmdb.domain.usecase.movie

import androidx.paging.PagingSource
import androidx.paging.PagingState
import vn.tusaamf.tmdb.data.model.dto.MovieDTO
import vn.tusaamf.tmdb.data.model.dto.extension.toMovieDTOList
import vn.tusaamf.tmdb.domain.repository.MediaRepository
import java.io.IOException

class MoviePopularPagingSource(
    internal val repository: MediaRepository
) : PagingSource<Int, MovieDTO>() {
    override fun getRefreshKey(state: PagingState<Int, MovieDTO>): Int? {
        return state.anchorPosition?.let { anchorPositon ->
            val anchorPage = state.closestPageToPosition(anchorPosition = anchorPositon)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MovieDTO> {
        val page = params.key ?: 1
        return try {
            val response = repository.moviePopular(page = page)

            val movieList = if (response.isSuccessful) {
                response.body()?.results.orEmpty().toMovieDTOList()
            } else {
                emptyList()
            }

            LoadResult.Page(
                data = movieList,
                prevKey = if (page == 1) null else page - 1,
                nextKey = if (movieList.isEmpty()) null else page + 1
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        }
    }
}