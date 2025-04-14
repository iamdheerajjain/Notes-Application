package com.maltaisn.notes.ui.edit.adapter

import androidx.recyclerview.widget.DiffUtil

class EditDiffCallback : DiffUtil.ItemCallback<EditListItem>() {

    override fun areItemsTheSame(old: EditListItem, new: EditListItem) = when {
        // Checked header item is recreated when count changes
        old is EditCheckedHeaderItem && new is EditCheckedHeaderItem -> true
        // Items are not recreated on a change so just check if they're the same object.
        else -> old === new
    }

    override fun areContentsTheSame(old: EditListItem, new: EditListItem) = when {
        old is EditCheckedHeaderItem && new is EditCheckedHeaderItem -> old.count == new.count
        // If this is called, then old === new, so content is necessarily the same.
        else -> true
    }
}
