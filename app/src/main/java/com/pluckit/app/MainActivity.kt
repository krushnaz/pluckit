package com.pluckit.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pluckit.app.features.UserDashboard.presentation.view.HomeScreen
import com.pluckit.app.ui.theme.PluckitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PluckitTheme {
                HomeScreen()
            }
        }
    }
}
