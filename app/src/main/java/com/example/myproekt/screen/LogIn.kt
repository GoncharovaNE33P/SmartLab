package com.example.myproekt.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
        .fillMaxSize(1f)
        .background(Color.White))
    {

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, bottom = 20.dp, end = 15.dp, start = 15.dp),
            text = "✋ Добро пожаловать!",
            fontWeight = FontWeight.Bold, fontSize = 24.sp,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp, end = 15.dp, start = 15.dp),
            text = "Войдите, чтобы пользоваться функциями приложения", fontSize = 15.sp
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .padding(top = 30.dp, end = 15.dp, start = 20.dp, bottom = 5.dp),
            text = "Вход по E-mail", fontSize = 14.sp, color = Color.Gray
        )
        Column(modifier = Modifier.fillMaxWidth(1f),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            TextField(modifier = Modifier.fillMaxWidth(0.9f),shape = RoundedCornerShape(10.dp),
                value = "example@mail.ru", onValueChange = {},
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0XFFF5F5F9),
                    focusedIndicatorColor = Color.Transparent,
                    focusedTextColor = Color(0XFF939396),
                    unfocusedTextColor = Color(0XFF939396),
                    disabledIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = Color.Gray
                )
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth(1f))
        {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0XFFC9D4FB),
                    contentColor = Color.White
                ),shape = RoundedCornerShape(10.dp)
            )
            {
                Text(text = "Далее", fontSize = 17.sp)
            }
        }
        Column( horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.fillMaxWidth(1f)
        )
        {
            Text(text = "Или войдите с помощью", fontSize = 14.sp, color = Color.Gray)

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.White),
                shape = RoundedCornerShape(10.dp)
            )
            {
                Text(text = "Войти с Яндекс", fontSize = 17.sp, color = Color.Black)
            }
    }
}
}