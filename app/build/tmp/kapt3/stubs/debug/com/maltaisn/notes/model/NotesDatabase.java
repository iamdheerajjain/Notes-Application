package com.maltaisn.notes.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/maltaisn/notes/model/NotesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "labelsDao", "Lcom/maltaisn/notes/model/LabelsDao;", "notesDao", "Lcom/maltaisn/notes/model/NotesDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.maltaisn.notes.model.entity.Note.class, com.maltaisn.notes.model.entity.NoteFts.class, com.maltaisn.notes.model.entity.Label.class, com.maltaisn.notes.model.entity.LabelRef.class}, version = 4)
@androidx.room.TypeConverters(value = {com.maltaisn.notes.model.converter.DateTimeConverter.class, com.maltaisn.notes.model.converter.NoteTypeConverter.class, com.maltaisn.notes.model.converter.NoteStatusConverter.class, com.maltaisn.notes.model.converter.NoteMetadataConverter.class, com.maltaisn.notes.model.converter.PinnedStatusConverter.class, com.maltaisn.notes.model.converter.RecurrenceConverter.class})
public abstract class NotesDatabase extends androidx.room.RoomDatabase {
    public static final int VERSION = 4;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_3_4 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration[] ALL_MIGRATIONS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.NotesDatabase.Companion Companion = null;
    
    public NotesDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.model.NotesDao notesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.model.LabelsDao labelsDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/maltaisn/notes/model/NotesDatabase$Companion;", "", "()V", "ALL_MIGRATIONS", "", "Landroidx/room/migration/Migration;", "getALL_MIGRATIONS", "()[Landroidx/room/migration/Migration;", "[Landroidx/room/migration/Migration;", "MIGRATION_1_2", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_2_3", "getMIGRATION_2_3", "MIGRATION_3_4", "getMIGRATION_3_4", "VERSION", "", "app_debug"})
    @kotlin.Suppress(names = {"MagicNumber"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_1_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_2_3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_3_4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration[] getALL_MIGRATIONS() {
            return null;
        }
    }
}