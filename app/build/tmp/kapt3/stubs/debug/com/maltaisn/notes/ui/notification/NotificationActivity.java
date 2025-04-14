package com.maltaisn.notes.ui.notification;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0016\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/maltaisn/notes/ui/notification/NotificationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lcom/maltaisn/notes/ui/notification/NotificationViewModel;", "getViewModel", "()Lcom/maltaisn/notes/ui/notification/NotificationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Lcom/maltaisn/notes/ui/notification/NotificationViewModel$Factory;", "getViewModelFactory", "()Lcom/maltaisn/notes/ui/notification/NotificationViewModel$Factory;", "setViewModelFactory", "(Lcom/maltaisn/notes/ui/notification/NotificationViewModel$Factory;)V", "handleIntent", "", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "registerDatePickerListener", "picker", "Lcom/google/android/material/datepicker/MaterialDatePicker;", "", "registerTimePickerListener", "Lcom/google/android/material/timepicker/MaterialTimePicker;", "setupViewModelObservers", "Companion", "app_debug"})
public final class NotificationActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.maltaisn.notes.ui.notification.NotificationViewModel.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATE_DIALOG_TAG = "date-picker-dialog";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TIME_DIALOG_TAG = "time-picker-dialog";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_INTENT_HANDLED = "com.maltaisn.notes.INTENT_HANDLED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_ACTION_POSTPONE = "com.maltaisn.notes.reminder.POSTPONE";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.notification.NotificationActivity.Companion Companion = null;
    
    public NotificationActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.notification.NotificationViewModel.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.notification.NotificationViewModel.Factory p0) {
    }
    
    private final com.maltaisn.notes.ui.notification.NotificationViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViewModelObservers() {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    private final void registerDatePickerListener(com.google.android.material.datepicker.MaterialDatePicker<java.lang.Long> picker) {
    }
    
    private final void registerTimePickerListener(com.google.android.material.timepicker.MaterialTimePicker picker) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/maltaisn/notes/ui/notification/NotificationActivity$Companion;", "", "()V", "DATE_DIALOG_TAG", "", "INTENT_ACTION_POSTPONE", "KEY_INTENT_HANDLED", "TIME_DIALOG_TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}