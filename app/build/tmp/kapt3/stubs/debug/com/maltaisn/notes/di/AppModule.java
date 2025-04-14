package com.maltaisn.notes.di;

@dagger.Module(includes = {com.maltaisn.notes.di.DatabaseModule.class, com.maltaisn.notes.di.BuildTypeModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t*\u00020\n8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00020\u000e*\u00020\u000f8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/maltaisn/notes/di/AppModule;", "", "()V", "bindAlarmCallback", "Lcom/maltaisn/notes/model/ReminderAlarmCallback;", "Lcom/maltaisn/notes/receiver/ReceiverAlarmCallback;", "getBindAlarmCallback", "(Lcom/maltaisn/notes/receiver/ReceiverAlarmCallback;)Lcom/maltaisn/notes/model/ReminderAlarmCallback;", "bindJsonManager", "Lcom/maltaisn/notes/model/JsonManager;", "Lcom/maltaisn/notes/model/DefaultJsonManager;", "getBindJsonManager", "(Lcom/maltaisn/notes/model/DefaultJsonManager;)Lcom/maltaisn/notes/model/JsonManager;", "bindLabelsRepository", "Lcom/maltaisn/notes/model/LabelsRepository;", "Lcom/maltaisn/notes/model/DefaultLabelsRepository;", "getBindLabelsRepository", "(Lcom/maltaisn/notes/model/DefaultLabelsRepository;)Lcom/maltaisn/notes/model/LabelsRepository;", "bindNotesRepository", "Lcom/maltaisn/notes/model/NotesRepository;", "Lcom/maltaisn/notes/model/DefaultNotesRepository;", "getBindNotesRepository", "(Lcom/maltaisn/notes/model/DefaultNotesRepository;)Lcom/maltaisn/notes/model/NotesRepository;", "Companion", "app_debug"})
public abstract class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.di.AppModule.Companion Companion = null;
    
    public AppModule() {
        super();
    }
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.model.NotesRepository getBindNotesRepository(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.DefaultNotesRepository p0);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.model.LabelsRepository getBindLabelsRepository(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.DefaultLabelsRepository p0);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.model.JsonManager getBindJsonManager(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.DefaultJsonManager p0);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.model.ReminderAlarmCallback getBindAlarmCallback(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.receiver.ReceiverAlarmCallback p0);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/maltaisn/notes/di/AppModule$Companion;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "providesSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @dagger.Provides()
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences providesSharedPreferences(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @dagger.Provides()
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.json.Json getJson() {
            return null;
        }
    }
}