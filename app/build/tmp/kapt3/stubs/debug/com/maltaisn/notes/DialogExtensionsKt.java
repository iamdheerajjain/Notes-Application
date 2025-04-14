package com.maltaisn.notes;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u001a\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u00a8\u0006\f"}, d2 = {"hideCursorInAllViews", "", "Landroidx/fragment/app/DialogFragment;", "setMaxWidth", "Landroid/app/Dialog;", "maxWidth", "", "view", "Landroid/view/View;", "setTitleIfEnoughSpace", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "title", "app_debug"})
public final class DialogExtensionsKt {
    
    /**
     * Set [this] dialog maximum width to [maxWidth].
     * @param view The dialog's content view.
     */
    public static final void setMaxWidth(@org.jetbrains.annotations.NotNull()
    android.app.Dialog $this$setMaxWidth, int maxWidth, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * Set title on dialog, but only if the device vertical size is large enough.
     * Otherwise, it becomes much harder or even impossible to type text (see #53).
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.dialog.MaterialAlertDialogBuilder setTitleIfEnoughSpace(@org.jetbrains.annotations.NotNull()
    com.google.android.material.dialog.MaterialAlertDialogBuilder $this$setTitleIfEnoughSpace, @androidx.annotation.StringRes()
    int title) {
        return null;
    }
    
    /**
     * In dialogs with an EditText, the cursor must be hidden when dialog is dismissed to prevent memory leak.
     * See [https://stackoverflow.com/questions/36842805/dialogfragment-leaking-memory].
     * This should be called in [DialogFragment.onDismiss].
     */
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    public static final void hideCursorInAllViews(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment $this$hideCursorInAllViews) {
    }
}