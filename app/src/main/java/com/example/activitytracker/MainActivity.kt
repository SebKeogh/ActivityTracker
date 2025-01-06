package com.example.activitytracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


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
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        domains.forEach { domain ->
            Row(modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp), horizontalArrangement = Arrangement.Center)
            {
                Button(
                    onClick = { /* Handle domain click */ },
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = domain.name, style = MaterialTheme.typography.labelLarge)
                        Text(text = "00h 00m 00s", style = MaterialTheme.typography.labelSmall)
                    }
                }
            }
            Row(modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp), horizontalArrangement = Arrangement.SpaceEvenly)
            {
                domain.categories.forEach { category ->
                    Button(
                        onClick = { /* Handle category clicking */ },
                    ) {
                        Text(text = category.name, style = MaterialTheme.typography.labelMedium)
                    }
                }
            }
        }
    }
}