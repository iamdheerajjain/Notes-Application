package com.maltaisn.notes.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u0016H\'J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u001e\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010 \u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/maltaisn/notes/model/LabelsDao;", "", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countRefs", "", "labelId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "label", "Lcom/maltaisn/notes/model/entity/Label;", "(Lcom/maltaisn/notes/model/entity/Label;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "labels", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRefs", "refs", "Lcom/maltaisn/notes/model/entity/LabelRef;", "getAll", "getAllByUsage", "Lkotlinx/coroutines/flow/Flow;", "getById", "id", "getLabelByName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLabelIdsForNote", "noteId", "insert", "insertRefs", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface LabelsDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.Label> labels, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Used for clearing all data.
     */
    @androidx.room.Query(value = "DELETE FROM labels")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Get all labels in database
     * Used for exporting data.
     */
    @androidx.room.Query(value = "SELECT * FROM labels")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.maltaisn.notes.model.entity.Label>> $completion);
    
    /**
     * Get all labels in database, sorted by most used first, then by name.
     * Used for viewing labels.
     * Left join so that labels with no references are returned.
     */
    @androidx.room.Query(value = "SELECT labels.* FROM labels LEFT JOIN label_refs ON labelId == id GROUP BY id\n                    ORDER BY CASE WHEN labelId IS NULL THEN 0 ELSE COUNT(*) END DESC, name ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.Label>> getAllByUsage();
    
    /**
     * Get a label by its ID. Returns `null` if label doesn't exist.
     */
    @androidx.room.Query(value = "SELECT * FROM labels WHERE id == :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.Label> $completion);
    
    /**
     * Get a label by its name, or `null` if none exists. Name must match exactly.
     * Used to ensure name uniqueness and for searching by label.
     */
    @androidx.room.Query(value = "SELECT * FROM labels WHERE name == :name")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLabelByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.Label> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertRefs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.LabelRef> refs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteRefs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.LabelRef> refs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Get all label references for a note by ID.
     * Used to remove old label references when changing labels on a note.
     */
    @androidx.room.Query(value = "SELECT labelId FROM label_refs WHERE noteId == :noteId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLabelIdsForNote(long noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    /**
     * Returns the number of references to a label ID.
     * Used when deleting a label to show confirmation or not.
     */
    @androidx.room.Query(value = "SELECT COUNT(*) FROM label_refs WHERE labelId == :labelId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countRefs(long labelId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
}