package com.example.navegacioncompose

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

/****
 * Project: NavegacionCompose
 * From: com.example.navegacioncompose
 * Created by: Victor Sanjines Lopez on 21/12/2022 at 21:00
 * More info: www.relativity.com.bo
 * All rights reserved 2022
 ****/
// Componente llamado Scaffold
// Un contenedor que es como un esqueleto de una pantalla
//de forma mas avanzada
@Composable
fun BottomBarExample() {
    //cuando trabajen con un Scaffold como contenedor
    //usen o manejen sus estados
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = { MyBottomMenu() }
    ) {

    }
}

//Bottom bar
@Composable
fun MyBottomMenu() {
    BottomNavigation(backgroundColor = Color.Red, contentColor = Color.White) {
        //para manejar los indices de cada item del menu
        var index by remember { mutableStateOf(0) }
        //Cada item o elemento para tu menu lo defines con el componente BottomNavigationItem
        //cada opcion del menu
        BottomNavigationItem(selected = index == 0, onClick = { index = 0 }, icon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "home"
            )
        }, label = { Text(text = "Home")})

        BottomNavigationItem(selected = index == 1, onClick = { index = 1 }, icon = {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "favorite"
            )
        }, label = { Text(text = "Favorite")})

        BottomNavigationItem(selected = index == 2, onClick = { index = 2 }, icon = {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "person"
            )
        }, label = { Text(text = "Person")})


    }
}





















