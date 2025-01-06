package com.example.activitytracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BestLayout()
        }
    }
}

@Preview()
@Composable
fun BestLayout() {
    val domains = DomainData.domains
    // TODO:: This should probably be a lazy column, for scrolling
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        domains.forEach { domain ->
            Box( modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
                .background(Color.DarkGray)
                .border(width = 1.dp, color = Color.Blue)
            ) {
                Column(
                    modifier = Modifier.align(Alignment.TopCenter).padding(6.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text = domain.name, style = MaterialTheme.typography.labelLarge)
                    Text(text = "00:00:00", style = MaterialTheme.typography.labelSmall)
                    Row (modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        domain.categories.forEach { category ->
                            Button(
                                onClick = { /* TODO:: This */ },
                                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 4.dp)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(text = category.name)
                                    Text(text = "00:00:00", style = MaterialTheme.typography.labelSmall, fontSize = 8.sp)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}