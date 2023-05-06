/*
 * SPDX-FileCopyrightText: 2023 The Calyx Institute
 * SPDX-License-Identifier: Apache-2.0
 */

package org.calyxos.quickfeed.navigation

sealed class Screen(val route: String) {
    object Feed : Screen(route = "feed_screen")
}
