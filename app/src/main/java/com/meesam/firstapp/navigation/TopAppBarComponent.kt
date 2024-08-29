package com.meesam.firstapp.navigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.meesam.firstapp.models.ListItem
import com.meesam.firstapp.screens.QuoteListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComponent(scrollBehavior: TopAppBarScrollBehavior){
   TopAppBar(
       title = {
           Text(text = "Todo App" , style = MaterialTheme.typography.titleLarge)
       },
       navigationIcon = {
           IconButton(
               onClick = { /*TODO*/ }
           ) {
              Icon(imageVector = Icons.Default.Menu , contentDescription = "")
           }
       },
       actions= {
           IconButton(
               onClick = { /*TODO*/ }
           ) {
               Icon(imageVector = Icons.Default.Settings , contentDescription = "")
           }
           IconButton(
               onClick = { /*TODO*/ }
           ) {
               Icon(imageVector = Icons.Default.AccountCircle , contentDescription = "")
           }
       },
       colors = TopAppBarDefaults.topAppBarColors(
           containerColor = MaterialTheme.colorScheme.primaryContainer,
       ),
       scrollBehavior = scrollBehavior
   )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScafolled(){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        topBar = {
            TopAppBarComponent(scrollBehavior)
        }
    ){ innerpadding ->
        Column(modifier = Modifier
            .padding(innerpadding)
            .fillMaxSize()
            .padding(16.dp)
        ){
            AppForm()
            TodoList()
        }
    }
}

@Composable
fun AppForm(){
    var titleText by remember { mutableStateOf("") }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ){
        TextField(
            value = titleText,
            onValueChange = { titleText = it },
            placeholder = { Text(text = "Enter the title")},
            label = { Text(text = "Title")},
        )
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            onClick = { /*TODO*/ },
            border = BorderStroke(2.dp, color = MaterialTheme.colorScheme.primary),
            elevation = ButtonDefaults.buttonElevation(5.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Add")
        }
        Spacer(modifier = Modifier.height(10.dp))
        //TodoList()
    }
}

@Composable
fun TodoList(){
    val listItems = mutableListOf<ListItem>()
    for (i in 1..100){
        listItems.add(ListItem("Title-$i", "SubTitle-$i"))
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight(),
        contentPadding = PaddingValues(top = 10.dp)
    ) {
      items(listItems){ item : ListItem ->
          QuoteListItem(model = item)
          Spacer(modifier = Modifier.height(10.dp))
      }
    }
}

@Preview
@Composable
private fun TopAppBarComponentPreview() {
    AppScafolled()
}