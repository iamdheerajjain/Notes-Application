package com.maltaisn.notes.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u0015H&J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u001d\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u001f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00a6@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010 \u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0002\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/maltaisn/notes/model/LabelsRepository;", "", "clearAllData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countLabelRefs", "", "labelId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLabel", "label", "Lcom/maltaisn/notes/model/entity/Label;", "(Lcom/maltaisn/notes/model/entity/Label;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLabelRefs", "refs", "", "Lcom/maltaisn/notes/model/entity/LabelRef;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLabels", "labels", "getAllLabelsByUsage", "Lkotlinx/coroutines/flow/Flow;", "getLabelById", "id", "getLabelByName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLabelIdsForNote", "noteId", "insertLabel", "insertLabelRefs", "updateLabel", "app_debug"})
public abstract interface LabelsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLabel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateLabel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteLabel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteLabels(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.Label> labels, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLabelById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.Label> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLabelByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.Label> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLabelRefs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.LabelRef> refs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteLabelRefs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.LabelRef> refs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLabelIdsForNote(long noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object countLabelRefs(long labelId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.Label>> getAllLabelsByUsage();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAllData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}