package com.maltaisn.notes.ui.edit.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/maltaisn/notes/ui/edit/adapter/EditFocusableViewHolder;", "binding", "Lcom/maltaisn/notes/databinding/ItemEditItemBinding;", "callback", "Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;", "(Lcom/maltaisn/notes/databinding/ItemEditItemBinding;Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;)V", "deleteImv", "Landroid/widget/ImageView;", "dragImv", "getDragImv", "()Landroid/widget/ImageView;", "isChecked", "", "()Z", "item", "Lcom/maltaisn/notes/ui/edit/adapter/EditItemItem;", "itemCheck", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "itemEdt", "Lcom/maltaisn/notes/ui/edit/adapter/EditEditText;", "bind", "", "clearFocus", "setFocus", "pos", "", "app_debug"})
public final class EditItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements com.maltaisn.notes.ui.edit.adapter.EditFocusableViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final android.widget.ImageView dragImv = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.checkbox.MaterialCheckBox itemCheck = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.ui.edit.adapter.EditEditText itemEdt = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.ImageView deleteImv = null;
    @org.jetbrains.annotations.Nullable()
    private com.maltaisn.notes.ui.edit.adapter.EditItemItem item;
    
    public EditItemViewHolder(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.databinding.ItemEditItemBinding binding, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.adapter.EditAdapter.Callback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getDragImv() {
        return null;
    }
    
    public final boolean isChecked() {
        return false;
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.adapter.EditItemItem item) {
    }
    
    @java.lang.Override()
    public void setFocus(int pos) {
    }
    
    public final void clearFocus() {
    }
}