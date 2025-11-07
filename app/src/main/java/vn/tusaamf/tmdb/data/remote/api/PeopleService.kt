package vn.tusaamf.tmdb.data.remote.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import vn.tusaamf.tmdb.data.model.PeopleEntity
import vn.tusaamf.tmdb.data.model.response.PeopleListResponse
import vn.tusaamf.tmdb.data.remote.utils.Endpoints

interface PeopleService {
    @GET(Endpoints.PEOPLE_POPULAR)
    suspend fun getPopular(
        @Query(Endpoints.PARAM_PAGE) page: Int,
        @Query(Endpoints.PARAM_LANGUAGE) language: String = Endpoints.PARAM_LANGUAGE_DEFAULT,
    ): Response<PeopleListResponse>

    @GET(Endpoints.PEOPLE_DETAILS)
    suspend fun getDetails(
        @Path(Endpoints.PATH_PERSON_ID) personId: String,
        @Query(Endpoints.PARAM_LANGUAGE) language: String = Endpoints.PARAM_LANGUAGE_DEFAULT,
    ): Response<PeopleEntity>
}