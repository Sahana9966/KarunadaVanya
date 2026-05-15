package com.example.karunadavanya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KarunadaVanyaApp()
        }
    }
}

@Composable
fun KarunadaVanyaApp() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "KarunadaVanya App",
            fontSize = 28.sp
        )

        Button(onClick = { println("Tiger clicked") }) {
            Text("Tiger")
        }
        Image(
            painter = painterResource(id = R.drawable.tiger),
            contentDescription = "Tiger",
            modifier = Modifier.size(120.dp)
        )

        Button(onClick = { println("Elephant clicked") }) {
            Text("Elephant")
        }
        Image(
            painter = painterResource(id = R.drawable.elephant),
            contentDescription = "Elephant",
            modifier = Modifier.size(120.dp)
        )

        Button(onClick = { println("Deer clicked") }) {
            Text("Deer")
        }
        Image(
            painter = painterResource(id = R.drawable.deer),
            contentDescription = "Deer",
            modifier = Modifier.size(120.dp)
        )

        Button(onClick = { println("Peacock clicked") }) {
            Text("Peacock")
        }
        Image(
            painter = painterResource(id = R.drawable.peacock),
            contentDescription = "Peacock",
            modifier = Modifier.size(120.dp)
        )
    }
}
