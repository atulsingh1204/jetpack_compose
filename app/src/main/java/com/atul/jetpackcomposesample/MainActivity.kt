package com.atul.jetpackcomposesample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.atul.jetpackcomposesample.ui.theme.JetPackComposeSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

//            MyUI()
//            Greeting()

            MyScreen()
        }

    }

    @Composable
    fun MyUI(){
        Text("Hello")
    }

    @Composable
    fun Greeting(){
        Text("Hello Atul")
    }

    @Composable
    fun MyScreen(){

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
        ) {
            Text("Hello")
            Text("Welcome to Compose")

            Button(onClick = { Toast.makeText(this@MainActivity, "Button is clicked", Toast.LENGTH_SHORT).show()}){
                Text("Click Me")
            }
        }
    }
}




