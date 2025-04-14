package com.maltaisn.notes.model;

/**
 * Enum with a value, so that it can be stored in future-proof manner
 * without relying on the field name or ordinal.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/model/ValueEnum;", "T", "", "value", "getValue", "()Ljava/lang/Object;", "app_debug"})
public abstract interface ValueEnum<T extends java.lang.Object> {
    
    public abstract T getValue();
}