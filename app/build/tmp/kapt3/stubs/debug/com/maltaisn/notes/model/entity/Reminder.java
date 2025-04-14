package com.maltaisn.notes.model.entity;

/**
 * A reminder for a [Note].
 */
@kotlinx.serialization.Serializable()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000389:BQ\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eB1\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J=\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010+\u001a\u00020\u0000J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0005J\t\u0010.\u001a\u00020/H\u00d6\u0001J&\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u00c1\u0001\u00a2\u0006\u0002\b7R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0019\u00a8\u0006;"}, d2 = {"Lcom/maltaisn/notes/model/entity/Reminder;", "", "seen1", "", "start", "Ljava/util/Date;", "recurrence", "Lcom/maltaisn/recurpicker/Recurrence;", "next", "count", "done", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Date;Lcom/maltaisn/recurpicker/Recurrence;Ljava/util/Date;IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Date;Lcom/maltaisn/recurpicker/Recurrence;Ljava/util/Date;IZ)V", "getCount$annotations", "()V", "getCount", "()I", "getDone$annotations", "getDone", "()Z", "getNext$annotations", "getNext", "()Ljava/util/Date;", "getRecurrence$annotations", "getRecurrence", "()Lcom/maltaisn/recurpicker/Recurrence;", "getStart$annotations", "getStart", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "findNextReminder", "recurrenceFinder", "Lcom/maltaisn/recurpicker/RecurrenceFinder;", "hashCode", "markAsDone", "postponeTo", "date", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_debug", "$serializer", "Companion", "InvalidReminderException", "app_debug"})
public final class Reminder {
    
    /**
     * The start time of this reminder, in local time zone.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date start = null;
    
    /**
     * A RFC 5545 RRule describing the recurrence rule of this reminder.
     * Can be `null` to indicate that the reminder isn't recurring.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.maltaisn.recurpicker.Recurrence recurrence = null;
    
    /**
     * The time of the next occurence of this reminder in local time zone.
     * For non-recurring reminders, this can also be the time that the reminder was postponed to.
     * When reminder is marked as [done], this keeps track of the last occurence time.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date next = null;
    
    /**
     * The number of times this reminder has occured as of [next] date. This is needed for recurrence events
     * calculation. For non-recurring reminders, this should always be 1.
     */
    private final int count = 0;
    
    /**
     * Whether the last occurence of this reminder was marked as done by user.
     */
    private final boolean done = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.entity.Reminder.Companion Companion = null;
    
    public Reminder(@org.jetbrains.annotations.NotNull()
    java.util.Date start, @org.jetbrains.annotations.Nullable()
    com.maltaisn.recurpicker.Recurrence recurrence, @org.jetbrains.annotations.NotNull()
    java.util.Date next, int count, boolean done) {
        super();
    }
    
    /**
     * The start time of this reminder, in local time zone.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getStart() {
        return null;
    }
    
    /**
     * The start time of this reminder, in local time zone.
     */
    @kotlinx.serialization.SerialName(value = "start")
    @java.lang.Deprecated()
    public static void getStart$annotations() {
    }
    
    /**
     * A RFC 5545 RRule describing the recurrence rule of this reminder.
     * Can be `null` to indicate that the reminder isn't recurring.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.maltaisn.recurpicker.Recurrence getRecurrence() {
        return null;
    }
    
    /**
     * A RFC 5545 RRule describing the recurrence rule of this reminder.
     * Can be `null` to indicate that the reminder isn't recurring.
     */
    @kotlinx.serialization.SerialName(value = "recurrence")
    @kotlinx.serialization.Serializable(with = com.maltaisn.notes.model.converter.RecurrenceConverter.class)
    @java.lang.Deprecated()
    public static void getRecurrence$annotations() {
    }
    
