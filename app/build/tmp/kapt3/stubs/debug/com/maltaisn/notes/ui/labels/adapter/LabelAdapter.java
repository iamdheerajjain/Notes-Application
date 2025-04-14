package com.maltaisn.notes.ui.labels.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/maltaisn/notes/ui/labels/adapter/LabelAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/maltaisn/notes/ui/labels/adapter/LabelListItem;", "Lcom/maltaisn/notes/ui/labels/adapter/LabelListViewHolder;", "context", "Landroid/content/Context;", "callback", "Lcom/maltaisn/notes/ui/labels/adapter/LabelAdapter$Callback;", "(Landroid/content/Context;Lcom/maltaisn/notes/ui/labels/adapter/LabelAdapter$Callback;)V", "getCallback", "()Lcom/maltaisn/notes/ui/labels/adapter/LabelAdapter$Callback;", "getContext", "()Landroid/content/Context;", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Callback", "app_debug"})
public final class LabelAdapter extends androidx.recyclerview.widget.ListAdapter<com.maltaisn.notes.ui.labels.adapter.LabelListItem, com.maltaisn.notes.ui.labels.adapter.LabelListViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.ui.labels.adapter.LabelAdapter.Callback callback = null;
    
    public LabelAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.labels.adapter.LabelAdapter.Callback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.labels.adapter.LabelAdapter.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.maltaisn.notes.ui.labels.adapter.LabelListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.labels.adapter.LabelListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Lcom/maltaisn/notes/ui/labels/adapter/LabelAdapter$Callback;", "", "shouldHighlightCheckedItems", "", "getShouldHighlightCheckedItems", "()Z", "onLabelItemClicked", "", "item", "Lcom/maltaisn/notes/ui/labels/adapter/LabelListItem;", "pos", "", "onLabelItemIconClicked", "onLabelItemLongClicked", "app_debug"})
    public static abstract interface Callback {
        
        public abstract boolean getShouldHighlightCheckedItems();
        
        /**
         * Called when a label [item] at [pos] is clicked.
         */
        public abstract void onLabelItemClicked(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.labels.adapter.LabelListItem item, int pos);
        
        /**
         * Called when a label [item] at [pos] is long-clicked.
         */
        public abstract void onLabelItemLongClicked(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.labels.adapter.LabelListItem item, int pos);
        
        /**
         * Called when the icon of a label [item] at [pos] is clicked.
         */
        public abstract void onLabelItemIconClicked(@org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.ui.labels.adapter.LabelListItem item, int pos);
    }
}