package com.example.thirtyday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirtyday.data.foods
import com.example.thirtyday.ui.theme.ThirtyDayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FoodApp()
                }
            }
        }
    }
}

@Composable
fun FoodApp(){
    Scaffold(
        topbar = {
            FoodTopAppBar()

        }
    ){ it ->
        LazyColumn(contentPadding = it){
            items(foods){
                FoodItem(
                    food = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small)),
                )
            }
        }
    }
}
@Composable
fun FoodTopAppBar(modifier: Modifier = Modifier){

}

@Composable
fun FoodItem(){}