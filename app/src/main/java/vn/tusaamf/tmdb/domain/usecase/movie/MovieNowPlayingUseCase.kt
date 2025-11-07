package vn.tusaamf.tmdb.domain.usecase.movie

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import vn.tusaamf.tmdb.data.model.dto.MovieDto
import vn.tusaamf.tmdb.domain.base.BaseUseCase
import vn.tusaamf.tmdb.domain.base.IParams
import vn.tusaamf.tmdb.domain.repository.MediaRepository

class MovieNowPlayingUseCase(
    internal val repository: MediaRepository
) : BaseUseCase<MovieNowPlayingUseCase.Params, PagingData<MovieDto>> {
    data class Params(
        val pagingConfig: PagingConfig
    ) : IParams

    override suspend fun invoke(param: Params): Flow<PagingData<MovieDto>> {
        return Pager(
            config = param.pagingConfig,
            pagingSourceFactory = { MovieNowPlayingPagingSource(repository = repository) }
        ).flow
    }
}