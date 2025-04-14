package com.maltaisn.notes.model.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FBY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u0006\u00101\u001a\u00020\u0000J\u0010\u00102\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u00020\u001eJ\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u001eJ\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\nH\u00c6\u0003J\t\u0010<\u001a\u00020\fH\u00c6\u0003J\t\u0010=\u001a\u00020\fH\u00c6\u0003J\t\u0010>\u001a\u00020\u000fH\u00c6\u0003J\t\u0010?\u001a\u00020\u0011H\u00c6\u0003Jo\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001J\u0013\u0010A\u001a\u00020\u001e2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020DH\u00d6\u0001J\t\u0010E\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100\u00a8\u0006G"}, d2 = {"Lcom/maltaisn/notes/model/entity/Note;", "", "id", "", "type", "Lcom/maltaisn/notes/model/entity/NoteType;", "title", "", "content", "metadata", "Lcom/maltaisn/notes/model/entity/NoteMetadata;", "addedDate", "Ljava/util/Date;", "lastModifiedDate", "status", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "pinned", "Lcom/maltaisn/notes/model/entity/PinnedStatus;", "reminder", "Lcom/maltaisn/notes/model/entity/Reminder;", "(JLcom/maltaisn/notes/model/entity/NoteType;Ljava/lang/String;Ljava/lang/String;Lcom/maltaisn/notes/model/entity/NoteMetadata;Ljava/util/Date;Ljava/util/Date;Lcom/maltaisn/notes/model/entity/NoteStatus;Lcom/maltaisn/notes/model/entity/PinnedStatus;Lcom/maltaisn/notes/model/entity/Reminder;)V", "getAddedDate", "()Ljava/util/Date;", "getContent", "()Ljava/lang/String;", "getId$annotations", "()V", "getId", "()J", "isBlank", "", "()Z", "getLastModifiedDate", "listItems", "", "Lcom/maltaisn/notes/model/entity/ListNoteItem;", "getListItems", "()Ljava/util/List;", "getMetadata", "()Lcom/maltaisn/notes/model/entity/NoteMetadata;", "getPinned", "()Lcom/maltaisn/notes/model/entity/PinnedStatus;", "getReminder", "()Lcom/maltaisn/notes/model/entity/Reminder;", "getStatus", "()Lcom/maltaisn/notes/model/entity/NoteStatus;", "getTitle", "getType", "()Lcom/maltaisn/notes/model/entity/NoteType;", "asListNote", "asText", "includeTitle", "asTextNote", "keepCheckedItems", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_debug"})
@androidx.room.Entity(tableName = "notes")
public final class Note {
    
    /**
     * Note ID in the database.
     * ID is transient during serialization since notes are mapped by ID in JSON,
     * so repeating this field would be superfluous.
     */
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id")
    private final long id = 0L;
    
    /**
     * Note type, determines the type of metadata.
     */
    @androidx.room.ColumnInfo(name = "type")
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.entity.NoteType type = null;
    
    /**
     * Note title, can be used for search.
     */
    @androidx.room.ColumnInfo(name = "title")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    
    /**
     * Note text content, can be used for search.
     */
    @androidx.room.ColumnInfo(name = "content")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String content = null;
    
    /**
     * Note metadata, not used for search.
     * @see NoteMetadataConverter
     */
    @androidx.room.ColumnInfo(name = "metadata")
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.entity.NoteMetadata metadata = null;
    
    /**
     * Creation date of the note, in UTC time.
     */
    @androidx.room.ColumnInfo(name = "added_date")
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date addedDate = null;
    
    /**
     * Last modification date of the note, in UTC time.
     * Change of [status] changes last modified date too.
     */
    @androidx.room.ColumnInfo(name = "modified_date")
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date lastModifiedDate = null;
    
    /**
     * Status of the note, i.e. its location in the user interface.
     */
    @androidx.room.ColumnInfo(name = "status")
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.entity.NoteStatus status = null;
    
    /**
     * Describes how the note is pinned.
     * Notes with [status] set to [NoteStatus.ACTIVE] should be pinned or unpinned.
     * Other notes should be set to [PinnedStatus.CANT_PIN].
     */
    @androidx.room.ColumnInfo(name = "pinned")
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.entity.PinnedStatus pinned = null;
    
