package com.maltaisn.notes.ui.note.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/maltaisn/notes/ui/note/adapter/NoteListItem;", "", "id", "", "getId", "()J", "type", "Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$ViewType;", "getType", "()Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$ViewType;", "Lcom/maltaisn/notes/ui/note/adapter/HeaderItem;", "Lcom/maltaisn/notes/ui/note/adapter/MessageItem;", "Lcom/maltaisn/notes/ui/note/adapter/NoteItem;", "app_debug"})
public abstract interface NoteListItem {
    
    public abstract long getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.ui.note.adapter.NoteAdapter.ViewType getType();
}