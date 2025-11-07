package vn.tusaamf.tmdb.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vn.tusaamf.tmdb.domain.repository.MediaRepository
import vn.tusaamf.tmdb.domain.usecase.movie.*
import vn.tusaamf.tmdb.domain.usecase.tv.*

@Module
@InstallIn(ViewModelComponent::class)
class UseCaseModule {
    @ViewModelScoped
    @Provides
    fun provideMovieNowPlayingUseCase(mediaRepository: MediaRepository) =
        MovieNowPlayingUseCase(mediaRepository)

    @ViewModelScoped
    @Provides
    fun provideMoviePopularUseCase(mediaRepository: MediaRepository) =
        MoviePopularUseCase(mediaRepository)

    @ViewModelScoped
    @Provides
    fun provideTVAiringTodayUseCase(mediaRepository: MediaRepository) =
        TVAiringTodayUseCase(mediaRepository)

    @ViewModelScoped
    @Provides
    fun provideTVPopularUseCase(mediaRepository: MediaRepository) =
        TVPopularUseCase(mediaRepository)
}
