package com.excel.shopping


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.excel.shopping.ui.theme.ShoppingTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun shopy() {
    var Shopitems by remember { mutableStateOf(listOf<SHList>()) }
    var dbox by remember { mutableStateOf(false) }
    var taskname by remember { mutableStateOf("") }
    var tasktime by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =Arrangement.Center)

    {   Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {dbox = true},
            colors = buttonColors(containerColor = Color.Cyan, contentColor = Color.White),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Add Task")
        }
        LazyColumn(modifier = Modifier.fillMaxSize().
        padding(16.dp)
        ) {
            items(Shopitems){

            }
        }
        if(dbox){
           AlertDialog(onDismissRequest = {dbox= false},
                        confirmButton = {},
                        title = {Text("Add a Task")},
                        text ={
                            OutlinedTextField(value = taskname,
                                onValueChange = {taskname = it},
                                label = {Text("Enter Task")})
                                 }   )
        }
    }
}
data class SHList(val id: Int,
                  val quantity: Int,
                  val name: String,
                  val isedit : Boolean)


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShoppingTheme {
        shopy()
    }
}