package com.example.thirtyday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtyday.data.Food
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodApp(){
    Scaffold (
        topBar = {
            FoodTopAppBar()
        }
    ){it ->
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
  Text(
      text = "30 day of recipes",
      style = MaterialTheme.typography.displayLarge
  )
}

@Composable
fun FoodItem(
    food: Food,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier){
        Box(modifier = modifier
            .fillMaxSize()){
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(R.dimen.padding_small))
            ){
                FoodIcon(food.imageResourceId)
                Spacer(Modifier.height(16.dp))
                FoodInformation(food.name,food.description)
            }
        }
    }
}
@Composable
fun FoodIcon(
    @DrawableRes foodIcon: Int,
    modifier: Modifier =Modifier
){
        Image(
            modifier = modifier
                .size(dimensionResource(R.dimen.image_size))
                .padding(dimensionResource(R.dimen.padding_small)),
            painter = painterResource(id = foodIcon),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
}

@Composable
fun FoodInformation(
    @StringRes foodName:Int,
    @StringRes foodDes: Int,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier){
        Text(
            text = stringResource(foodName),
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
        Text(
            text = stringResource(foodDes),
            style = MaterialTheme.typography.bodyLarge,
            modifier = modifier

        )
    }
}
@Preview
@Composable
fun ThirtyPreview(){
    ThirtyDayTheme(darkTheme = false) {
        FoodApp()


    }
}
@Preview
@Composable
fun ThirtyDarkThemePreview() {
    ThirtyDayTheme(darkTheme = true) {
        FoodApp()
    }
}