package com.maltaisn.notes.ui.home

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.maltaisn.notes.NavGraphMainDirections
import com.maltaisn.notes.R
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeToLabelEdit(
    public val labelId: Long = 0L,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_home_to_label_edit

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("labelId", this.labelId)
        return result
      }
  }

  public companion object {
    public fun actionHomeToSearch(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home_to_search)

    public fun actionHomeToSettings(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home_to_settings)

    public fun actionHomeToLabelEdit(labelId: Long = 0L): NavDirections =
        ActionHomeToLabelEdit(labelId)

    public fun actionHomeToSort(): NavDirections = ActionOnlyNavDirections(R.id.action_home_to_sort)

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
