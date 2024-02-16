package com.example.myproekt.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myproekt.CodeEmail.EmailCode
import com.example.myproekt.screen.LogIn

/*Класс для перемещения по страницам*/
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,//контроллер реагирующий и отвечающий за перемещения
        startDestination = "EmailCodeSreen")
    {
        //Для каждой страницы задается route - для дальнейшего обращения к ней
        //и указывается метод для запуска с переданными параметрами

        composable("logInScreen"){
            LogIn(navController)
        }
        composable("EmailCodeSreen"){
            EmailCode(/*navController*/)
        }

    }
}