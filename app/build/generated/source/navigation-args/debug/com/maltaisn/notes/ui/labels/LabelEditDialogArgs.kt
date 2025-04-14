package com.maltaisn.notes.ui.labels

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class LabelEditDialogArgs(
  public val labelId: Long = 0L,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("labelId", this.labelId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("labelId", this.labelId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): LabelEditDialogArgs {
      bundle.setClassLoader(LabelEditDialogArgs::class.java.classLoader)
      val __labelId : Long
      if (bundle.containsKey("labelId")) {
        __labelId = bundle.getLong("labelId")
      } else {
        __labelId = 0L
      }
      return LabelEditDialogArgs(__labelId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): LabelEditDialogArgs {
      val __labelId : Long?
      if (savedStateHandle.contains("labelId")) {
        __labelId = savedStateHandle["labelId"]
        if (__labelId == null) {
          throw IllegalArgumentException("Argument \"labelId\" of type long does not support null values")
        }
      } else {
        __labelId = 0L
      }
      return LabelEditDialogArgs(__labelId)
    }
  }
}
