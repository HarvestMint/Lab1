package com.example.lab1

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.ui.theme.Lab1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileSection()
                }
            }
        }
    }
}
//The function that contains the code to be displayed.
@Composable
fun ProfileSection(){
    //Box to add the proper padding around everything
    Box(Modifier.padding(16.dp)){
        //Added background color
        Box(modifier = Modifier
        .background(color = Color.DarkGray,
            )){
        //Column to take care of alignment
        Column(modifier = Modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            //Box to crete circle shape around picture.
            Box(Modifier.clip(CircleShape)){
                //Box to control the size of the picture.
                Box( modifier = Modifier
                    .fillMaxSize(0.3f),
                ){
                    //The picture itself.
                    Image(
                        painter = painterResource(R.drawable.pixel_compendium_orca_1_png),
                        contentDescription = null
                    )
                }
            }

            //Title Text with modifiers for size and alignment.
            Text(
                text = "Keyla Christopher",
                Modifier.padding(8.dp),
                textAlign = TextAlign.Justify,
                fontSize = 18.sp

            )
            //Bio Text with modifiers for size and alignment.
            Text(
                text = "Orcas are super cool animals and are my favorite.",
                Modifier.padding(8.dp),
                textAlign = TextAlign.Justify,
                fontSize = 12.sp
            )
        }
    }
    }

}
//creates a preview in the virtual phone
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1Theme {
        Column {

            ProfileSection()
        }
    }
}