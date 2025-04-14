package com.maltaisn.notes.ui.home;

/**
 * Start screen fragment displaying a list of notes for different note status,
 * by label, or with a reminder.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020(H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006*"}, d2 = {"Lcom/maltaisn/notes/ui/home/HomeFragment;", "Lcom/maltaisn/notes/ui/note/NoteFragment;", "Landroidx/appcompat/widget/Toolbar$OnMenuItemClickListener;", "()V", "viewModel", "Lcom/maltaisn/notes/ui/home/HomeViewModel;", "getViewModel", "()Lcom/maltaisn/notes/ui/home/HomeViewModel;", "viewModel$delegate", "Landroidx/lifecycle/ViewModelLazy;", "viewModelFactory", "Lcom/maltaisn/notes/ui/home/HomeViewModel$Factory;", "getViewModelFactory", "()Lcom/maltaisn/notes/ui/home/HomeViewModel$Factory;", "setViewModelFactory", "(Lcom/maltaisn/notes/ui/home/HomeViewModel$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyActionMode", "mode", "Landroid/view/ActionMode;", "onDialogPositiveButtonClicked", "tag", "", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setupViewModelObservers", "showEmptyTrashConfirmDialog", "updateListLayoutItemForMode", "Lcom/maltaisn/notes/ui/note/adapter/NoteListLayoutMode;", "updateToolbarForDestination", "destination", "Lcom/maltaisn/notes/ui/navigation/HomeDestination;", "Companion", "app_debug"})
public final class HomeFragment extends com.maltaisn.notes.ui.note.NoteFragment implements androidx.appcompat.widget.Toolbar.OnMenuItemClickListener {
    @javax.inject.Inject()
    public com.maltaisn.notes.ui.home.HomeViewModel.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.ViewModelLazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EMPTY_TRASH_DIALOG_TAG = "empty_trash_dialog";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.home.HomeFragment.Companion Companion = null;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.home.HomeViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.home.HomeViewModel.Factory p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected com.maltaisn.notes.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViewModelObservers() {
    }
    
    private final void updateToolbarForDestination(com.maltaisn.notes.ui.navigation.HomeDestination destination) {
    }
    
    private final void updateListLayoutItemForMode(com.maltaisn.notes.ui.note.adapter.NoteListLayoutMode mode) {
    }
    
    private final void showEmptyTrashConfirmDialog() {
    }
    
    @java.lang.Override()
    public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/maltaisn/notes/ui/home/HomeFragment$Companion;", "", "()V", "EMPTY_TRASH_DIALOG_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}