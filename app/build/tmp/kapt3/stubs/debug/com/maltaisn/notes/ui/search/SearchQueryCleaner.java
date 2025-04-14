package com.maltaisn.notes.ui.search;

/**
 * Helper class to clean search queries.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/search/SearchQueryCleaner;", "", "()V", "clean", "", "query", "app_debug"})
public final class SearchQueryCleaner {
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.search.SearchQueryCleaner INSTANCE = null;
    
    private SearchQueryCleaner() {
        super();
    }
    
    /**
     * Clean a search [query] to disable all unwanted FTS features, in order to
     * prevent crashes on malformed queries, like when quotes are missing.
     * Also adds a prefix to each search term to widen the search.
     *
     * Only balanced quotes and NOT operator using a minus `-` are allowed.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String clean(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}