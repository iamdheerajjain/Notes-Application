package com.maltaisn.notes.ui.note;

/**
 * Enum for deleted notes timeout.
 * [value] is from [R.array.pref_deleted_notes_timeout_values].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\r"}, d2 = {"Lcom/maltaisn/notes/ui/note/DeletedNotesTimeoutField;", "", "Lcom/maltaisn/notes/model/ValueEnum;", "", "value", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DAY", "WEEK", "MONTH", "YEAR", "Companion", "app_debug"})
public enum DeletedNotesTimeoutField implements com.maltaisn.notes.model.ValueEnum<java.lang.String> {
    /*public static final*/ DAY /* = new DAY(null) */,
    /*public static final*/ WEEK /* = new WEEK(null) */,
    /*public static final*/ MONTH /* = new MONTH(null) */,
    /*public static final*/ YEAR /* = new YEAR(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.note.DeletedNotesTimeoutField.Companion Companion = null;
    
    DeletedNotesTimeoutField(java.lang.String value) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.maltaisn.notes.ui.note.DeletedNotesTimeoutField> getEntries() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/maltaisn/notes/ui/note/DeletedNotesTimeoutField$Companion;", "", "()V", "fromValue", "Lcom/maltaisn/notes/ui/note/DeletedNotesTimeoutField;", "value", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.note.DeletedNotesTimeoutField fromValue(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
    }
}