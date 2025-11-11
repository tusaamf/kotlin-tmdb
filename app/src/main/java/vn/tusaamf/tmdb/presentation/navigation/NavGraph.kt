package vn.tusaamf.tmdb.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import vn.tusaamf.tmdb.presentation.component.TmdbBottomAppBar
import vn.tusaamf.tmdb.presentation.component.TmdbScaffold
import vn.tusaamf.tmdb.presentation.screen.dashboard.navigation.dashboardNavigationRoute
import vn.tusaamf.tmdb.presentation.screen.dashboard.navigation.dashboardScreen
import vn.tusaamf.tmdb.presentation.screen.dashboard.navigation.navigateDashboard
import vn.tusaamf.tmdb.presentation.screen.mediadetail.navigation.navigateMediaDetail

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val currentDescription = navController.currentBackStackEntryAsState().value?.destination

    TmdbScaffold(
        bottomBar = {
            BottomNav.entries.forEach { navItem ->
//                if (navItem.route == currentRoute) {
                    TmdbBottomAppBar(
                        navController = navController,
                        currentDescription = currentDescription
                    )
//                }
            }
        },
        containerColor = MaterialTheme.colorScheme.background,
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = dashboardNavigationRoute,
            modifier = Modifier.padding(innerPadding)
        ) {
            dashboardScreen { navController.navigateMediaDetail(it!!) }
            dashboardScreen { navController.navigateMediaDetail(it!!) }
            dashboardScreen { navController.navigateMediaDetail(it!!) }
            dashboardScreen { navController.navigateMediaDetail(it!!) }
        }
    }
}