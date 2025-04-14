package com.maltaisn.notes.ui.notification

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ReminderPostponeTimeDialogArgs(
  public val date: Long,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("date", this.date)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("date", this.date)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ReminderPostponeTimeDialogArgs {
      bundle.setClassLoader(ReminderPostponeTimeDialogArgs::class.java.classLoader)
      val __date : Long
      if (bundle.containsKey("date")) {
        __date = bundle.getLong("date")
      } else {
        throw IllegalArgumentException("Required argument \"date\" is missing and does not have an android:defaultValue")
      }
      return ReminderPostponeTimeDialogArgs(__date)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        ReminderPostponeTimeDialogArgs {
      val __date : Long?
      if (savedStateHandle.contains("date")) {
        __date = savedStateHandle["date"]
        if (__date == null) {
          throw IllegalArgumentException("Argument \"date\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"date\" is missing and does not have an android:defaultValue")
      }
      return ReminderPostponeTimeDialogArgs(__date)
    }
  }
}
