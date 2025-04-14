package com.maltaisn.notes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"navigateSafe", "", "Landroidx/navigation/NavController;", "directions", "Landroidx/navigation/NavDirections;", "allowSameDest", "", "extras", "Landroidx/navigation/Navigator$Extras;", "app_debug"})
public final class NavigationExtensionsKt {
    
    /**
     * Navigate safely to another destination with [directions], the action must be registered on current destination.
     * This will also prevent adding the same destination to the backstack more than once.
     * @param [allowSameDest] Whether to allow navigating from the current destination to itself.
     */
    public static final void navigateSafe(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController $this$navigateSafe, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections directions, boolean allowSameDest, @org.jetbrains.annotations.Nullable()
    androidx.navigation.Navigator.Extras extras) {
    }
}