package com.maltaisn.notes.ui.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002\u001f B9\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0011J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/maltaisn/notes/ui/search/SearchViewModel;", "Lcom/maltaisn/notes/ui/note/NoteViewModel;", "Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$Callback;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "notesRepository", "Lcom/maltaisn/notes/model/NotesRepository;", "labelsRepository", "Lcom/maltaisn/notes/model/LabelsRepository;", "prefs", "Lcom/maltaisn/notes/model/PrefsManager;", "reminderAlarmManager", "Lcom/maltaisn/notes/model/ReminderAlarmManager;", "noteItemFactory", "Lcom/maltaisn/notes/ui/note/NoteItemFactory;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/maltaisn/notes/model/NotesRepository;Lcom/maltaisn/notes/model/LabelsRepository;Lcom/maltaisn/notes/model/PrefsManager;Lcom/maltaisn/notes/model/ReminderAlarmManager;Lcom/maltaisn/notes/ui/note/NoteItemFactory;)V", "lastQuery", "", "selectedNoteStatus", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "getSelectedNoteStatus", "()Lcom/maltaisn/notes/model/entity/NoteStatus;", "createListItems", "", "notes", "", "Lcom/maltaisn/notes/model/entity/NoteWithLabels;", "searchNotes", "query", "updatePlaceholder", "Lcom/maltaisn/notes/ui/note/PlaceholderData;", "Companion", "Factory", "app_debug"})
public final class SearchViewModel extends com.maltaisn.notes.ui.note.NoteViewModel implements com.maltaisn.notes.ui.note.adapter.NoteAdapter.Callback {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastQuery = "";
    @org.jetbrains.annotations.NotNull()
    private static final com.maltaisn.notes.ui.note.adapter.HeaderItem ARCHIVED_HEADER_ITEM = null;
    private static final long SEARCH_DEBOUNCE_DELAY = 100L;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.search.SearchViewModel.Companion Companion = null;
    
    @dagger.assisted.AssistedInject()
    public SearchViewModel(@dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesRepository notesRepository, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.LabelsRepository labelsRepository, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager prefs, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.NoteItemFactory noteItemFactory) {
        super(null, null, null, null, null, null);
    }
    
    public final void searchNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected com.maltaisn.notes.model.entity.NoteStatus getSelectedNoteStatus() {
        return null;
    }
    
    private final void createListItems(java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels> notes) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.maltaisn.notes.ui.note.PlaceholderData updatePlaceholder() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/maltaisn/notes/ui/search/SearchViewModel$Companion;", "", "()V", "ARCHIVED_HEADER_ITEM", "Lcom/maltaisn/notes/ui/note/adapter/HeaderItem;", "getARCHIVED_HEADER_ITEM", "()Lcom/maltaisn/notes/ui/note/adapter/HeaderItem;", "SEARCH_DEBOUNCE_DELAY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.note.adapter.HeaderItem getARCHIVED_HEADER_ITEM() {
            return null;
        }
    }
    
    @dagger.assisted.AssistedFactory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/search/SearchViewModel$Factory;", "Lcom/maltaisn/notes/ui/AssistedSavedStateViewModelFactory;", "Lcom/maltaisn/notes/ui/search/SearchViewModel;", "create", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_debug"})
    public static abstract interface Factory extends com.maltaisn.notes.ui.AssistedSavedStateViewModelFactory<com.maltaisn.notes.ui.search.SearchViewModel> {
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public abstract com.maltaisn.notes.ui.search.SearchViewModel create(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle);
    }
}