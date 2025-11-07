package vn.tusaamf.tmdb.data.remote.utils

object Endpoints {
    const val PATH_PERSON_ID = "person_id"
    const val PATH_MOVIE_ID = "movie_id"
    const val PATH_TV_ID = "tv_id"
    const val PARAM_PAGE = "page"
    const val PARAM_LANGUAGE = "language"
    const val PARAM_LANGUAGE_DEFAULT = "en-US"

    const val MOVIE_NOW_PLAYING = "/movie/now_playing"
    const val MOVIE_POPULAR = "/movie/popular"
    const val MOVIE_DETAILS = "/movie/{$PATH_MOVIE_ID}"
    const val TV_AIRING_TODAY = "/tv/airing_today"
    const val TV_POPULAR = "/tv/popular"
    const val TV_DETAILS = "/tv/{$PATH_TV_ID}"
    const val PEOPLE_POPULAR = "/person/popular"
    const val PEOPLE_DETAILS = "/person/{$PATH_PERSON_ID}"
}