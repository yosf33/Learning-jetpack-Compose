package com.example.composecourse

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class GymsViewModel():ViewModel(){
    var state by mutableStateOf(getGyms())

    fun toggleFavouriteState(gymId: Int) {
        val gyms=state.toMutableList()
        val itemIndex=gyms.indexOfFirst { it.id==gymId }
        gyms[itemIndex]=gyms[itemIndex].copy(isFavourite = !gyms[itemIndex].isFavourite)
        state=gyms
    }
   private fun getGyms()= listOfGyms

}