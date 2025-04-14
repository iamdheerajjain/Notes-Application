package com.maltaisn.notes.model.converter;

/**
 * Converter used to store instances of [NoteMetadata] in the database and to serialize them.
 * When serialized, metadata JSON in itself encoded into a JSON string. This wouldn't be
 * necessary but it simplifies the server's job. Also metadata *could* eventually not be JSON.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002H\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/maltaisn/notes/model/converter/NoteMetadataConverter;", "Lkotlinx/serialization/KSerializer;", "Lcom/maltaisn/notes/model/entity/NoteMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json$Default;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "toMetadata", "str", "", "toString", "metadata", "app_debug"})
public final class NoteMetadataConverter implements kotlinx.serialization.KSerializer<com.maltaisn.notes.model.entity.NoteMetadata> {
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.serialization.json.Json.Default json = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.converter.NoteMetadataConverter INSTANCE = null;
    
    private NoteMetadataConverter() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.entity.NoteMetadata toMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toString(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteMetadata metadata) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return null;
    }
    
    @java.lang.Override()
    public void serialize(@org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteMetadata value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.maltaisn.notes.model.entity.NoteMetadata deserialize(@org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.Decoder decoder) {
        return null;
    }
}