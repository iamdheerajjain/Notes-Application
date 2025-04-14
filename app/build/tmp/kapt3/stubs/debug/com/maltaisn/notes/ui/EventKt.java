package com.maltaisn.notes.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b\u001a)\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\n2\u0006\u0010\u000b\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\f\u001a\u0016\u0010\t\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\n\u00a8\u0006\r"}, d2 = {"observeEvent", "", "T", "Landroidx/lifecycle/LiveData;", "Lcom/maltaisn/notes/ui/Event;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Lkotlin/Function1;", "send", "Landroidx/lifecycle/MutableLiveData;", "value", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "app_debug"})
public final class EventKt {
    
    public static final <T extends java.lang.Object>void observeEvent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<T>> $this$observeEvent, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> observer) {
    }
    
    public static final <T extends java.lang.Object>void send(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<T>> $this$send, T value) {
    }
    
    public static final void send(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> $this$send) {
    }
}