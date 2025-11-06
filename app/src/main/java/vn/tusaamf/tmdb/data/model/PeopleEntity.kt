package vn.tusaamf.tmdb.data.model

data class PeopleEntity(
    val id: Int, // id
    val name: String, // name
    val placeOfBirth: String, // place_of_birth
    val profilePath: String, // profile_path
    val gender: Int, // gender
    val birthday: String, // birthday
    val biography: String // biography
)