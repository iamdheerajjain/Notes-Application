package com.maltaisn.notes.ui.edit.adapter;

/**
 * Interface implemented by any item that can have its focus position changed.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditFocusableViewHolder;", "", "setFocus", "", "pos", "", "Lcom/maltaisn/notes/ui/edit/adapter/EditContentViewHolder;", "Lcom/maltaisn/notes/ui/edit/adapter/EditItemViewHolder;", "Lcom/maltaisn/notes/ui/edit/adapter/EditTitleViewHolder;", "app_debug"})
public abstract interface EditFocusableViewHolder {
    
    public abstract void setFocus(int pos);
}