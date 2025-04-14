package com.maltaisn.notes.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096@\u00a2\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0002\u0010\u0016J*\u0010#\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!H\u0082@\u00a2\u0006\u0002\u0010&J\u001a\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010\u000f\u001a\u00020(2\u0006\u0010\u0011\u001a\u00020(H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/maltaisn/notes/model/DefaultJsonManager;", "Lcom/maltaisn/notes/model/JsonManager;", "notesDao", "Lcom/maltaisn/notes/model/NotesDao;", "labelsDao", "Lcom/maltaisn/notes/model/LabelsDao;", "json", "Lkotlinx/serialization/json/Json;", "reminderAlarmManager", "Lcom/maltaisn/notes/model/ReminderAlarmManager;", "prefs", "Lcom/maltaisn/notes/model/PrefsManager;", "(Lcom/maltaisn/notes/model/NotesDao;Lcom/maltaisn/notes/model/LabelsDao;Lkotlinx/serialization/json/Json;Lcom/maltaisn/notes/model/ReminderAlarmManager;Lcom/maltaisn/notes/model/PrefsManager;)V", "compareReminders", "", "old", "Lcom/maltaisn/notes/model/entity/Reminder;", "new", "encryptNotesData", "Lcom/maltaisn/notes/model/EncryptedNotesData;", "notesData", "Lcom/maltaisn/notes/model/NotesData;", "(Lcom/maltaisn/notes/model/NotesData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exportJsonData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importJsonData", "Lcom/maltaisn/notes/model/JsonManager$ImportResult;", "data", "importKey", "Ljavax/crypto/SecretKey;", "(Ljava/lang/String;Ljavax/crypto/SecretKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importLabels", "", "", "importNotes", "", "newLabelsMap", "(Lcom/maltaisn/notes/model/NotesData;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeNotes", "Lcom/maltaisn/notes/model/entity/Note;", "Companion", "app_debug"})
public final class DefaultJsonManager implements com.maltaisn.notes.model.JsonManager {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.NotesDao notesDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.LabelsDao labelsDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.serialization.json.Json json = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.PrefsManager prefs = null;
    private static final int VERSION = 4;
    private static final int FIRST_VERSION = 3;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXPORT_ENCRYPTION_ALGORITHM = "AES/GCM/NoPadding";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXPORT_ENCRYPTION_KEY_ALIAS = "export_key";
    private static final int BASE64_FLAGS = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.DefaultJsonManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public DefaultJsonManager(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesDao notesDao, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.LabelsDao labelsDao, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.json.Json json, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager prefs) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object exportJsonData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    private final java.lang.Object encryptNotesData(com.maltaisn.notes.model.NotesData notesData, kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.EncryptedNotesData> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object importJsonData(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.Nullable()
    javax.crypto.SecretKey importKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.JsonManager.ImportResult> $completion) {
        return null;
    }
    
    private final java.lang.Object importLabels(com.maltaisn.notes.model.NotesData notesData, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.Long, java.lang.Long>> $completion) {
        return null;
    }
    
    private final java.lang.Object importNotes(com.maltaisn.notes.model.NotesData notesData, java.util.Map<java.lang.Long, java.lang.Long> newLabelsMap, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final com.maltaisn.notes.model.entity.Note mergeNotes(com.maltaisn.notes.model.entity.Note old, com.maltaisn.notes.model.entity.Note p1_54480) {
        return null;
    }
    
    private final boolean compareReminders(com.maltaisn.notes.model.entity.Reminder old, com.maltaisn.notes.model.entity.Reminder p1_54480) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/maltaisn/notes/model/DefaultJsonManager$Companion;", "", "()V", "BASE64_FLAGS", "", "EXPORT_ENCRYPTION_ALGORITHM", "", "EXPORT_ENCRYPTION_KEY_ALIAS", "FIRST_VERSION", "VERSION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}