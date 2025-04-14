package com.maltaisn.notes.model;

/**
 * Preference manager. This class interacts with [SharedPreferences]
 * so that other classes don't need knowledge of the keys and their associated type.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020uH\u0007J\u0006\u0010v\u001a\u00020sJD\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002Hy0x\"\u0018\b\u0000\u0010y\u0018\u0001*\u0006\u0012\u0002\b\u00030z*\b\u0012\u0004\u0012\u0002Hy0{2\u0006\u0010|\u001a\u00020\u000e2\u0006\u0010}\u001a\u0002HyH\u0082\b\u00a2\u0006\u0002\u0010~J\u0010\u0010\u007f\u001a\u00020<2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u0007\u0010\u0082\u0001\u001a\u00020sJ1\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002Hy0x\"\u0004\b\u0000\u0010y2\u0006\u0010|\u001a\u00020\u000e2\u0006\u0010}\u001a\u0002HyH\u0002\u00a2\u0006\u0003\u0010\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020s2\u0006\u0010t\u001a\u00020uR+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001b\u0010\tR+\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\r\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R+\u0010!\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b$\u0010\r\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R+\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b+\u0010\r\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R+\u0010,\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b/\u0010\r\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R+\u00100\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b3\u0010\r\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R+\u00105\u001a\u0002042\u0006\u0010\u0005\u001a\u0002048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b:\u0010\r\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b?\u0010\r\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010\r\u001a\u0004\bA\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bF\u0010\r\u001a\u0004\bD\u0010\t\"\u0004\bE\u0010\u000bR+\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bJ\u0010\r\u001a\u0004\bH\u0010\t\"\u0004\bI\u0010\u000bR\u001b\u0010K\u001a\u00020L8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bO\u0010\r\u001a\u0004\bM\u0010NR+\u0010Q\u001a\u00020P2\u0006\u0010\u0005\u001a\u00020P8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bV\u0010\r\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR+\u0010X\u001a\u00020W2\u0006\u0010\u0005\u001a\u00020W8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b]\u0010\r\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0011\u0010^\u001a\u00020_8F\u00a2\u0006\u0006\u001a\u0004\b`\u0010aR\u001b\u0010b\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bd\u0010\r\u001a\u0004\bc\u0010\tR\u001b\u0010e\u001a\u00020f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bi\u0010\r\u001a\u0004\bg\u0010hR\u001b\u0010j\u001a\u00020f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bl\u0010\r\u001a\u0004\bk\u0010hR\u001b\u0010m\u001a\u00020n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bq\u0010\r\u001a\u0004\bo\u0010p\u00a8\u0006\u0087\u0001"}, d2 = {"Lcom/maltaisn/notes/model/PrefsManager;", "", "prefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "<set-?>", "", "autoExportFailed", "getAutoExportFailed", "()Z", "setAutoExportFailed", "(Z)V", "autoExportFailed$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "autoExportUri", "getAutoExportUri", "()Ljava/lang/String;", "setAutoExportUri", "(Ljava/lang/String;)V", "autoExportUri$delegate", "deletedNotesTimeout", "Lcom/maltaisn/notes/ui/note/DeletedNotesTimeoutField;", "getDeletedNotesTimeout", "()Lcom/maltaisn/notes/ui/note/DeletedNotesTimeoutField;", "deletedNotesTimeout$delegate", "dynamicColors", "getDynamicColors", "dynamicColors$delegate", "encryptedExportKeyDerivationSalt", "getEncryptedExportKeyDerivationSalt", "setEncryptedExportKeyDerivationSalt", "encryptedExportKeyDerivationSalt$delegate", "encryptedImportKeyDerivationSalt", "getEncryptedImportKeyDerivationSalt", "setEncryptedImportKeyDerivationSalt", "encryptedImportKeyDerivationSalt$delegate", "", "lastAutoExportTime", "getLastAutoExportTime", "()J", "setLastAutoExportTime", "(J)V", "lastAutoExportTime$delegate", "lastRestrictedBatteryReminderTime", "getLastRestrictedBatteryReminderTime", "setLastRestrictedBatteryReminderTime", "lastRestrictedBatteryReminderTime$delegate", "lastTrashReminderTime", "getLastTrashReminderTime", "setLastTrashReminderTime", "lastTrashReminderTime$delegate", "Lcom/maltaisn/notes/ui/note/adapter/NoteListLayoutMode;", "listLayoutMode", "getListLayoutMode", "()Lcom/maltaisn/notes/ui/note/adapter/NoteListLayoutMode;", "setListLayoutMode", "(Lcom/maltaisn/notes/ui/note/adapter/NoteListLayoutMode;)V", "listLayoutMode$delegate", "maximumPreviewLabels", "", "getMaximumPreviewLabels", "()I", "maximumPreviewLabels$delegate", "moveCheckedToBottom", "getMoveCheckedToBottom", "moveCheckedToBottom$delegate", "shouldAutoExport", "getShouldAutoExport", "setShouldAutoExport", "shouldAutoExport$delegate", "shouldEncryptExportedData", "getShouldEncryptExportedData", "setShouldEncryptExportedData", "shouldEncryptExportedData$delegate", "shownDateField", "Lcom/maltaisn/notes/ui/note/ShownDateField;", "getShownDateField", "()Lcom/maltaisn/notes/ui/note/ShownDateField;", "shownDateField$delegate", "Lcom/maltaisn/notes/model/SortDirection;", "sortDirection", "getSortDirection", "()Lcom/maltaisn/notes/model/SortDirection;", "setSortDirection", "(Lcom/maltaisn/notes/model/SortDirection;)V", "sortDirection$delegate", "Lcom/maltaisn/notes/model/SortField;", "sortField", "getSortField", "()Lcom/maltaisn/notes/model/SortField;", "setSortField", "(Lcom/maltaisn/notes/model/SortField;)V", "sortField$delegate", "sortSettings", "Lcom/maltaisn/notes/model/SortSettings;", "getSortSettings", "()Lcom/maltaisn/notes/model/SortSettings;", "strikethroughChecked", "getStrikethroughChecked", "strikethroughChecked$delegate", "swipeActionLeft", "Lcom/maltaisn/notes/ui/note/SwipeAction;", "getSwipeActionLeft", "()Lcom/maltaisn/notes/ui/note/SwipeAction;", "swipeActionLeft$delegate", "swipeActionRight", "getSwipeActionRight", "swipeActionRight$delegate", "theme", "Lcom/maltaisn/notes/ui/AppTheme;", "getTheme", "()Lcom/maltaisn/notes/ui/AppTheme;", "theme$delegate", "clear", "", "context", "Landroid/content/Context;", "disableAutoExport", "enumPreference", "Lkotlin/properties/ReadWriteProperty;", "T", "Lcom/maltaisn/notes/model/ValueEnum;", "", "key", "default", "(Ljava/lang/String;Ljava/lang/Enum;)Lkotlin/properties/ReadWriteProperty;", "getMaximumPreviewLines", "noteType", "Lcom/maltaisn/notes/model/entity/NoteType;", "migratePreferences", "preference", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "setDefaults", "Companion", "app_debug"})
@androidx.annotation.OpenForTesting()
public final class PrefsManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty theme$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty dynamicColors$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty strikethroughChecked$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty moveCheckedToBottom$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty listLayoutMode$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty swipeActionLeft$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty swipeActionRight$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty shownDateField$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty maximumPreviewLabels$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty deletedNotesTimeout$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty sortField$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty sortDirection$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty shouldEncryptExportedData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty encryptedExportKeyDerivationSalt$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty encryptedImportKeyDerivationSalt$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty shouldAutoExport$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty autoExportUri$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty autoExportFailed$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty lastAutoExportTime$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty lastTrashReminderTime$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty lastRestrictedBatteryReminderTime$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String THEME = "theme";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DYNAMIC_COLORS = "dynamic_colors";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREVIEW_LABELS = "preview_labels";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREVIEW_LINES = "preview_lines";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREVIEW_LINES_TEXT_LIST = "preview_lines_text_list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREVIEW_LINES_LIST_LIST = "preview_lines_list_list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREVIEW_LINES_TEXT_GRID = "preview_lines_text_grid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREVIEW_LINES_LIST_GRID = "preview_lines_list_grid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STRIKETHROUGH_CHECKED = "strikethrough_checked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVE_CHECKED_TO_BOTTOM = "move_checked_to_bottom";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHOWN_DATE = "shown_date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SWIPE_ACTION_LEFT = "swipe_action_left";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SWIPE_ACTION_RIGHT = "swipe_action_right";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENCRYPTED_EXPORT = "encrypted_export";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPORT_DATA = "export_data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTO_EXPORT = "auto_export";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMPORT_DATA = "import_data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLEAR_DATA = "clear_data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIEW_LICENSES = "view_licenses";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VERSION = "version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELETED_TIMEOUT = "deleted_timeout";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String AUTO_EXPORT_URI = "auto_export_uri";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LIST_LAYOUT_MODE = "is_in_list_layout";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SORT_FIELD = "sort_field";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SORT_DIRECTION = "sort_direction";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LAST_TRASH_REMIND_TIME = "last_deleted_remind_time";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LAST_RESTRICTED_BATTERY_REMIND_TIME = "last_restricted_battery_remind_time";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LAST_AUTO_EXPORT_TIME = "last_auto_export_time";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String AUTO_EXPORT_FAILED = "auto_export_failed";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ENCRYPTED_EXPORT_KEY_DERIVATION_SALT = "encrypted_export_key_derivation_salt";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ENCRYPTED_IMPORT_KEY_DERIVATION_SALT = "encrypted_import_key_derivation_salt";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SWIPE_ACTION = "swipe_action";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.Integer> PREFS_XML = null;
    
    /**
     * Required delay before showing the trash reminder delay after user dismisses it.
     */
    private static final long TRASH_REMINDER_DELAY = 0L;
    
    /**
     * Required delay before showing a notice that restricted battery mode will impact
     * reminders, after user dismisses it.
     */
    private static final long RESTRICTED_BATTERY_REMINDER_DELAY = 0L;
    
    /**
     * Minimum delay between each automatic export.
     */
    private static final long AUTO_EXPORT_DELAY = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTO_EXPORT_NO_URI = "";
    
    /**
     * Maximum number of days in the past or the future for which
     * the creation/modification date and reminder date are displayed in relative format.
     */
    public static final int MAXIMUM_RELATIVE_DATE_DAYS = 6;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.model.PrefsManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public PrefsManager(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.AppTheme getTheme() {
        return null;
    }
    
    public final boolean getDynamicColors() {
        return false;
    }
    
    public final boolean getStrikethroughChecked() {
        return false;
    }
    
    public final boolean getMoveCheckedToBottom() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.adapter.NoteListLayoutMode getListLayoutMode() {
        return null;
    }
    
    public final void setListLayoutMode(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.ui.note.adapter.NoteListLayoutMode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.SwipeAction getSwipeActionLeft() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.SwipeAction getSwipeActionRight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.ShownDateField getShownDateField() {
        return null;
    }
    
    public final int getMaximumPreviewLabels() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.ui.note.DeletedNotesTimeoutField getDeletedNotesTimeout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.SortField getSortField() {
        return null;
    }
    
    public final void setSortField(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.SortField p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.SortDirection getSortDirection() {
        return null;
    }
    
    public final void setSortDirection(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.SortDirection p0) {
    }
    
    public final boolean getShouldEncryptExportedData() {
        return false;
    }
    
    public final void setShouldEncryptExportedData(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEncryptedExportKeyDerivationSalt() {
        return null;
    }
    
    public final void setEncryptedExportKeyDerivationSalt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEncryptedImportKeyDerivationSalt() {
        return null;
    }
    
    public final void setEncryptedImportKeyDerivationSalt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getShouldAutoExport() {
        return false;
    }
    
    public final void setShouldAutoExport(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAutoExportUri() {
        return null;
    }
    
    public final void setAutoExportUri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getAutoExportFailed() {
        return false;
    }
    
    public final void setAutoExportFailed(boolean p0) {
    }
    
    public final long getLastAutoExportTime() {
        return 0L;
    }
    
    public final void setLastAutoExportTime(long p0) {
    }
    
    public final long getLastTrashReminderTime() {
        return 0L;
    }
    
    public final void setLastTrashReminderTime(long p0) {
    }
    
    public final long getLastRestrictedBatteryReminderTime() {
        return 0L;
    }
    
    public final void setLastRestrictedBatteryReminderTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.maltaisn.notes.model.SortSettings getSortSettings() {
        return null;
    }
    
    public final int getMaximumPreviewLines(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteType noteType) {
        return 0;
    }
    
    public final void setDefaults(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void disableAutoExport() {
    }
    
    @org.jetbrains.annotations.TestOnly()
    public final void clear(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final <T extends java.lang.Object>kotlin.properties.ReadWriteProperty<com.maltaisn.notes.model.PrefsManager, T> preference(java.lang.String key, T p1_772401952) {
        return null;
    }
    
    /**
     * Used to migrate preferences from an older version of the app to a newer one.
     * This is needed if a key name is changed for example.
     */
    public final void migratePreferences() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010$\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b%\u0010\bR\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010.\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b/\u0010\bR\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u00062"}, d2 = {"Lcom/maltaisn/notes/model/PrefsManager$Companion;", "", "()V", "AUTO_EXPORT", "", "AUTO_EXPORT_DELAY", "Lkotlin/time/Duration;", "getAUTO_EXPORT_DELAY-UwyO8pc", "()J", "J", "AUTO_EXPORT_FAILED", "AUTO_EXPORT_NO_URI", "AUTO_EXPORT_URI", "CLEAR_DATA", "DELETED_TIMEOUT", "DYNAMIC_COLORS", "ENCRYPTED_EXPORT", "ENCRYPTED_EXPORT_KEY_DERIVATION_SALT", "ENCRYPTED_IMPORT_KEY_DERIVATION_SALT", "EXPORT_DATA", "IMPORT_DATA", "LAST_AUTO_EXPORT_TIME", "LAST_RESTRICTED_BATTERY_REMIND_TIME", "LAST_TRASH_REMIND_TIME", "LIST_LAYOUT_MODE", "MAXIMUM_RELATIVE_DATE_DAYS", "", "MOVE_CHECKED_TO_BOTTOM", "PREFS_XML", "", "PREVIEW_LABELS", "PREVIEW_LINES", "PREVIEW_LINES_LIST_GRID", "PREVIEW_LINES_LIST_LIST", "PREVIEW_LINES_TEXT_GRID", "PREVIEW_LINES_TEXT_LIST", "RESTRICTED_BATTERY_REMINDER_DELAY", "getRESTRICTED_BATTERY_REMINDER_DELAY-UwyO8pc", "SHOWN_DATE", "SORT_DIRECTION", "SORT_FIELD", "STRIKETHROUGH_CHECKED", "SWIPE_ACTION", "SWIPE_ACTION_LEFT", "SWIPE_ACTION_RIGHT", "THEME", "TRASH_REMINDER_DELAY", "getTRASH_REMINDER_DELAY-UwyO8pc", "VERSION", "VIEW_LICENSES", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}