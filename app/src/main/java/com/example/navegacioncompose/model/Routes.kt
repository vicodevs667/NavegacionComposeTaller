package com.example.navegacioncompose.model

/****
 * Project: NavegacionCompose
 * From: com.example.navegacioncompose.model
 * Created by: Victor Sanjines Lopez on 21/12/2022 at 19:56
 * More info: www.relativity.com.bo
 * All rights reserved 2022
 ****/
sealed class Routes(val route: String) {
    object Pantalla1: Routes("pantalla1")
    object Pantalla2: Routes("pantalla2")
    object Pantalla3: Routes("pantalla3")
    //para argumentos obligatorios en la navegacion
    object Pantalla4: Routes("pantalla4/{age}") {
        fun createRoute(age: Int) = "pantalla4/$age"
    }

    //para argumentos opcionales
    object Pantalla5: Routes("pantalla5?name={name}") {
        fun createRoute(name: String) = "pantalla5?name=$name"
    }
}














