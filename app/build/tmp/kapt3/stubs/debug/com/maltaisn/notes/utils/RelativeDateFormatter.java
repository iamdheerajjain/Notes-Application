package com.maltaisn.notes.utils;

/**
 * [RelativeDateTimeFormatter] is somewhat buggy and couldn't do for what I wanted.
 * For example it seems stuck on AM/PM time format, even when on device with 24 hour time setting.
 * This is a relatively simple implementation of equivalent functionality.
 * The only downside is a few additional strings to translate.
 *
 * This class is not thread-safe.
 *
 * @property absoluteDateFormatter Date formatter used for absolute dates.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/maltaisn/notes/utils/RelativeDateFormatter;", "", "resources", "Landroid/content/res/Resources;", "absoluteDateFormatter", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "date", "", "(Landroid/content/res/Resources;Lkotlin/jvm/functions/Function1;)V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "format", "now", "maxRelativeDays", "", "app_debug"})
public final class RelativeDateFormatter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.res.Resources resources = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Long, java.lang.String> absoluteDateFormatter = null;
    private final java.util.Calendar calendar = null;
    
    public RelativeDateFormatter(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.String> absoluteDateFormatter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(long date, long now, int maxRelativeDays) {
        return null;
    }
}