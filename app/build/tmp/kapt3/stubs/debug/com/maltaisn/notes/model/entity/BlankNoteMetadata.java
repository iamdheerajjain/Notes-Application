package com.maltaisn.notes.model.entity;

/**
 * Metadata with no information, for a text note.
 */
@kotlinx.serialization.Serializable()
@kotlinx.serialization.SerialName(value = "blank")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u00c6\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/maltaisn/notes/model/entity/BlankNoteMetadata;", "Lcom/maltaisn/notes/model/entity/NoteMetadata;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app_debug"})
public final class BlankNoteMetadata extends com.maltaisn.notes.model.entity.NoteMetadata {
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.entity.BlankNoteMetadata INSTANCE = null;
    
    private BlankNoteMetadata() {
        super(0, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.serialization.KSerializer<com.maltaisn.notes.model.entity.BlankNoteMetadata> serializer() {
        return null;
    }
}