package com.maltaisn.notes.ui.edit.adapter;

/**
 * This is needed so the view model can know the text and each item at all times and be able
 * to change it. An interface is used to provide a different test implementation.
 * The alternative would be the call the view model every time an item text is changed by
 * user, which wouldn't be great for performance since `toString()` would be needed every time.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lcom/maltaisn/notes/ui/edit/adapter/EditableText;", "", "text", "", "getText", "()Ljava/lang/CharSequence;", "append", "", "replaceAll", "app_debug"})
public abstract interface EditableText {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.CharSequence getText();
    
    public abstract void append(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text);
    
    public abstract void replaceAll(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text);
}