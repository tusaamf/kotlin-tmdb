package vn.tusaamf.tmdb.data.model.dto.extension

import vn.tusaamf.tmdb.data.model.*
import vn.tusaamf.tmdb.data.model.dto.*

fun MovieEntity.toMovieDTO() = MovieDTO(
    title = title,
    originalTitle = originalTitle,
    isFavorite = false
)

fun List<MovieEntity>.toMovieDTOList() = map { it.toMovieDTO() }

fun TVEntity.toTvDTO() = TvDTO(
    name = name,
    originalName = originalName,
    isFavorite = false
)

fun List<TVEntity>.toTvDTOList() = map { it.toTvDTO() }