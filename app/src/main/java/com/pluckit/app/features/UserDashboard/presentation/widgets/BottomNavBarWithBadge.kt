package com.pluckit.app.features.UserDashboard.presentation.widgets

import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Badge
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart

@Composable
fun BottomNavBarWithBadge(cartCount: Int) {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = true,
            onClick = { }
        )
        NavigationBarItem(
            icon = { Icon(imageVector = Icons.Filled.Search, contentDescription = "Search") },
            label = { Text("Search") },
            selected = false,
            onClick = { }
        )
        NavigationBarItem(
            icon = {
                BadgedBox(badge = {
                    if (cartCount > 0) Badge { Text("$cartCount") }
                }) {
                    Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "Cart")
                }
            },
            label = { Text("Cart") },
            selected = false,
            onClick = { }
        )
    }
}
