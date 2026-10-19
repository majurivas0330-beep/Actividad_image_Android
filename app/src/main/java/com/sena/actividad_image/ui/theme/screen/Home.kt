
package com.sena.actividad_image.ui.theme.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sena.actividad_image.ui.theme.section.FooterSection
import com.sena.actividad_image.ui.theme.section.HeaderSection
import com.sena.actividad_image.ui.theme.section.MainSection

@Composable
fun Home(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2F2F2))
            .padding(16.dp)
    ) {
        HeaderSection()

        Spacer(modifier = Modifier.height(16.dp))

        MainSection(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )

        Spacer(modifier = Modifier.height(12.dp))

        FooterSection()
    }
}
