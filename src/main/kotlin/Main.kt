// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            val stopWatch = remember { StopWatch() }
            StopWatchDisplay(
                formattedTime = stopWatch.formattedTime,
                onStartClick = stopWatch::start,
                onPauseClick = stopWatch::pause,
                onResetClick = stopWatch::reset
            )
        }
    }
}

/*
@Composable
@Preview
fun Preview() {
    MaterialTheme { }
}*/
