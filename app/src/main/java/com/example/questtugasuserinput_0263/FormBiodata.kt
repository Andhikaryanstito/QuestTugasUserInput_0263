package com.example.questtugasuserinput_0263

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.questtugasuserinput_0263.ui.theme.QuestTugasUserInput_0263Theme

@Composable
fun FormBiodata(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        // Layer 1: Wallpaper latar belakang neon spider
        HeaderSection()
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
