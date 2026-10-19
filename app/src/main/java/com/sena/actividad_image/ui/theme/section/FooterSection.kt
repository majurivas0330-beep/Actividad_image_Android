
package com.sena.actividad_image.ui.theme.section

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FooterSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF252525))
            .padding(12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "SportCars - Carros deportivos",
            color = Color.White,
            fontSize = 12.sp
        )
    }
}
