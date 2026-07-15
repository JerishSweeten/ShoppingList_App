package com.excel.shopping

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.excel.shopping.ui.theme.ShoppingTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.collections.listOf


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoppingTheme {
                shopy()

                }

            }
        }
    }

@Composable
fun shopy() {
    var Shopitems by remember { mutableStateOf(listOf<String>()) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =Arrangement.Center)

    {   Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {},
            colors = buttonColors(containerColor = Color.Cyan, contentColor = Color.White),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Add Item")
        }
        LazyColumn(modifier = Modifier.fillMaxSize().
        padding(16.dp)
        ) {
            items(){

            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShoppingTheme {
        shopy()
    }
}