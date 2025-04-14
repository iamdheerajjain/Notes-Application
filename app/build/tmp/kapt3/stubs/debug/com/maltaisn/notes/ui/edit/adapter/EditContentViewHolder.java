package com.maltaisn.notes.ui.edit.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/maltaisn/notes/ui/edit/adapter/EditFocusableViewHolder;", "binding", "Lcom/maltaisn/notes/databinding/ItemEditContentBinding;", "callback", "Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;", "(Lcom/maltaisn/notes/databinding/ItemEditContentBinding;Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;)V", "contentEdt", "Lcom/maltaisn/notes/ui/edit/adapter/EditEditText;", "item", "Lcom/maltaisn/notes/ui/edit/adapter/EditContentItem;", "bind", "", "setFocus", "pos", "", "app_debug"})
public final class EditContentViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements com.maltaisn.notes.ui.edit.adapter.EditFocusableViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.ui.edit.adapter.EditEditText contentEdt = null;
    @org.jetbrains.annotations.Nullable()
    private com.maltaisn.notes.ui.edit.adapter.EditContentItem item;
    
    public EditContentViewHolder(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.databinding.ItemEditContentBinding binding, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.adapter.EditAdapter.Callback callback) {
        super(null);
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.adapter.EditContentItem item) {
    }
    
    @java.lang.Override()
    public void setFocus(int pos) {
    }
}