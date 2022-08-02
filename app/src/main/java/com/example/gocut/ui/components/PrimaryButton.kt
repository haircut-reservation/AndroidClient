package com.example.gocut.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.gocut.R
import com.example.gocut.ui.theme.ButtonShape

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    isEnabled: Boolean,
) {
    val colors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.secondary,
        contentColor = MaterialTheme.colors.onSecondary,
        disabledBackgroundColor = MaterialTheme.colors.background,
        disabledContentColor = MaterialTheme.colors.onBackground
    )
    Button(
        onClick = {
            onClick
        },
        colors = colors,
        shape = ButtonShape,
        enabled = isEnabled,
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
fun ButtonPrimaryTest() {
    PrimaryButton(text = "Continue", onClick = { }, isEnabled = true)
}