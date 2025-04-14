package com.maltaisn.notes.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/maltaisn/notes/model/ReminderAlarmManager;", "", "notesRepository", "Lcom/maltaisn/notes/model/NotesRepository;", "alarmCallback", "Lcom/maltaisn/notes/model/ReminderAlarmCallback;", "(Lcom/maltaisn/notes/model/NotesRepository;Lcom/maltaisn/notes/model/ReminderAlarmCallback;)V", "recurrenceFinder", "Lcom/maltaisn/recurpicker/RecurrenceFinder;", "markReminderAsDone", "", "noteId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAlarm", "removeAllAlarms", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setNextNoteReminderAlarm", "note", "Lcom/maltaisn/notes/model/entity/Note;", "(Lcom/maltaisn/notes/model/entity/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setNextNoteReminderAlarmInternal", "setNoteReminderAlarm", "updateAllAlarms", "app_debug"})
@androidx.annotation.OpenForTesting()
public final class ReminderAlarmManager {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.NotesRepository notesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.ReminderAlarmCallback alarmCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.recurpicker.RecurrenceFinder recurrenceFinder = null;
    
    @javax.inject.Inject()
    public ReminderAlarmManager(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesRepository notesRepository, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.ReminderAlarmCallback alarmCallback) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateAllAlarms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void setNoteReminderAlarm(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Note note) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setNextNoteReminderAlarm(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final com.maltaisn.notes.model.entity.Note setNextNoteReminderAlarmInternal(com.maltaisn.notes.model.entity.Note note) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object markReminderAsDone(long noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void removeAlarm(long noteId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeAllAlarms(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}