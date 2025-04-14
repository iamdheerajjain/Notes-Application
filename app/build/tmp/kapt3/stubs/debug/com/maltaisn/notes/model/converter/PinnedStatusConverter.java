package com.maltaisn.notes.model.converter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0011H\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/maltaisn/notes/model/converter/PinnedStatusConverter;", "Lkotlinx/serialization/KSerializer;", "Lcom/maltaisn/notes/model/entity/PinnedStatus;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "toInt", "", "status", "toStatus", "app_debug"})
public final class PinnedStatusConverter implements kotlinx.serialization.KSerializer<com.maltaisn.notes.model.entity.PinnedStatus> {
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.converter.PinnedStatusConverter INSTANCE = null;
    
    private PinnedStatusConverter() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.room.TypeConverter()
    public static final int toInt(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.PinnedStatus status) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.entity.PinnedStatus toStatus(int value) {
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
    com.maltaisn.notes.model.entity.PinnedStatus value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.maltaisn.notes.model.entity.PinnedStatus deserialize(@org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.Decoder decoder) {
        return null;
    }
}