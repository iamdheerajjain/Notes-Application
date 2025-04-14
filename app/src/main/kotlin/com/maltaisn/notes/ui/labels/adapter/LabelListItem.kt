package com.maltaisn.notes.ui.labels.adapter

import com.maltaisn.notes.model.entity.Label

data class LabelListItem(
    val id: Long,
    val label: Label,
    val checked: Boolean
)
