package com.maltaisn.notes.ui.settings

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

public class SettingsFragmentDirections private constructor() {
  private data class ActionNestedSettings(
    public val prefsXml: Int,
    public val prefsTitle: Int,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_nested_settings

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("prefsXml", this.prefsXml)
        result.putInt("prefsTitle", this.prefsTitle)
        return result
      }
  }

  public companion object {
    public fun actionAboutLibraries(): NavDirections =
        ActionOnlyNavDirections(R.id.action_about_libraries)

    public fun actionNestedSettings(prefsXml: Int, prefsTitle: Int): NavDirections =
        ActionNestedSettings(prefsXml, prefsTitle)

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
