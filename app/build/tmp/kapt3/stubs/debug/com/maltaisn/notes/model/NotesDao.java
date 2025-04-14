package com.maltaisn.notes.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u0016H\'J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0019J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00162\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J$\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010!\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\"\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00162\u0006\u0010$\u001a\u00020%H\'J$\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00162\u0006\u0010$\u001a\u00020\'2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J8\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00162\u0006\u0010$\u001a\u00020\'2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010*\"\u00020\u0001H\u0002J\u0016\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u001c\u0010,\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u00a7@\u00a2\u0006\u0002\u0010\f\u00a8\u0006-"}, d2 = {"Lcom/maltaisn/notes/model/NotesDao;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "note", "Lcom/maltaisn/notes/model/entity/Note;", "(Lcom/maltaisn/notes/model/entity/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "notes", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNotesByStatusAndDate", "status", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "minDate", "", "(Lcom/maltaisn/notes/model/entity/NoteStatus;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "Lcom/maltaisn/notes/model/entity/NoteWithLabels;", "getAllWithReminder", "Lkotlinx/coroutines/flow/Flow;", "getById", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByIdWithLabels", "getByLabel", "labelId", "sort", "Lcom/maltaisn/notes/model/SortSettings;", "getByStatus", "getLastCreatedNote", "insert", "insertAll", "runtimeQuery", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "search", "", "sortedQuery", "args", "", "update", "updateAll", "app_debug"})
@androidx.room.Dao()
public abstract interface NotesDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.Note> notes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.Note> notes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.Note> notes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Used for clearing all data.
     */
    @androidx.room.Query(value = "DELETE FROM notes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Get all notes in database, with their labels.
     * Used for exporting data.
     */
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM notes")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> $completion);
    
    /**
     * Get a note by its ID. Returns `null` if note doesn't exist.
     */
    @androidx.room.Query(value = "SELECT * FROM notes WHERE id == :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.Note> $completion);
    
    /**
     * Get a note by its ID with its labels. Returns `null` if note doesn't exist.
     */
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM notes WHERE id == :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getByIdWithLabels(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.NoteWithLabels> $completion);
    
    /**
     * Get the last created note, as indicated by creation date.
     * Returns `null` if there's no notes in database.
     */
    @androidx.room.Query(value = "SELECT * FROM notes ORDER BY added_date DESC LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLastCreatedNote(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.Note> $completion);
    
    /**
     * Get all notes with a [status], sorted by last modified date, with pinned notes first.
     * Exclude notes with a label marked as hidden, except if the note is deleted.
     * This is used to display notes for each status destination.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> getByStatus(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteStatus status, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.SortSettings sort);
    
    /**
     * Get all notes tagged with a label ([labelId]), except deleted notes.
     * The notes are sorted by status then by pinned status (pinned first), then by last modified date.
     * This is used to display notes by label.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> getByLabel(long labelId, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.SortSettings sort);
    
    /**
     * Get all notes with a reminder set and reminder not done, sorted by ascending date.
     * Used for reminders screen and for adding alarms back on boot.
     */
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM notes WHERE reminder_start IS NOT NULL AND NOT reminder_done ORDER BY reminder_next ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> getAllWithReminder();
    
    /**
     * Search active and archived notes for a [query] using full-text search,
     * sorted by status first then by last modified date.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.SortSettings sort);
    
    /**
     * For internal DAO use, to support query with variable sort field and direction.
     */
    @androidx.room.Transaction()
    @androidx.room.RawQuery(observedEntities = {com.maltaisn.notes.model.entity.Note.class, com.maltaisn.notes.model.entity.Label.class})
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> runtimeQuery(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    /**
     * Delete notes with a [status] and older than a [date][minDate].
     * Used for deleting notes in trash.
     */
    @androidx.room.Query(value = "DELETE FROM notes WHERE status == :status AND modified_date < :minDate")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteNotesByStatusAndDate(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteStatus status, long minDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        /**
         * Get all notes with a [status], sorted by last modified date, with pinned notes first.
         * Exclude notes with a label marked as hidden, except if the note is deleted.
         * This is used to display notes for each status destination.
         */
        @org.jetbrains.annotations.NotNull()
        public static kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> getByStatus(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.NotesDao $this, @org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.entity.NoteStatus status, @org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.SortSettings sort) {
            return null;
        }
        
        /**
         * Get all notes tagged with a label ([labelId]), except deleted notes.
         * The notes are sorted by status then by pinned status (pinned first), then by last modified date.
         * This is used to display notes by label.
         */
        @org.jetbrains.annotations.NotNull()
        public static kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> getByLabel(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.NotesDao $this, long labelId, @org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.SortSettings sort) {
            return null;
        }
        
        /**
         * Search active and archived notes for a [query] using full-text search,
         * sorted by status first then by last modified date.
         */
        @org.jetbrains.annotations.NotNull()
        public static kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> search(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.NotesDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String query, @org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.SortSettings sort) {
            return null;
        }
        
        /**
         * Append [sort] settings at the end of a note with labels observable query, with a list of bindable [args]
         * (only primitive values, not converted automatically). [query] should contain a `ORDER BY :sort` substring.
         */
        private static kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.NoteWithLabels>> sortedQuery(com.maltaisn.notes.model.NotesDao $this, java.lang.String query, com.maltaisn.notes.model.SortSettings sort, java.lang.Object... args) {
            return null;
        }
    }
}