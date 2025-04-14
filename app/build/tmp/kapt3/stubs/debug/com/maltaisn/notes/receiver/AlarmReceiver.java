package com.maltaisn.notes.receiver;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/maltaisn/notes/receiver/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "notesRepository", "Lcom/maltaisn/notes/model/NotesRepository;", "getNotesRepository", "()Lcom/maltaisn/notes/model/NotesRepository;", "setNotesRepository", "(Lcom/maltaisn/notes/model/NotesRepository;)V", "reminderAlarmManager", "Lcom/maltaisn/notes/model/ReminderAlarmManager;", "getReminderAlarmManager", "()Lcom/maltaisn/notes/model/ReminderAlarmManager;", "setReminderAlarmManager", "(Lcom/maltaisn/notes/model/ReminderAlarmManager;)V", "markReminderAsDone", "", "context", "Landroid/content/Context;", "noteId", "", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceive", "intent", "Landroid/content/Intent;", "showNotificationForReminder", "Companion", "app_debug"})
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @javax.inject.Inject()
    public com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager;
    @javax.inject.Inject()
    public com.maltaisn.notes.model.NotesRepository notesRepository;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_ALARM = "com.maltaisn.notes.reminder.ALARM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MARK_DONE = "com.maltaisn.notes.reminder.MARK_DONE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NOTE_ID = "com.maltaisn.notes.reminder.NOTE_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_GROUP = "com.maltaisn.notes.reminder.REMINDERS";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.receiver.AlarmReceiver.Companion Companion = null;
    
    public AlarmReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.ReminderAlarmManager getReminderAlarmManager() {
        return null;
    }
    
    public final void setReminderAlarmManager(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.ReminderAlarmManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.NotesRepository getNotesRepository() {
        return null;
    }
    
    public final void setNotesRepository(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesRepository p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    /**
     * Receiver was called for reminder alarm, show a notification with the note title and content.
     * Clicking the notification opens the app to edit/view it.
     * Two action buttons can be clicked: mark as done and postpone.
     */
    private final java.lang.Object showNotificationForReminder(android.content.Context context, long noteId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object markReminderAsDone(android.content.Context context, long noteId, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/maltaisn/notes/receiver/AlarmReceiver$Companion;", "", "()V", "ACTION_ALARM", "", "ACTION_MARK_DONE", "EXTRA_NOTE_ID", "NOTIFICATION_GROUP", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}