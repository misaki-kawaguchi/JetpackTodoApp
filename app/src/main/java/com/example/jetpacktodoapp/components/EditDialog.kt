package com.example.jetpacktodoapp.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun EditDialog() {
  AlertDialog(
    onDismissRequest = { /*TODO*/ },
    title = { Text(text = "タスク新規作成") },
    text = {},
    buttons = {},
  )
}