package com.maltaisn.notes.ui.navigation;

/**
 * Different destinations accessible from the navigation drawer.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/maltaisn/notes/ui/navigation/NavigationDestination;", "", "NavGraph", "Lcom/maltaisn/notes/ui/navigation/HomeDestination;", "Lcom/maltaisn/notes/ui/navigation/NavigationDestination$NavGraph;", "app_debug"})
public abstract interface NavigationDestination {
    
    /**
     * Destination to navigate to another fragment in the navigation graph.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/maltaisn/notes/ui/navigation/NavigationDestination$NavGraph;", "Lcom/maltaisn/notes/ui/navigation/NavigationDestination;", "directions", "Landroidx/navigation/NavDirections;", "(Landroidx/navigation/NavDirections;)V", "getDirections", "()Landroidx/navigation/NavDirections;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class NavGraph implements com.maltaisn.notes.ui.navigation.NavigationDestination {
        @org.jetbrains.annotations.NotNull()
        private final androidx.navigation.NavDirections directions = null;
        
        public NavGraph(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavDirections directions) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections getDirections() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.navigation.NavigationDestination.NavGraph copy(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavDirections directions) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}