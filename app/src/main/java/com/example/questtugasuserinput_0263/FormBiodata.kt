package com.example.questtugasuserinput_0263

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugasuserinput_0263.ui.theme.QuestTugasUserInput_0263Theme

@Composable
fun FormBiodata(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        // Layer 1: Wallpaper latar belakang neon spider
        HeaderSection()

        // Layer 2: Kontainer Box/Card putih mengapung di atas Scaffold
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 220.dp)
                .shadow(
                    elevation = 12.dp,
                    shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
                    clip = false
                ),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.card_bg)
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp, vertical = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Judul Form
                Text(
                    text = stringResource(id = R.string.title_form_biodata),
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.text_title)
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Subtitle / Panduan Form
                Text(
                    text = stringResource(id = R.string.subtitle_form_biodata),
                    fontSize = 13.sp,
                    color = colorResource(id = R.color.text_subtitle),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

@Composable
fun HeaderSection(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.bagroundspider),
        contentDescription = stringResource(id = R.string.content_desc_header),
        modifier = modifier
            .fillMaxWidth()
            .height(280.dp),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true)
@Composable
fun FormBiodataPreview() {
    QuestTugasUserInput_0263Theme {
        FormBiodata()
    }
}
