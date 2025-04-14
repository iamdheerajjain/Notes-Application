package com.maltaisn.notes.ui.labels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006+"}, d2 = {"Lcom/maltaisn/notes/ui/labels/LabelEditDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "args", "Lcom/maltaisn/notes/ui/labels/LabelEditDialogArgs;", "getArgs", "()Lcom/maltaisn/notes/ui/labels/LabelEditDialogArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "sharedViewModel", "Lcom/maltaisn/notes/ui/SharedViewModel;", "kotlin.jvm.PlatformType", "getSharedViewModel", "()Lcom/maltaisn/notes/ui/SharedViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "sharedViewModelProvider", "Ljavax/inject/Provider;", "getSharedViewModelProvider", "()Ljavax/inject/Provider;", "setSharedViewModelProvider", "(Ljavax/inject/Provider;)V", "viewModel", "Lcom/maltaisn/notes/ui/labels/LabelEditViewModel;", "getViewModel", "()Lcom/maltaisn/notes/ui/labels/LabelEditViewModel;", "viewModel$delegate", "Landroidx/lifecycle/ViewModelLazy;", "viewModelFactory", "Lcom/maltaisn/notes/ui/labels/LabelEditViewModel$Factory;", "getViewModelFactory", "()Lcom/maltaisn/notes/ui/labels/LabelEditViewModel$Factory;", "setViewModelFactory", "(Lcom/maltaisn/notes/ui/labels/LabelEditViewModel$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "app_debug"})
public final class LabelEditDialog extends androidx.fragment.app.DialogFragment {
    @javax.inject.Inject()
    public javax.inject.Provider<com.maltaisn.notes.ui.SharedViewModel> sharedViewModelProvider;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @javax.inject.Inject()
    public com.maltaisn.notes.ui.labels.LabelEditViewModel.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.ViewModelLazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public LabelEditDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.inject.Provider<com.maltaisn.notes.ui.SharedViewModel> getSharedViewModelProvider() {
        return null;
    }
    
    public final void setSharedViewModelProvider(@org.jetbrains.annotations.NotNull()
    javax.inject.Provider<com.maltaisn.notes.ui.SharedViewModel> p0) {
    }
    
    private final com.maltaisn.notes.ui.SharedViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.labels.LabelEditViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.labels.LabelEditViewModel.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.labels.LabelEditViewModel getViewModel() {
        return null;
    }
    
    private final com.maltaisn.notes.ui.labels.LabelEditDialogArgs getArgs() {
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
}