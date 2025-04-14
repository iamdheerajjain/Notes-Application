package com.maltaisn.notes.ui.notification;

/**
 * Helper class used to request the notification permission for reminders on API 33+.
 * [ConfirmDialog.Callback] methods must be delegated to this class.
 *
 * Useful documentation:
 * - [https://developer.android.com/develop/ui/views/notifications/notification-permission]
 * - [https://developer.android.com/training/permissions/requesting]
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016J\u0006\u0010\u0017\u001a\u00020\u0007R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/maltaisn/notes/ui/notification/NotificationPermission;", "Lcom/maltaisn/notes/ui/common/ConfirmDialog$Callback;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "deniedListener", "Lkotlin/Function0;", "", "getDeniedListener", "()Lkotlin/jvm/functions/Function0;", "setDeniedListener", "(Lkotlin/jvm/functions/Function0;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "permissionRequested", "", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "onDialogCancelled", "tag", "onDialogNegativeButtonClicked", "onDialogPositiveButtonClicked", "request", "Companion", "app_debug"})
public final class NotificationPermission implements com.maltaisn.notes.ui.common.ConfirmDialog.Callback {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher;
    private boolean permissionRequested = false;
    
    /**
     * Optional listener called if permission was denied or may have been denied.
     */
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> deniedListener;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NOTIF_PERMISSION_DIALOG = "notif-permission-dialog";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NOTIF_PERMISSION_DENIED_DIALOG = "notif-permission-denied-dialog";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.notification.NotificationPermission.Companion Companion = null;
    
    public NotificationPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragment() {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/notification/NotificationPermission$Companion;", "", "()V", "NOTIF_PERMISSION_DENIED_DIALOG", "", "NOTIF_PERMISSION_DIALOG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}