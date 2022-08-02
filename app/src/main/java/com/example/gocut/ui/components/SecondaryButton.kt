package com.example.gocut.ui.components

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.gocut.R
import com.example.gocut.ui.theme.ButtonShape
import com.example.gocut.ui.theme.transparent

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    TextButton(
        onClick = {
            onClick()
        },
        shape = ButtonShape,
        modifier = modifier
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.button_height))
    ) {
        Text(
            text = text,
            fontFamily = MaterialTheme.typography.button.fontFamily
        )
    }
}

@Composable
@Preview
fun ButtonSecondaryTest() {
    SecondaryButton(text = "Continue", onClick = { })
}