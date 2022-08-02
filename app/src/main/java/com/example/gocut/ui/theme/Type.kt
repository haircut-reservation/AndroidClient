package com.example.gocut.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.gocut.R

val urbanistBlack = FontFamily(Font(R.font.urbanist_black))
val urbanistBold = FontFamily(Font(R.font.urbanist_bold))
val urbanistSemiBold = FontFamily(Font(R.font.urbanist_semibold))
val urbanistMedium = FontFamily(Font(R.font.urbanist_medium))
val urbanistRegular = FontFamily(Font(R.font.urbanist_regular))

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = urbanistBold,
        fontSize = 24.sp
    ),
    h2 = TextStyle(
        fontFamily = urbanistBlack,
        fontSize = 20.sp
    ),
    h3 = TextStyle(
        fontFamily = urbanistBlack,
        fontSize = 12.sp
    ),
    button = TextStyle(
        fontFamily = urbanistSemiBold,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = urbanistRegular,
        fontSize = 18.sp
    ),
    body2 = TextStyle(
        fontFamily = urbanistRegular,
        fontSize = 16.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = urbanistMedium,
        fontSize = 12.sp
    ),
    caption = TextStyle(
        fontFamily = urbanistRegular,
        fontSize = 10.sp
    )
    /**
     * 24 bold
     * 20 black
     * 14 bold
     * 12 semi bold
     * 10 regular
     * 16 regular
     * 18 regular
     * 12 medium
     */
)