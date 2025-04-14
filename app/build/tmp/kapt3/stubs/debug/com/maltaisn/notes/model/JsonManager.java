package com.maltaisn.notes.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/maltaisn/notes/model/JsonManager;", "", "exportJsonData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importJsonData", "Lcom/maltaisn/notes/model/JsonManager$ImportResult;", "data", "importKey", "Ljavax/crypto/SecretKey;", "(Ljava/lang/String;Ljavax/crypto/SecretKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ImportResult", "app_debug"})
public abstract interface JsonManager {
    
    /**
     * Export all the app data to a JSON string.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object exportJsonData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    /**
     * Import notes data from JSON, merging with existing data.
     * Returns true if import was successful, false otherwise.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object importJsonData(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.Nullable()
    javax.crypto.SecretKey importKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.JsonManager.ImportResult> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/maltaisn/notes/model/JsonManager$ImportResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "BAD_FORMAT", "BAD_DATA", "FUTURE_VERSION", "KEY_MISSING_OR_INCORRECT", "app_debug"})
    public static enum ImportResult {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ BAD_FORMAT /* = new BAD_FORMAT() */,
        /*public static final*/ BAD_DATA /* = new BAD_DATA() */,
        /*public static final*/ FUTURE_VERSION /* = new FUTURE_VERSION() */,
        /*public static final*/ KEY_MISSING_OR_INCORRECT /* = new KEY_MISSING_OR_INCORRECT() */;
        
        ImportResult() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.maltaisn.notes.model.JsonManager.ImportResult> getEntries() {
            return null;
        }
    }
}