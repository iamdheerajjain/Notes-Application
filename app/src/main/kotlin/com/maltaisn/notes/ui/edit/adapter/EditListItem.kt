package com.maltaisn.notes.ui.edit.adapter

import com.maltaisn.notes.ui.edit.adapter.EditAdapter.ViewType

sealed class EditListItem {
    abstract val type: ViewType
}

data class EditDateItem(
    val date: Long
) : EditListItem() {

    override val type get() = ViewType.DATE
}

data class EditTitleItem(
    var title: EditableText,
    val editable: Boolean
) : EditListItem() {

    override val type get() = ViewType.TITLE
}

data class EditContentItem(
    var content: EditableText,
    val editable: Boolean
) : EditListItem() {

    override val type get() = ViewType.CONTENT
}

data class EditItemItem(
    var content: EditableText,
    var checked: Boolean,
    val editable: Boolean,
    var actualPos: Int,
) : EditListItem() {

    override val type get() = ViewType.ITEM
}

object EditItemAddItem : EditListItem() {

    override val type get() = ViewType.ITEM_ADD
}

data class EditCheckedHeaderItem(
    var count: Int
) : EditListItem() {

    override val type get() = ViewType.ITEM_CHECKED_HEADER
}

data class EditChipsItem(
    // Chips can be Label or Reminder
    val chips: List<Any>
) : EditListItem() {

    override val type get() = ViewType.ITEM_CHIPS
}

/**
 * This is needed so the view model can know the text and each item at all times and be able
 * to change it. An interface is used to provide a different test implementation.
 * The alternative would be the call the view model every time an item text is changed by
 * user, which wouldn't be great for performance since `toString()` would be needed every time.
 */
interface EditableText {
    val text: CharSequence

    fun append(text: CharSequence)
    fun replaceAll(text: CharSequence)
}
