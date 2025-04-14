package com.maltaisn.notes.model

import com.maltaisn.notes.model.entity.Label
import com.maltaisn.notes.model.entity.LabelRef
import kotlinx.coroutines.flow.Flow

interface LabelsRepository {

    suspend fun insertLabel(label: Label): Long

    suspend fun updateLabel(label: Label)

    suspend fun deleteLabel(label: Label)
    suspend fun deleteLabels(labels: List<Label>)

    suspend fun getLabelById(id: Long): Label?
    suspend fun getLabelByName(name: String): Label?

    suspend fun insertLabelRefs(refs: List<LabelRef>)
    suspend fun deleteLabelRefs(refs: List<LabelRef>)
    suspend fun getLabelIdsForNote(noteId: Long): List<Long>
    suspend fun countLabelRefs(labelId: Long): Long

    fun getAllLabelsByUsage(): Flow<List<Label>>

    suspend fun clearAllData()
}
