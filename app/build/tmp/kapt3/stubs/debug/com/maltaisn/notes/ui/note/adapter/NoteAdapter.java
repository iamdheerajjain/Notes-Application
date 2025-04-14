package com.maltaisn.notes.ui.note.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003345B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019J\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0016J\b\u0010&\u001a\u00020\u0019H\u0007J\b\u0010\'\u001a\u00020\u001bH\u0007J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0010H\u0016J\u0018\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0010H\u0016J\u0010\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0003H\u0016J\u0006\u00102\u001a\u00020\u001fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00066"}, d2 = {"Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/maltaisn/notes/ui/note/adapter/NoteListItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "callback", "Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$Callback;", "prefsManager", "Lcom/maltaisn/notes/model/PrefsManager;", "(Landroid/content/Context;Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$Callback;Lcom/maltaisn/notes/model/PrefsManager;)V", "getCallback", "()Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$Callback;", "getContext", "()Landroid/content/Context;", "highlightBackgroundColor", "", "getHighlightBackgroundColor", "()I", "highlightForegroundColor", "getHighlightForegroundColor", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "labelViewHolderPool", "Lkotlin/collections/ArrayDeque;", "Lcom/maltaisn/notes/ui/note/adapter/LabelChipViewHolder;", "listNoteItemViewHolderPool", "Lcom/maltaisn/notes/ui/note/adapter/ListNoteItemViewHolder;", "getPrefsManager", "()Lcom/maltaisn/notes/model/PrefsManager;", "freeLabelViewHolder", "", "viewHolder", "freeListNoteItemViewHolder", "getItemId", "", "position", "getItemViewType", "obtainLabelViewHolder", "obtainListNoteItemViewHolder", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "updateForListLayoutChange", "Callback", "SwipeDirection", "ViewType", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.ListAdapter<com.maltaisn.notes.ui.note.adapter.NoteListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.ui.note.adapter.NoteAdapter.Callback callback = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.PrefsManager prefsManager = null;
    
    /**
     * A pool of view holders for showing items of list notes.
     * When list note items are bound, view holders are obtained from this pool and bound.
     * When list note items are recycled, view holders are added back to the pool.
     * **Should only be accessed on main thread.**
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.collections.ArrayDeque<com.maltaisn.notes.ui.note.adapter.ListNoteItemViewHolder> listNoteItemViewHolderPool = null;
    
    /**
     * A pool of view holders for showing label chips
     * When note items are bound, view holders are obtained from this pool and bound.
     * When note items are recycled, view holders are added back to the pool.
     * **Should only be accessed on main thread.**
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.collections.ArrayDeque<com.maltaisn.notes.ui.note.adapter.LabelChipViewHolder> labelViewHolderPool = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = null;
    private final int highlightBackgroundColor = 0;
    private final int highlightForegroundColor = 0;
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.NoteAdapter.Callback callback, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager prefsManager) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.adapter.NoteAdapter.Callback getCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.PrefsManager getPrefsManager() {
        return null;
    }
    
    public final int getHighlightBackgroundColor() {
        return 0;
    }
    
    public final int getHighlightForegroundColor() {
        return 0;
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.adapter.ListNoteItemViewHolder obtainListNoteItemViewHolder() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.adapter.LabelChipViewHolder obtainLabelViewHolder() {
        return null;
    }
    
    public final void freeListNoteItemViewHolder(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.ListNoteItemViewHolder viewHolder) {
    }
    
    public final void freeLabelViewHolder(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.LabelChipViewHolder viewHolder) {
    }
    
    public final void updateForListLayoutChange() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0015"}, d2 = {"Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$Callback;", "", "strikethroughCheckedItems", "", "getStrikethroughCheckedItems", "()Z", "getNoteSwipeAction", "Lcom/maltaisn/notes/ui/note/SwipeAction;", "direction", "Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$SwipeDirection;", "onMessageItemDismissed", "", "item", "Lcom/maltaisn/notes/ui/note/adapter/MessageItem;", "pos", "", "onNoteActionButtonClicked", "Lcom/maltaisn/notes/ui/note/adapter/NoteItem;", "onNoteItemClicked", "onNoteItemLongClicked", "onNoteSwiped", "app_debug"})
    public static abstract interface Callback {
        
        /**
         * Called when a note [item] at [pos] is clicked.
         */
        public abstract void onNoteItemClicked(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.note.adapter.NoteItem item, int pos);
        
        /**
         * Called when a note [item] at [pos] is long-clicked.
         */
        public abstract void onNoteItemLongClicked(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.note.adapter.NoteItem item, int pos);
        
        /**
         * Called when a message [item] at [pos] is dismissed by clicking on close button.
         */
        public abstract void onMessageItemDismissed(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.note.adapter.MessageItem item, int pos);
        
        /**
         * Called when a note's action button is clicked.
         */
        public abstract void onNoteActionButtonClicked(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.note.adapter.NoteItem item, int pos);
        
        /**
         * Returns the action for the given swipe direction.
         */
        @org.jetbrains.annotations.NotNull()
        public abstract com.maltaisn.notes.ui.note.SwipeAction getNoteSwipeAction(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.note.adapter.NoteAdapter.SwipeDirection direction);
        
        /**
         * Called when a [NoteItem] at [pos] is swiped.
         */
        public abstract void onNoteSwiped(int pos, @org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.note.adapter.NoteAdapter.SwipeDirection direction);
        
        /**
         * Whether strikethrough should be added to checked items or not.
         */
        public abstract boolean getStrikethroughCheckedItems();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$SwipeDirection;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "app_debug"})
    public static enum SwipeDirection {
        /*public static final*/ LEFT /* = new LEFT() */,
        /*public static final*/ RIGHT /* = new RIGHT() */;
        
        SwipeDirection() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.maltaisn.notes.ui.note.adapter.NoteAdapter.SwipeDirection> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/maltaisn/notes/ui/note/adapter/NoteAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "MESSAGE", "HEADER", "TEXT_NOTE", "LIST_NOTE", "app_debug"})
    public static enum ViewType {
        /*public static final*/ MESSAGE /* = new MESSAGE() */,
        /*public static final*/ HEADER /* = new HEADER() */,
        /*public static final*/ TEXT_NOTE /* = new TEXT_NOTE() */,
        /*public static final*/ LIST_NOTE /* = new LIST_NOTE() */;
        
        ViewType() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.maltaisn.notes.ui.note.adapter.NoteAdapter.ViewType> getEntries() {
            return null;
        }
    }
}