package vn.tusaamf.tmdb.presentation.screen.dashboard.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import vn.tusaamf.tmdb.common.Route
import vn.tusaamf.tmdb.data.model.dto.MediaDTO
import vn.tusaamf.tmdb.presentation.screen.dashboard.DashboardScreen

const val dashboardNavigationRoute = "dashboard_route"

@Serializable
data object Dashboard: Route()

fun NavController.navigateDashboard(
    navOptions: NavOptions? = null
) {
    this.navigate(dashboardNavigationRoute, navOptions)
}

fun NavGraphBuilder.dashboardScreen(navigateToMediaDetail: (MediaDTO?) -> Unit) {
    composable<Dashboard> {
        DashboardScreen(navigateToMediaDetail = navigateToMediaDetail)
    }
}