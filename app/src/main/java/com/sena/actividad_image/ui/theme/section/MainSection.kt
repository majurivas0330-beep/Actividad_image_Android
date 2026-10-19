
package com.sena.actividad_image.ui.theme.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.actividad_image.R
import com.sena.actividad_image.ui.theme.composable.CarroItem

@Composable
fun MainSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.verticalScroll(
            rememberScrollState()
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        // Carro destacado
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color(0xFF8B1E2D),
                    RoundedCornerShape(10.dp)
                )
                .padding(12.dp)
        ) {
            Text(
                text = "CARRO DESTACADO",
                color = Color.White
            )

            Text(
                text = "McLaren",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            Image(
                painter = painterResource(
                    id = R.drawable.car_orange
                ),
                contentDescription = "McLaren naranja",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
        }

        // Categorías
        Text(
            text = "Categorías",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Categoria("Deportivos")
            Categoria("Clásicos")
            Categoria("Tuning")
        }

        // Carros populares
        Text(
            text = "Carros populares",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        CarroItem(
            imagen = R.drawable.porsche_negro,
            nombre = "Porsche Panamera",
            descripcion = "Elegancia y rendimiento"
        )

        CarroItem(
            imagen = R.drawable.bmw_gris,
            nombre = "BMW deportivo",
            descripcion = "Diseño y potencia"
        )

        CarroItem(
            imagen = R.drawable.mustang_azul,
            nombre = "Chevrolet Camaro",
            descripcion = "Estilo deportivo"
        )
    }
}

@Composable
private fun Categoria(nombre: String) {
    Text(
        text = nombre,
        modifier = Modifier
            .background(
                Color.White,
                RoundedCornerShape(8.dp)
            )
            .padding(8.dp),
        fontSize = 11.sp,
        maxLines = 1
    )
}
