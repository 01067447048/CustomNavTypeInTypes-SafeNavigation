package com.morphine_coder.custom_nav_type_in_type_safenavigation

import kotlinx.serialization.Serializable

@Serializable
data class Dog(
    val id: Int,
    val name: String,
)

enum class BreedSize {
    SMALL,
    MEDIUM,
    LARGE
}
