package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun GymScreen() {
    LazyColumn() {
        items(listOfGyms) {
            GymItem(it)

        }
    }
}

@Composable
fun GymItem(gym: Gym) {
    Card(
        elevation = cardElevation(
            defaultElevation = 10.dp
        ), modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            GymIcon(Icons.Filled.Place, Modifier.weight(0.15f).fillMaxHeight())
            GymDetails(gym, Modifier.weight(0.85f))
        }
    }
}

@Composable
fun GymDetails(gym: Gym, modifier: Modifier) {
    Column(modifier=modifier) {
        Text(
            text = gym.name, style = MaterialTheme.typography.headlineLarge, color = Color.Blue
        )


        Text(
            text = gym.place, style = MaterialTheme.typography.bodyMedium
        )


    }
}


@Composable
fun GymIcon(vector: ImageVector, modifier: Modifier) {

    Image(
        imageVector = vector,
        contentDescription = "gym icon",
        modifier = modifier,
        colorFilter = ColorFilter.tint(Color.DarkGray)
    )
}


@Preview(showBackground = true)
@Composable
fun GymScreenPreview() {
    LazyColumn() {
        items(listOfGyms) {
            GymItem(it)

        }
    }
}
