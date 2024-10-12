package rfm.hillsongapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import rfm.hillsongapp.home.Launch

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = LaunchScreen
    ) {
        composable<LaunchScreen> {
            Launch()
        }
    }


}

@Serializable
object LaunchScreen

