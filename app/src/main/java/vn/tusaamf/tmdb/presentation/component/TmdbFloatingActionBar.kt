package vn.tusaamf.tmdb.presentation.component

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import kotlinx.coroutines.delay
import vn.tusaamf.tmdb.presentation.ui.icon.Wishlist
import vn.tusaamf.tmdb.utils.Utility.getAnimateFloat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TmdbFloatingActionBar(
    navController: NavController,
    route: String,
) {
    var isClick by remember { mutableStateOf(false) }

    LaunchedEffect(
        isClick
    ) {
        if (isClick) {
            delay(800)
            isClick = false
        }
    }

    FloatingActionButton(
        onClick = {
            isClick = true
            navController.navigate(route) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
            }
        }
    ) {
        Icon(
            Icons.Filled.Wishlist,
            contentDescription = null,
            tint = Color.Red,
            modifier = Modifier.size(if (isClick) getAnimateFloat().value.dp else 24.dp)
        )
    }
}
