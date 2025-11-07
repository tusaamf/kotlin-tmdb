package vn.tusaamf.tmdb.data.remote.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import vn.tusaamf.tmdb.data.model.MovieEntity
import vn.tusaamf.tmdb.data.model.TVEntity
import vn.tusaamf.tmdb.data.model.response.MovieListResponse
import vn.tusaamf.tmdb.data.model.response.TVListResponse
import vn.tusaamf.tmdb.data.remote.utils.Endpoints

interface MediaService {
    @GET(Endpoints.MOVIE_NOW_PLAYING)
    suspend fun movieNowPlaying(
        @Query(Endpoints.PARAM_PAGE) page: Int,
        @Query(Endpoints.PARAM_LANGUAGE) language: String = Endpoints.PARAM_LANGUAGE_DEFAULT,
    ): Response<MovieListResponse>

    @GET(Endpoints.MOVIE_POPULAR)
    suspend fun moviePopular(
        @Query(Endpoints.PARAM_PAGE) page: Int,
        @Query(Endpoints.PARAM_LANGUAGE) language: String = Endpoints.PARAM_LANGUAGE_DEFAULT,
    ): Response<MovieListResponse>

    @GET(Endpoints.MOVIE_DETAILS)
    suspend fun movieDetails(
        @Path(Endpoints.PATH_MOVIE_ID) movieId: Int,
        @Query(Endpoints.PARAM_LANGUAGE) language: String = Endpoints.PARAM_LANGUAGE_DEFAULT,
    ): Response<MovieEntity>

    @GET(Endpoints.TV_AIRING_TODAY)
    suspend fun tvAiringToday(
        @Query(Endpoints.PARAM_PAGE) page: Int,
        @Query(Endpoints.PARAM_LANGUAGE) language: String = Endpoints.PARAM_LANGUAGE_DEFAULT,
    ): Response<TVListResponse>

    @GET(Endpoints.TV_POPULAR)
    suspend fun tvPopular(
        @Query(Endpoints.PARAM_PAGE) page: Int,
        @Query(Endpoints.PARAM_LANGUAGE) language: String = Endpoints.PARAM_LANGUAGE_DEFAULT,
    ): Response<TVListResponse>

    @GET(Endpoints.TV_DETAILS)
    suspend fun tvDetails(
        @Path(Endpoints.PATH_TV_ID) tvId: Int,
        @Query(Endpoints.PARAM_LANGUAGE) language: String = Endpoints.PARAM_LANGUAGE_DEFAULT,
    ): Response<TVEntity>
}