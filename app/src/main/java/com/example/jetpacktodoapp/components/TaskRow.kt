package com.example.jetpacktodoapp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskRow() {
  Card(
    modifier = Modifier
      .fillMaxWidth()
      .padding(5.dp),
    elevation = 5.dp,
  ) {
    Row(
      modifier = Modifier.padding(10.dp),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      Text(text = "タスクタイトル")
      Spacer(modifier = Modifier.weight(1f))
      IconButton(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Default.Delete, contentDescription = "削除")
      }
    }
  }
}

@Preview
@Composable
fun taskRowPreview() {
  TaskRow()
}