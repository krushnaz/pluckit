package com.pluckit.app.features.UserDashboard.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import androidx.compose.ui.Modifier
import com.pluckit.app.features.UserDashboard.presentation.widgets.BottomNavBarWithBadge
import com.pluckit.app.features.UserDashboard.presentation.widgets.CategorySection
import com.pluckit.app.features.UserDashboard.presentation.widgets.ShimmerBanner
import com.pluckit.app.features.UserDashboard.presentation.widgets.FeaturedProductsSection
import com.pluckit.app.features.UserDashboard.presentation.widgets.SearchBar

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun HomeScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Pluckit", fontWeight = FontWeight.Bold) }) },
        bottomBar = { BottomNavBarWithBadge(cartCount = 3) }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color(0xFFF8F8F8)),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item { SearchBar() }
            item { ShimmerBanner(isLoading = true) }
            item { CategorySection() }
            item { FeaturedProductsSection() }
        }
    }
}


// ... keep SearchBar, CategorySection, FeaturedProductsSection as is
