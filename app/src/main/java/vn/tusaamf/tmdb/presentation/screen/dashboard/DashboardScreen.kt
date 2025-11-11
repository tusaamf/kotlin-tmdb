package vn.tusaamf.tmdb.presentation.screen.dashboard

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.serialization.Serializable
import vn.tusaamf.tmdb.common.Route

@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = hiltViewModel(),
    navigateToDetail: () -> Unit
) {
    val uiState = viewModel.uiState.collectAsState().value
}