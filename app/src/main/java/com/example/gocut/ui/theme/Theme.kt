package com.example.gocut.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val brandColorPalette = darkColors(
    primary = buttonTextBlack,
    onPrimary = background,
    secondary = primaryBlue,
    onSecondary = buttonTextBlack,
    background = primaryBlueAlpha,
    onBackground = darkGrey,
    surface = background,
    onSurface = paragraphBlack
)

@Composable
fun GoCutTheme(content: @Composable () -> Unit) {
    val colors = brandColorPalette
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}