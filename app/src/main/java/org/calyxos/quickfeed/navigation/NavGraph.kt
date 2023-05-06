/*
 * SPDX-FileCopyrightText: 2023 The Calyx Institute
 * SPDX-License-Identifier: Apache-2.0
 */

package org.calyxos.quickfeed.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.calyxos.quickfeed.feed.FeedScreen

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.Feed.route) {
        composable(route = Screen.Feed.route) {
            FeedScreen(navHostController)
        }
    }
}
