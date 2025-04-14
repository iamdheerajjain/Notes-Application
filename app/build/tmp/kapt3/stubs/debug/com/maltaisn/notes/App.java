package com.maltaisn.notes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lcom/maltaisn/notes/App;", "Landroid/app/Application;", "()V", "appComponent", "error/NonExistentClass", "getAppComponent", "()Lerror/NonExistentClass;", "appComponent$delegate", "Lkotlin/Lazy;", "database", "Lcom/maltaisn/notes/model/NotesDatabase;", "getDatabase", "()Lcom/maltaisn/notes/model/NotesDatabase;", "setDatabase", "(Lcom/maltaisn/notes/model/NotesDatabase;)V", "prefs", "Lcom/maltaisn/notes/model/PrefsManager;", "getPrefs", "()Lcom/maltaisn/notes/model/PrefsManager;", "setPrefs", "(Lcom/maltaisn/notes/model/PrefsManager;)V", "createNotificationChannel", "", "onCreate", "updateTheme", "theme", "Lcom/maltaisn/notes/ui/AppTheme;", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appComponent$delegate = null;
    @javax.inject.Inject()
    public com.maltaisn.notes.model.PrefsManager prefs;
    @javax.inject.Inject()
    public com.maltaisn.notes.model.NotesDatabase database;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFICATION_CHANNEL_ID = "reminders";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.App.Companion Companion = null;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final error.NonExistentClass getAppComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.PrefsManager getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.NotesDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesDatabase p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void updateTheme(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.AppTheme theme) {
    }
    
    private final void createNotificationChannel() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/maltaisn/notes/App$Companion;", "", "()V", "NOTIFICATION_CHANNEL_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}