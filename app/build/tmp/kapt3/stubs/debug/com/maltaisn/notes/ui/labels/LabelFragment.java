package com.maltaisn.notes.ui.labels;

/**
 * This fragment has two purposes:
 *
 * - Managing labels: add, rename, delete. Supports multiple selection.
 * - Selecting and applying labels: set or change labels on a set of notes.
 *
 * The mode is determined by the argument passed by the navigation component.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001WB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0018\u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020\t2\u0006\u00106\u001a\u000207H\u0016J$\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010?\u001a\u0002022\u0006\u0010.\u001a\u00020\tH\u0016J\b\u0010@\u001a\u000202H\u0016J\u0012\u0010A\u001a\u0002022\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010D\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u0010E\u001a\u00020-2\u0006\u0010.\u001a\u00020\t2\u0006\u00106\u001a\u000207H\u0016J\u001a\u0010F\u001a\u0002022\u0006\u0010G\u001a\u0002092\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010H\u001a\u0002022\u0006\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u000202H\u0002J*\u0010L\u001a\u0002022\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020-H\u0002J\u0010\u0010S\u001a\u0002022\u0006\u0010T\u001a\u00020NH\u0002J\u0010\u0010U\u001a\u0002022\u0006\u0010T\u001a\u00020NH\u0002J\u0010\u0010V\u001a\u0002022\u0006\u0010T\u001a\u00020NH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006X"}, d2 = {"Lcom/maltaisn/notes/ui/labels/LabelFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "Landroid/view/ActionMode$Callback;", "Lcom/maltaisn/notes/ui/common/ConfirmDialog$Callback;", "()V", "_binding", "Lcom/maltaisn/notes/databinding/FragmentLabelBinding;", "actionMode", "Landroid/view/ActionMode;", "args", "Lcom/maltaisn/notes/ui/labels/LabelFragmentArgs;", "getArgs", "()Lcom/maltaisn/notes/ui/labels/LabelFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/maltaisn/notes/databinding/FragmentLabelBinding;", "sharedViewModel", "Lcom/maltaisn/notes/ui/SharedViewModel;", "kotlin.jvm.PlatformType", "getSharedViewModel", "()Lcom/maltaisn/notes/ui/SharedViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "sharedViewModelProvider", "Ljavax/inject/Provider;", "getSharedViewModelProvider", "()Ljavax/inject/Provider;", "setSharedViewModelProvider", "(Ljavax/inject/Provider;)V", "viewModel", "Lcom/maltaisn/notes/ui/labels/LabelViewModel;", "getViewModel", "()Lcom/maltaisn/notes/ui/labels/LabelViewModel;", "viewModel$delegate", "Landroidx/lifecycle/ViewModelLazy;", "viewModelFactory", "Lcom/maltaisn/notes/ui/labels/LabelViewModel$Factory;", "getViewModelFactory", "()Lcom/maltaisn/notes/ui/labels/LabelViewModel$Factory;", "setViewModelFactory", "(Lcom/maltaisn/notes/ui/labels/LabelViewModel$Factory;)V", "onActionItemClicked", "", "mode", "item", "Landroid/view/MenuItem;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "state", "onDestroyActionMode", "onDestroyView", "onDialogPositiveButtonClicked", "tag", "", "onMenuItemClick", "onPrepareActionMode", "onViewCreated", "view", "setupViewModelObservers", "adapter", "Lcom/maltaisn/notes/ui/labels/adapter/LabelAdapter;", "showDeleteConfirmDialog", "switchStatusBarColor", "colorFrom", "", "colorTo", "duration", "", "endAsTransparent", "updateActionModeForSelection", "count", "updateFabForSelection", "updateItemsForSelection", "Companion", "app_debug"})
public final class LabelFragment extends androidx.fragment.app.DialogFragment implements androidx.appcompat.widget.Toolbar.OnMenuItemClickListener, android.view.ActionMode.Callback, com.maltaisn.notes.ui.common.ConfirmDialog.Callback {
    @javax.inject.Inject()
    public com.maltaisn.notes.ui.labels.LabelViewModel.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.ViewModelLazy viewModel$delegate = null;
    @javax.inject.Inject()
    public javax.inject.Provider<com.maltaisn.notes.ui.SharedViewModel> sharedViewModelProvider;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.maltaisn.notes.databinding.FragmentLabelBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private android.view.ActionMode actionMode;
    private static final java.text.NumberFormat NUMBER_FORMAT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DELETE_CONFIRM_DIALOG_TAG = "delete_confirm_dialog";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.labels.LabelFragment.Companion Companion = null;
    
    public LabelFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.labels.LabelViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.labels.LabelViewModel.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.labels.LabelViewModel getViewModel() {
        return null;
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
    
    private final com.maltaisn.notes.ui.labels.LabelFragmentArgs getArgs() {
        return null;
    }
    
    private final com.maltaisn.notes.databinding.FragmentLabelBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle state) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setupViewModelObservers(com.maltaisn.notes.ui.labels.adapter.LabelAdapter adapter) {
    }
    
    private final void updateActionModeForSelection(int count) {
    }
    
    private final void updateItemsForSelection(int count) {
    }
    
    private final void updateFabForSelection(int count) {
    }
    
    private final void showDeleteConfirmDialog() {
    }
    
    @java.lang.Override()
    public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void switchStatusBarColor(int colorFrom, int colorTo, long duration, boolean endAsTransparent) {
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public void onDialogPositiveButtonClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void onDialogCancelled(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void onDialogNegativeButtonClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/maltaisn/notes/ui/labels/LabelFragment$Companion;", "", "()V", "DELETE_CONFIRM_DIALOG_TAG", "", "NUMBER_FORMAT", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}