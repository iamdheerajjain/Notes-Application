package com.maltaisn.notes.ui.note;

/**
 * Helper class to add highlight spans on search results.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bJ,\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/maltaisn/notes/ui/note/HighlightHelper;", "", "()V", "START_ELLIPSIS", "", "findHighlightsInString", "", "Lkotlin/ranges/IntRange;", "text", "query", "max", "", "getStartEllipsizedText", "Lcom/maltaisn/notes/ui/note/Highlighted;", "highlights", "startEllipsisThreshold", "startEllipsisDistance", "app_debug"})
public final class HighlightHelper {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String START_ELLIPSIS = "\u2026\ufeff";
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.note.HighlightHelper INSTANCE = null;
    
    private HighlightHelper() {
        super();
    }
    
    /**
     * Find a [max] of highlight positions for matches of a [query] in a [text].
     *
     * Note: could be improved to tokenize query in the same way FTS does, to separate terms
     * and highlight them separatedly.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.ranges.IntRange> findHighlightsInString(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String query, int max) {
        return null;
    }
    
    /**
     * Ellipsize start of text of first highlight is beyond threshold.
     * Leave a certain number of characters between the ellipsis and the highlight (the "distance")
     * If start is ellipsized, highlights are shifted according, in place.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.Highlighted getStartEllipsizedText(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.ranges.IntRange> highlights, int startEllipsisThreshold, int startEllipsisDistance) {
        return null;
    }
}