package com.maltaisn.notes.ui.labels

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.LongArray
import kotlin.jvm.JvmStatic

public data class LabelFragmentArgs(
  public val noteIds: LongArray,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLongArray("noteIds", this.noteIds)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("noteIds", this.noteIds)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): LabelFragmentArgs {
      bundle.setClassLoader(LabelFragmentArgs::class.java.classLoader)
      val __noteIds : LongArray?
      if (bundle.containsKey("noteIds")) {
        __noteIds = bundle.getLongArray("noteIds")
        if (__noteIds == null) {
          throw IllegalArgumentException("Argument \"noteIds\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"noteIds\" is missing and does not have an android:defaultValue")
      }
      return LabelFragmentArgs(__noteIds)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): LabelFragmentArgs {
      val __noteIds : LongArray?
      if (savedStateHandle.contains("noteIds")) {
        __noteIds = savedStateHandle["noteIds"]
        if (__noteIds == null) {
          throw IllegalArgumentException("Argument \"noteIds\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"noteIds\" is missing and does not have an android:defaultValue")
      }
      return LabelFragmentArgs(__noteIds)
    }
  }
}
