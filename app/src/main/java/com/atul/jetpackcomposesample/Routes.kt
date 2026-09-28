package com.atul.jetpackcomposesample

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes{

    @Serializable
    data object Home: Routes()

    @Serializable
    data class Profile(val username: String): Routes()
}