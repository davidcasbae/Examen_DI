package com.example.examen_di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.examen_di.ui.theme.Examen_DITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            datos_alumno()
            imagen_interactiva()
            lista_elementos()
        }
    }
}

@Preview
@Composable
fun datos_alumno() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
            .background(Color.Blue)
    ) {
        item {
            Text(text = "David ", fontSize = 20.sp)
            Text(text = "Castellano Baeza", fontSize = 20.sp)
        }
    }
}

@Preview
@Composable
fun imagen_interactiva() {
    var counter by remember { mutableStateOf(0) }
    LazyRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 80.dp)
            .background(Color.White)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.imagen_clickable),
                contentDescription = "emoticono",
                modifier = Modifier
                    .clickable { counter++ }
            )
            Text(
                text = counter.toString(),
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

@Preview
@Composable
fun lista_elementos() {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 105.dp)
            .background(Color.White)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.snoopy_1),
                contentDescription = "Snoopy_1"
            )
            Text(text = "Imagen 1 de Snoopy ", fontSize = 15.sp, color = Color.Blue)
            Image(
                painter = painterResource(id = R.drawable.snoopy_2),
                contentDescription = "Snoopy_2"
            )
            Text(text = "Imagen 2 de Snoopy", fontSize = 15.sp, color = Color.Blue)
            Image(
                painter = painterResource(id = R.drawable.snoopy_3),
                contentDescription = "Snoopy_3"
            )
            Text(text = "Imagen 3 de Snoopy", fontSize = 15.sp, color = Color.Blue)
            Image(
                painter = painterResource(id = R.drawable.snoopy_4),
                contentDescription = "Snoopy_4"
            )
            Text(text = "Imagen 3 de Snoopy", fontSize = 15.sp, color = Color.Blue)
        }
    }
    LazyRow(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 800.dp)
            .background(Color.White)
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.snoopy_1),
                contentDescription = "Imagen horizontal"
            )
            Image(
                painter = painterResource(id = R.drawable.snoopy_2),
                contentDescription = "Imagen horizontal"
            )
            Image(
                painter = painterResource(id = R.drawable.snoopy_3),
                contentDescription = "Imagen horizontal"
            )
            Image(
                painter = painterResource(id = R.drawable.snoopy_4),
                contentDescription = "Imagen horizontal"
            )
        }
    }
}