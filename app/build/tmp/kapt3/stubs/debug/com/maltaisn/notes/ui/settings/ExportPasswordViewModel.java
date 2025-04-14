package com.maltaisn.notes.ui.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u001e\u001a\u00020\u001dR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017\u00a8\u0006!"}, d2 = {"Lcom/maltaisn/notes/ui/settings/ExportPasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_passwordRepeatErrorShown", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_passwordValid", "_setDialogDataEvent", "Lcom/maltaisn/notes/ui/Event;", "Lkotlin/Pair;", "", "value", "password", "setPassword", "(Ljava/lang/String;)V", "passwordRepeat", "setPasswordRepeat", "passwordRepeatErrorShown", "Landroidx/lifecycle/LiveData;", "getPasswordRepeatErrorShown", "()Landroidx/lifecycle/LiveData;", "passwordValid", "getPasswordValid", "setDialogDataEvent", "getSetDialogDataEvent", "onPasswordChanged", "", "start", "Companion", "Factory", "app_debug"})
public final class ExportPasswordViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Pair<java.lang.String, java.lang.String>>> _setDialogDataEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _passwordValid = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _passwordRepeatErrorShown = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String passwordRepeat;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_PASSWORD = "password";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_PASSWORD_REPEAT = "passwordRepeat";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.settings.ExportPasswordViewModel.Companion Companion = null;
    
    @dagger.assisted.AssistedInject()
    public ExportPasswordViewModel(@dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<kotlin.Pair<java.lang.String, java.lang.String>>> getSetDialogDataEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getPasswordValid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getPasswordRepeatErrorShown() {
        return null;
    }
    
    private final void setPassword(java.lang.String value) {
    }
    
    private final void setPasswordRepeat(java.lang.String value) {
    }
    
    public final void start() {
    }
    
    public final void onPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String passwordRepeat) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/settings/ExportPasswordViewModel$Companion;", "", "()V", "KEY_PASSWORD", "", "KEY_PASSWORD_REPEAT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @dagger.assisted.AssistedFactory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/settings/ExportPasswordViewModel$Factory;", "Lcom/maltaisn/notes/ui/AssistedSavedStateViewModelFactory;", "Lcom/maltaisn/notes/ui/settings/ExportPasswordViewModel;", "create", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_debug"})
    public static abstract interface Factory extends com.maltaisn.notes.ui.AssistedSavedStateViewModelFactory<com.maltaisn.notes.ui.settings.ExportPasswordViewModel> {
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public abstract com.maltaisn.notes.ui.settings.ExportPasswordViewModel create(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle);
    }
}