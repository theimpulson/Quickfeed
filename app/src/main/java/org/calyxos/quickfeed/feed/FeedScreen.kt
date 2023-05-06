/*
 * SPDX-FileCopyrightText: 2023 The Calyx Institute
 * SPDX-License-Identifier: Apache-2.0
 */

package org.calyxos.quickfeed.feed

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun FeedScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize())
}

@Composable
@Preview(showBackground = true)
fun FeedScreenPreview() {
    FeedScreen(navController = rememberNavController())
}
