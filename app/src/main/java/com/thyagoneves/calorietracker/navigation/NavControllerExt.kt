package com.thyagoneves.calorietracker.navigation

import androidx.navigation.NavController
import com.thyagoneves.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}