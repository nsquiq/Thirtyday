package com.example.thirtyday.data


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtyday.R

data class Food(

    @StringRes val name : Int,
    @StringRes val description : Int,
    @DrawableRes val imageResourceId : Int,
)
val foods = listOf(
    Food(R.string.food1,R.string.description1,R.drawable.bolognese),
    Food(R.string.food2,R.string.description2,R.drawable.caprese),
    Food(R.string.food3,R.string.description3,R.drawable.chicken),
    Food(R.string.food4,R.string.description4,R.drawable.curry),
    Food(R.string.food5,R.string.description5,R.drawable.fajita),
    Food(R.string.food6,R.string.description6,R.drawable.guacamole),
    Food(R.string.food7,R.string.description7,R.drawable.seafood),
    Food(R.string.food8,R.string.description8,R.drawable.rolls),
    Food(R.string.food9,R.string.description9,R.drawable.pizza),
    Food(R.string.food10,R.string.description10,R.drawable.last),
    Food(R.string.food1,R.string.description1,R.drawable.bolognese),
    Food(R.string.food2,R.string.description2,R.drawable.caprese),
    Food(R.string.food3,R.string.description3,R.drawable.chicken),
    Food(R.string.food4,R.string.description4,R.drawable.curry),
    Food(R.string.food5,R.string.description5,R.drawable.fajita),
    Food(R.string.food6,R.string.description6,R.drawable.guacamole),
    Food(R.string.food7,R.string.description7,R.drawable.seafood),
    Food(R.string.food8,R.string.description8,R.drawable.rolls),
    Food(R.string.food9,R.string.description9,R.drawable.pizza),
    Food(R.string.food10,R.string.description10,R.drawable.last),
    Food(R.string.food1,R.string.description1,R.drawable.bolognese),
    Food(R.string.food2,R.string.description2,R.drawable.caprese),
    Food(R.string.food3,R.string.description3,R.drawable.chicken),
    Food(R.string.food4,R.string.description4,R.drawable.curry),
    Food(R.string.food5,R.string.description5,R.drawable.fajita),
    Food(R.string.food6,R.string.description6,R.drawable.guacamole),
    Food(R.string.food7,R.string.description7,R.drawable.seafood),
    Food(R.string.food8,R.string.description8,R.drawable.rolls),
    Food(R.string.food9,R.string.description9,R.drawable.pizza),
    Food(R.string.food10,R.string.description10,R.drawable.last),
    )