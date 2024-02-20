package com.example.composecourse

import androidx.compose.ui.graphics.StrokeCap.Companion.Square


val listOfGyms = listOf(
Gym ( 1, "Up Toan Syn",  "20 El-Bihad. Mit Akaba. Agouza. Giza Governorate 5754284, Egypt"),
Gym( 2,"Gold's Gym"," place 61 Syria, Mit Akaba, Aggyza, Siza Governorate 3752302, Egypt"),
Gym( 3,"Hammer Gym"," place: 7 Sphinx Square Al Huwaitayah. Agguzo. Giza Governorate 3753612, Egypt"),
Gym ( 4,"I-Enencgy Gym", "place 22 G001 Gamal Al Humaitevah, Agouza. Giza Governorate 3753620, Egypt"),
Gym ( 5,"H20 Gym & Spa", "place: 32 Anas Inn Malek Hit Akabo, Anouza. Eiza Governorate 3752212, Egypt")
)

data class Gym(val id:Int,val name: String, val place: String,var isFavourite: Boolean =false)

