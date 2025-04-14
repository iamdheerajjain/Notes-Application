package com.maltaisn.notes.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00120\u0018H\u0016J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010 \u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\"\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010#\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/maltaisn/notes/model/DefaultLabelsRepository;", "Lcom/maltaisn/notes/model/LabelsRepository;", "labelsDao", "Lcom/maltaisn/notes/model/LabelsDao;", "(Lcom/maltaisn/notes/model/LabelsDao;)V", "clearAllData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countLabelRefs", "", "labelId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLabel", "label", "Lcom/maltaisn/notes/model/entity/Label;", "(Lcom/maltaisn/notes/model/entity/Label;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLabelRefs", "refs", "", "Lcom/maltaisn/notes/model/entity/LabelRef;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLabels", "labels", "getAllLabelsByUsage", "Lkotlinx/coroutines/flow/Flow;", "getLabelById", "id", "getLabelByName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLabelIdsForNote", "noteId", "insertLabel", "insertLabelRefs", "updateLabel", "app_debug"})
public final class DefaultLabelsRepository implements com.maltaisn.notes.model.LabelsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.LabelsDao labelsDao = null;
    
    @javax.inject.Inject()
    public DefaultLabelsRepository(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.LabelsDao labelsDao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertLabel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateLabel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteLabel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.Label label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteLabels(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.Label> labels, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLabelById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.Label> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLabelByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.maltaisn.notes.model.entity.Label> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object insertLabelRefs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.LabelRef> refs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteLabelRefs(@org.jetbrains.annotations.NotNull()
    java.util.List<com.maltaisn.notes.model.entity.LabelRef> refs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLabelIdsForNote(long noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object countLabelRefs(long labelId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.maltaisn.notes.model.entity.Label>> getAllLabelsByUsage() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearAllData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}