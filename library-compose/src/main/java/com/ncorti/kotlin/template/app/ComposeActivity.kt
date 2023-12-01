package com.ncorti.kotlin.template.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ncorti.kotlin.template.library.compose.R

class ComposeActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .paint(
                        painter = painterResource(id = R.drawable.bg_main_screen),
                        contentScale = ContentScale.FillBounds
                    )

            ) {
                OnboardingScreen(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 4.dp, horizontal = 24.dp)
                )
            }
        }
    }
}

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_progressbar),
            contentDescription = "Icon",
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_coin),
            contentDescription = "Icon",
            modifier = Modifier
                .height(151.dp)
                .width(215.dp)
                .padding(top = 24.dp)
        )

    }
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(text = "SPEED")
        Text(text = "Do it once,\ndo it fast")
        Text(
            text = "Maecenas donec eget sagittis adipiscing adipiscing. Semper sapien amet, aliquet porttitor parturient nisl, nisi tempor. Sed ut donec nulla turpis nunc sem praesent elementum. Felis.",
            textAlign = TextAlign.Justify
        )
        Button(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(vertical = 8.dp), onClick = { /*TODO*/ }) {
            Text(text = "Register Now")
        }
        OutlinedButton(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(vertical = 8.dp), onClick = { /*TODO*/ }) {
            Text(text = "Already have an account")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.bg_main_screen), contentScale = ContentScale.FillBounds
            )
    ) {
        OnboardingScreen(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 4.dp, horizontal = 24.dp)
        )
        }
}