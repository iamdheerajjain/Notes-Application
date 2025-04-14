package com.maltaisn.notes.ui.note;

/**
 * This view model provides common behavior for home and search view models.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b&\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0004\u0096\u0001\u0097\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010f\u001a\u00020%J&\u0010g\u001a\u00020%2\u0018\u0010h\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0j\u0012\u0004\u0012\u00020%0iH\u0084\b\u00f8\u0001\u0000J\u001e\u0010k\u001a\u00020%2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020!0U2\u0006\u0010m\u001a\u00020QH\u0004J\u0010\u0010n\u001a\u00020%2\u0006\u0010m\u001a\u00020QH\u0002J\u0006\u0010o\u001a\u00020%J\u0016\u0010p\u001a\u00020%2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020rJ\u0006\u0010t\u001a\u00020%J\u0006\u0010u\u001a\u00020%J\u0006\u0010v\u001a\u00020%J\u0010\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020zH\u0016J\u0010\u0010{\u001a\u00020c2\u0006\u0010|\u001a\u00020!H\u0004J\u0006\u0010}\u001a\u00020%J\b\u0010~\u001a\u00020%H\u0014J\u001b\u0010\u007f\u001a\u00020%2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0017H\u0016J\u001c\u0010\u0083\u0001\u001a\u00020%2\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0017H\u0016J\u001c\u0010\u0085\u0001\u001a\u00020%2\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0017H\u0016J\u001c\u0010\u0086\u0001\u001a\u00020%2\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0017H\u0016J\u001a\u0010\u0087\u0001\u001a\u00020%2\u0007\u0010\u0082\u0001\u001a\u00020\u00172\u0006\u0010y\u001a\u00020zH\u0016J\t\u0010\u0088\u0001\u001a\u00020%H\u0014J\t\u0010\u0089\u0001\u001a\u00020%H\u0002J\u0007\u0010\u008a\u0001\u001a\u00020%J\u0012\u0010\u008b\u0001\u001a\u00020%2\u0007\u0010\u008c\u0001\u001a\u00020cH\u0002J\u0007\u0010\u008d\u0001\u001a\u00020%J\u0007\u0010\u008e\u0001\u001a\u00020%J\u001c\u0010\u008f\u0001\u001a\u00020%2\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0017H\u0002J\u0007\u0010\u0090\u0001\u001a\u00020%J\u0007\u0010\u0091\u0001\u001a\u00020%J\t\u0010\u0092\u0001\u001a\u00020%H\u0014J\t\u0010\u0093\u0001\u001a\u00020\u001eH&J\u0010\u0010\u0094\u0001\u001a\u00020%H\u0084@\u00a2\u0006\u0003\u0010\u0095\u0001R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00140\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120+8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R)\u0010.\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u00140+8F\u00a2\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R0\u00103\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b@DX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00190+8F\u00a2\u0006\u0006\u001a\u0004\b9\u0010-R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0+8F\u00a2\u0006\u0006\u001a\u0004\b=\u0010-R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0019\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0+8F\u00a2\u0006\u0006\u001a\u0004\bG\u0010-R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0010\u0010L\u001a\u0004\u0018\u00010?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00160 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010P\u001a\u0004\u0018\u00010QX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020!0U8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\bV\u0010WR\u001d\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00140+8F\u00a2\u0006\u0006\u001a\u0004\bY\u0010-R\u001d\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140+8F\u00a2\u0006\u0006\u001a\u0004\b[\u0010-R#\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u00140+8F\u00a2\u0006\u0006\u001a\u0004\b]\u0010-R#\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u00140+8F\u00a2\u0006\u0006\u001a\u0004\b_\u0010-R\u001d\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00140+8F\u00a2\u0006\u0006\u001a\u0004\ba\u0010-R\u0014\u0010b\u001a\u00020c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0098\u0001"}, d2 = {"Lcom/maltaisn/notes/ui/note/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$Callback;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "notesRepository", "Lcom/maltaisn/notes/model/NotesRepository;", "labelsRepository", "Lcom/maltaisn/notes/model/LabelsRepository;", "prefs", "Lcom/maltaisn/notes/model/PrefsManager;", "noteItemFactory", "Lcom/maltaisn/notes/ui/note/NoteItemFactory;", "reminderAlarmManager", "Lcom/maltaisn/notes/model/ReminderAlarmManager;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/maltaisn/notes/model/NotesRepository;Lcom/maltaisn/notes/model/LabelsRepository;Lcom/maltaisn/notes/model/PrefsManager;Lcom/maltaisn/notes/ui/note/NoteItemFactory;Lcom/maltaisn/notes/model/ReminderAlarmManager;)V", "_currentSelection", "Landroidx/lifecycle/MutableLiveData;", "Lcom/maltaisn/notes/ui/note/NoteViewModel$NoteSelection;", "_editItemEvent", "Lcom/maltaisn/notes/ui/Event;", "Lkotlin/Pair;", "", "", "_listLayoutMode", "Lcom/maltaisn/notes/ui/note/adapter/NoteListLayoutMode;", "_noteItems", "", "Lcom/maltaisn/notes/ui/note/adapter/NoteListItem;", "_placeholderData", "Lcom/maltaisn/notes/ui/note/PlaceholderData;", "_selectedNotes", "", "Lcom/maltaisn/notes/model/entity/Note;", "_shareEvent", "Lcom/maltaisn/notes/ui/ShareData;", "_showDeletedForeverConfirmEvent", "", "_showLabelsFragmentEvent", "_showReminderDialogEvent", "_statusChangeEvent", "Lcom/maltaisn/notes/ui/StatusChange;", "currentSelection", "Landroidx/lifecycle/LiveData;", "getCurrentSelection", "()Landroidx/lifecycle/LiveData;", "editItemEvent", "getEditItemEvent", "getLabelsRepository", "()Lcom/maltaisn/notes/model/LabelsRepository;", "value", "listItems", "getListItems", "()Ljava/util/List;", "setListItems", "(Ljava/util/List;)V", "listLayoutMode", "getListLayoutMode", "getNoteItemFactory", "()Lcom/maltaisn/notes/ui/note/NoteItemFactory;", "noteItems", "getNoteItems", "noteListJob", "Lkotlinx/coroutines/Job;", "getNoteListJob", "()Lkotlinx/coroutines/Job;", "setNoteListJob", "(Lkotlinx/coroutines/Job;)V", "getNotesRepository", "()Lcom/maltaisn/notes/model/NotesRepository;", "placeholderData", "getPlaceholderData", "getPrefs", "()Lcom/maltaisn/notes/model/PrefsManager;", "getReminderAlarmManager", "()Lcom/maltaisn/notes/model/ReminderAlarmManager;", "restoreStateJob", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "selectedNoteIds", "selectedNoteStatus", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "getSelectedNoteStatus", "()Lcom/maltaisn/notes/model/entity/NoteStatus;", "selectedNotes", "", "getSelectedNotes", "()Ljava/util/Set;", "shareEvent", "getShareEvent", "showDeleteConfirmEvent", "getShowDeleteConfirmEvent", "showLabelsFragmentEvent", "getShowLabelsFragmentEvent", "showReminderDialogEvent", "getShowReminderDialogEvent", "statusChangeEvent", "getStatusChangeEvent", "strikethroughCheckedItems", "", "getStrikethroughCheckedItems", "()Z", "changeLabels", "changeListItems", "change", "Lkotlin/Function1;", "", "changeNotesStatus", "notes", "newStatus", "changeSelectedNotesStatus", "clearSelection", "copySelectedNote", "untitledName", "", "copySuffix", "createReminder", "deleteSelectedNotes", "deleteSelectedNotesPre", "getNoteSwipeAction", "Lcom/maltaisn/notes/ui/note/SwipeAction;", "direction", "Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$SwipeDirection;", "isNoteSelected", "note", "moveSelectedNotes", "onListLayoutModeChanged", "onMessageItemDismissed", "item", "Lcom/maltaisn/notes/ui/note/adapter/MessageItem;", "pos", "onNoteActionButtonClicked", "Lcom/maltaisn/notes/ui/note/adapter/NoteItem;", "onNoteItemClicked", "onNoteItemLongClicked", "onNoteSwiped", "restoreState", "saveNoteSelectionState", "selectAll", "setAllSelected", "selected", "shareSelectedNote", "stopUpdatingList", "toggleItemChecked", "toggleListLayoutMode", "togglePin", "updateNoteSelection", "updatePlaceholder", "waitForRestoredState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "NoteSelection", "app_debug"})
public abstract class NoteViewModel extends androidx.lifecycle.ViewModel implements com.maltaisn.notes.ui.note.adapter.NoteAdapter.Callback {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.NotesRepository notesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.LabelsRepository labelsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.PrefsManager prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.ui.note.NoteItemFactory noteItemFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.maltaisn.notes.ui.note.adapter.NoteListItem> listItems;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<com.maltaisn.notes.model.entity.Note> _selectedNotes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.Long> selectedNoteIds = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.maltaisn.notes.ui.note.adapter.NoteListItem>> _noteItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.note.adapter.NoteListLayoutMode> _listLayoutMode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Pair<java.lang.Long, java.lang.Integer>>> _editItemEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.ShareData>> _shareEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.StatusChange>> _statusChangeEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.note.NoteViewModel.NoteSelection> _currentSelection = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.note.PlaceholderData> _placeholderData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.util.List<java.lang.Long>>> _showReminderDialogEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.util.List<java.lang.Long>>> _showLabelsFragmentEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> _showDeletedForeverConfirmEvent = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job noteListJob;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job restoreStateJob;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_SELECTED_IDS = "selected_ids";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.note.NoteViewModel.Companion Companion = null;
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesRepository notesRepository, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.LabelsRepository labelsRepository, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager prefs, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.NoteItemFactory noteItemFactory, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.SavedStateHandle getSavedStateHandle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.maltaisn.notes.model.NotesRepository getNotesRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.maltaisn.notes.model.LabelsRepository getLabelsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.maltaisn.notes.model.PrefsManager getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.maltaisn.notes.ui.note.NoteItemFactory getNoteItemFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.maltaisn.notes.model.ReminderAlarmManager getReminderAlarmManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.List<com.maltaisn.notes.ui.note.adapter.NoteListItem> getListItems() {
        return null;
    }
    
    protected final void setListItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.maltaisn.notes.ui.note.adapter.NoteListItem> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.Set<com.maltaisn.notes.model.entity.Note> getSelectedNotes() {
        return null;
    }
    
    /**
     * Implementation should return the "global" status of the selected notes.
     * This is used to determine what move event will do on the selected notes.
     */
    @org.jetbrains.annotations.Nullable()
    protected abstract com.maltaisn.notes.model.entity.NoteStatus getSelectedNoteStatus();
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.maltaisn.notes.ui.note.adapter.NoteListItem>> getNoteItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.note.adapter.NoteListLayoutMode> getListLayoutMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<kotlin.Pair<java.lang.Long, java.lang.Integer>>> getEditItemEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.ShareData>> getShareEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.StatusChange>> getStatusChangeEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.note.NoteViewModel.NoteSelection> getCurrentSelection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.note.PlaceholderData> getPlaceholderData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.util.List<java.lang.Long>>> getShowReminderDialogEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.util.List<java.lang.Long>>> getShowLabelsFragmentEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> getShowDeleteConfirmEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlinx.coroutines.Job getNoteListJob() {
        return null;
    }
    
    protected final void setNoteListJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    /**
     * Restore the state of this fragment from [savedStateHandle].
     * Must be called by child to ensure child is fully constructed before restoring state.
     * Notice that state restoration is suspending, so when initializing the child view model,
     * [waitForRestoredState] must be called to wait for state restoration to be complete.
     */
    protected void restoreState() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.lang.Object waitForRestoredState(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Stop updating list. This is called when the fragment view is destroyed to
     * prevent useless updates when the fragment isn't visible but the view model still exists.
     */
    public final void stopUpdatingList() {
    }
    
    /**
     * Called when note list is empty to update the placeholder data.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.ui.note.PlaceholderData updatePlaceholder();
    
    public final void clearSelection() {
    }
    
    public final void selectAll() {
    }
    
    public final void togglePin() {
    }
    
    public final void createReminder() {
    }
    
    public final void changeLabels() {
    }
    
    protected void onListLayoutModeChanged() {
    }
    
    public final void toggleListLayoutMode() {
    }
    
    public final void moveSelectedNotes() {
    }
    
    public final void deleteSelectedNotesPre() {
    }
    
    public final void deleteSelectedNotes() {
    }
    
    public final void copySelectedNote(@org.jetbrains.annotations.NotNull()
    java.lang.String untitledName, @org.jetbrains.annotations.NotNull()
    java.lang.String copySuffix) {
    }
    
    public final void shareSelectedNote() {
    }
    
    /**
     * Set the selected state of all notes to [selected].
     */
    private final void setAllSelected(boolean selected) {
    }
    
    protected final boolean isNoteSelected(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Note note) {
        return false;
    }
    
    /**
     * Update current selection live data to reflect current selection.
     */
    protected void updateNoteSelection() {
    }
    
    /**
     * Save [selectedNotes] to [savedStateHandle].
     */
    private final void saveNoteSelectionState() {
    }
    
    /**
     * Change the status of [notes] to [newStatus].
     */
    protected final void changeNotesStatus(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.maltaisn.notes.model.entity.Note> notes, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteStatus newStatus) {
    }
    
    /**
     * Change the status of selected notes to [newStatus], and clear selection.
     */
    private final void changeSelectedNotesStatus(com.maltaisn.notes.model.entity.NoteStatus newStatus) {
    }
    
    @java.lang.Override()
    public void onNoteItemClicked(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.NoteItem item, int pos) {
    }
    
    @java.lang.Override()
    public void onNoteItemLongClicked(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.NoteItem item, int pos) {
    }
    
    private final void toggleItemChecked(com.maltaisn.notes.ui.note.adapter.NoteItem item, int pos) {
    }
    
    @java.lang.Override()
    public void onMessageItemDismissed(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.MessageItem item, int pos) {
    }
    
    @java.lang.Override()
    public void onNoteActionButtonClicked(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.NoteItem item, int pos) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.maltaisn.notes.ui.note.SwipeAction getNoteSwipeAction(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.NoteAdapter.SwipeDirection direction) {
        return null;
    }
    
    @java.lang.Override()
    public void onNoteSwiped(int pos, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.NoteAdapter.SwipeDirection direction) {
    }
    
    @java.lang.Override()
    public boolean getStrikethroughCheckedItems() {
        return false;
    }
    
    protected final void changeListItems(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.maltaisn.notes.ui.note.adapter.NoteListItem>, kotlin.Unit> change) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/maltaisn/notes/ui/note/NoteViewModel$Companion;", "", "()V", "KEY_SELECTED_IDS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/maltaisn/notes/ui/note/NoteViewModel$NoteSelection;", "", "count", "", "status", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "pinned", "Lcom/maltaisn/notes/model/entity/PinnedStatus;", "hasReminder", "", "(ILcom/maltaisn/notes/model/entity/NoteStatus;Lcom/maltaisn/notes/model/entity/PinnedStatus;Z)V", "getCount", "()I", "getHasReminder", "()Z", "getPinned", "()Lcom/maltaisn/notes/model/entity/PinnedStatus;", "getStatus", "()Lcom/maltaisn/notes/model/entity/NoteStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
    public static final class NoteSelection {
        private final int count = 0;
        @org.jetbrains.annotations.Nullable()
        private final com.maltaisn.notes.model.entity.NoteStatus status = null;
        @org.jetbrains.annotations.NotNull()
        private final com.maltaisn.notes.model.entity.PinnedStatus pinned = null;
        private final boolean hasReminder = false;
        
        public NoteSelection(int count, @org.jetbrains.annotations.Nullable()
        com.maltaisn.notes.model.entity.NoteStatus status, @org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.entity.PinnedStatus pinned, boolean hasReminder) {
            super();
        }
        
        public final int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.maltaisn.notes.model.entity.NoteStatus getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.model.entity.PinnedStatus getPinned() {
            return null;
        }
        
        public final boolean getHasReminder() {
            return false;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.maltaisn.notes.model.entity.NoteStatus component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.model.entity.PinnedStatus component3() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.note.NoteViewModel.NoteSelection copy(int count, @org.jetbrains.annotations.Nullable()
        com.maltaisn.notes.model.entity.NoteStatus status, @org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.entity.PinnedStatus pinned, boolean hasReminder) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}