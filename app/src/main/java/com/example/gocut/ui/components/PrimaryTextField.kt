package com.example.gocut.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.gocut.ui.theme.TextFieldShape
import com.example.gocut.ui.theme.darkGrey
import com.example.gocut.ui.theme.lightGrey
import com.example.gocut.util.Constants.P_NUMBER_LIMIT

@Composable
fun PrimaryTextField(
    modifier: Modifier = Modifier,
    text: String,
    onTextChanged: (String) -> Unit,
    placeholder: String,
    trailingIcon: Painter,
    onClearClicked: () -> Unit,
    onDoneClicked: () -> Unit
) {
    val focusManager = LocalFocusManager.current
    val maxCharacterCount = P_NUMBER_LIMIT
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(TextFieldShape)
            .border(
                BorderStroke(
                    1.dp,
                    SolidColor(lightGrey)
                ),
                TextFieldShape
            ),
        contentAlignment = Alignment.Center
    ) {
        OutlinedTextField(
            modifier = modifier
                .heightIn(48.dp)
                .fillMaxWidth(),
            value = text,
            onValueChange = {
                if (it.length <= maxCharacterCount) {
                    onTextChanged(it)
                }
            },
            placeholder = {
                Text(
                    text = placeholder,
                    fontStyle = MaterialTheme.typography.subtitle1.fontStyle,
                    fontWeight = FontWeight.Medium,
                    color = darkGrey,
                    modifier = modifier.offset(y = 1.dp)
                )
            },
            textStyle = TextStyle(
                color = MaterialTheme.colors.onSurface,
                fontStyle = MaterialTheme.typography.subtitle1.fontStyle,
                fontWeight = FontWeight.Medium,
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = MaterialTheme.colors.secondary,
                trailingIconColor = MaterialTheme.colors.onBackground,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
            ),
            trailingIcon = {
                if (text.isNotBlank()) {
                    IconButton(
                        onClick = {
                            onClearClicked()
                        }
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(18.dp),
                            painter = trailingIcon,
                            contentDescription = "clear text"
                        )
                    }
                }
            },
            singleLine = true,
            maxLines = 1,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    onDoneClicked()
                    focusManager.clearFocus()

                }
            )

        )
    }
}
