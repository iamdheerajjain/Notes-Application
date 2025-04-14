package com.maltaisn.notes.di;

@javax.inject.Singleton()
@dagger.Component(modules = {com.maltaisn.notes.di.AppModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0017J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0010H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0012H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0014H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0016H&\u00a8\u0006\u0018"}, d2 = {"Lcom/maltaisn/notes/di/AppComponent;", "", "inject", "", "app", "Lcom/maltaisn/notes/App;", "receiver", "Lcom/maltaisn/notes/receiver/AlarmReceiver;", "fragment", "Lcom/maltaisn/notes/ui/edit/EditFragment;", "Lcom/maltaisn/notes/ui/home/HomeFragment;", "dialog", "Lcom/maltaisn/notes/ui/labels/LabelEditDialog;", "Lcom/maltaisn/notes/ui/labels/LabelFragment;", "activity", "Lcom/maltaisn/notes/ui/main/MainActivity;", "Lcom/maltaisn/notes/ui/notification/NotificationActivity;", "Lcom/maltaisn/notes/ui/reminder/ReminderDialog;", "Lcom/maltaisn/notes/ui/search/SearchFragment;", "Lcom/maltaisn/notes/ui/settings/ExportPasswordDialog;", "Lcom/maltaisn/notes/ui/settings/ImportPasswordDialog;", "Lcom/maltaisn/notes/ui/settings/SettingsFragment;", "Lcom/maltaisn/notes/ui/sort/SortDialog;", "Factory", "app_debug"})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.App app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.main.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.notification.NotificationActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.home.HomeFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.search.SearchFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.EditFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.labels.LabelFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.settings.SettingsFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.reminder.ReminderDialog dialog);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.labels.LabelEditDialog dialog);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.sort.SortDialog dialog);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.settings.ExportPasswordDialog dialog);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.settings.ImportPasswordDialog dialog);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.receiver.AlarmReceiver receiver);
    
    @dagger.Component.Factory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/di/AppComponent$Factory;", "", "create", "Lcom/maltaisn/notes/di/AppComponent;", "appContext", "Landroid/content/Context;", "app_debug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.maltaisn.notes.di.AppComponent create(@dagger.BindsInstance()
        @org.jetbrains.annotations.NotNull()
        android.content.Context appContext);
    }
}