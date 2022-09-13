package ru.aolachinov.notesappmvvm.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@Composable
fun Start(navController: NavHostController) {
    Text(text = "Hello Start screen!")
}