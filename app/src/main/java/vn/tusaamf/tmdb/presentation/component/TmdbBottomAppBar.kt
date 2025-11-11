package vn.tusaamf.tmdb.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.navOptions
import vn.tusaamf.tmdb.presentation.navigation.BottomNav
import androidx.tracing.trace
import vn.tusaamf.tmdb.presentation.screen.dashboard.navigation.navigateDashboard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TmdbBottomAppBar(
    navController: NavController,
    currentDescription: NavDestination?,
) {
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp)),
        content = {
            BottomNav.entries.forEach { bottomNav ->
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = ImageVector.vectorResource(bottomNav.unselectedIcon),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(bottomNav.label),
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.labelSmall
                        )
                    },
                    selected = currentDescription.isBottomNavDestinationInHierarchy(bottomNav),
                    onClick = {
                        navigateToBottomNavDestination(
                            bottomNav = bottomNav,
                            navController = navController
                        )
                    },
                )
            }
        }
    )
}

fun navigateToBottomNavDestination(bottomNav: BottomNav, navController: NavController) {
    trace("Navigation: ${bottomNav.label}") {
        val bottomBarOptions = navOptions {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // re-selecting the same item
            launchSingleTop = true
            // Restore state when re-selecting a previously selected item
            restoreState = true
        }
        when (bottomNav) {
            BottomNav.HOME -> navController.navigateDashboard(bottomBarOptions)
            BottomNav.WISHLIST -> navController.navigateDashboard(bottomBarOptions)
            BottomNav.SEARCH -> navController.navigateDashboard(bottomBarOptions)
            BottomNav.PROFILE -> navController.navigateDashboard(bottomBarOptions)
        }
    }
}

private fun NavDestination?.isBottomNavDestinationInHierarchy(destination: BottomNav) =
    this?.hierarchy?.any {
        it.route?.contains(destination.name, true) ?: false
    } ?: false