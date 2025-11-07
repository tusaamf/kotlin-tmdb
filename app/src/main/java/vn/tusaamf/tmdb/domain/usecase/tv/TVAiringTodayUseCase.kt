package vn.tusaamf.tmdb.domain.usecase.tv

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import vn.tusaamf.tmdb.data.model.dto.TVDto
import vn.tusaamf.tmdb.domain.base.BaseUseCase
import vn.tusaamf.tmdb.domain.base.IParams
import vn.tusaamf.tmdb.domain.repository.MediaRepository

class TVAiringTodayUseCase(
    internal val repository: MediaRepository
) : BaseUseCase<TVAiringTodayUseCase.Params, PagingData<TVDto>> {
    data class Params(
        val pagingConfig: PagingConfig
    ) : IParams

    override suspend fun invoke(param: Params): Flow<PagingData<TVDto>> {
        return Pager(
            config = param.pagingConfig,
            pagingSourceFactory = { TVAiringTodayPagingSource(repository = repository) }
        ).flow
    }
}