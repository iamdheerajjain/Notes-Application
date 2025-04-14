package com.maltaisn.notes.ui

import com.maltaisn.notes.R
import com.maltaisn.notes.model.ValueEnum
import com.maltaisn.notes.model.findValueEnum

/**
 * Enum for different app themes.
 * [value] is from [R.array.pref_theme_values].
 */
enum class AppTheme(override val value: String) : ValueEnum<String> {
    LIGHT("light"),
    DARK("dark"),
    SYSTEM("system");

    companion object {
        fun fromValue(value: String): AppTheme = findValueEnum(value)
    }
}
