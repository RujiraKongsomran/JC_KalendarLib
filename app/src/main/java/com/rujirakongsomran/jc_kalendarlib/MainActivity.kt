package com.rujirakongsomran.jc_kalendarlib

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.himanshoe.kalendar.common.KalendarSelector
import com.himanshoe.kalendar.common.KalendarStyle
import com.himanshoe.kalendar.common.data.KalendarEvent
import com.himanshoe.kalendar.ui.Kalendar
import com.himanshoe.kalendar.ui.KalendarType
import com.rujirakongsomran.jc_kalendarlib.ui.theme.JC_KalendarLibTheme
import java.time.LocalDate

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
    val context = LocalContext.current
    Kalendar(
        kalendarType = KalendarType.Firey(),
        kalendarStyle = KalendarStyle(
            kalendarSelector = KalendarSelector.Circle(),
        ),
        kalendarEvents = listOf(
            KalendarEvent(
                date = LocalDate.of(2022, 2, 28),
                eventName = "Biw Day",
                eventDescription = "Celebrate"
            )
        ),
        onCurrentDayClick = { day, event ->
            Toast.makeText(
                context,
                "${event?.eventName}",
                Toast.LENGTH_SHORT
            ).show()

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
