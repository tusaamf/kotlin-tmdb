package vn.tusaamf.tmdb.presentation.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TmdbSnackbar(
    snackbarHostState: SnackbarHostState
) {
    SnackbarHost(snackbarHostState) { data ->
        Snackbar(
            containerColor = MaterialTheme.colorScheme.onSurface,
            snackbarData = data,
            shape = MaterialTheme.shapes.medium
        )
    }
}

@Preview
@Composable
private fun BodyPreview() {
    TmdbSnackbar(snackbarHostState = SnackbarHostState())
}