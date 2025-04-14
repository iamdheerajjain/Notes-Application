package com.maltaisn.notes.model.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/maltaisn/notes/model/entity/NoteStatus;", "", "Lcom/maltaisn/notes/model/ValueEnum;", "", "value", "(Ljava/lang/String;II)V", "getValue", "()Ljava/lang/Integer;", "ACTIVE", "ARCHIVED", "DELETED", "Companion", "app_debug"})
public enum NoteStatus implements com.maltaisn.notes.model.ValueEnum<java.lang.Integer> {
    /*public static final*/ ACTIVE /* = new ACTIVE(0) */,
    /*public static final*/ ARCHIVED /* = new ARCHIVED(0) */,
    /*public static final*/ DELETED /* = new DELETED(0) */;
    private final int value = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.entity.NoteStatus.Companion Companion = null;
    
    NoteStatus(int value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Integer getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.maltaisn.notes.model.entity.NoteStatus> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/maltaisn/notes/model/entity/NoteStatus$Companion;", "", "()V", "fromValue", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "value", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.model.entity.NoteStatus fromValue(int value) {
            return null;
        }
    }
}