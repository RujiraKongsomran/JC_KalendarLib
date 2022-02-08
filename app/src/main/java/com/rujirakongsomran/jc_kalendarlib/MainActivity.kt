package com.rujirakongsomran.jc_kalendarlib

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.himanshoe.kalendar.common.KalendarKonfig
import com.himanshoe.kalendar.common.YearRange
import com.himanshoe.kalendar.ui.Kalendar
import com.himanshoe.kalendar.ui.KalendarType
import com.rujirakongsomran.jc_kalendarlib.ui.theme.JC_KalendarLibTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_KalendarLibTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CreateCalendar()
                }
            }
        }
    }
}

@Composable
fun CreateCalendar() {
    Kalendar(
        kalendarType = KalendarType.Firey(),
        kalendarKonfig = KalendarKonfig(
            yearRange = YearRange(0,5)
        ),
        onCurrentDayClick = { day, event ->
        }, errorMessage = {

        })
}

@Preview(showBackground = true)
@Composable
fun CreateCalendarPreview() {
    JC_KalendarLibTheme {
        CreateCalendar()
    }
}