    /**
     * The time of the next occurence of this reminder in local time zone.
     * For non-recurring reminders, this can also be the time that the reminder was postponed to.
     * When reminder is marked as [done], this keeps track of the last occurence time.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getNext() {
        return null;
    }
    
    /**
     * The time of the next occurence of this reminder in local time zone.
     * For non-recurring reminders, this can also be the time that the reminder was postponed to.
     * When reminder is marked as [done], this keeps track of the last occurence time.
     */
    @kotlinx.serialization.SerialName(value = "next")
    @java.lang.Deprecated()
    public static void getNext$annotations() {
    }
    
    /**
     * The number of times this reminder has occured as of [next] date. This is needed for recurrence events
     * calculation. For non-recurring reminders, this should always be 1.
     */
    public final int getCount() {
        return 0;
    }
    
    /**
     * The number of times this reminder has occured as of [next] date. This is needed for recurrence events
     * calculation. For non-recurring reminders, this should always be 1.
     */
    @kotlinx.serialization.SerialName(value = "count")
    @java.lang.Deprecated()
    public static void getCount$annotations() {
    }
    
    /**
     * Whether the last occurence of this reminder was marked as done by user.
     */
    public final boolean getDone() {
        return false;
    }
    
    /**
     * Whether the last occurence of this reminder was marked as done by user.
     */
    @kotlinx.serialization.SerialName(value = "done")
    @java.lang.Deprecated()
    public static void getDone$annotations() {
    }
    
    /**
     * Create a reminder with the [next] property updated to the next occurence of this reminder.
     * [done] is always set to `false`. If recurrence is not recurring or recurrence is done, the
     * same instance is returned.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.Reminder findNextReminder(@org.jetbrains.annotations.NotNull()
    com.maltaisn.recurpicker.RecurrenceFinder recurrenceFinder) {
        return null;
    }
    
    /**
     * Postpone this non-recurring reminder to a future [date].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.Reminder postponeTo(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    /**
     * Mark this reminder as done.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.Reminder markAsDone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.maltaisn.recurpicker.Recurrence component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.entity.Reminder copy(@org.jetbrains.annotations.NotNull()
    java.util.Date start, @org.jetbrains.annotations.Nullable()
    com.maltaisn.recurpicker.Recurrence recurrence, @org.jetbrains.annotations.NotNull()
    java.util.Date next, int count, boolean done) {
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
    com.maltaisn.notes.model.entity.Reminder self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    /**
     * A reminder for a [Note].
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/maltaisn/notes/model/entity/Reminder.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/maltaisn/notes/model/entity/Reminder;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.maltaisn.notes.model.entity.Reminder> {
        @org.jetbrains.annotations.NotNull()
        public static final com.maltaisn.notes.model.entity.Reminder.$serializer INSTANCE = null;
        
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
        public com.maltaisn.notes.model.entity.Reminder deserialize(@org.jetbrains.annotations.NotNull()
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
        com.maltaisn.notes.model.entity.Reminder value) {
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u00c6\u0001\u00a8\u0006\r"}, d2 = {"Lcom/maltaisn/notes/model/entity/Reminder$Companion;", "", "()V", "create", "Lcom/maltaisn/notes/model/entity/Reminder;", "start", "Ljava/util/Date;", "recurrence", "Lcom/maltaisn/recurpicker/Recurrence;", "recurrenceFinder", "Lcom/maltaisn/recurpicker/RecurrenceFinder;", "serializer", "Lkotlinx/serialization/KSerializer;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a new reminder on a [start] date with an optional [recurrence].
         * @param recurrenceFinder Used to find the first occurence of the reminder.
         *
         * @throws InvalidReminderException Thrown if reminder has no events.
         * This can happen for some recurring reminders.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.model.entity.Reminder create(@org.jetbrains.annotations.NotNull()
        java.util.Date start, @org.jetbrains.annotations.Nullable()
        com.maltaisn.recurpicker.Recurrence recurrence, @org.jetbrains.annotations.NotNull()
        com.maltaisn.recurpicker.RecurrenceFinder recurrenceFinder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.maltaisn.notes.model.entity.Reminder> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/model/entity/Reminder$InvalidReminderException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class InvalidReminderException extends java.lang.IllegalArgumentException {
        
        public InvalidReminderException(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
    }
}