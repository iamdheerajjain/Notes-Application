package com.maltaisn.notes.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/maltaisn/notes/di/BuildTypeModule;", "", "()V", "bind", "Lcom/maltaisn/notes/ui/home/BuildTypeBehavior;", "Lcom/maltaisn/notes/ui/home/DebugBuildTypeBehavior;", "getBind", "(Lcom/maltaisn/notes/ui/home/DebugBuildTypeBehavior;)Lcom/maltaisn/notes/ui/home/BuildTypeBehavior;", "app_debug"})
public abstract class BuildTypeModule {
    
    public BuildTypeModule() {
        super();
    }
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.maltaisn.notes.ui.home.BuildTypeBehavior getBind(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.home.DebugBuildTypeBehavior p0);
}