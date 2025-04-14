package com.maltaisn.notes.model.converter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/maltaisn/notes/model/converter/RecurrenceConverter;", "Lkotlinx/serialization/KSerializer;", "Lcom/maltaisn/recurpicker/Recurrence;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rruleFormatter", "Lcom/maltaisn/recurpicker/format/RRuleFormatter;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "toRRule", "", "recurrence", "toRecurrence", "rrule", "app_debug"})
public final class RecurrenceConverter implements kotlinx.serialization.KSerializer<com.maltaisn.recurpicker.Recurrence> {
    @org.jetbrains.annotations.NotNull()
    private static final com.maltaisn.recurpicker.format.RRuleFormatter rruleFormatter = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.converter.RecurrenceConverter INSTANCE = null;
    
    private RecurrenceConverter() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public static final com.maltaisn.recurpicker.Recurrence toRecurrence(@org.jetbrains.annotations.Nullable()
    java.lang.String rrule) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String toRRule(@org.jetbrains.annotations.Nullable()
    com.maltaisn.recurpicker.Recurrence recurrence) {
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
    com.maltaisn.recurpicker.Recurrence value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.maltaisn.recurpicker.Recurrence deserialize(@org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.Decoder decoder) {
        return null;
    }
}