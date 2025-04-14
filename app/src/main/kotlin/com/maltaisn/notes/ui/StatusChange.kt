package com.maltaisn.notes.ui

import com.maltaisn.notes.model.entity.Note
import com.maltaisn.notes.model.entity.NoteStatus

/**
 * A class representing a change of status for one or many notes.
 * Status change from [oldStatus] to [newStatus].
 */
data class StatusChange(
    val oldNotes: List<Note>,
    val oldStatus: NoteStatus,
    val newStatus: NoteStatus
)
