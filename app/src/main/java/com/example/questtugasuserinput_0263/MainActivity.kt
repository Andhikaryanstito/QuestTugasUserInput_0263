package com.example.questtugasuserinput_0263

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.questtugasuserinput_0263.ui.theme.QuestTugasUserInput_0263Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestTugasUserInput_0263Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FormBiodata(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}