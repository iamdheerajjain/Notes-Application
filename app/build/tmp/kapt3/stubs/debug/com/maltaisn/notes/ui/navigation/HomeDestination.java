package com.maltaisn.notes.ui.navigation;

/**
 * A destination accessible only by changing the content of the [HomeFragment].
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/maltaisn/notes/ui/navigation/HomeDestination;", "Lcom/maltaisn/notes/ui/navigation/NavigationDestination;", "Landroid/os/Parcelable;", "Labels", "Reminders", "Status", "Lcom/maltaisn/notes/ui/navigation/HomeDestination$Labels;", "Lcom/maltaisn/notes/ui/navigation/HomeDestination$Reminders;", "Lcom/maltaisn/notes/ui/navigation/HomeDestination$Status;", "app_debug"})
public abstract interface HomeDestination extends com.maltaisn.notes.ui.navigation.NavigationDestination, android.os.Parcelable {
    
    /**
     * Destination to view all notes with a [label].
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/maltaisn/notes/ui/navigation/HomeDestination$Labels;", "Lcom/maltaisn/notes/ui/navigation/HomeDestination;", "label", "Lcom/maltaisn/notes/model/entity/Label;", "(Lcom/maltaisn/notes/model/entity/Label;)V", "getLabel", "()Lcom/maltaisn/notes/model/entity/Label;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    @kotlinx.parcelize.Parcelize()
    public static final class Labels implements com.maltaisn.notes.ui.navigation.HomeDestination {
        @org.jetbrains.annotations.NotNull()
        private final com.maltaisn.notes.model.entity.Label label = null;
        
        public Labels(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.entity.Label label) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.model.entity.Label getLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.model.entity.Label component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.navigation.HomeDestination.Labels copy(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.entity.Label label) {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
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
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
    }
    
    /**
     * Destination to view all notes with a reminder.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/maltaisn/notes/ui/navigation/HomeDestination$Reminders;", "Lcom/maltaisn/notes/ui/navigation/HomeDestination;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    @kotlinx.parcelize.Parcelize()
    public static final class Reminders implements com.maltaisn.notes.ui.navigation.HomeDestination {
        @org.jetbrains.annotations.NotNull()
        public static final com.maltaisn.notes.ui.navigation.HomeDestination.Reminders INSTANCE = null;
        
        private Reminders() {
            super();
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
    }
    
    /**
     * Destination to view all notes of with a specific [status].
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/maltaisn/notes/ui/navigation/HomeDestination$Status;", "Lcom/maltaisn/notes/ui/navigation/HomeDestination;", "status", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "(Lcom/maltaisn/notes/model/entity/NoteStatus;)V", "getStatus", "()Lcom/maltaisn/notes/model/entity/NoteStatus;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    @kotlinx.parcelize.Parcelize()
    public static final class Status implements com.maltaisn.notes.ui.navigation.HomeDestination {
        @org.jetbrains.annotations.NotNull()
        private final com.maltaisn.notes.model.entity.NoteStatus status = null;
        
        public Status(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.entity.NoteStatus status) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.model.entity.NoteStatus getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.model.entity.NoteStatus component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.navigation.HomeDestination.Status copy(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.entity.NoteStatus status) {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
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
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
    }
}