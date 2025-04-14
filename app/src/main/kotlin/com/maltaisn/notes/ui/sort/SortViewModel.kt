package com.maltaisn.notes.ui.sort

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.maltaisn.notes.model.PrefsManager
import com.maltaisn.notes.model.SortDirection
import com.maltaisn.notes.model.SortField
import com.maltaisn.notes.ui.Event
import com.maltaisn.notes.ui.send
import javax.inject.Inject

class SortViewModel @Inject constructor(
    private val prefs: PrefsManager,
) : ViewModel() {

    private val _sortField = MutableLiveData<Event<SortField>>()
    val sortField: LiveData<Event<SortField>>
        get() = _sortField

    private val _sortDirection = MutableLiveData<Event<SortDirection>>()
    val sortDirection: LiveData<Event<SortDirection>>
        get() = _sortDirection

    fun start() {
        _sortField.send(prefs.sortField)
        _sortDirection.send(prefs.sortDirection)
    }
}
