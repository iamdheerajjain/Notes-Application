package com.maltaisn.notes

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String

public class NavGraphMainDirections private constructor() {
  private data class ActionEditNote(
    public val noteId: Long = 0L,
    public val labelId: Long = 0L,
    public val changeReminder: Boolean = false,
    public val type: Int = 0,
    public val title: String = "",
    public val content: String = "",
  ) : NavDirections {
    public override val actionId: Int = R.id.action_edit_note

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("noteId", this.noteId)
        result.putLong("labelId", this.labelId)
        result.putBoolean("changeReminder", this.changeReminder)
        result.putInt("type", this.type)
        result.putString("title", this.title)
        result.putString("content", this.content)
        return result
      }
  }

  private data class ActionReminder(
    public val noteIds: LongArray,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_reminder

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLongArray("noteIds", this.noteIds)
        return result
      }
  }

  private data class ActionLabel(
    public val noteIds: LongArray,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_label

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLongArray("noteIds", this.noteIds)
        return result
      }
  }

  public companion object {
    public fun actionEditNote(
      noteId: Long = 0L,
      labelId: Long = 0L,
      changeReminder: Boolean = false,
      type: Int = 0,
      title: String = "",
      content: String = "",
    ): NavDirections = ActionEditNote(noteId, labelId, changeReminder, type, title, content)

    public fun actionReminder(noteIds: LongArray): NavDirections = ActionReminder(noteIds)

    public fun actionLabel(noteIds: LongArray): NavDirections = ActionLabel(noteIds)
  }
}
