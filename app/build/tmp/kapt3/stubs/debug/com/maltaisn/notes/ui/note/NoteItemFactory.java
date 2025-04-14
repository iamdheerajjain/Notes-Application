package com.maltaisn.notes.ui.note;

/**
 * Class used to create note items for the note preview list.
 * Handles which items are visible, search highlights, ellipsis, etc.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J.\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J0\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J*\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00162\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00160\u0016H\u0002J\"\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\'0\'2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0016H\u0002J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006+"}, d2 = {"Lcom/maltaisn/notes/ui/note/NoteItemFactory;", "", "prefs", "Lcom/maltaisn/notes/model/PrefsManager;", "(Lcom/maltaisn/notes/model/PrefsManager;)V", "appendIdToTitle", "", "getAppendIdToTitle", "()Z", "setAppendIdToTitle", "(Z)V", "query", "", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "createItem", "Lcom/maltaisn/notes/ui/note/adapter/NoteItem;", "note", "Lcom/maltaisn/notes/model/entity/Note;", "labels", "", "Lcom/maltaisn/notes/model/entity/Label;", "checked", "showMarkAsDone", "createListItem", "Lcom/maltaisn/notes/ui/note/adapter/NoteItemList;", "createTextItem", "Lcom/maltaisn/notes/ui/note/adapter/NoteItemText;", "createTitle", "Lcom/maltaisn/notes/ui/note/Highlighted;", "getListItemCount", "", "items", "Lcom/maltaisn/notes/model/entity/ListNoteItem;", "highlights", "Lkotlin/ranges/IntRange;", "getListItemHighlights", "", "getStartEllipsisThreshold", "threshold", "Companion", "app_debug"})
public final class NoteItemFactory {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.PrefsManager prefs = null;
    
    /**
     * Search query used to set highlights on created note.
     * Set to `null` to highlight nothing.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String query;
    
    /**
     * Whether to append note ID to title, for debugging.
     */
    private boolean appendIdToTitle = false;
    
    /**
     * If checked items are moved to the bottom and hidden in preview,
     * this is the minimum number of items shown in a list note preview.
     * So if all items are checked, this number of items will be shown, even if they're checked.
     */
    private static final int MINIMUM_LIST_NOTE_ITEMS = 2;
    private static final int MAX_HIGHLIGHTS_IN_TITLE = 2;
    private static final int MAX_HIGHLIGHTS_IN_TEXT = 10;
    private static final int MAX_HIGHLIGHTS_IN_LIST_ITEM = 2;
    private static final int MAX_HIGHLIGHTS_IN_LIST = 10;
    private static final int START_ELLIPSIS_THRESHOLD_TITLE = 20;
    private static final int START_ELLIPSIS_DISTANCE_TITLE = 10;
    private static final int START_ELLIPSIS_THRESHOLD_ITEM = 10;
    private static final int START_ELLIPSIS_DISTANCE_ITEM = 4;
    private static final int START_ELLIPSIS_THRESHOLD_CONTENT = 15;
    private static final int START_ELLIPSIS_THRESHOLD_CONTENT_FIRST = 5;
    private static final int START_ELLIPSIS_DISTANCE_CONTENT = 20;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.note.NoteItemFactory.Companion Companion = null;
    
    @javax.inject.Inject()
    public NoteItemFactory(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager prefs) {
        super();
    }
    
    /**
     * Search query used to set highlights on created note.
     * Set to `null` to highlight nothing.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQuery() {
        return null;
    }
    
    /**
     * Search query used to set highlights on created note.
     * Set to `null` to highlight nothing.
     */
    public final void setQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Whether to append note ID to title, for debugging.
     */
    public final boolean getAppendIdToTitle() {
        return false;
    }
    
    /**
     * Whether to append note ID to title, for debugging.
     */
    public final void setAppendIdToTitle(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.adapter.NoteItem createItem(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Note note, @org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.Label> labels, boolean checked, boolean showMarkAsDone) {
        return null;
    }
    
    private final com.maltaisn.notes.ui.note.adapter.NoteItemText createTextItem(com.maltaisn.notes.model.entity.Note note, java.util.List<com.maltaisn.notes.model.entity.Label> labels, boolean checked, boolean showMarkAsDone) {
        return null;
    }
    
    private final com.maltaisn.notes.ui.note.adapter.NoteItemList createListItem(com.maltaisn.notes.model.entity.Note note, java.util.List<com.maltaisn.notes.model.entity.Label> labels, boolean checked, boolean showMarkAsDone) {
        return null;
    }
    
    private final int getListItemCount(java.util.List<com.maltaisn.notes.model.entity.ListNoteItem> items, java.util.List<? extends java.util.List<kotlin.ranges.IntRange>> highlights) {
        return 0;
    }
    
    private final java.util.List<java.util.List<kotlin.ranges.IntRange>> getListItemHighlights(java.util.List<com.maltaisn.notes.model.entity.ListNoteItem> items) {
        return null;
    }
    
    private final com.maltaisn.notes.ui.note.Highlighted createTitle(com.maltaisn.notes.model.entity.Note note) {
        return null;
    }
    
    private final int getStartEllipsisThreshold(int threshold) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/maltaisn/notes/ui/note/NoteItemFactory$Companion;", "", "()V", "MAX_HIGHLIGHTS_IN_LIST", "", "MAX_HIGHLIGHTS_IN_LIST_ITEM", "MAX_HIGHLIGHTS_IN_TEXT", "MAX_HIGHLIGHTS_IN_TITLE", "MINIMUM_LIST_NOTE_ITEMS", "START_ELLIPSIS_DISTANCE_CONTENT", "START_ELLIPSIS_DISTANCE_ITEM", "START_ELLIPSIS_DISTANCE_TITLE", "START_ELLIPSIS_THRESHOLD_CONTENT", "START_ELLIPSIS_THRESHOLD_CONTENT_FIRST", "START_ELLIPSIS_THRESHOLD_ITEM", "START_ELLIPSIS_THRESHOLD_TITLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}