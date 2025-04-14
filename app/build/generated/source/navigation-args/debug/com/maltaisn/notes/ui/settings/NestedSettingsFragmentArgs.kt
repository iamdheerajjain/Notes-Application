package com.maltaisn.notes.ui.settings

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class NestedSettingsFragmentArgs(
  public val prefsXml: Int,
  public val prefsTitle: Int,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("prefsXml", this.prefsXml)
    result.putInt("prefsTitle", this.prefsTitle)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("prefsXml", this.prefsXml)
    result.set("prefsTitle", this.prefsTitle)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): NestedSettingsFragmentArgs {
      bundle.setClassLoader(NestedSettingsFragmentArgs::class.java.classLoader)
      val __prefsXml : Int
      if (bundle.containsKey("prefsXml")) {
        __prefsXml = bundle.getInt("prefsXml")
      } else {
        throw IllegalArgumentException("Required argument \"prefsXml\" is missing and does not have an android:defaultValue")
      }
      val __prefsTitle : Int
      if (bundle.containsKey("prefsTitle")) {
        __prefsTitle = bundle.getInt("prefsTitle")
      } else {
        throw IllegalArgumentException("Required argument \"prefsTitle\" is missing and does not have an android:defaultValue")
      }
      return NestedSettingsFragmentArgs(__prefsXml, __prefsTitle)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        NestedSettingsFragmentArgs {
      val __prefsXml : Int?
      if (savedStateHandle.contains("prefsXml")) {
        __prefsXml = savedStateHandle["prefsXml"]
        if (__prefsXml == null) {
          throw IllegalArgumentException("Argument \"prefsXml\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"prefsXml\" is missing and does not have an android:defaultValue")
      }
      val __prefsTitle : Int?
      if (savedStateHandle.contains("prefsTitle")) {
        __prefsTitle = savedStateHandle["prefsTitle"]
        if (__prefsTitle == null) {
          throw IllegalArgumentException("Argument \"prefsTitle\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"prefsTitle\" is missing and does not have an android:defaultValue")
      }
      return NestedSettingsFragmentArgs(__prefsXml, __prefsTitle)
    }
  }
}
