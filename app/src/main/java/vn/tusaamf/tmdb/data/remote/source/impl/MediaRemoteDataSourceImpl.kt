package vn.tusaamf.tmdb.data.remote.source.impl

import retrofit2.Response
import vn.tusaamf.tmdb.data.model.MovieEntity
import vn.tusaamf.tmdb.data.model.TVEntity
import vn.tusaamf.tmdb.data.model.response.MovieListResponse
import vn.tusaamf.tmdb.data.model.response.TVListResponse
import vn.tusaamf.tmdb.data.remote.api.MediaService
import vn.tusaamf.tmdb.data.remote.source.MediaRemoteDataSource
import javax.inject.Inject

class MediaRemoteDataSourceImpl @Inject constructor(
    private val mediaService: MediaService,
) : BaseRemoteDataSource(), MediaRemoteDataSource {
    override suspend fun movieNowPlaying(page: Int): Response<MovieListResponse> =
        mediaService.movieNowPlaying(page = page)

    override suspend fun moviePopular(page: Int): Response<MovieListResponse> =
        mediaService.moviePopular(page = page)

    override suspend fun movieDetails(movieId: Int): Response<MovieEntity> =
        mediaService.movieDetails(movieId = movieId)

    override suspend fun tvAiringToday(page: Int): Response<TVListResponse> =
        mediaService.tvAiringToday(page = page)

    override suspend fun tvPopular(page: Int): Response<TVListResponse> =
        mediaService.tvPopular(page = page)

    override suspend fun tvDetails(tvId: Int): Response<TVEntity> =
        mediaService.tvDetails(tvId = tvId)
}