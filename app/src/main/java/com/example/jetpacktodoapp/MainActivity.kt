package com.example.jetpacktodoapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.jetpacktodoapp.components.EditDialog
import com.example.jetpacktodoapp.ui.theme.JetpackTodoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      JetpackTodoAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          MainContent()
        }
      }
    }
  }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainContent(viewModel: MainViewModel = hiltViewModel()) {
  if (viewModel.isShowDialog) {
    EditDialog()
  }

  Scaffold(floatingActionButton = {
    FloatingActionButton(onClick = { viewModel.isShowDialog = true }) {
      Icon(imageVector = Icons.Default.Add, contentDescription = "新規作成")
    }
  }) {
    val tasks by viewModel.tasks.collectAsState(initial = emptyList())
    Log.d("COUNT", tasks.size.toString())
  }
}
