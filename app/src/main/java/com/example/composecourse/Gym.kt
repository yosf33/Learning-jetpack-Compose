package com.example.composecourse

val listOfGyms = listOf<Gym>(
    Gym("name1","place1"),
    Gym("name2","place2"),
    Gym("name3","place3"),
    Gym("name4","place4")

)

data class Gym(val name: String, val place: String)

