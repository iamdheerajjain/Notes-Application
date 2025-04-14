package com.maltaisn.notes.ui.common;

/**
 * Simple dialog with a callback to ask user for confirmation.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/maltaisn/notes/ui/common/ConfirmDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "callback", "Lcom/maltaisn/notes/ui/common/ConfirmDialog$Callback;", "getCallback", "()Lcom/maltaisn/notes/ui/common/ConfirmDialog$Callback;", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "onCreateDialog", "Landroid/app/Dialog;", "state", "Landroid/os/Bundle;", "Callback", "Companion", "app_debug"})
public final class ConfirmDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_TITLE = "title";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_MESSAGE = "message";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_BTN_POSITIVE = "btn_positive";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_BTN_NEGATIVE = "btn_negative";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ARG_MESSAGE_STR = "message_str";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.common.ConfirmDialog.Companion Companion = null;
    
    public ConfirmDialog() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle state) {
        return null;
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final com.maltaisn.notes.ui.common.ConfirmDialog.Callback getCallback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/maltaisn/notes/ui/common/ConfirmDialog$Callback;", "", "onDialogCancelled", "", "tag", "", "onDialogNegativeButtonClicked", "onDialogPositiveButtonClicked", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onDialogPositiveButtonClicked(@org.jetbrains.annotations.Nullable()
        java.lang.String tag);
        
        public abstract void onDialogNegativeButtonClicked(@org.jetbrains.annotations.Nullable()
        java.lang.String tag);
        
        public abstract void onDialogCancelled(@org.jetbrains.annotations.Nullable()
        java.lang.String tag);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void onDialogPositiveButtonClicked(@org.jetbrains.annotations.NotNull()
            com.maltaisn.notes.ui.common.ConfirmDialog.Callback $this, @org.jetbrains.annotations.Nullable()
            java.lang.String tag) {
            }
            
            public static void onDialogNegativeButtonClicked(@org.jetbrains.annotations.NotNull()
            com.maltaisn.notes.ui.common.ConfirmDialog.Callback $this, @org.jetbrains.annotations.Nullable()
            java.lang.String tag) {
            }
            
            public static void onDialogCancelled(@org.jetbrains.annotations.NotNull()
            com.maltaisn.notes.ui.common.ConfirmDialog.Callback $this, @org.jetbrains.annotations.Nullable()
            java.lang.String tag) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/maltaisn/notes/ui/common/ConfirmDialog$Companion;", "", "()V", "ARG_BTN_NEGATIVE", "", "ARG_BTN_POSITIVE", "ARG_MESSAGE", "ARG_MESSAGE_STR", "ARG_TITLE", "newInstance", "Lcom/maltaisn/notes/ui/common/ConfirmDialog;", "title", "", "message", "btnPositive", "btnNegative", "messageStr", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.common.ConfirmDialog newInstance(@androidx.annotation.StringRes()
        int title, @androidx.annotation.StringRes()
        int message, @androidx.annotation.StringRes()
        int btnPositive, @androidx.annotation.StringRes()
        int btnNegative, @org.jetbrains.annotations.NotNull()
        java.lang.String messageStr) {
            return null;
        }
    }
}