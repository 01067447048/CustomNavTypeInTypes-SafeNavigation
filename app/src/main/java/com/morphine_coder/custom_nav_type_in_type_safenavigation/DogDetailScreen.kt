package com.morphine_coder.custom_nav_type_in_type_safenavigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DogDetailScreen(
    dog: Dog,
    breedSize: BreedSize,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "${dog.name} with the ID of ${dog.id} has the breed size $breedSize",
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview
@Composable
private fun DogDetailScreenPreview() {
    DogDetailScreen(
        dog = Dog(1, "Golden Retriever"),
        breedSize = BreedSize.LARGE
    )
}