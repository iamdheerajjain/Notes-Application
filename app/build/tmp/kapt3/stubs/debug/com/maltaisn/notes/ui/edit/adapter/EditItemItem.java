package com.maltaisn.notes.ui.edit.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\bH\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditItemItem;", "Lcom/maltaisn/notes/ui/edit/adapter/EditListItem;", "content", "Lcom/maltaisn/notes/ui/edit/adapter/EditableText;", "checked", "", "editable", "actualPos", "", "(Lcom/maltaisn/notes/ui/edit/adapter/EditableText;ZZI)V", "getActualPos", "()I", "setActualPos", "(I)V", "getChecked", "()Z", "setChecked", "(Z)V", "getContent", "()Lcom/maltaisn/notes/ui/edit/adapter/EditableText;", "setContent", "(Lcom/maltaisn/notes/ui/edit/adapter/EditableText;)V", "getEditable", "type", "Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$ViewType;", "getType", "()Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$ViewType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "app_debug"})
public final class EditItemItem extends com.maltaisn.notes.ui.edit.adapter.EditListItem {
    @org.jetbrains.annotations.NotNull()
    private com.maltaisn.notes.ui.edit.adapter.EditableText content;
    private boolean checked;
    private final boolean editable = false;
    private int actualPos;
    
    public EditItemItem(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.adapter.EditableText content, boolean checked, boolean editable, int actualPos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.edit.adapter.EditableText getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.adapter.EditableText p0) {
    }
    
    public final boolean getChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
    
    public final boolean getEditable() {
        return false;
    }
    
    public final int getActualPos() {
        return 0;
    }
    
    public final void setActualPos(int p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.maltaisn.notes.ui.edit.adapter.EditAdapter.ViewType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.edit.adapter.EditableText component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.edit.adapter.EditItemItem copy(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.adapter.EditableText content, boolean checked, boolean editable, int actualPos) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}