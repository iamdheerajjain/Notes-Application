package com.maltaisn.notes.ui.edit;

/**
 * View model for the edit note screen.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b3\u0018\u0000 \u00ad\u00012\u00020\u00012\u00020\u0002:\b\u00ad\u0001\u00ae\u0001\u00af\u0001\u00b0\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0006\u0010o\u001a\u00020\u0014J\u0010\u0010p\u001a\u00020\u00142\u0006\u0010q\u001a\u00020 H\u0002J\u0006\u0010r\u001a\u00020\u0014J\u000e\u0010s\u001a\u00020\u00142\u0006\u0010t\u001a\u000208J\u0016\u0010u\u001a\u00020\u00142\u0006\u0010v\u001a\u00020$2\u0006\u0010w\u001a\u00020$J\u0016\u0010x\u001a\b\u0012\u0004\u0012\u00020y002\u0006\u0010z\u001a\u00020\u001aH\u0002J\u0006\u0010{\u001a\u00020\u0014J\u0010\u0010|\u001a\u00020\u00142\u0006\u0010}\u001a\u00020~H\u0002J\u0006\u0010\u007f\u001a\u00020\u0014J\u0007\u0010\u0080\u0001\u001a\u00020\u0014J\u0010\u0010\u0081\u0001\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0003\u0010\u0082\u0001J\u0007\u0010\u0083\u0001\u001a\u00020\u0014J\u001e\u0010\u0084\u0001\u001a\u0003H\u0085\u0001\"\u000b\b\u0000\u0010\u0085\u0001\u0018\u0001*\u00020\u0011H\u0082\b\u00a2\u0006\u0003\u0010\u0086\u0001J\u0017\u0010\u0087\u0001\u001a\u00020~\"\u000b\b\u0000\u0010\u0085\u0001\u0018\u0001*\u00020\u0011H\u0082\bJ#\u0010\u0088\u0001\u001a\u00020\u00142\u0006\u0010}\u001a\u00020~2\u0007\u0010\u0089\u0001\u001a\u00020~2\u0007\u0010\u008a\u0001\u001a\u000208H\u0002J\u0007\u0010\u008b\u0001\u001a\u00020\u0014J\t\u0010\u008c\u0001\u001a\u00020\u0014H\u0002J\u0007\u0010\u008d\u0001\u001a\u00020\u0014J\u001a\u0010\u008e\u0001\u001a\u00020\u00142\u0007\u0010\u008f\u0001\u001a\u00020$2\u0006\u0010?\u001a\u00020$H\u0016J\t\u0010\u0090\u0001\u001a\u00020\u0014H\u0016J\u0011\u0010\u0091\u0001\u001a\u00020\u00142\u0006\u0010}\u001a\u00020~H\u0016J\u0011\u0010\u0092\u0001\u001a\u00020\u00142\u0006\u0010}\u001a\u00020~H\u0016J\u001a\u0010\u0093\u0001\u001a\u00020\u00142\u0006\u0010}\u001a\u00020~2\u0007\u0010\u0094\u0001\u001a\u000208H\u0016J\u001a\u0010\u0095\u0001\u001a\u00020\u00142\u0006\u0010}\u001a\u00020~2\u0007\u0010\u0096\u0001\u001a\u000208H\u0016J\u0011\u0010\u0097\u0001\u001a\u00020\u00142\u0006\u0010}\u001a\u00020~H\u0016J\u001b\u0010\u0098\u0001\u001a\u00020\u00142\u0007\u0010\u0099\u0001\u001a\u00020~2\u0007\u0010\u009a\u0001\u001a\u00020~H\u0016J\t\u0010\u009b\u0001\u001a\u00020\u0014H\u0016J\t\u0010\u009c\u0001\u001a\u00020\u0014H\u0016J\u0011\u0010\u009d\u0001\u001a\u00020\u00142\b\u0010X\u001a\u0004\u0018\u00010\u001eJ\u0007\u0010\u009e\u0001\u001a\u00020\u0014J\t\u0010\u009f\u0001\u001a\u00020\u0014H\u0002J\u0007\u0010\u00a0\u0001\u001a\u00020\u0014J\u0007\u0010\u00a1\u0001\u001a\u00020\u0014J\u0007\u0010\u00a2\u0001\u001a\u00020\u0014JG\u0010\u00a3\u0001\u001a\u00020\u00142\b\b\u0002\u0010z\u001a\u00020\u001a2\t\b\u0002\u0010\u00a4\u0001\u001a\u00020\u001a2\b\b\u0002\u0010r\u001a\u0002082\t\b\u0002\u0010\u00a5\u0001\u001a\u00020\"2\t\b\u0002\u0010\u00a6\u0001\u001a\u00020$2\t\b\u0002\u0010\u00a7\u0001\u001a\u00020$J\u0007\u0010\u00a8\u0001\u001a\u00020\u0014J\u0007\u0010\u00a9\u0001\u001a\u00020\u0014J\u0007\u0010\u00aa\u0001\u001a\u00020\u0014J\t\u0010\u00ab\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u00ac\u0001\u001a\u00020\u0014H\u0002R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010.\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u0011000/8F\u00a2\u0006\u0006\u001a\u0004\b1\u00102R\u001d\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130/8F\u00a2\u0006\u0006\u001a\u0004\b4\u00102R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130/8F\u00a2\u0006\u0006\u001a\u0004\b6\u00102R\u000e\u00107\u001a\u000208X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00109\u001a\u0002088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u0010:R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=00X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010?\u001a\u0004\u0018\u00010$2\b\u0010>\u001a\u0004\u0018\u00010$8B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00130/8F\u00a2\u0006\u0006\u001a\u0004\bF\u00102R\u0014\u0010G\u001a\u0002088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bH\u0010:R\u000e\u0010I\u001a\u00020JX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130/8F\u00a2\u0006\u0006\u001a\u0004\bL\u00102R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001c0/8F\u00a2\u0006\u0006\u001a\u0004\bN\u00102R\u0019\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0/8F\u00a2\u0006\u0006\u001a\u0004\bP\u00102R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020 0/8F\u00a2\u0006\u0006\u001a\u0004\bR\u00102R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\"0/8F\u00a2\u0006\u0006\u001a\u0004\bT\u00102R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00130/8F\u00a2\u0006\u0006\u001a\u0004\bV\u00102R\u000e\u0010W\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00130/8F\u00a2\u0006\u0006\u001a\u0004\b\\\u00102R\u0014\u0010]\u001a\u0002088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b^\u0010:R\u001d\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130/8F\u00a2\u0006\u0006\u001a\u0004\b`\u00102R\u001d\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130/8F\u00a2\u0006\u0006\u001a\u0004\bb\u00102R\u001d\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00130/8F\u00a2\u0006\u0006\u001a\u0004\bd\u00102R\u001d\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130/8F\u00a2\u0006\u0006\u001a\u0004\bf\u00102R\u001d\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130/8F\u00a2\u0006\u0006\u001a\u0004\bh\u00102R\u000e\u0010i\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00130/8F\u00a2\u0006\u0006\u001a\u0004\bk\u00102R\u0014\u0010l\u001a\u0002088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bm\u0010:R\u0010\u0010n\u001a\u0004\u0018\u00010ZX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00b1\u0001"}, d2 = {"Lcom/maltaisn/notes/ui/edit/EditViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/maltaisn/notes/ui/edit/adapter/EditAdapter$Callback;", "notesRepository", "Lcom/maltaisn/notes/model/NotesRepository;", "labelsRepository", "Lcom/maltaisn/notes/model/LabelsRepository;", "prefs", "Lcom/maltaisn/notes/model/PrefsManager;", "reminderAlarmManager", "Lcom/maltaisn/notes/model/ReminderAlarmManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/maltaisn/notes/model/NotesRepository;Lcom/maltaisn/notes/model/LabelsRepository;Lcom/maltaisn/notes/model/PrefsManager;Lcom/maltaisn/notes/model/ReminderAlarmManager;Landroidx/lifecycle/SavedStateHandle;)V", "_editItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/maltaisn/notes/ui/edit/adapter/EditListItem;", "_exitEvent", "Lcom/maltaisn/notes/ui/Event;", "", "_focusEvent", "Lcom/maltaisn/notes/ui/edit/EditViewModel$FocusChange;", "_messageEvent", "Lcom/maltaisn/notes/ui/edit/EditMessage;", "_noteCreateEvent", "", "_notePinned", "Lcom/maltaisn/notes/model/entity/PinnedStatus;", "_noteReminder", "Lcom/maltaisn/notes/model/entity/Reminder;", "_noteStatus", "Lcom/maltaisn/notes/model/entity/NoteStatus;", "_noteType", "Lcom/maltaisn/notes/model/entity/NoteType;", "_openLinkEvent", "", "_shareEvent", "Lcom/maltaisn/notes/ui/ShareData;", "_showDeleteConfirmEvent", "_showLabelsFragmentEvent", "_showLinkDialogEvent", "_showReminderDialogEvent", "_showRemoveCheckedConfirmEvent", "_statusChangeEvent", "Lcom/maltaisn/notes/ui/StatusChange;", "editItems", "Landroidx/lifecycle/LiveData;", "", "getEditItems", "()Landroidx/lifecycle/LiveData;", "exitEvent", "getExitEvent", "focusEvent", "getFocusEvent", "isNewNote", "", "isNoteDragEnabled", "()Z", "isNoteInTrash", "labels", "Lcom/maltaisn/notes/model/entity/Label;", "value", "linkUrl", "getLinkUrl", "()Ljava/lang/String;", "setLinkUrl", "(Ljava/lang/String;)V", "listItems", "messageEvent", "getMessageEvent", "moveCheckedToBottom", "getMoveCheckedToBottom", "note", "Lcom/maltaisn/notes/model/entity/Note;", "noteCreateEvent", "getNoteCreateEvent", "notePinned", "getNotePinned", "noteReminder", "getNoteReminder", "noteStatus", "getNoteStatus", "noteType", "getNoteType", "openLinkEvent", "getOpenLinkEvent", "pinned", "reminder", "restoreNoteJob", "Lkotlinx/coroutines/Job;", "shareEvent", "getShareEvent", "shouldShowDate", "getShouldShowDate", "showDeleteConfirmEvent", "getShowDeleteConfirmEvent", "showLabelsFragmentEvent", "getShowLabelsFragmentEvent", "showLinkDialogEvent", "getShowLinkDialogEvent", "showReminderDialogEvent", "getShowReminderDialogEvent", "showRemoveCheckedConfirmEvent", "getShowRemoveCheckedConfirmEvent", "status", "statusChangeEvent", "getStatusChangeEvent", "strikethroughCheckedItems", "getStrikethroughCheckedItems", "updateNoteJob", "changeLabels", "changeNoteStatusAndExit", "newStatus", "changeReminder", "convertToText", "keepCheckedItems", "copyNote", "untitledName", "copySuffix", "createLabelRefs", "Lcom/maltaisn/notes/model/entity/LabelRef;", "noteId", "deleteCheckedItems", "deleteListItemAt", "pos", "", "deleteNote", "deleteNoteForeverAndExit", "deleteNoteInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exit", "findItem", "T", "()Lcom/maltaisn/notes/ui/edit/adapter/EditListItem;", "findItemPos", "focusItemAt", "textPos", "itemExists", "focusNoteContent", "moveCheckedItemsToBottom", "moveNoteAndExit", "onLinkClickedInNote", "linkText", "onNoteClickedToEdit", "onNoteItemAddClicked", "onNoteItemBackspacePressed", "onNoteItemChanged", "isPaste", "onNoteItemCheckChanged", "checked", "onNoteItemDeleteClicked", "onNoteItemSwapped", "from", "to", "onNoteLabelClicked", "onNoteReminderClicked", "onReminderChange", "openClickedLink", "recreateListItems", "restoreNoteAndEdit", "saveNote", "shareNote", "start", "labelId", "type", "title", "content", "toggleNoteType", "togglePin", "uncheckAllItems", "updateListItems", "updateNote", "Companion", "DefaultEditableText", "Factory", "FocusChange", "app_debug"})
public final class EditViewModel extends androidx.lifecycle.ViewModel implements com.maltaisn.notes.ui.edit.adapter.EditAdapter.Callback {
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.NotesRepository notesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.LabelsRepository labelsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.PrefsManager prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    /**
     * Whether the current note is a new note.
     * This is important to remember as to not recreate as new blank note
     * when [start] is called a second time.
     */
    private boolean isNewNote = false;
    
    /**
     * Note being edited by user. This note data is not up-to-date with the UI.
     * - Call [updateNote] to update it to reflect UI state.
     * - Call [saveNote] to update it from UI and update database.
     */
    @org.jetbrains.annotations.NotNull()
    private com.maltaisn.notes.model.entity.Note note;
    
    /**
     * List of labels on note. Always reflects the UI.
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.maltaisn.notes.model.entity.Label> labels;
    
    /**
     * Status of the note being edited. This is separate from [note] so that
     * note status can be updated from this in [updateNote].
     */
    @org.jetbrains.annotations.NotNull()
    private com.maltaisn.notes.model.entity.NoteStatus status;
    
    /**
     * Whether the note being edited is pinned or not.
     */
    @org.jetbrains.annotations.NotNull()
    private com.maltaisn.notes.model.entity.PinnedStatus pinned;
    
    /**
     * The reminder set on the note, or `null` if none is set.
     */
    @org.jetbrains.annotations.Nullable()
    private com.maltaisn.notes.model.entity.Reminder reminder;
    
    /**
     * The currently displayed list items created in [recreateListItems].
     *
     * While this list is mutable, any in place changes should be reported to the adapter! This is used in the case
     * of moving items, where the view model updates the list but the adapter already knows of the move.
     *
     * Note the in the case of list items, a specific item has no identity. Its position and its content
     * can change at any time, so it can be associated with a stable ID. This is problematic for item diff callback
     * and animations, which would rely on ID. Instead, the diff callback was made to rely on identity so that
     * add/remove animations take place correctly. The recycler view was also set up to not animate item appearance,
     * so that if the list is completely recreated, no animation will occur despite all items identity being lost.
     *
     * To allow restoring list note items original positions when checking and unchecking (if move to bottom is set),
     * each list note item carries an `actualPos` field which is the item actual position in the list note.
     * This field must be kept up-to-date after all changes to the list!
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.maltaisn.notes.ui.edit.adapter.EditListItem> listItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.model.entity.NoteType> _noteType = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.model.entity.NoteStatus> _noteStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.model.entity.PinnedStatus> _notePinned = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.model.entity.Reminder> _noteReminder = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.maltaisn.notes.ui.edit.adapter.EditListItem>> _editItems = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.lang.Long>> _noteCreateEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.edit.EditViewModel.FocusChange>> _focusEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.edit.EditMessage>> _messageEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.StatusChange>> _statusChangeEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.ShareData>> _shareEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> _showDeleteConfirmEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> _showRemoveCheckedConfirmEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.lang.Long>> _showReminderDialogEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.lang.Long>> _showLabelsFragmentEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.lang.String>> _showLinkDialogEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<java.lang.String>> _openLinkEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> _exitEvent = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job updateNoteJob;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job restoreNoteJob;
    @org.jetbrains.annotations.NotNull()
    private static final com.maltaisn.notes.model.entity.Note BLANK_NOTE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_NOTE_ID = "noteId";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_IS_NEW_NOTE = "isNewNote";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_LINK_URL = "linkUrl";
    @org.jetbrains.annotations.NotNull()
    private static final com.maltaisn.notes.ui.edit.adapter.EditItemItem TEMP_ITEM = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.maltaisn.notes.ui.edit.EditViewModel.Companion Companion = null;
    
    @dagger.assisted.AssistedInject()
    public EditViewModel(@org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.NotesRepository notesRepository, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.LabelsRepository labelsRepository, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.PrefsManager prefs, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.ReminderAlarmManager reminderAlarmManager, @dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    private final java.lang.String getLinkUrl() {
        return null;
    }
    
    private final void setLinkUrl(java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.model.entity.NoteType> getNoteType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.model.entity.NoteStatus> getNoteStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.model.entity.PinnedStatus> getNotePinned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.model.entity.Reminder> getNoteReminder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<? extends java.util.List<com.maltaisn.notes.ui.edit.adapter.EditListItem>> getEditItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.lang.Long>> getNoteCreateEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.edit.EditViewModel.FocusChange>> getFocusEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.edit.EditMessage>> getMessageEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.StatusChange>> getStatusChangeEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<com.maltaisn.notes.ui.ShareData>> getShareEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> getShowDeleteConfirmEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> getShowRemoveCheckedConfirmEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.lang.Long>> getShowReminderDialogEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.lang.Long>> getShowLabelsFragmentEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.lang.String>> getShowLinkDialogEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<java.lang.String>> getOpenLinkEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.maltaisn.notes.ui.Event<kotlin.Unit>> getExitEvent() {
        return null;
    }
    
    private final boolean getShouldShowDate() {
        return false;
    }
    
    private final boolean isNoteInTrash() {
        return false;
    }
    
    /**
     * Initialize the view model to edit a note with the ID [noteId].
     * The view model can only be started once to edit a note.
     * Subsequent calls with different arguments will do nothing and previous note will be edited.
     *
     * @param noteId Can be [Note.NO_ID] to create a new note with [type], [title] and [content].
     * @param labelId Can be different from [Label.NO_ID] to initially set a label on a new note.
     * @param changeReminder Whether to start editing note by first changing the reminder.
     */
    public final void start(long noteId, long labelId, boolean changeReminder, @org.jetbrains.annotations.NotNull()
    com.maltaisn.notes.model.entity.NoteType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    /**
     * Update note and save it in database if it was changed.
     * This updates last modified date.
     */
    public final void saveNote() {
    }
    
    /**
     * Send exit event. If note is blank, it's discarded.
     */
    public final void exit() {
    }
    
    public final void toggleNoteType() {
    }
    
    public final void togglePin() {
    }
    
    public final void changeReminder() {
    }
    
    public final void changeLabels() {
    }
    
    public final void onReminderChange(@org.jetbrains.annotations.Nullable()
    com.maltaisn.notes.model.entity.Reminder reminder) {
    }
    
    public final void convertToText(boolean keepCheckedItems) {
    }
    
    public final void moveNoteAndExit() {
    }
    
    public final void restoreNoteAndEdit() {
    }
    
    public final void copyNote(@org.jetbrains.annotations.NotNull()
    java.lang.String untitledName, @org.jetbrains.annotations.NotNull()
    java.lang.String copySuffix) {
    }
    
    public final void shareNote() {
    }
    
    public final void deleteNote() {
    }
    
    public final void deleteNoteForeverAndExit() {
    }
    
    public final void uncheckAllItems() {
    }
    
    public final void deleteCheckedItems() {
    }
    
    public final void focusNoteContent() {
    }
    
    public final void openClickedLink() {
    }
    
    private final void changeNoteStatusAndExit(com.maltaisn.notes.model.entity.NoteStatus newStatus) {
    }
    
    /**
     * Update [note] to reflect UI changes, like text changes.
     * Note is not updated in database and last modified date isn't changed.
     */
    private final void updateNote() {
    }
    
    private final java.lang.Object deleteNoteInternal(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Create label refs for a note ID from [labels].
     */
    private final java.util.List<com.maltaisn.notes.model.entity.LabelRef> createLabelRefs(long noteId) {
        return null;
    }
    
    /**
     * Update list items to match content of [note].
     * It's important to make sure [updateNote] was called beforehand so that [note] matches UI content!
     */
    private final void recreateListItems() {
    }
    
    private final void updateListItems() {
    }
    
    @java.lang.Override()
    public void onNoteItemChanged(int pos, boolean isPaste) {
    }
    
    @java.lang.Override()
    public void onNoteItemCheckChanged(int pos, boolean checked) {
    }
    
    @java.lang.Override()
    public void onNoteItemBackspacePressed(int pos) {
    }
    
    @java.lang.Override()
    public void onNoteItemDeleteClicked(int pos) {
    }
    
    @java.lang.Override()
    public void onNoteItemAddClicked(int pos) {
    }
    
    @java.lang.Override()
    public void onNoteLabelClicked() {
    }
    
    @java.lang.Override()
    public void onNoteReminderClicked() {
    }
    
    @java.lang.Override()
    public void onNoteClickedToEdit() {
    }
    
    @java.lang.Override()
    public void onLinkClickedInNote(@org.jetbrains.annotations.NotNull()
    java.lang.String linkText, @org.jetbrains.annotations.NotNull()
    java.lang.String linkUrl) {
    }
    
    @java.lang.Override()
    public boolean isNoteDragEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void onNoteItemSwapped(int from, int to) {
    }
    
    @java.lang.Override()
    public boolean getStrikethroughCheckedItems() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getMoveCheckedToBottom() {
        return false;
    }
    
    private final void focusItemAt(int pos, int textPos, boolean itemExists) {
    }
    
    private final void deleteListItemAt(int pos) {
    }
    
    /**
     * If configured so, move checked items to a separate section at the bottom,
     * and update the checked header count. If no items are checked, the section is removed.
     * Always calls [updateListItems].
     */
    private final void moveCheckedItemsToBottom() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/maltaisn/notes/ui/edit/EditViewModel$Companion;", "", "()V", "BLANK_NOTE", "Lcom/maltaisn/notes/model/entity/Note;", "KEY_IS_NEW_NOTE", "", "KEY_LINK_URL", "KEY_NOTE_ID", "TEMP_ITEM", "Lcom/maltaisn/notes/ui/edit/adapter/EditItemItem;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    /**
     * The default class used for editable item text, backed by StringBuilder.
     * When items are bound by the adapter, this is changed to AndroidEditableText instead.
     * The default implementation is only used temporarily (before item is bound) and for testing.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0018\u0010\u0002\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/maltaisn/notes/ui/edit/EditViewModel$DefaultEditableText;", "Lcom/maltaisn/notes/ui/edit/adapter/EditableText;", "text", "", "(Ljava/lang/CharSequence;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getText", "()Ljava/lang/StringBuilder;", "append", "", "equals", "", "other", "", "hashCode", "", "replaceAll", "toString", "", "app_debug"})
    public static final class DefaultEditableText implements com.maltaisn.notes.ui.edit.adapter.EditableText {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.StringBuilder text = null;
        
        public DefaultEditableText(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.StringBuilder getText() {
            return null;
        }
        
        @java.lang.Override()
        public void append(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
        }
        
        @java.lang.Override()
        public void replaceAll(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text) {
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
        
        public DefaultEditableText() {
            super();
        }
    }
    
    @dagger.assisted.AssistedFactory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/maltaisn/notes/ui/edit/EditViewModel$Factory;", "Lcom/maltaisn/notes/ui/AssistedSavedStateViewModelFactory;", "Lcom/maltaisn/notes/ui/edit/EditViewModel;", "create", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_debug"})
    public static abstract interface Factory extends com.maltaisn.notes.ui.AssistedSavedStateViewModelFactory<com.maltaisn.notes.ui.edit.EditViewModel> {
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public abstract com.maltaisn.notes.ui.edit.EditViewModel create(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/maltaisn/notes/ui/edit/EditViewModel$FocusChange;", "", "itemPos", "", "pos", "itemExists", "", "(IIZ)V", "getItemExists", "()Z", "getItemPos", "()I", "getPos", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
    public static final class FocusChange {
        private final int itemPos = 0;
        private final int pos = 0;
        private final boolean itemExists = false;
        
        public FocusChange(int itemPos, int pos, boolean itemExists) {
            super();
        }
        
        public final int getItemPos() {
            return 0;
        }
        
        public final int getPos() {
            return 0;
        }
        
        public final boolean getItemExists() {
            return false;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.maltaisn.notes.ui.edit.EditViewModel.FocusChange copy(int itemPos, int pos, boolean itemExists) {
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
    }
}