package vn.tusaamf.tmdb.presentation.screen.dashboard

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import vn.tusaamf.tmdb.R
import vn.tusaamf.tmdb.data.model.dto.MediaDTO
import vn.tusaamf.tmdb.presentation.component.TmdbScaffold
import vn.tusaamf.tmdb.presentation.component.TmdbTopAppBar

@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel = hiltViewModel(),
    navigateToMediaDetail: (MediaDTO?) -> Unit
) {
    val uiState = viewModel.uiState.collectAsState().value

    TmdbScaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TmdbTopAppBar(
                text = stringResource(id = R.string.tab_home)
            )
        },
        content = {
            Content()
        }
    )
}

@Composable
private fun Content() {

}