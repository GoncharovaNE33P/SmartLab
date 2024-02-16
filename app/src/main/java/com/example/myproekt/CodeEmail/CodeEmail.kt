package com.example.myproekt.CodeEmail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun EmailCode(/*navHost: NavHostController*/) {
    Column(modifier = Modifier
        .fillMaxSize(1f)
        .background(Color.White))
    {
        Box(
            modifier = Modifier
                .padding(12.dp)
                .height(32.dp)
                .width(32.dp)
                .clip(RoundedCornerShape(7.dp))
                .background(Color(0xFFF5F5F9))
                /*.clickable { navHost.navigate("logInScreen") }*/,
            contentAlignment = Alignment.Center
        )
        {
         Icon(imageVector = Icons.Default.KeyboardArrowLeft,
             contentDescription = "ArrowBack Icon"
         )
        }
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize() )
    {
        Text(text = "Введите код из E-mail",fontWeight = FontWeight.Bold, fontSize = 24.sp,
            modifier = Modifier.padding(top = 240.dp))
        Row {
            Box(
                modifier = Modifier
                    .padding(12.dp)
                    .height(48.dp)
                    .width(48.dp)
                    .clip(RoundedCornerShape(7.dp))
                    .background(Color(0xFFF5F5F9)),
                contentAlignment = Alignment.Center
            )
            {

            }
            Box(
                modifier = Modifier
                    .padding(12.dp)
                    .height(48.dp)
                    .width(48.dp)
                    .clip(RoundedCornerShape(7.dp))
                    .background(Color(0xFFF5F5F9)),
                contentAlignment = Alignment.Center
            )
            {

            }
            Box(
                modifier = Modifier
                    .padding(12.dp)
                    .height(48.dp)
                    .width(48.dp)
                    .clip(RoundedCornerShape(7.dp))
                    .background(Color(0xFFF5F5F9)),
                contentAlignment = Alignment.Center
            )
            {

            }
            Box(
                modifier = Modifier
                    .padding(12.dp)
                    .height(48.dp)
                    .width(48.dp)
                    .clip(RoundedCornerShape(7.dp))
                    .background(Color(0xFFF5F5F9)),
                contentAlignment = Alignment.Center
            )
            {

            }
        }
        Text(text = "Отправить код повторно можно будет через 59 секунд",
            fontSize = 15.sp, color = Color(0XFF939396),
            textAlign = TextAlign.Center, modifier = Modifier.width(242.dp).height(40.dp)     )
    }
}