    /**
     * The note reminder, or `null` if none is set.
     */
    @androidx.room.Embedded(prefix = "reminder_")
    @org.jetbrains.annotations.Nullable()
    private final com.maltaisn.notes.model.entity.Reminder reminder = null;
    public static final long NO_ID = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BULLET_CHARS = "-+*\u2022\u2013";
    public static final char DEFAULT_BULLET_CHAR = '-';
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.entity.Note.Companion Companion = null;
    
    public Note(long id, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteMetadata metadata, @org.jetbrains.annotations.NotNull()
    java.util.Date addedDate, @org.jetbrains.annotations.NotNull()
    java.util.Date lastModifiedDate, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteStatus status, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.PinnedStatus pinned, @org.jetbrains.annotations.Nullable()
    com.maltaisn.notes.model.entity.Reminder reminder) {
        super();
    }
    
    /**
     * Note ID in the database.
     * ID is transient during serialization since notes are mapped by ID in JSON,
     * so repeating this field would be superfluous.
     */
    public final long getId() {
        return 0L;
    }
    
    /**
     * Note ID in the database.
     * ID is transient during serialization since notes are mapped by ID in JSON,
     * so repeating this field would be superfluous.
     */
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getId$annotations() {
    }
    
    /**
     * Note type, determines the type of metadata.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteType getType() {
        return null;
    }
    
    /**
     * Note title, can be used for search.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    /**
     * Note text content, can be used for search.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    /**
     * Note metadata, not used for search.
     * @see NoteMetadataConverter
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteMetadata getMetadata() {
        return null;
    }
    
    /**
     * Creation date of the note, in UTC time.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getAddedDate() {
        return null;
    }
    
    /**
     * Last modification date of the note, in UTC time.
     * Change of [status] changes last modified date too.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLastModifiedDate() {
        return null;
    }
    
    /**
     * Status of the note, i.e. its location in the user interface.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteStatus getStatus() {
        return null;
    }
    
    /**
     * Describes how the note is pinned.
     * Notes with [status] set to [NoteStatus.ACTIVE] should be pinned or unpinned.
     * Other notes should be set to [PinnedStatus.CANT_PIN].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.PinnedStatus getPinned() {
        return null;
    }
    
    /**
     * The note reminder, or `null` if none is set.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.maltaisn.notes.model.entity.Reminder getReminder() {
        return null;
    }
    
    public final boolean isBlank() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.maltaisn.notes.model.entity.ListNoteItem> getListItems() {
        return null;
    }
    
    /**
     * Returns conversion of this note to a text note if it's not already one.
     * If all items were blank, resulting list note is empty. Otherwise, each item
     * because a text line with a bullet point at the start. Checked state is always lost.
     *
     * @param keepCheckedItems Whether to keep checked items or delete them.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.Note asTextNote(boolean keepCheckedItems) {
        return null;
    }
    
    /**
     * Returns a conversion of this note to a list note if it's not already one.
     * Each text line becomes an unchecked list item.
     * If all lines started with a bullet point, the bullet point is removed.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.Note asListNote() {
        return null;
    }
    
    /**
     * Convert this note to text, including both the title and the content.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String asText(boolean includeTitle) {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.maltaisn.notes.model.entity.Reminder component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteMetadata component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteStatus component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.PinnedStatus component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.Note copy(long id, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteMetadata metadata, @org.jetbrains.annotations.NotNull()
    java.util.Date addedDate, @org.jetbrains.annotations.NotNull()
    java.util.Date lastModifiedDate, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteStatus status, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.PinnedStatus pinned, @org.jetbrains.annotations.Nullable()
    com.maltaisn.notes.model.entity.Reminder reminder) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/maltaisn/notes/model/entity/Note$Companion;", "", "()V", "BULLET_CHARS", "", "DEFAULT_BULLET_CHAR", "", "NO_ID", "", "getCopiedNoteTitle", "currentTitle", "untitledName", "copySuffix", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Get the title of a copy of a note with [currentTitle].
         * Localized strings [untitledName] and [copySuffix] must be provided.
         * Returns "- Copy", "- Copy 2", "- Copy 3", etc, and sets a title if current is blank.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCopiedNoteTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String currentTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String untitledName, @org.jetbrains.annotations.NotNull()
        java.lang.String copySuffix) {
            return null;
        }
    }
}