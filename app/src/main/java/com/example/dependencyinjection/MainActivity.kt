package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dependencyinjection.ui.theme.DependencyInjectionTheme
import dagger.hilt.android.HiltAndroidApp
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

           click()
            }
        }
    }

@Composable
fun click( ){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.Yellow)) {
       val userregistrationcomponent = Daggeruserregistrationcomponent.builder().build().getuserregistrationservice()
Column {


    Surface(modifier = Modifier.size(200.dp)) {


        Button(onClick = {
            userregistrationcomponent.userregistor("mannu", "123")
        }) {
            Text(text = "click me")
        }
    }
}
    }
}



