package com.maltaisn.notes.ui.sort;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/maltaisn/notes/ui/sort/SortViewModel;", "Landroidx/lifecycle/ViewModel;", "prefs", "Lcom/maltaisn/notes/model/PrefsManager;", "(Lcom/maltaisn/notes/model/PrefsManager;)V", "_sortDirection", "Landroidx/lifecycle/MutableLiveData;", "Lcom/maltaisn/notes/ui/Event;", "Lcom/maltaisn/notes/model/SortDirection;", "_sortField", "Lcom/maltaisn/notes/model/SortField;", "sortDirection", "Landroidx/lifecycle/LiveData;", "getSortDirection", "()Landroidx/lifecycle/LiveData;", "sortField", "getSortField", "start", "", "app_debug"})
public final class SortViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.PrefsManager prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.SortField>> _sortField = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.SortDirection>> _sortDirection = null;
    
    @javax.inject.Inject()
    public SortViewModel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager prefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.SortField>> getSortField() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.SortDirection>> getSortDirection() {
        return null;
    }
    
    public final void start() {
    }
}