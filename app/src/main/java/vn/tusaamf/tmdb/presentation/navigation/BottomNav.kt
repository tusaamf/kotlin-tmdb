package vn.tusaamf.tmdb.presentation.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import vn.tusaamf.tmdb.R
import vn.tusaamf.tmdb.common.Route

enum class AppDestinations(
    val route: Route,
    @field:StringRes val label: Int,
    @field:DrawableRes val selectedIcon: Int,
    @field:DrawableRes val unselectedIcon: Int,
) {
    HOME(R.string.tab_home, R.drawable.ic_home_select, R.drawable.ic_home_unselect),
    SEARCH(R.string.tab_search, R.drawable.ic_search_select, R.drawable.ic_search_unselect),
    WISHLIST(R.string.tab_wishlist, R.drawable.ic_wishlist_select, R.drawable.ic_wishlist_unselect),
    PROFILE(R.string.tab_profile, R.drawable.ic_profile_select, R.drawable.ic_profile_unselect),
}

class BottomNav {
}