package com.example.myproekt.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LogIn() {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.White))
    {

        Text(
            modifier = Modifier.
            fillMaxWidth().
            padding(top = 50.dp,bottom = 20.dp, end = 15.dp, start = 15.dp),
            text = "✋ Добро пожаловать!",
            fontWeight = FontWeight.Bold, fontSize = 24.sp,)
        Text(modifier = Modifier.
            fillMaxWidth().
            padding(bottom = 30.dp, end = 15.dp, start = 15.dp),
            text = "Войдите, чтобы пользоваться функциями приложения",fontSize = 15.sp)
        Text(modifier = Modifier.
            fillMaxWidth().
            padding(bottom = 30.dp, end = 15.dp, start = 15.dp),
            text = "Вход по E-mail",fontSize = 14.sp, color = Color(126, 126, 154, 1)
            )
        Column (modifier = Modifier
            .fillMaxSize()
            .background(Color.White),horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            TextField(value = "example@mail.ru", onValueChange = {},
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0XFFF5F5F9),
                    focusedIndicatorColor = Color(0XFFEBEBEB),
                    focusedTextColor = Color(0XFF939396),
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = Color(0XFFEBEBEB))
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Далее", fontSize = 17.sp)
            }
            Text(text = "Или войдите с помощью", fontSize = 14.sp, color = Color.Gray)
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Войти с Яндекс", fontSize = 17.sp, color = Color.Black)
            }
        }
    }



}