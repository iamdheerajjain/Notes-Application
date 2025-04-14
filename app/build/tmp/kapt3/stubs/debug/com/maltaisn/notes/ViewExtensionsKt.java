package com.maltaisn.notes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\n\u0010\b\u001a\u00020\t*\u00020\n\u001a\u0014\u0010\u000b\u001a\u00020\t*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"value", "", "strikethroughText", "Landroid/widget/TextView;", "getStrikethroughText", "(Landroid/widget/TextView;)Z", "setStrikethroughText", "(Landroid/widget/TextView;Z)V", "hideKeyboard", "", "Landroid/view/View;", "showKeyboard", "delay", "", "app_debug"})
public final class ViewExtensionsKt {
    
    /**
     * Try to hide the keyboard from [this] view.
     */
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard) {
    }
    
    /**
     * Try to show the keyboard from [this] view.
     * The keyboard is shown with a 200 ms delay by default, otherwise it often doesn't work.
     */
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard, long delay) {
    }
    
    public static final boolean getStrikethroughText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$strikethroughText) {
        return false;
    }
    
    public static final void setStrikethroughText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$strikethroughText, boolean value) {
    }
}