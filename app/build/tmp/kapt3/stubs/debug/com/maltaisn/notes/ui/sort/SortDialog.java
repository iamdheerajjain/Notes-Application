package com.maltaisn.notes.ui.sort;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f\u00a8\u0006\""}, d2 = {"Lcom/maltaisn/notes/ui/sort/SortDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "sharedViewModel", "Lcom/maltaisn/notes/ui/SharedViewModel;", "kotlin.jvm.PlatformType", "getSharedViewModel", "()Lcom/maltaisn/notes/ui/SharedViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "sharedViewModelProvider", "Ljavax/inject/Provider;", "getSharedViewModelProvider", "()Ljavax/inject/Provider;", "setSharedViewModelProvider", "(Ljavax/inject/Provider;)V", "viewModel", "Lcom/maltaisn/notes/ui/sort/SortViewModel;", "getViewModel", "()Lcom/maltaisn/notes/ui/sort/SortViewModel;", "viewModel$delegate", "Landroidx/lifecycle/ViewModelLazy;", "viewModelProvider", "getViewModelProvider", "setViewModelProvider", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "setupViewModelObservers", "binding", "Lcom/maltaisn/notes/databinding/DialogSortBinding;", "app_debug"})
public final class SortDialog extends androidx.fragment.app.DialogFragment {
    @javax.inject.Inject()
    public javax.inject.Provider<com.maltaisn.notes.ui.SharedViewModel> sharedViewModelProvider;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @javax.inject.Inject()
    public javax.inject.Provider<com.maltaisn.notes.ui.sort.SortViewModel> viewModelProvider;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.ViewModelLazy viewModel$delegate = null;
    
    public SortDialog() {
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
    public final javax.inject.Provider<com.maltaisn.notes.ui.sort.SortViewModel> getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull()
    javax.inject.Provider<com.maltaisn.notes.ui.sort.SortViewModel> p0) {
    }
    
    private final com.maltaisn.notes.ui.sort.SortViewModel getViewModel() {
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
    
    private final void setupViewModelObservers(com.maltaisn.notes.databinding.DialogSortBinding binding) {
    }
}