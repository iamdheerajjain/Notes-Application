package com.maltaisn.notes.ui.reminder

import androidx.navigation.NavDirections
import com.maltaisn.notes.NavGraphReminderDirections
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String

public class ReminderDialogDirections private constructor() {
  public companion object {
    public fun actionEditNote(
      noteId: Long = 0L,
      labelId: Long = 0L,
      changeReminder: Boolean = false,
      type: Int = 0,
      title: String = "",
      content: String = "",
    ): NavDirections = NavGraphReminderDirections.actionEditNote(noteId, labelId, changeReminder,
        type, title, content)

    public fun actionReminder(noteIds: LongArray): NavDirections =
        NavGraphReminderDirections.actionReminder(noteIds)

    public fun actionLabel(noteIds: LongArray): NavDirections =
        NavGraphReminderDirections.actionLabel(noteIds)
  }
}
