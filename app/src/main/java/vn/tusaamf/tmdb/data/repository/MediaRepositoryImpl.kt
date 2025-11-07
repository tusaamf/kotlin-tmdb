package vn.tusaamf.tmdb.data.repository

import retrofit2.Response
import vn.tusaamf.tmdb.data.model.MovieEntity
import vn.tusaamf.tmdb.data.model.TVEntity
import vn.tusaamf.tmdb.data.model.response.MovieListResponse
import vn.tusaamf.tmdb.data.model.response.TVListResponse
import vn.tusaamf.tmdb.data.remote.source.MediaRemoteDataSource
import vn.tusaamf.tmdb.domain.repository.MediaRepository
import javax.inject.Inject

class MediaRepositoryImpl @Inject constructor(
    private val mediaRemoteDataSource: MediaRemoteDataSource,
) : MediaRepository {
    override suspend fun movieNowPlaying(page: Int): Response<MovieListResponse> =
        mediaRemoteDataSource.movieNowPlaying(page = page)

    override suspend fun moviePopular(page: Int): Response<MovieListResponse> =
        mediaRemoteDataSource.moviePopular(page = page)

    override suspend fun movieDetails(movieId: Int): Response<MovieEntity> =
        mediaRemoteDataSource.movieDetails(movieId = movieId)

    override suspend fun tvAiringToday(page: Int): Response<TVListResponse> =
        mediaRemoteDataSource.tvAiringToday(page = page)

    override suspend fun tvPopular(page: Int): Response<TVListResponse> =
        mediaRemoteDataSource.tvPopular(page = page)

    override suspend fun tvDetails(tvId: Int): Response<TVEntity> =
        mediaRemoteDataSource.tvDetails(tvId = tvId)
}