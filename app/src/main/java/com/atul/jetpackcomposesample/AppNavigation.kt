package com.atul.jetpackcomposesample

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    // Implement your navigation logic here

    val backStack: SnapshotStateList<Routes> = remember { mutableListOf(Routes.Home).toMutableStateList() }


    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = Routes.Home, modifier = modifier){

        composable<Routes.Home> {
            HomeScreen { username ->
                val profileScreen = Routes.Profile(username)

                backStack.add(profileScreen)

                navController.navigate(profileScreen)
            }
        }

        composable<Routes.Profile> { backstackEntry ->
            val profileScreen = backstackEntry.toRoute<Routes.Profile>()

            ProfileScreen(
                userName = profileScreen.username,
                onNavigateBack = {
                    if (backStack.isNotEmpty()) {
                        backStack.removeLast()
                    }
                    navController.popBackStack()
                }
            )
        }
    }
}