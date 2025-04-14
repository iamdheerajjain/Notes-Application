package com.maltaisn.notes.ui;

/**
 * Shared view model used to send Snackbars from a fragment being popped from backstack.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\tJ\u000e\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u0018J\u000e\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0013J\u0006\u00108\u001a\u00020\fJ\u000e\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u000eJ\u0010\u0010;\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010\u0015J\u000e\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u001aJ\u0006\u0010?\u001a\u00020\fJ\u0006\u0010@\u001a\u00020\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001eR\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0010\u0010%\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u001eR\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u001eR\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u001e\u00a8\u0006A"}, d2 = {"Lcom/maltaisn/notes/ui/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "notesRepository", "Lcom/maltaisn/notes/model/NotesRepository;", "reminderAlarmManager", "Lcom/maltaisn/notes/model/ReminderAlarmManager;", "(Lcom/maltaisn/notes/model/NotesRepository;Lcom/maltaisn/notes/model/ReminderAlarmManager;)V", "_currentHomeDestination", "Landroidx/lifecycle/MutableLiveData;", "Lcom/maltaisn/notes/ui/navigation/HomeDestination;", "_currentHomeDestinationChangeEvent", "Lcom/maltaisn/notes/ui/Event;", "", "_labelAddEventNav", "Lcom/maltaisn/notes/model/entity/Label;", "_labelAddEventSelect", "_messageEvent", "", "_noteCreatedEvent", "", "_reminderChangeEvent", "Lcom/maltaisn/notes/model/entity/Reminder;", "_sharedElementTransitionFinishedEvent", "_sortChangeEvent", "Lcom/maltaisn/notes/model/SortSettings;", "_statusChangeEvent", "Lcom/maltaisn/notes/ui/StatusChange;", "currentHomeDestination", "Landroidx/lifecycle/LiveData;", "getCurrentHomeDestination", "()Landroidx/lifecycle/LiveData;", "currentHomeDestinationChangeEvent", "getCurrentHomeDestinationChangeEvent", "labelAddEventNav", "getLabelAddEventNav", "labelAddEventSelect", "getLabelAddEventSelect", "lastStatusChange", "messageEvent", "getMessageEvent", "noteCreatedEvent", "getNoteCreatedEvent", "reminderChangeEvent", "getReminderChangeEvent", "sharedElementTransitionFinishedEvent", "getSharedElementTransitionFinishedEvent", "sortChangeEvent", "getSortChangeEvent", "statusChangeEvent", "getStatusChangeEvent", "changeHomeDestination", "destination", "changeSortSettings", "settings", "noteCreated", "noteId", "onBlankNoteDiscarded", "onLabelAdd", "label", "onReminderChange", "reminder", "onStatusChange", "statusChange", "sharedElementTransitionFinished", "undoStatusChange", "app_debug"})
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.NotesRepository notesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager = null;
    @org.jetbrains.annotations.Nullable()
    private com.maltaisn.notes.ui.StatusChange lastStatusChange;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.lang.Integer>> _messageEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.StatusChange>> _statusChangeEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Reminder>> _reminderChangeEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Label>> _labelAddEventNav = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Label>> _labelAddEventSelect = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.SortSettings>> _sortChangeEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.navigation.HomeDestination> _currentHomeDestination = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> _currentHomeDestinationChangeEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> _sharedElementTransitionFinishedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.lang.Long>> _noteCreatedEvent = null;
    
    @javax.inject.Inject()
    public SharedViewModel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesRepository notesRepository, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.lang.Integer>> getMessageEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.StatusChange>> getStatusChangeEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Reminder>> getReminderChangeEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Label>> getLabelAddEventNav() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Label>> getLabelAddEventSelect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.SortSettings>> getSortChangeEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.navigation.HomeDestination> getCurrentHomeDestination() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> getCurrentHomeDestinationChangeEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> getSharedElementTransitionFinishedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.lang.Long>> getNoteCreatedEvent() {
        return null;
    }
    
    public final void onBlankNoteDiscarded() {
    }
    
    public final void onStatusChange(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.StatusChange statusChange) {
    }
    
    public final void undoStatusChange() {
    }
    
    public final void onReminderChange(@org.jetbrains.annotations.Nullable()
    com.maltaisn.notes.model.entity.Reminder reminder) {
    }
    
    public final void onLabelAdd(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label) {
    }
    
    public final void changeSortSettings(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.SortSettings settings) {
    }
    
    /**
     * This is the method to use whenever the home destination should be changed.
     * The navigation list selection will be updated automatically and the rest of app can listen for these changes.
     */
    public final void changeHomeDestination(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.navigation.HomeDestination destination) {
    }
    
    public final void sharedElementTransitionFinished() {
    }
    
    public final void noteCreated(long noteId) {
    }
}