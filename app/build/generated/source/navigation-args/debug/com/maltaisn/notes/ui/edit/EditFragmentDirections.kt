package com.maltaisn.notes.ui.edit

import androidx.navigation.NavDirections
import com.maltaisn.notes.NavGraphMainDirections
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String

public class EditFragmentDirections private constructor() {
  public companion object {
    public fun actionEditNote(
      noteId: Long = 0L,
      labelId: Long = 0L,
      changeReminder: Boolean = false,
      type: Int = 0,
      title: String = "",
      content: String = "",
    ): NavDirections = NavGraphMainDirections.actionEditNote(noteId, labelId, changeReminder, type,
        title, content)

    public fun actionReminder(noteIds: LongArray): NavDirections =
        NavGraphMainDirections.actionReminder(noteIds)

    public fun actionLabel(noteIds: LongArray): NavDirections =
        NavGraphMainDirections.actionLabel(noteIds)
  }
}
