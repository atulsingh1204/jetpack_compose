package com.atul.jetpackcomposesample

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

//            PreviewFunctions() //Text
//            ImageFunctions()
//            ButtonFunction()
//            PreviewTextField()

            TextInput()

        }

    }

//    @Preview(showBackground = true, widthDp = 300, heightDp =  500)
//    @Composable
//    private fun PreviewFunctions(){
//        Text(
//            text = "Hello Atul",
//            fontStyle = FontStyle.Italic,
//            fontWeight = FontWeight.ExtraBold,
//            color = Color.Red,
//            fontSize = 30.sp,
//            textAlign = TextAlign.Center,
//        )
//    }

//    @Preview(showBackground = true, widthDp = 300, heightDp =  300)
//    @Composable
//    private fun ImageFunctions(){
//        Image(
//            painter = painterResource(id = R.drawable.ic_outline_arrow_shape_up_stack),
//            contentDescription = "Dummy image",
//            colorFilter = ColorFilter.tint(Color.Blue),
//            contentScale = ContentScale.Crop
//        )
//    }


//@Preview(showBackground = true, widthDp = 300, heightDp =  300)
//@Composable
//private fun ButtonFunction(){
//    Button(
//        onClick = {
//            Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
//        },
//        colors = ButtonDefaults.buttonColors(
//            Color.Green,
//            Color.Black
//        ),
//        enabled = false
//    ){
//        Text("Hello", color = Color.Blue, fontSize = 50.sp)
//        Image(
//            painter = painterResource(id = R.drawable.ic_outline_arrow_shape_up_stack),
//            contentDescription = "Dummy Image"
//        )
//    }
//}


    @Preview(showBackground = true, widthDp = 300, heightDp =  300)
    @Composable
    private fun PreviewTextField(){
        TextField(
            value = "Hello Atul",
            onValueChange = {
                Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            },
            label = {Text("Enter your name")},
            placeholder = {Text("Name")},
        )

    }

    @Composable
    fun TextInput(){
        val state = remember{ mutableStateOf("") }
        TextField(
            value = state.value,
            onValueChange = {
                state.value = it
//                Log.e("check", "TextInput: " + it)
            },
            label = {Text("Enter Message")},
        )
    }

}




