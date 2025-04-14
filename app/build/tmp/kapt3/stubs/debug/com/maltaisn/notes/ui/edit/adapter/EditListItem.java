package com.maltaisn.notes.ui.edit.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u0007\b\t\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditListItem;", "", "()V", "type", "Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$ViewType;", "getType", "()Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$ViewType;", "Lcom/maltaisn/notes/ui/edit/adapter/EditCheckedHeaderItem;", "Lcom/maltaisn/notes/ui/edit/adapter/EditChipsItem;", "Lcom/maltaisn/notes/ui/edit/adapter/EditContentItem;", "Lcom/maltaisn/notes/ui/edit/adapter/EditDateItem;", "Lcom/maltaisn/notes/ui/edit/adapter/EditItemAddItem;", "Lcom/maltaisn/notes/ui/edit/adapter/EditItemItem;", "Lcom/maltaisn/notes/ui/edit/adapter/EditTitleItem;", "app_debug"})
public abstract class EditListItem {
    
    private EditListItem() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.ui.edit.adapter.EditAdapter.ViewType getType();
}