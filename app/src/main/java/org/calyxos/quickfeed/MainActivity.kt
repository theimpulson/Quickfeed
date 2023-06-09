/*
 * SPDX-FileCopyrightText: 2023 The Calyx Institute
 * SPDX-License-Identifier: Apache-2.0
 */

package org.calyxos.quickfeed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import org.calyxos.quickfeed.navigation.SetupNavGraph
import org.calyxos.quickfeed.ui.theme.QuickfeedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuickfeedTheme {
                val navController = rememberNavController()
                SetupNavGraph(navHostController = navController)
            }
        }
    }
}
