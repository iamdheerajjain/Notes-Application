package com.maltaisn.notes.ui.home;

/**
 * Used to provide built-type dependent behavior.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/maltaisn/notes/ui/home/BuildTypeBehavior;", "", "doExtraAction", "", "viewModel", "Lcom/maltaisn/notes/ui/home/HomeViewModel;", "(Lcom/maltaisn/notes/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface BuildTypeBehavior {
    
    /**
     * Called by [HomeViewModel] to do something when the extra menu item is clicked.
     * This is only called in debug builds.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object doExtraAction(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.home.HomeViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}