package com.maltaisn.notes.ui;

/**
 * Used as a wrapper for data that is exposed via a LiveData that represents an event.
 * Taken from: [https://github.com/android/architecture-samples]
 * Changes were made to allow unhandled `null` values.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\fR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/maltaisn/notes/ui/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "", "hasBeenHandled", "getHasBeenHandled", "()Z", "requireUnhandledContent", "()Ljava/lang/Object;", "app_debug"})
public final class Event<T extends java.lang.Object> {
    private final T content = null;
    private boolean hasBeenHandled = false;
    
    public Event(T content) {
        super();
    }
    
    public final boolean getHasBeenHandled() {
        return false;
    }
    
    /**
     * Returns the content if not handled, otherwise throws an exception.
     */
    public final T requireUnhandledContent() {
        return null;
    }
}