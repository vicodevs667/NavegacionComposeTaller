package com.example.navegacioncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navegacioncompose.model.Routes
import com.example.navegacioncompose.ui.theme.NavegacionComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacionComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BottomBarExample()
                    //Un controlador que va a gestionar y controlar el tema
                    //de los estados de la navegacion
                    /*
                    val navigationController = rememberNavController()

                    //Definicion de tu grafo de navegación
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.Pantalla1.route
                    ) {
                        //contruir los nodos usando una llave o key única
                        composable(Routes.Pantalla1.route) { Screen1(navigationController) }
                        composable(Routes.Pantalla2.route) { Screen2(navigationController) }
                        composable(Routes.Pantalla3.route) { Screen3(navigationController) }
                        composable(
                            Routes.Pantalla4.route,
                            arguments = listOf(navArgument("age") { type = NavType.IntType })
                        ) { backStackEntry ->
                            Screen4(
                                navigationController,
                                backStackEntry.arguments?.getInt("age") ?:0
                            )
                        }
                        composable(
                            Routes.Pantalla5.route,
                            arguments = listOf(navArgument("name") {defaultValue = "Pepe"})
                        ) { backStackEntry ->
                            Screen5(navigationController,
                                backStackEntry.arguments?.getString("name")
                            )
                        }
                    }

                     */
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavegacionComposeTheme {
        Greeting("Android")
    }
}