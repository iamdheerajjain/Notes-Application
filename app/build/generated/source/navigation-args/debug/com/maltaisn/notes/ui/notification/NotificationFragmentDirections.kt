package com.maltaisn.notes.ui.notification

import android.os.Bundle
import androidx.navigation.NavDirections
import com.maltaisn.notes.R
import kotlin.Int
import kotlin.Long

public class NotificationFragmentDirections private constructor() {
  private data class ActionReminderPostponeDate(
    public val date: Long,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_reminder_postpone_date

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("date", this.date)
        return result
      }
  }

  private data class ActionReminderPostponeTime(
    public val date: Long,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_reminder_postpone_time

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("date", this.date)
        return result
      }
  }

  public companion object {
    public fun actionReminderPostponeDate(date: Long): NavDirections =
        ActionReminderPostponeDate(date)

    public fun actionReminderPostponeTime(date: Long): NavDirections =
        ActionReminderPostponeTime(date)
  }
}
