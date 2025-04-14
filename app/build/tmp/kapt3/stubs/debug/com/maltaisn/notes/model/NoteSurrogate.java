package com.maltaisn.notes.model;

/**
 * Same fields as [Note], minus redundant [Note.id] and
 * adding [labels] to store label references.
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 Q2\u00020\u0001:\u0002PQB\u0097\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\u0010\u001aJ\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\nH\u00c6\u0003J\t\u0010=\u001a\u00020\fH\u00c6\u0003J\t\u0010>\u001a\u00020\fH\u00c6\u0003J\t\u0010?\u001a\u00020\u000fH\u00c6\u0003J\t\u0010@\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003Ju\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\t\u0010G\u001a\u00020\u0007H\u00d6\u0001J&\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NH\u00c1\u0001\u00a2\u0006\u0002\bOR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010!R\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010$R\u001c\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u001c\u001a\u0004\b(\u0010)R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010,R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010/R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001c\u001a\u0004\b1\u00102R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010!R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001c\u001a\u0004\b6\u00107\u00a8\u0006R"}, d2 = {"Lcom/maltaisn/notes/model/NoteSurrogate;", "", "seen1", "", "type", "Lcom/maltaisn/notes/model/entity/NoteType;", "title", "", "content", "metadata", "Lcom/maltaisn/notes/model/entity/NoteMetadata;", "addedDate", "Ljava/util/Date;", "lastModifiedDate", "status", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "pinned", "Lcom/maltaisn/notes/model/entity/PinnedStatus;", "reminder", "Lcom/maltaisn/notes/model/entity/Reminder;", "labels", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/maltaisn/notes/model/entity/NoteType;Ljava/lang/String;Ljava/lang/String;Lcom/maltaisn/notes/model/entity/NoteMetadata;Ljava/util/Date;Ljava/util/Date;Lcom/maltaisn/notes/model/entity/NoteStatus;Lcom/maltaisn/notes/model/entity/PinnedStatus;Lcom/maltaisn/notes/model/entity/Reminder;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/maltaisn/notes/model/entity/NoteType;Ljava/lang/String;Ljava/lang/String;Lcom/maltaisn/notes/model/entity/NoteMetadata;Ljava/util/Date;Ljava/util/Date;Lcom/maltaisn/notes/model/entity/NoteStatus;Lcom/maltaisn/notes/model/entity/PinnedStatus;Lcom/maltaisn/notes/model/entity/Reminder;Ljava/util/List;)V", "getAddedDate$annotations", "()V", "getAddedDate", "()Ljava/util/Date;", "getContent$annotations", "getContent", "()Ljava/lang/String;", "getLabels$annotations", "getLabels", "()Ljava/util/List;", "getLastModifiedDate$annotations", "getLastModifiedDate", "getMetadata$annotations", "getMetadata", "()Lcom/maltaisn/notes/model/entity/NoteMetadata;", "getPinned$annotations", "getPinned", "()Lcom/maltaisn/notes/model/entity/PinnedStatus;", "getReminder$annotations", "getReminder", "()Lcom/maltaisn/notes/model/entity/Reminder;", "getStatus$annotations", "getStatus", "()Lcom/maltaisn/notes/model/entity/NoteStatus;", "getTitle$annotations", "getTitle", "getType$annotations", "getType", "()Lcom/maltaisn/notes/model/entity/NoteType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_debug", "$serializer", "Companion", "app_debug"})
final class NoteSurrogate {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.entity.NoteType type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String content = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.entity.NoteMetadata metadata = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date addedDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date lastModifiedDate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.entity.NoteStatus status = null;
    @androidx.room.ColumnInfo(name = "pinned")
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.entity.PinnedStatus pinned = null;
    @org.jetbrains.annotations.Nullable()
    private final com.maltaisn.notes.model.entity.Reminder reminder = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Long> labels = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.NoteSurrogate.Companion Companion = null;
    
    public NoteSurrogate(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteMetadata metadata, @org.jetbrains.annotations.NotNull()
    java.util.Date addedDate, @org.jetbrains.annotations.NotNull()
    java.util.Date lastModifiedDate, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteStatus status, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.PinnedStatus pinned, @org.jetbrains.annotations.Nullable()
    com.maltaisn.notes.model.entity.Reminder reminder, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> labels) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteType getType() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "type")
    @java.lang.Deprecated()
    public static void getType$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "title")
    @java.lang.Deprecated()
    public static void getTitle$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContent() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "content")
    @java.lang.Deprecated()
    public static void getContent$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteMetadata getMetadata() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "metadata")
    @java.lang.Deprecated()
    public static void getMetadata$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getAddedDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "added")
    @java.lang.Deprecated()
    public static void getAddedDate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLastModifiedDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "modified")
    @java.lang.Deprecated()
    public static void getLastModifiedDate$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteStatus getStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "status")
    @java.lang.Deprecated()
    public static void getStatus$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.PinnedStatus getPinned() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "pinned")
    @java.lang.Deprecated()
    public static void getPinned$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.maltaisn.notes.model.entity.Reminder getReminder() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "reminder")
    @java.lang.Deprecated()
    public static void getReminder$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getLabels() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "labels")
    @java.lang.Deprecated()
    public static void getLabels$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteMetadata component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.NoteStatus component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.PinnedStatus component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.maltaisn.notes.model.entity.Reminder component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.NoteSurrogate copy(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteMetadata metadata, @org.jetbrains.annotations.NotNull()
    java.util.Date addedDate, @org.jetbrains.annotations.NotNull()
    java.util.Date lastModifiedDate, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteStatus status, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.PinnedStatus pinned, @org.jetbrains.annotations.Nullable()
    com.maltaisn.notes.model.entity.Reminder reminder, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> labels) {
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
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self$app_debug(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NoteSurrogate self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    /**
     * Same fields as [Note], minus redundant [Note.id] and
     * adding [labels] to store label references.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/maltaisn/notes/model/NoteSurrogate.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/maltaisn/notes/model/NoteSurrogate;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.maltaisn.notes.model.NoteSurrogate> {
        @org.jetbrains.annotations.NotNull()
        public static final com.maltaisn.notes.model.NoteSurrogate.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.maltaisn.notes.model.NoteSurrogate deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.maltaisn.notes.model.NoteSurrogate value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    /**
     * Same fields as [Note], minus redundant [Note.id] and
     * adding [labels] to store label references.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/model/NoteSurrogate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/maltaisn/notes/model/NoteSurrogate;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.maltaisn.notes.model.NoteSurrogate> serializer() {
            return null;
        }
    }
}