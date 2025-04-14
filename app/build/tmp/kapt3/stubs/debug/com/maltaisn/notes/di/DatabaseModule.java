package com.maltaisn.notes.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/maltaisn/notes/di/DatabaseModule;", "", "()V", "providesDatabase", "Lcom/maltaisn/notes/model/NotesDatabase;", "context", "Landroid/content/Context;", "providesLabelsDao", "Lcom/maltaisn/notes/model/LabelsDao;", "database", "providesNotesDao", "Lcom/maltaisn/notes/model/NotesDao;", "app_debug"})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.NotesDatabase providesDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.NotesDao providesNotesDao(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.LabelsDao providesLabelsDao(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesDatabase database) {
        return null;
    }
}