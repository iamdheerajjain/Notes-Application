package com.maltaisn.notes.ui.edit

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class EditFragmentArgs(
  public val noteId: Long = 0L,
  public val labelId: Long = 0L,
  public val changeReminder: Boolean = false,
  public val type: Int = 0,
  public val title: String = "",
  public val content: String = "",
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("noteId", this.noteId)
    result.putLong("labelId", this.labelId)
    result.putBoolean("changeReminder", this.changeReminder)
    result.putInt("type", this.type)
    result.putString("title", this.title)
    result.putString("content", this.content)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("noteId", this.noteId)
    result.set("labelId", this.labelId)
    result.set("changeReminder", this.changeReminder)
    result.set("type", this.type)
    result.set("title", this.title)
    result.set("content", this.content)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EditFragmentArgs {
      bundle.setClassLoader(EditFragmentArgs::class.java.classLoader)
      val __noteId : Long
      if (bundle.containsKey("noteId")) {
        __noteId = bundle.getLong("noteId")
      } else {
        __noteId = 0L
      }
      val __labelId : Long
      if (bundle.containsKey("labelId")) {
        __labelId = bundle.getLong("labelId")
      } else {
        __labelId = 0L
      }
      val __changeReminder : Boolean
      if (bundle.containsKey("changeReminder")) {
        __changeReminder = bundle.getBoolean("changeReminder")
      } else {
        __changeReminder = false
      }
      val __type : Int
      if (bundle.containsKey("type")) {
        __type = bundle.getInt("type")
      } else {
        __type = 0
      }
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        __title = ""
      }
      val __content : String?
      if (bundle.containsKey("content")) {
        __content = bundle.getString("content")
        if (__content == null) {
          throw IllegalArgumentException("Argument \"content\" is marked as non-null but was passed a null value.")
        }
      } else {
        __content = ""
      }
      return EditFragmentArgs(__noteId, __labelId, __changeReminder, __type, __title, __content)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): EditFragmentArgs {
      val __noteId : Long?
      if (savedStateHandle.contains("noteId")) {
        __noteId = savedStateHandle["noteId"]
        if (__noteId == null) {
          throw IllegalArgumentException("Argument \"noteId\" of type long does not support null values")
        }
      } else {
        __noteId = 0L
      }
      val __labelId : Long?
      if (savedStateHandle.contains("labelId")) {
        __labelId = savedStateHandle["labelId"]
        if (__labelId == null) {
          throw IllegalArgumentException("Argument \"labelId\" of type long does not support null values")
        }
      } else {
        __labelId = 0L
      }
      val __changeReminder : Boolean?
      if (savedStateHandle.contains("changeReminder")) {
        __changeReminder = savedStateHandle["changeReminder"]
        if (__changeReminder == null) {
          throw IllegalArgumentException("Argument \"changeReminder\" of type boolean does not support null values")
        }
      } else {
        __changeReminder = false
      }
      val __type : Int?
      if (savedStateHandle.contains("type")) {
        __type = savedStateHandle["type"]
        if (__type == null) {
          throw IllegalArgumentException("Argument \"type\" of type integer does not support null values")
        }
      } else {
        __type = 0
      }
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value")
        }
      } else {
        __title = ""
      }
      val __content : String?
      if (savedStateHandle.contains("content")) {
        __content = savedStateHandle["content"]
        if (__content == null) {
          throw IllegalArgumentException("Argument \"content\" is marked as non-null but was passed a null value")
        }
      } else {
        __content = ""
      }
      return EditFragmentArgs(__noteId, __labelId, __changeReminder, __type, __title, __content)
    }
  }
}
