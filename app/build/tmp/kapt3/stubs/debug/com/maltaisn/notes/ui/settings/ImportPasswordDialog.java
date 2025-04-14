package com.maltaisn.notes.ui.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/maltaisn/notes/ui/settings/ImportPasswordDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "callback", "Lcom/maltaisn/notes/ui/settings/ImportPasswordDialog$Callback;", "getCallback", "()Lcom/maltaisn/notes/ui/settings/ImportPasswordDialog$Callback;", "viewModel", "Lcom/maltaisn/notes/ui/settings/ImportPasswordViewModel;", "getViewModel", "()Lcom/maltaisn/notes/ui/settings/ImportPasswordViewModel;", "viewModel$delegate", "Landroidx/lifecycle/ViewModelLazy;", "viewModelFactory", "Lcom/maltaisn/notes/ui/settings/ImportPasswordViewModel$Factory;", "getViewModelFactory", "()Lcom/maltaisn/notes/ui/settings/ImportPasswordViewModel$Factory;", "setViewModelFactory", "(Lcom/maltaisn/notes/ui/settings/ImportPasswordViewModel$Factory;)V", "onCancel", "", "dialog", "Landroid/content/DialogInterface;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onDismiss", "Callback", "Companion", "app_debug"})
public final class ImportPasswordDialog extends androidx.fragment.app.DialogFragment {
    @javax.inject.Inject()
    public com.maltaisn.notes.ui.settings.ImportPasswordViewModel.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.ViewModelLazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.settings.ImportPasswordDialog.Companion Companion = null;
    
    public ImportPasswordDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.settings.ImportPasswordViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.settings.ImportPasswordViewModel.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.settings.ImportPasswordViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final com.maltaisn.notes.ui.settings.ImportPasswordDialog.Callback getCallback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/maltaisn/notes/ui/settings/ImportPasswordDialog$Callback;", "", "onImportPasswordDialogCancelled", "", "onImportPasswordDialogNegativeButtonClicked", "onImportPasswordDialogPositiveButtonClicked", "password", "", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onImportPasswordDialogPositiveButtonClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String password);
        
        public abstract void onImportPasswordDialogNegativeButtonClicked();
        
        public abstract void onImportPasswordDialogCancelled();
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
            
            public static void onImportPasswordDialogPositiveButtonClicked(@org.jetbrains.annotations.NotNull()
            com.maltaisn.notes.ui.settings.ImportPasswordDialog.Callback $this, @org.jetbrains.annotations.NotNull()
            java.lang.String password) {
            }
            
            public static void onImportPasswordDialogNegativeButtonClicked(@org.jetbrains.annotations.NotNull()
            com.maltaisn.notes.ui.settings.ImportPasswordDialog.Callback $this) {
            }
            
            public static void onImportPasswordDialogCancelled(@org.jetbrains.annotations.NotNull()
            com.maltaisn.notes.ui.settings.ImportPasswordDialog.Callback $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/maltaisn/notes/ui/settings/ImportPasswordDialog$Companion;", "", "()V", "newInstance", "Lcom/maltaisn/notes/ui/settings/ImportPasswordDialog;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.settings.ImportPasswordDialog newInstance() {
            return null;
        }
    }
}