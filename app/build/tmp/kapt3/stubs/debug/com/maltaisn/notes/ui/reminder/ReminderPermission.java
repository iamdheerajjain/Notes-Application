package com.maltaisn.notes.ui.reminder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u001b\u001a\u00020\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/maltaisn/notes/ui/reminder/ReminderPermission;", "Lcom/maltaisn/notes/ui/common/ConfirmDialog$Callback;", "fragment", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "(Landroidx/fragment/app/Fragment;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "deniedListener", "Lkotlin/Function0;", "", "getDeniedListener", "()Lkotlin/jvm/functions/Function0;", "setDeniedListener", "(Lkotlin/jvm/functions/Function0;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "permissionRequested", "", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "onDialogCancelled", "tag", "onDialogNegativeButtonClicked", "onDialogPositiveButtonClicked", "request", "Companion", "app_debug"})
public final class ReminderPermission implements com.maltaisn.notes.ui.common.ConfirmDialog.Callback {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher;
    private boolean permissionRequested = false;
    
    /**
     * Optional listener called if permission was denied or may have been denied.
     */
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> deniedListener;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String REMINDER_PERMISSION_DIALOG = "alarm-permission-dialog";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String REMINDER_PERMISSION_DENIED_DIALOG = "alarm-permission-denied-dialog";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.reminder.ReminderPermission.Companion Companion = null;
    
    public ReminderPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    /**
     * Optional listener called if permission was denied or may have been denied.
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getDeniedListener() {
        return null;
    }
    
    /**
     * Optional listener called if permission was denied or may have been denied.
     */
    public final void setDeniedListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final void request() {
    }
    
    @java.lang.Override()
    public void onDialogPositiveButtonClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void onDialogNegativeButtonClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void onDialogCancelled(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/reminder/ReminderPermission$Companion;", "", "()V", "REMINDER_PERMISSION_DENIED_DIALOG", "", "REMINDER_PERMISSION_DIALOG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}