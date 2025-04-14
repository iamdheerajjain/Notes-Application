package com.maltaisn.notes.ui.note

import com.maltaisn.notes.R
import com.maltaisn.notes.model.ValueEnum
import com.maltaisn.notes.model.findValueEnum

/**
 * Enum for deleted notes timeout.
 * [value] is from [R.array.pref_deleted_notes_timeout_values].
 */
enum class DeletedNotesTimeoutField(override val value: String) : ValueEnum<String> {
    DAY("1"),
    WEEK("7"),
    MONTH("30"),
    YEAR("365");

    companion object {
        fun fromValue(value: String): DeletedNotesTimeoutField = findValueEnum(value)
    }
}