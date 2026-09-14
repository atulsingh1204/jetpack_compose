package com.atul.jetpackcomposesample

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        Modifier.fillMaxSize(),
        Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(painter = painterResource(R.drawable.login), "Login Image",
            modifier = Modifier.size(200.dp))


        Text("Welcome Back", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.size(4.dp))

        Text("Login to your account")

        Spacer(modifier = Modifier.size(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = { Text("Email Address") }
        )

        Spacer(modifier = Modifier.size(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            }, 
            label = { Text("Password") }, visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.size(16.dp))

        Button(onClick = {
            Log.e("credentials", "Email: ${email} Password: ${password}", )
        }) { Text("Login") }

        Spacer(modifier = Modifier.size(16.dp))
        Text("Forgot Password?", Modifier.clickable{ })

        Spacer(modifier = Modifier.size(16.dp))

        Text("Or sign in with")

        Spacer(modifier = Modifier.size(16.dp))

        Row(Modifier
            .fillMaxSize()
            .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(painterResource(R.drawable.facebook),"Facebook", modifier = Modifier
                .size(60.dp)
                .clickable {

                }
            )

            Image(painterResource(R.drawable.google),"Google", modifier = Modifier
                .size(60.dp)
                .clickable {

                }
            )

            Image(painterResource(R.drawable.twitter),"Twitter", modifier = Modifier
                .size(60.dp)
                .clickable {

                }
            )
        }


    }


}