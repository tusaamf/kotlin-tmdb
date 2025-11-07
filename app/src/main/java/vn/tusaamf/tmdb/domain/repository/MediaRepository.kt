package vn.tusaamf.tmdb.domain.repository

import retrofit2.Response
import vn.tusaamf.tmdb.data.model.MovieEntity
import vn.tusaamf.tmdb.data.model.TVEntity
import vn.tusaamf.tmdb.data.model.response.MovieListResponse
import vn.tusaamf.tmdb.data.model.response.TVListResponse

interface MediaRepository {
    suspend fun movieNowPlaying(page: Int): Response<MovieListResponse>
    suspend fun moviePopular(page: Int): Response<MovieListResponse>
    suspend fun movieDetails(movieId: Int): Response<MovieEntity>
    suspend fun tvAiringToday(page: Int): Response<TVListResponse>
    suspend fun tvPopular(page: Int): Response<TVListResponse>
    suspend fun tvDetails(tvId: Int): Response<TVEntity>
}