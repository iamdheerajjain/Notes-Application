package com.maltaisn.notes.ui.labels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001aJ\u000e\u0010\'\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010(\u001a\u00020#H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u001a@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00158F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0017\u00a8\u0006,"}, d2 = {"Lcom/maltaisn/notes/ui/labels/LabelEditViewModel;", "Landroidx/lifecycle/ViewModel;", "labelsRepository", "Lcom/maltaisn/notes/model/LabelsRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/maltaisn/notes/model/LabelsRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_labelAddEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/maltaisn/notes/ui/Event;", "Lcom/maltaisn/notes/model/entity/Label;", "_labelError", "Lcom/maltaisn/notes/ui/labels/LabelEditViewModel$Error;", "kotlin.jvm.PlatformType", "_setLabelEvent", "value", "", "hidden", "setHidden", "(Z)V", "labelAddEvent", "Landroidx/lifecycle/LiveData;", "getLabelAddEvent", "()Landroidx/lifecycle/LiveData;", "labelId", "", "", "labelName", "setLabelName", "(Ljava/lang/String;)V", "nameError", "getNameError", "setLabelEvent", "getSetLabelEvent", "addLabel", "", "onHiddenChanged", "onNameChanged", "name", "start", "updateError", "Companion", "Error", "Factory", "app_debug"})
public final class LabelEditViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.LabelsRepository labelsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Label>> _setLabelEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Label>> _labelAddEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.labels.LabelEditViewModel.Error> _labelError = null;
    private long labelId = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String labelName;
    private boolean hidden;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_NAME = "name";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_HIDDEN = "hidden";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.labels.LabelEditViewModel.Companion Companion = null;
    
    @dagger.assisted.AssistedInject()
    public LabelEditViewModel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.LabelsRepository labelsRepository, @dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Label>> getSetLabelEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.model.entity.Label>> getLabelAddEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.labels.LabelEditViewModel.Error> getNameError() {
        return null;
    }
    
    private final void setLabelName(java.lang.String value) {
    }
    
    private final void setHidden(boolean value) {
    }
    
    public final void start(long labelId) {
    }
    
    public final void onNameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void onHiddenChanged(boolean hidden) {
    }
    
    public final void addLabel() {
    }
    
    private final void updateError() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/labels/LabelEditViewModel$Companion;", "", "()V", "KEY_HIDDEN", "", "KEY_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/labels/LabelEditViewModel$Error;", "", "(Ljava/lang/String;I)V", "NONE", "DUPLICATE", "BLANK", "app_debug"})
    public static enum Error {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ DUPLICATE /* = new DUPLICATE() */,
        /*public static final*/ BLANK /* = new BLANK() */;
        
        Error() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.maltaisn.notes.ui.labels.LabelEditViewModel.Error> getEntries() {
            return null;
        }
    }
    
    @dagger.assisted.AssistedFactory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/labels/LabelEditViewModel$Factory;", "Lcom/maltaisn/notes/ui/AssistedSavedStateViewModelFactory;", "Lcom/maltaisn/notes/ui/labels/LabelEditViewModel;", "create", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_debug"})
    public static abstract interface Factory extends com.maltaisn.notes.ui.AssistedSavedStateViewModelFactory<com.maltaisn.notes.ui.labels.LabelEditViewModel> {
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public abstract com.maltaisn.notes.ui.labels.LabelEditViewModel create(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle);
    }
}