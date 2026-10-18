package com.example.questtugasuserinput_0263

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugasuserinput_0263.ui.theme.QuestTugasUserInput_0263Theme

@Composable
fun FormBiodata(modifier: Modifier = Modifier) {
    // Variabel state untuk menampung input pengguna
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var birthDate by remember { mutableStateOf("") }
    var experience by remember { mutableStateOf("") }
    var isExpDropdownExpanded by remember { mutableStateOf(false) }

    var isSkillAndroid by remember { mutableStateOf(false) }
    var isSkillUiUx by remember { mutableStateOf(false) }
    var isSkillWeb by remember { mutableStateOf(false) }

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

                // Baris Nama Depan & Nama Belakang
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    OutlinedTextField(
                        value = firstName,
                        onValueChange = { firstName = it },
                        label = { Text(text = stringResource(id = R.string.label_first_name)) },
                        shape = RoundedCornerShape(16.dp),
                        singleLine = true,
                        modifier = Modifier.weight(1f)
                    )

                    OutlinedTextField(
                        value = lastName,
                        onValueChange = { lastName = it },
                        label = { Text(text = stringResource(id = R.string.label_last_name)) },
                        shape = RoundedCornerShape(16.dp),
                        singleLine = true,
                        modifier = Modifier.weight(1f)
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Input Email
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = stringResource(id = R.string.label_email)) },
                    shape = RoundedCornerShape(16.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Baris Tanggal Lahir & Experience
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Input Tanggal Lahir
                    OutlinedTextField(
                        value = birthDate,
                        onValueChange = { birthDate = it },
                        label = { Text(text = stringResource(id = R.string.label_birth_date)) },
                        shape = RoundedCornerShape(16.dp),
                        singleLine = true,
                        trailingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_calendar),
                                contentDescription = stringResource(id = R.string.content_desc_calendar),
                                tint = colorResource(id = R.color.text_primary)
                            )
                        },
                        modifier = Modifier.weight(1f)
                    )

                    // Input Experience (Dropdown Menu)
                    Box(modifier = Modifier.weight(1f)) {
                        OutlinedTextField(
                            value = experience,
                            onValueChange = {},
                            readOnly = true,
                            label = { Text(text = stringResource(id = R.string.label_experience)) },
                            shape = RoundedCornerShape(16.dp),
                            trailingIcon = {
                                IconButton(onClick = { isExpDropdownExpanded = !isExpDropdownExpanded }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_dropdown),
                                        contentDescription = stringResource(id = R.string.content_desc_dropdown),
                                        tint = colorResource(id = R.color.text_primary)
                                    )
                                }
                            },
                            modifier = Modifier.fillMaxWidth()
                        )

                        // Area klik transparan di atas TextField
                        Box(
                            modifier = Modifier
                                .matchParentSize()
                                .clickable { isExpDropdownExpanded = !isExpDropdownExpanded }
                        )

                        DropdownMenu(
                            expanded = isExpDropdownExpanded,
                            onDismissRequest = { isExpDropdownExpanded = false }
                        ) {
                            val options = listOf(
                                stringResource(id = R.string.exp_beginner),
                                stringResource(id = R.string.exp_intermediate),
                                stringResource(id = R.string.exp_advanced)
                            )
                            options.forEach { option ->
                                DropdownMenuItem(
                                    text = { Text(text = option) },
                                    onClick = {
                                        experience = option
                                        isExpDropdownExpanded = false
                                    }
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Judul Bagian Skill
                Text(
                    text = stringResource(id = R.string.title_skills),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.text_primary),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(4.dp))

                // Checkbox Android
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable { isSkillAndroid = !isSkillAndroid }
                ) {
                    Checkbox(
                        checked = isSkillAndroid,
                        onCheckedChange = { isSkillAndroid = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = colorResource(id = R.color.checkbox_checked_color)
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.skill_android),
                        fontSize = 13.sp,
                        color = colorResource(id = R.color.text_primary)
                    )
                }

                // Checkbox UI/UX
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable { isSkillUiUx = !isSkillUiUx }
                ) {
                    Checkbox(
                        checked = isSkillUiUx,
                        onCheckedChange = { isSkillUiUx = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = colorResource(id = R.color.checkbox_checked_color)
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.skill_ui_ux),
                        fontSize = 13.sp,
                        color = colorResource(id = R.color.text_primary)
                    )
                }

                // Checkbox Web
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable { isSkillWeb = !isSkillWeb }
                ) {
                    Checkbox(
                        checked = isSkillWeb,
                        onCheckedChange = { isSkillWeb = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = colorResource(id = R.color.checkbox_checked_color)
                        )
                    )
                    Text(
                        text = stringResource(id = R.string.skill_web),
                        fontSize = 13.sp,
                        color = colorResource(id = R.color.text_primary)
                    )
                }
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
