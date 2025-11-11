//package vn.tusaamf.tmdb.presentation.screen.main
//
//import android.os.Bundle
//import android.util.Log
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.annotation.DrawableRes
//import androidx.annotation.StringRes
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.material3.Icon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.NavigationBarItemDefaults
//import androidx.compose.material3.NavigationDrawerItemDefaults
//import androidx.compose.material3.NavigationRailItemDefaults
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteDefaults
//import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.tooling.preview.PreviewScreenSizes
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import vn.tusaamf.tmdb.R
//import vn.tusaamf.tmdb.KtTMDBApp
//import vn.tusaamf.tmdb.presentation.ui.theme.TMDBTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.d("TUNT", "MainActivity");
//        enableEdgeToEdge()
//        setContent {
//            TMDBTheme {
//                KtTMDBApp()
//            }
//        }
//    }
//}
//
//@PreviewScreenSizes
//@Composable
//fun TMDBApp() {
//    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.HOME) }
//
//    val suiteItemColors = NavigationSuiteDefaults.itemColors(
//        navigationBarItemColors = NavigationBarItemDefaults.colors(
//            selectedIconColor = MaterialTheme.colorScheme.primary,
//            unselectedIconColor = Color.Black,
//            selectedTextColor = MaterialTheme.colorScheme.primary,
//            unselectedTextColor = Color.Black,
//            indicatorColor = Color.Transparent
//        ),
//        navigationDrawerItemColors = NavigationDrawerItemDefaults.colors(),
//        navigationRailItemColors = NavigationRailItemDefaults.colors(),
//    )
//
//    NavigationSuiteScaffold(
//        navigationSuiteItems = {
//            AppDestinations.entries.forEach {
//                item(
//                    icon = {
//                        Icon(
//                            painterResource(if (it == currentDestination) it.selectedIcon else it.unselectedIcon),
//                            contentDescription = stringResource(it.label),
//                            modifier = Modifier.size(24.dp)
//                        )
//                    },
//                    label = {
//                        Text(
//                            stringResource(it.label), style = TextStyle(
//                                fontSize = 12.sp,
//                            )
//                        )
//                    },
//                    selected = it == currentDestination,
//                    onClick = { currentDestination = it },
//                    colors = suiteItemColors
//                )
//            }
//        },
//    ) {
//        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//            Greeting(
//                name = "Android",
//                modifier = Modifier.padding(innerPadding)
//            )
//        }
//    }
//}
//
//enum class AppDestinations(
//    @field:StringRes val label: Int,
//    @field:DrawableRes val selectedIcon: Int,
//    @field:DrawableRes val unselectedIcon: Int,
//) {
//    HOME(R.string.tab_home, R.drawable.ic_home_select, R.drawable.ic_home_unselect),
//    SEARCH(R.string.tab_search, R.drawable.ic_search_select, R.drawable.ic_search_unselect),
//    WISHLIST(R.string.tab_wishlist, R.drawable.ic_wishlist_select, R.drawable.ic_wishlist_unselect),
//    PROFILE(R.string.tab_profile, R.drawable.ic_profile_select, R.drawable.ic_profile_unselect),
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TMDBTheme {
//        Greeting("Android")
//    }
//}