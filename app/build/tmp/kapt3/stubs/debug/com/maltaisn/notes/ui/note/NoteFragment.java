package com.maltaisn.notes.ui.note;

/**
 * This fragment provides common code for home and search fragments.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001hB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u00108\u001a\u000209H\u0002J\u0018\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020=H\u0016J\u0012\u0010>\u001a\u0002092\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0018\u0010A\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\t2\u0006\u0010B\u001a\u00020CH\u0016J$\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010H2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\"\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010O\u001a\u0002092\u0006\u0010;\u001a\u00020\tH\u0016J\b\u0010P\u001a\u000209H\u0016J\u0012\u0010Q\u001a\u0002092\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0018\u0010T\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\t2\u0006\u0010B\u001a\u00020CH\u0016J\u001a\u0010U\u001a\u0002092\u0006\u0010V\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010W\u001a\u0002092\u0006\u0010X\u001a\u00020YH\u0002J\u0018\u0010Z\u001a\u0002092\u0006\u0010X\u001a\u00020Y2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010[\u001a\u000209H\u0002J\u0010\u0010\\\u001a\u0002092\u0006\u0010]\u001a\u00020^H\u0003J*\u0010_\u001a\u0002092\u0006\u0010`\u001a\u0002032\u0006\u0010a\u001a\u0002032\u0006\u0010b\u001a\u00020\u00102\b\b\u0002\u0010c\u001a\u00020\u0013H\u0002J\u0010\u0010d\u001a\u0002092\u0006\u0010e\u001a\u00020fH\u0002J\u0010\u0010g\u001a\u0002092\u0006\u0010e\u001a\u00020fH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00078DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020\'8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R$\u0010,\u001a\b\u0012\u0004\u0012\u00020\'0-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u00104\u001a\u000205X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b6\u00107\u00a8\u0006i"}, d2 = {"Lcom/maltaisn/notes/ui/note/NoteFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/ActionMode$Callback;", "Lcom/maltaisn/notes/ui/common/ConfirmDialog$Callback;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "()V", "_binding", "Lcom/maltaisn/notes/databinding/FragmentNoteBinding;", "actionMode", "Landroid/view/ActionMode;", "binding", "getBinding", "()Lcom/maltaisn/notes/databinding/FragmentNoteBinding;", "createdNote", "Landroid/view/View;", "createdNoteId", "", "Ljava/lang/Long;", "currentHomeDestinationChanged", "", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "hideActionMode", "isSharedElementTransitionPlaying", "layoutManager", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "prefsManager", "Lcom/maltaisn/notes/model/PrefsManager;", "getPrefsManager", "()Lcom/maltaisn/notes/model/PrefsManager;", "setPrefsManager", "(Lcom/maltaisn/notes/model/PrefsManager;)V", "rcvOneShotPreDrawListener", "Landroidx/core/view/OneShotPreDrawListener;", "sharedViewModel", "Lcom/maltaisn/notes/ui/SharedViewModel;", "getSharedViewModel", "()Lcom/maltaisn/notes/ui/SharedViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "sharedViewModelProvider", "Ljavax/inject/Provider;", "getSharedViewModelProvider", "()Ljavax/inject/Provider;", "setSharedViewModelProvider", "(Ljavax/inject/Provider;)V", "spanCount", "", "viewModel", "Lcom/maltaisn/notes/ui/note/NoteViewModel;", "getViewModel", "()Lcom/maltaisn/notes/ui/note/NoteViewModel;", "noteListCommitCallback", "", "onActionItemClicked", "mode", "item", "Landroid/view/MenuItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestinationChanged", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "onDestroyActionMode", "onDestroyView", "onDialogPositiveButtonClicked", "tag", "", "onPrepareActionMode", "onViewCreated", "view", "setupNoteItemsObserver", "adapter", "Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter;", "setupViewModelObservers", "showDeleteConfirmDialog", "showMessageForStatusChange", "statusChange", "Lcom/maltaisn/notes/ui/StatusChange;", "switchStatusBarColor", "colorFrom", "colorTo", "duration", "endAsTransparent", "updateActionModeForSelection", "selection", "Lcom/maltaisn/notes/ui/note/NoteViewModel$NoteSelection;", "updateItemsForSelection", "Companion", "app_debug"})
public abstract class NoteFragment extends androidx.fragment.app.Fragment implements android.view.ActionMode.Callback, com.maltaisn.notes.ui.common.ConfirmDialog.Callback, androidx.navigation.NavController.OnDestinationChangedListener {
    @javax.inject.Inject()
    public javax.inject.Provider<com.maltaisn.notes.ui.SharedViewModel> sharedViewModelProvider;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @javax.inject.Inject()
    public com.maltaisn.notes.model.PrefsManager prefsManager;
    @org.jetbrains.annotations.Nullable()
    private com.maltaisn.notes.databinding.FragmentNoteBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private android.view.ActionMode actionMode;
    protected androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    private int spanCount = 1;
    private boolean hideActionMode = false;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager;
    private boolean currentHomeDestinationChanged = false;
    private boolean isSharedElementTransitionPlaying = false;
    @org.jetbrains.annotations.Nullable()
    private androidx.core.view.OneShotPreDrawListener rcvOneShotPreDrawListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View createdNote;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long createdNoteId;
    private static final java.text.NumberFormat NUMBER_FORMAT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DELETE_CONFIRM_DIALOG_TAG = "delete_confirm_dialog";
    private static final int STATUS_CHANGE_SNACKBAR_DURATION = 7500;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.note.NoteFragment.Companion Companion = null;
    
    public NoteFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.inject.Provider<com.maltaisn.notes.ui.SharedViewModel> getSharedViewModelProvider() {
        return null;
    }
    
    public final void setSharedViewModelProvider(@org.jetbrains.annotations.NotNull()
    javax.inject.Provider<com.maltaisn.notes.ui.SharedViewModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.SharedViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.PrefsManager getPrefsManager() {
        return null;
    }
    
    public final void setPrefsManager(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract com.maltaisn.notes.ui.note.NoteViewModel getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final com.maltaisn.notes.databinding.FragmentNoteBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
        return null;
    }
    
    protected final void setDrawerLayout(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout p0) {
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
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void noteListCommitCallback() {
    }
    
    private final void setupNoteItemsObserver(com.maltaisn.notes.ui.note.adapter.NoteAdapter adapter) {
    }
    
    private final void setupViewModelObservers(com.maltaisn.notes.ui.note.adapter.NoteAdapter adapter, androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager) {
    }
    
    private final void updateActionModeForSelection(com.maltaisn.notes.ui.note.NoteViewModel.NoteSelection selection) {
    }
    
    private final void updateItemsForSelection(com.maltaisn.notes.ui.note.NoteViewModel.NoteSelection selection) {
    }
    
    private final void showDeleteConfirmDialog() {
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    private final void showMessageForStatusChange(com.maltaisn.notes.ui.StatusChange statusChange) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
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
    public void onDestinationChanged(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController controller, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDestination destination, @org.jetbrains.annotations.Nullable()
    android.os.Bundle arguments) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/maltaisn/notes/ui/note/NoteFragment$Companion;", "", "()V", "DELETE_CONFIRM_DIALOG_TAG", "", "NUMBER_FORMAT", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "STATUS_CHANGE_SNACKBAR_DURATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}