package com.maltaisn.notes.receiver;

/**
 * Implementation of the alarm callback for [ReminderAlarmManager].
 * Uses the app context to set alarms broadcasted to [AlarmReceiver].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/maltaisn/notes/receiver/ReceiverAlarmCallback;", "Lcom/maltaisn/notes/model/ReminderAlarmCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "alarmManager", "Landroid/app/AlarmManager;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "addAlarm", "", "noteId", "", "time", "getAlarmPendingIndent", "Landroid/app/PendingIntent;", "removeAlarm", "app_debug"})
public final class ReceiverAlarmCallback implements com.maltaisn.notes.model.ReminderAlarmCallback {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.AlarmManager alarmManager = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TAG = "CrashAlarmPermission";
    
    @javax.inject.Inject()
    public ReceiverAlarmCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.S)
    public void addAlarm(long noteId, long time) {
    }
    
    @java.lang.Override()
    public void removeAlarm(long noteId) {
    }
    
    private final android.app.PendingIntent getAlarmPendingIndent(long noteId) {
        return null;
    }
}