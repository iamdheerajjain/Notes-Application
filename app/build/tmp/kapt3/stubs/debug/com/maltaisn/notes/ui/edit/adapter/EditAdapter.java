package com.maltaisn.notes.ui.edit.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002!\"B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0017J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/maltaisn/notes/ui/edit/adapter/EditListItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "callback", "Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;", "(Landroid/content/Context;Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;)V", "getCallback", "()Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;", "getContext", "()Landroid/content/Context;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "pendingFocusChange", "Lcom/maltaisn/notes/ui/edit/EditViewModel$FocusChange;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getItemViewType", "", "position", "onAttachedToRecyclerView", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "setItemFocus", "focus", "Callback", "ViewType", "app_debug"})
public final class EditAdapter extends androidx.recyclerview.widget.ListAdapter<com.maltaisn.notes.ui.edit.adapter.EditListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.ui.edit.adapter.EditAdapter.Callback callback = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper = null;
    
    /**
     * Pending focus change to be made when item will be bound
     * by RecyclerView, or `null` if none is pending.
     */
    @org.jetbrains.annotations.Nullable()
    private com.maltaisn.notes.ui.edit.EditViewModel.FocusChange pendingFocusChange;
    
    public EditAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.adapter.EditAdapter.Callback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.edit.adapter.EditAdapter.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
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
    
    public final void setItemFocus(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.edit.EditViewModel.FocusChange focus) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0003H&J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0003H&J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0004\u00a8\u0006\u001d"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;", "", "isNoteDragEnabled", "", "()Z", "moveCheckedToBottom", "getMoveCheckedToBottom", "strikethroughCheckedItems", "getStrikethroughCheckedItems", "onLinkClickedInNote", "", "linkText", "", "linkUrl", "onNoteClickedToEdit", "onNoteItemAddClicked", "pos", "", "onNoteItemBackspacePressed", "onNoteItemChanged", "isPaste", "onNoteItemCheckChanged", "checked", "onNoteItemDeleteClicked", "onNoteItemSwapped", "from", "to", "onNoteLabelClicked", "onNoteReminderClicked", "app_debug"})
    public static abstract interface Callback {
        
        /**
         * Called when an [EditItemItem] at [pos] text is changed by user,
         * either from the keyboard or from a paste event.
         */
        public abstract void onNoteItemChanged(int pos, boolean isPaste);
        
        /**
         * Called when an [EditItemItem] at [pos] is checked or unchecked by user.
         */
        public abstract void onNoteItemCheckChanged(int pos, boolean checked);
        
        /**
         * Called when backspace is pressed when EditText selection
         * is a position 0 in an [EditItemItem] at [pos].
         */
        public abstract void onNoteItemBackspacePressed(int pos);
        
        /**
         * Called when the delete button is clicked on an [EditItemItem].
         */
        public abstract void onNoteItemDeleteClicked(int pos);
        
        /**
         * Called when [EditItemAddItem] is clicked.
         */
        public abstract void onNoteItemAddClicked(int pos);
        
        /**
         * Called when a chip in [EditChipsItem] is clicked.
         */
        public abstract void onNoteLabelClicked();
        
        public abstract void onNoteReminderClicked();
        
        /**
         * Called when any item is clicked on to start editing.
         */
        public abstract void onNoteClickedToEdit();
        
        /**
         * Called when a link with an [url] is clicked in the note text.
         */
        public abstract void onLinkClickedInNote(@org.jetbrains.annotations.NotNull()
        java.lang.String linkText, @org.jetbrains.annotations.NotNull()
        java.lang.String linkUrl);
        
        /**
         * Whether to enabled the dragging of [EditItemItem].
         */
        public abstract boolean isNoteDragEnabled();
        
        /**
         * Called after an [EditItemItem] was dragged [from] a position [to] another.
         */
        public abstract void onNoteItemSwapped(int from, int to);
        
        /**
         * Whether strikethrough should be added to checked items or not.
         */
        public abstract boolean getStrikethroughCheckedItems();
        
        /**
         * Whether checked items are moved to the bottom or not.
         */
        public abstract boolean getMoveCheckedToBottom();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "DATE", "TITLE", "CONTENT", "ITEM", "ITEM_ADD", "ITEM_CHECKED_HEADER", "ITEM_CHIPS", "app_debug"})
    public static enum ViewType {
        /*public static final*/ DATE /* = new DATE() */,
        /*public static final*/ TITLE /* = new TITLE() */,
        /*public static final*/ CONTENT /* = new CONTENT() */,
        /*public static final*/ ITEM /* = new ITEM() */,
        /*public static final*/ ITEM_ADD /* = new ITEM_ADD() */,
        /*public static final*/ ITEM_CHECKED_HEADER /* = new ITEM_CHECKED_HEADER() */,
        /*public static final*/ ITEM_CHIPS /* = new ITEM_CHIPS() */;
        
        ViewType() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.maltaisn.notes.ui.edit.adapter.EditAdapter.ViewType> getEntries() {
            return null;
        }
    }
}