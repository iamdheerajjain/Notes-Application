package com.maltaisn.notes.ui.note.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u0018\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/maltaisn/notes/ui/note/adapter/NoteItem;", "Lcom/maltaisn/notes/ui/note/adapter/NoteListItem;", "checked", "", "getChecked", "()Z", "setChecked", "(Z)V", "labels", "", "Lcom/maltaisn/notes/model/entity/Label;", "getLabels", "()Ljava/util/List;", "note", "Lcom/maltaisn/notes/model/entity/Note;", "getNote", "()Lcom/maltaisn/notes/model/entity/Note;", "showMarkAsDone", "getShowMarkAsDone", "title", "Lcom/maltaisn/notes/ui/note/Highlighted;", "getTitle", "()Lcom/maltaisn/notes/ui/note/Highlighted;", "withChecked", "Lcom/maltaisn/notes/ui/note/adapter/NoteItemList;", "Lcom/maltaisn/notes/ui/note/adapter/NoteItemText;", "app_debug"})
public abstract interface NoteItem extends com.maltaisn.notes.ui.note.adapter.NoteListItem {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.model.entity.Note getNote();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.maltaisn.notes.model.entity.Label> getLabels();
    
    public abstract boolean getChecked();
    
    public abstract void setChecked(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.ui.note.Highlighted getTitle();
    
    public abstract boolean getShowMarkAsDone();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.ui.note.adapter.NoteItem withChecked(boolean checked);
}