package com.meesam.firstapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun QuoteListItem() {
  Card(
      elevation = CardDefaults.cardElevation(8.dp),
      modifier = Modifier
          .padding(8.dp)
  ) {
     Row(modifier = Modifier
         .padding(16.dp)
     ) {
         Image(
             imageVector = Icons.Filled.FormatQuote,
             contentDescription = "",
             alignment = Alignment.TopStart,
             colorFilter = ColorFilter.tint(Color.White),
             modifier = Modifier
                 .size(40.dp)
                 .background(Color.Black)
         )
         Spacer(modifier = Modifier.padding(4.dp))
         Column(modifier = Modifier
             .weight(1f)
         ) {
             Text(text = "Title", style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.Bold)
             Spacer(modifier = Modifier.padding(2.dp))
             Box(modifier = Modifier
                 .background(Color.LightGray)
                 .fillMaxWidth(.4f)
                 .height(1.dp)
             )
             Spacer(modifier = Modifier.padding(2.dp))
             Text(text = "Subtitle", fontWeight = FontWeight.Thin)
         }
     }
  }

}

@Composable
fun QuoteDetails(){
  Box(contentAlignment = Alignment.Center,
      modifier = Modifier
          .fillMaxSize(1f)
          .background(Color.LightGray)

  ) {
      Card(elevation = CardDefaults.cardElevation(5.dp),
       modifier = Modifier
           .padding(32.dp)
      ) {
          Column(
              verticalArrangement = Arrangement.Center,
              modifier = Modifier
                  .padding(start = 16.dp, top = 24.dp)
          ) {
              Image(
                  imageVector = Icons.Filled.FormatQuote,
                  contentDescription = "",
                  alignment = Alignment.Center,
                  colorFilter = ColorFilter.tint(Color.White),
                  modifier = Modifier
                      .size(40.dp)
                      .background(Color.Black)
              )
              Spacer(modifier = Modifier.height(20.dp))
              Text(text = "Quote Details Quote Details Quote Details Quote DetailsQuote Details",
                  modifier = Modifier
                      .padding(bottom = 15.dp)
                  )
          }
      }


  }
}

@Preview
@Composable
private fun QuoteListItemPreview () {
    //QuoteListItem()
    QuoteDetails()
}