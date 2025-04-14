package com.maltaisn.notes.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.maltaisn.notes.model.converter.DateTimeConverter;
import com.maltaisn.notes.model.converter.NoteMetadataConverter;
import com.maltaisn.notes.model.converter.NoteStatusConverter;
import com.maltaisn.notes.model.converter.NoteTypeConverter;
import com.maltaisn.notes.model.converter.PinnedStatusConverter;
import com.maltaisn.notes.model.converter.RecurrenceConverter;
import com.maltaisn.notes.model.entity.Label;
import com.maltaisn.notes.model.entity.Note;
import com.maltaisn.notes.model.entity.NoteMetadata;
import com.maltaisn.notes.model.entity.NoteStatus;
import com.maltaisn.notes.model.entity.NoteType;
import com.maltaisn.notes.model.entity.NoteWithLabels;
import com.maltaisn.notes.model.entity.PinnedStatus;
import com.maltaisn.notes.model.entity.Reminder;
import com.maltaisn.recurpicker.Recurrence;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NotesDao_Impl implements NotesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Note> __insertionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter<Note> __deletionAdapterOfNote;

  private final EntityDeletionOrUpdateAdapter<Note> __updateAdapterOfNote;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  private final SharedSQLiteStatement __preparedStmtOfDeleteNotesByStatusAndDate;

  public NotesDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNote = new EntityInsertionAdapter<Note>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `notes` (`id`,`type`,`title`,`content`,`metadata`,`added_date`,`modified_date`,`status`,`pinned`,`reminder_start`,`reminder_recurrence`,`reminder_next`,`reminder_count`,`reminder_done`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Note entity) {
        statement.bindLong(1, entity.getId());
        final int _tmp = NoteTypeConverter.INSTANCE.toInt(entity.getType());
        statement.bindLong(2, _tmp);
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        if (entity.getContent() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getContent());
        }
        final String _tmp_1 = NoteMetadataConverter.INSTANCE.toString(entity.getMetadata());
        if (_tmp_1 == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, _tmp_1);
        }
        final long _tmp_2 = DateTimeConverter.INSTANCE.toLong(entity.getAddedDate());
        statement.bindLong(6, _tmp_2);
        final long _tmp_3 = DateTimeConverter.INSTANCE.toLong(entity.getLastModifiedDate());
        statement.bindLong(7, _tmp_3);
        final int _tmp_4 = NoteStatusConverter.INSTANCE.toInt(entity.getStatus());
        statement.bindLong(8, _tmp_4);
        final int _tmp_5 = PinnedStatusConverter.INSTANCE.toInt(entity.getPinned());
        statement.bindLong(9, _tmp_5);
        final Reminder _tmpReminder = entity.getReminder();
        if (_tmpReminder != null) {
          final long _tmp_6 = DateTimeConverter.INSTANCE.toLong(_tmpReminder.getStart());
          statement.bindLong(10, _tmp_6);
          final String _tmp_7 = RecurrenceConverter.INSTANCE.toRRule(_tmpReminder.getRecurrence());
          if (_tmp_7 == null) {
            statement.bindNull(11);
          } else {
            statement.bindString(11, _tmp_7);
          }
          final long _tmp_8 = DateTimeConverter.INSTANCE.toLong(_tmpReminder.getNext());
          statement.bindLong(12, _tmp_8);
          statement.bindLong(13, _tmpReminder.getCount());
          final int _tmp_9 = _tmpReminder.getDone() ? 1 : 0;
          statement.bindLong(14, _tmp_9);
        } else {
          statement.bindNull(10);
          statement.bindNull(11);
          statement.bindNull(12);
          statement.bindNull(13);
          statement.bindNull(14);
        }
      }
    };
    this.__deletionAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `notes` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Note entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfNote = new EntityDeletionOrUpdateAdapter<Note>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `notes` SET `id` = ?,`type` = ?,`title` = ?,`content` = ?,`metadata` = ?,`added_date` = ?,`modified_date` = ?,`status` = ?,`pinned` = ?,`reminder_start` = ?,`reminder_recurrence` = ?,`reminder_next` = ?,`reminder_count` = ?,`reminder_done` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Note entity) {
        statement.bindLong(1, entity.getId());
        final int _tmp = NoteTypeConverter.INSTANCE.toInt(entity.getType());
        statement.bindLong(2, _tmp);
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        if (entity.getContent() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getContent());
        }
        final String _tmp_1 = NoteMetadataConverter.INSTANCE.toString(entity.getMetadata());
        if (_tmp_1 == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, _tmp_1);
        }
        final long _tmp_2 = DateTimeConverter.INSTANCE.toLong(entity.getAddedDate());
        statement.bindLong(6, _tmp_2);
        final long _tmp_3 = DateTimeConverter.INSTANCE.toLong(entity.getLastModifiedDate());
        statement.bindLong(7, _tmp_3);
        final int _tmp_4 = NoteStatusConverter.INSTANCE.toInt(entity.getStatus());
        statement.bindLong(8, _tmp_4);
        final int _tmp_5 = PinnedStatusConverter.INSTANCE.toInt(entity.getPinned());
        statement.bindLong(9, _tmp_5);
        final Reminder _tmpReminder = entity.getReminder();
        if (_tmpReminder != null) {
          final long _tmp_6 = DateTimeConverter.INSTANCE.toLong(_tmpReminder.getStart());
          statement.bindLong(10, _tmp_6);
          final String _tmp_7 = RecurrenceConverter.INSTANCE.toRRule(_tmpReminder.getRecurrence());
          if (_tmp_7 == null) {
            statement.bindNull(11);
          } else {
            statement.bindString(11, _tmp_7);
          }
          final long _tmp_8 = DateTimeConverter.INSTANCE.toLong(_tmpReminder.getNext());
          statement.bindLong(12, _tmp_8);
          statement.bindLong(13, _tmpReminder.getCount());
          final int _tmp_9 = _tmpReminder.getDone() ? 1 : 0;
          statement.bindLong(14, _tmp_9);
        } else {
          statement.bindNull(10);
          statement.bindNull(11);
          statement.bindNull(12);
          statement.bindNull(13);
          statement.bindNull(14);
        }
        statement.bindLong(15, entity.getId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM notes";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteNotesByStatusAndDate = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM notes WHERE status == ? AND modified_date < ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Note note, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfNote.insertAndReturnId(note);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final List<Note> notes, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNote.insert(notes);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final Note note, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfNote.handle(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final List<Note> notes, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfNote.handleMultiple(notes);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final Note note, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfNote.handle(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateAll(final List<Note> notes, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfNote.handleMultiple(notes);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object clear(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClear.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteNotesByStatusAndDate(final NoteStatus status, final long minDate,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteNotesByStatusAndDate.acquire();
        int _argIndex = 1;
        final int _tmp = NoteStatusConverter.INSTANCE.toInt(status);
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, minDate);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteNotesByStatusAndDate.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getAll(final Continuation<? super List<NoteWithLabels>> $completion) {
    final String _sql = "SELECT * FROM notes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<NoteWithLabels>>() {
      @Override
      @NonNull
      public List<NoteWithLabels> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
            final int _cursorIndexOfMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "metadata");
            final int _cursorIndexOfAddedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "added_date");
            final int _cursorIndexOfLastModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_date");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final int _cursorIndexOfPinned = CursorUtil.getColumnIndexOrThrow(_cursor, "pinned");
            final int _cursorIndexOfStart = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_start");
            final int _cursorIndexOfRecurrence = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_recurrence");
            final int _cursorIndexOfNext = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_next");
            final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_count");
            final int _cursorIndexOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_done");
            final LongSparseArray<ArrayList<Label>> _collectionLabels = new LongSparseArray<ArrayList<Label>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey;
              _tmpKey = _cursor.getLong(_cursorIndexOfId);
              if (!_collectionLabels.containsKey(_tmpKey)) {
                _collectionLabels.put(_tmpKey, new ArrayList<Label>());
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiplabelsAscomMaltaisnNotesModelEntityLabel(_collectionLabels);
            final List<NoteWithLabels> _result = new ArrayList<NoteWithLabels>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final NoteWithLabels _item;
              final Note _tmpNote;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final NoteType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = NoteTypeConverter.INSTANCE.toType(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpContent;
              if (_cursor.isNull(_cursorIndexOfContent)) {
                _tmpContent = null;
              } else {
                _tmpContent = _cursor.getString(_cursorIndexOfContent);
              }
              final NoteMetadata _tmpMetadata;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfMetadata)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfMetadata);
              }
              _tmpMetadata = NoteMetadataConverter.INSTANCE.toMetadata(_tmp_1);
              final Date _tmpAddedDate;
              final long _tmp_2;
              _tmp_2 = _cursor.getLong(_cursorIndexOfAddedDate);
              _tmpAddedDate = DateTimeConverter.INSTANCE.toDate(_tmp_2);
              final Date _tmpLastModifiedDate;
              final long _tmp_3;
              _tmp_3 = _cursor.getLong(_cursorIndexOfLastModifiedDate);
              _tmpLastModifiedDate = DateTimeConverter.INSTANCE.toDate(_tmp_3);
              final NoteStatus _tmpStatus;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfStatus);
              _tmpStatus = NoteStatusConverter.INSTANCE.toStatus(_tmp_4);
              final PinnedStatus _tmpPinned;
              final int _tmp_5;
              _tmp_5 = _cursor.getInt(_cursorIndexOfPinned);
              _tmpPinned = PinnedStatusConverter.INSTANCE.toStatus(_tmp_5);
              final Reminder _tmpReminder;
              if (!(_cursor.isNull(_cursorIndexOfStart) && _cursor.isNull(_cursorIndexOfRecurrence) && _cursor.isNull(_cursorIndexOfNext) && _cursor.isNull(_cursorIndexOfCount) && _cursor.isNull(_cursorIndexOfDone))) {
                final Date _tmpStart;
                final long _tmp_6;
                _tmp_6 = _cursor.getLong(_cursorIndexOfStart);
                _tmpStart = DateTimeConverter.INSTANCE.toDate(_tmp_6);
                final Recurrence _tmpRecurrence;
                final String _tmp_7;
                if (_cursor.isNull(_cursorIndexOfRecurrence)) {
                  _tmp_7 = null;
                } else {
                  _tmp_7 = _cursor.getString(_cursorIndexOfRecurrence);
                }
                _tmpRecurrence = RecurrenceConverter.INSTANCE.toRecurrence(_tmp_7);
                final Date _tmpNext;
                final long _tmp_8;
                _tmp_8 = _cursor.getLong(_cursorIndexOfNext);
                _tmpNext = DateTimeConverter.INSTANCE.toDate(_tmp_8);
                final int _tmpCount;
                _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                final boolean _tmpDone;
                final int _tmp_9;
                _tmp_9 = _cursor.getInt(_cursorIndexOfDone);
                _tmpDone = _tmp_9 != 0;
                _tmpReminder = new Reminder(_tmpStart,_tmpRecurrence,_tmpNext,_tmpCount,_tmpDone);
              } else {
                _tmpReminder = null;
              }
              _tmpNote = new Note(_tmpId,_tmpType,_tmpTitle,_tmpContent,_tmpMetadata,_tmpAddedDate,_tmpLastModifiedDate,_tmpStatus,_tmpPinned,_tmpReminder);
              final ArrayList<Label> _tmpLabelsCollection;
              final long _tmpKey_1;
              _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpLabelsCollection = _collectionLabels.get(_tmpKey_1);
              _item = new NoteWithLabels(_tmpNote,_tmpLabelsCollection);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getById(final long id, final Continuation<? super Note> $completion) {
    final String _sql = "SELECT * FROM notes WHERE id == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Note>() {
      @Override
      @Nullable
      public Note call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "metadata");
          final int _cursorIndexOfAddedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "added_date");
          final int _cursorIndexOfLastModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_date");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfPinned = CursorUtil.getColumnIndexOrThrow(_cursor, "pinned");
          final int _cursorIndexOfStart = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_start");
          final int _cursorIndexOfRecurrence = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_recurrence");
          final int _cursorIndexOfNext = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_next");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_count");
          final int _cursorIndexOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_done");
          final Note _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final NoteType _tmpType;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfType);
            _tmpType = NoteTypeConverter.INSTANCE.toType(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final NoteMetadata _tmpMetadata;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfMetadata)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfMetadata);
            }
            _tmpMetadata = NoteMetadataConverter.INSTANCE.toMetadata(_tmp_1);
            final Date _tmpAddedDate;
            final long _tmp_2;
            _tmp_2 = _cursor.getLong(_cursorIndexOfAddedDate);
            _tmpAddedDate = DateTimeConverter.INSTANCE.toDate(_tmp_2);
            final Date _tmpLastModifiedDate;
            final long _tmp_3;
            _tmp_3 = _cursor.getLong(_cursorIndexOfLastModifiedDate);
            _tmpLastModifiedDate = DateTimeConverter.INSTANCE.toDate(_tmp_3);
            final NoteStatus _tmpStatus;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = NoteStatusConverter.INSTANCE.toStatus(_tmp_4);
            final PinnedStatus _tmpPinned;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfPinned);
            _tmpPinned = PinnedStatusConverter.INSTANCE.toStatus(_tmp_5);
            final Reminder _tmpReminder;
            if (!(_cursor.isNull(_cursorIndexOfStart) && _cursor.isNull(_cursorIndexOfRecurrence) && _cursor.isNull(_cursorIndexOfNext) && _cursor.isNull(_cursorIndexOfCount) && _cursor.isNull(_cursorIndexOfDone))) {
              final Date _tmpStart;
              final long _tmp_6;
              _tmp_6 = _cursor.getLong(_cursorIndexOfStart);
              _tmpStart = DateTimeConverter.INSTANCE.toDate(_tmp_6);
              final Recurrence _tmpRecurrence;
              final String _tmp_7;
              if (_cursor.isNull(_cursorIndexOfRecurrence)) {
                _tmp_7 = null;
              } else {
                _tmp_7 = _cursor.getString(_cursorIndexOfRecurrence);
              }
              _tmpRecurrence = RecurrenceConverter.INSTANCE.toRecurrence(_tmp_7);
              final Date _tmpNext;
              final long _tmp_8;
              _tmp_8 = _cursor.getLong(_cursorIndexOfNext);
              _tmpNext = DateTimeConverter.INSTANCE.toDate(_tmp_8);
              final int _tmpCount;
              _tmpCount = _cursor.getInt(_cursorIndexOfCount);
              final boolean _tmpDone;
              final int _tmp_9;
              _tmp_9 = _cursor.getInt(_cursorIndexOfDone);
              _tmpDone = _tmp_9 != 0;
              _tmpReminder = new Reminder(_tmpStart,_tmpRecurrence,_tmpNext,_tmpCount,_tmpDone);
            } else {
              _tmpReminder = null;
            }
            _result = new Note(_tmpId,_tmpType,_tmpTitle,_tmpContent,_tmpMetadata,_tmpAddedDate,_tmpLastModifiedDate,_tmpStatus,_tmpPinned,_tmpReminder);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getByIdWithLabels(final long id,
      final Continuation<? super NoteWithLabels> $completion) {
    final String _sql = "SELECT * FROM notes WHERE id == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<NoteWithLabels>() {
      @Override
      @Nullable
      public NoteWithLabels call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
            final int _cursorIndexOfMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "metadata");
            final int _cursorIndexOfAddedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "added_date");
            final int _cursorIndexOfLastModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_date");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final int _cursorIndexOfPinned = CursorUtil.getColumnIndexOrThrow(_cursor, "pinned");
            final int _cursorIndexOfStart = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_start");
            final int _cursorIndexOfRecurrence = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_recurrence");
            final int _cursorIndexOfNext = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_next");
            final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_count");
            final int _cursorIndexOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_done");
            final LongSparseArray<ArrayList<Label>> _collectionLabels = new LongSparseArray<ArrayList<Label>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey;
              _tmpKey = _cursor.getLong(_cursorIndexOfId);
              if (!_collectionLabels.containsKey(_tmpKey)) {
                _collectionLabels.put(_tmpKey, new ArrayList<Label>());
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiplabelsAscomMaltaisnNotesModelEntityLabel(_collectionLabels);
            final NoteWithLabels _result;
            if (_cursor.moveToFirst()) {
              final Note _tmpNote;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final NoteType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = NoteTypeConverter.INSTANCE.toType(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpContent;
              if (_cursor.isNull(_cursorIndexOfContent)) {
                _tmpContent = null;
              } else {
                _tmpContent = _cursor.getString(_cursorIndexOfContent);
              }
              final NoteMetadata _tmpMetadata;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfMetadata)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfMetadata);
              }
              _tmpMetadata = NoteMetadataConverter.INSTANCE.toMetadata(_tmp_1);
              final Date _tmpAddedDate;
              final long _tmp_2;
              _tmp_2 = _cursor.getLong(_cursorIndexOfAddedDate);
              _tmpAddedDate = DateTimeConverter.INSTANCE.toDate(_tmp_2);
              final Date _tmpLastModifiedDate;
              final long _tmp_3;
              _tmp_3 = _cursor.getLong(_cursorIndexOfLastModifiedDate);
              _tmpLastModifiedDate = DateTimeConverter.INSTANCE.toDate(_tmp_3);
              final NoteStatus _tmpStatus;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfStatus);
              _tmpStatus = NoteStatusConverter.INSTANCE.toStatus(_tmp_4);
              final PinnedStatus _tmpPinned;
              final int _tmp_5;
              _tmp_5 = _cursor.getInt(_cursorIndexOfPinned);
              _tmpPinned = PinnedStatusConverter.INSTANCE.toStatus(_tmp_5);
              final Reminder _tmpReminder;
              if (!(_cursor.isNull(_cursorIndexOfStart) && _cursor.isNull(_cursorIndexOfRecurrence) && _cursor.isNull(_cursorIndexOfNext) && _cursor.isNull(_cursorIndexOfCount) && _cursor.isNull(_cursorIndexOfDone))) {
                final Date _tmpStart;
                final long _tmp_6;
                _tmp_6 = _cursor.getLong(_cursorIndexOfStart);
                _tmpStart = DateTimeConverter.INSTANCE.toDate(_tmp_6);
                final Recurrence _tmpRecurrence;
                final String _tmp_7;
                if (_cursor.isNull(_cursorIndexOfRecurrence)) {
                  _tmp_7 = null;
                } else {
                  _tmp_7 = _cursor.getString(_cursorIndexOfRecurrence);
                }
                _tmpRecurrence = RecurrenceConverter.INSTANCE.toRecurrence(_tmp_7);
                final Date _tmpNext;
                final long _tmp_8;
                _tmp_8 = _cursor.getLong(_cursorIndexOfNext);
                _tmpNext = DateTimeConverter.INSTANCE.toDate(_tmp_8);
                final int _tmpCount;
                _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                final boolean _tmpDone;
                final int _tmp_9;
                _tmp_9 = _cursor.getInt(_cursorIndexOfDone);
                _tmpDone = _tmp_9 != 0;
                _tmpReminder = new Reminder(_tmpStart,_tmpRecurrence,_tmpNext,_tmpCount,_tmpDone);
              } else {
                _tmpReminder = null;
              }
              _tmpNote = new Note(_tmpId,_tmpType,_tmpTitle,_tmpContent,_tmpMetadata,_tmpAddedDate,_tmpLastModifiedDate,_tmpStatus,_tmpPinned,_tmpReminder);
              final ArrayList<Label> _tmpLabelsCollection;
              final long _tmpKey_1;
              _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpLabelsCollection = _collectionLabels.get(_tmpKey_1);
              _result = new NoteWithLabels(_tmpNote,_tmpLabelsCollection);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getLastCreatedNote(final Continuation<? super Note> $completion) {
    final String _sql = "SELECT * FROM notes ORDER BY added_date DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Note>() {
      @Override
      @Nullable
      public Note call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "metadata");
          final int _cursorIndexOfAddedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "added_date");
          final int _cursorIndexOfLastModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_date");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfPinned = CursorUtil.getColumnIndexOrThrow(_cursor, "pinned");
          final int _cursorIndexOfStart = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_start");
          final int _cursorIndexOfRecurrence = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_recurrence");
          final int _cursorIndexOfNext = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_next");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_count");
          final int _cursorIndexOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_done");
          final Note _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final NoteType _tmpType;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfType);
            _tmpType = NoteTypeConverter.INSTANCE.toType(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final NoteMetadata _tmpMetadata;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfMetadata)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfMetadata);
            }
            _tmpMetadata = NoteMetadataConverter.INSTANCE.toMetadata(_tmp_1);
            final Date _tmpAddedDate;
            final long _tmp_2;
            _tmp_2 = _cursor.getLong(_cursorIndexOfAddedDate);
            _tmpAddedDate = DateTimeConverter.INSTANCE.toDate(_tmp_2);
            final Date _tmpLastModifiedDate;
            final long _tmp_3;
            _tmp_3 = _cursor.getLong(_cursorIndexOfLastModifiedDate);
            _tmpLastModifiedDate = DateTimeConverter.INSTANCE.toDate(_tmp_3);
            final NoteStatus _tmpStatus;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = NoteStatusConverter.INSTANCE.toStatus(_tmp_4);
            final PinnedStatus _tmpPinned;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfPinned);
            _tmpPinned = PinnedStatusConverter.INSTANCE.toStatus(_tmp_5);
            final Reminder _tmpReminder;
            if (!(_cursor.isNull(_cursorIndexOfStart) && _cursor.isNull(_cursorIndexOfRecurrence) && _cursor.isNull(_cursorIndexOfNext) && _cursor.isNull(_cursorIndexOfCount) && _cursor.isNull(_cursorIndexOfDone))) {
              final Date _tmpStart;
              final long _tmp_6;
              _tmp_6 = _cursor.getLong(_cursorIndexOfStart);
              _tmpStart = DateTimeConverter.INSTANCE.toDate(_tmp_6);
              final Recurrence _tmpRecurrence;
              final String _tmp_7;
              if (_cursor.isNull(_cursorIndexOfRecurrence)) {
                _tmp_7 = null;
              } else {
                _tmp_7 = _cursor.getString(_cursorIndexOfRecurrence);
              }
              _tmpRecurrence = RecurrenceConverter.INSTANCE.toRecurrence(_tmp_7);
              final Date _tmpNext;
              final long _tmp_8;
              _tmp_8 = _cursor.getLong(_cursorIndexOfNext);
              _tmpNext = DateTimeConverter.INSTANCE.toDate(_tmp_8);
              final int _tmpCount;
              _tmpCount = _cursor.getInt(_cursorIndexOfCount);
              final boolean _tmpDone;
              final int _tmp_9;
              _tmp_9 = _cursor.getInt(_cursorIndexOfDone);
              _tmpDone = _tmp_9 != 0;
              _tmpReminder = new Reminder(_tmpStart,_tmpRecurrence,_tmpNext,_tmpCount,_tmpDone);
            } else {
              _tmpReminder = null;
            }
            _result = new Note(_tmpId,_tmpType,_tmpTitle,_tmpContent,_tmpMetadata,_tmpAddedDate,_tmpLastModifiedDate,_tmpStatus,_tmpPinned,_tmpReminder);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<NoteWithLabels>> getAllWithReminder() {
    final String _sql = "SELECT * FROM notes WHERE reminder_start IS NOT NULL AND NOT reminder_done ORDER BY reminder_next ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, true, new String[] {"label_refs", "labels",
        "notes"}, new Callable<List<NoteWithLabels>>() {
      @Override
      @NonNull
      public List<NoteWithLabels> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
            final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
            final int _cursorIndexOfMetadata = CursorUtil.getColumnIndexOrThrow(_cursor, "metadata");
            final int _cursorIndexOfAddedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "added_date");
            final int _cursorIndexOfLastModifiedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "modified_date");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
            final int _cursorIndexOfPinned = CursorUtil.getColumnIndexOrThrow(_cursor, "pinned");
            final int _cursorIndexOfStart = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_start");
            final int _cursorIndexOfRecurrence = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_recurrence");
            final int _cursorIndexOfNext = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_next");
            final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_count");
            final int _cursorIndexOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder_done");
            final LongSparseArray<ArrayList<Label>> _collectionLabels = new LongSparseArray<ArrayList<Label>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey;
              _tmpKey = _cursor.getLong(_cursorIndexOfId);
              if (!_collectionLabels.containsKey(_tmpKey)) {
                _collectionLabels.put(_tmpKey, new ArrayList<Label>());
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiplabelsAscomMaltaisnNotesModelEntityLabel(_collectionLabels);
            final List<NoteWithLabels> _result = new ArrayList<NoteWithLabels>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final NoteWithLabels _item;
              final Note _tmpNote;
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final NoteType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = NoteTypeConverter.INSTANCE.toType(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpContent;
              if (_cursor.isNull(_cursorIndexOfContent)) {
                _tmpContent = null;
              } else {
                _tmpContent = _cursor.getString(_cursorIndexOfContent);
              }
              final NoteMetadata _tmpMetadata;
              final String _tmp_1;
              if (_cursor.isNull(_cursorIndexOfMetadata)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getString(_cursorIndexOfMetadata);
              }
              _tmpMetadata = NoteMetadataConverter.INSTANCE.toMetadata(_tmp_1);
              final Date _tmpAddedDate;
              final long _tmp_2;
              _tmp_2 = _cursor.getLong(_cursorIndexOfAddedDate);
              _tmpAddedDate = DateTimeConverter.INSTANCE.toDate(_tmp_2);
              final Date _tmpLastModifiedDate;
              final long _tmp_3;
              _tmp_3 = _cursor.getLong(_cursorIndexOfLastModifiedDate);
              _tmpLastModifiedDate = DateTimeConverter.INSTANCE.toDate(_tmp_3);
              final NoteStatus _tmpStatus;
              final int _tmp_4;
              _tmp_4 = _cursor.getInt(_cursorIndexOfStatus);
              _tmpStatus = NoteStatusConverter.INSTANCE.toStatus(_tmp_4);
              final PinnedStatus _tmpPinned;
              final int _tmp_5;
              _tmp_5 = _cursor.getInt(_cursorIndexOfPinned);
              _tmpPinned = PinnedStatusConverter.INSTANCE.toStatus(_tmp_5);
              final Reminder _tmpReminder;
              if (!(_cursor.isNull(_cursorIndexOfStart) && _cursor.isNull(_cursorIndexOfRecurrence) && _cursor.isNull(_cursorIndexOfNext) && _cursor.isNull(_cursorIndexOfCount) && _cursor.isNull(_cursorIndexOfDone))) {
                final Date _tmpStart;
                final long _tmp_6;
                _tmp_6 = _cursor.getLong(_cursorIndexOfStart);
                _tmpStart = DateTimeConverter.INSTANCE.toDate(_tmp_6);
                final Recurrence _tmpRecurrence;
                final String _tmp_7;
                if (_cursor.isNull(_cursorIndexOfRecurrence)) {
                  _tmp_7 = null;
                } else {
                  _tmp_7 = _cursor.getString(_cursorIndexOfRecurrence);
                }
                _tmpRecurrence = RecurrenceConverter.INSTANCE.toRecurrence(_tmp_7);
                final Date _tmpNext;
                final long _tmp_8;
                _tmp_8 = _cursor.getLong(_cursorIndexOfNext);
                _tmpNext = DateTimeConverter.INSTANCE.toDate(_tmp_8);
                final int _tmpCount;
                _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                final boolean _tmpDone;
                final int _tmp_9;
                _tmp_9 = _cursor.getInt(_cursorIndexOfDone);
                _tmpDone = _tmp_9 != 0;
                _tmpReminder = new Reminder(_tmpStart,_tmpRecurrence,_tmpNext,_tmpCount,_tmpDone);
              } else {
                _tmpReminder = null;
              }
              _tmpNote = new Note(_tmpId,_tmpType,_tmpTitle,_tmpContent,_tmpMetadata,_tmpAddedDate,_tmpLastModifiedDate,_tmpStatus,_tmpPinned,_tmpReminder);
              final ArrayList<Label> _tmpLabelsCollection;
              final long _tmpKey_1;
              _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpLabelsCollection = _collectionLabels.get(_tmpKey_1);
              _item = new NoteWithLabels(_tmpNote,_tmpLabelsCollection);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<NoteWithLabels>> runtimeQuery(final SupportSQLiteQuery query) {
    return CoroutinesRoom.createFlow(__db, true, new String[] {"label_refs", "labels",
        "notes"}, new Callable<List<NoteWithLabels>>() {
      @Override
      @NonNull
      public List<NoteWithLabels> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, query, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
            final int _cursorIndexOfType = CursorUtil.getColumnIndex(_cursor, "type");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(_cursor, "title");
            final int _cursorIndexOfContent = CursorUtil.getColumnIndex(_cursor, "content");
            final int _cursorIndexOfMetadata = CursorUtil.getColumnIndex(_cursor, "metadata");
            final int _cursorIndexOfAddedDate = CursorUtil.getColumnIndex(_cursor, "added_date");
            final int _cursorIndexOfLastModifiedDate = CursorUtil.getColumnIndex(_cursor, "modified_date");
            final int _cursorIndexOfStatus = CursorUtil.getColumnIndex(_cursor, "status");
            final int _cursorIndexOfPinned = CursorUtil.getColumnIndex(_cursor, "pinned");
            final int _cursorIndexOfStart = CursorUtil.getColumnIndex(_cursor, "reminder_start");
            final int _cursorIndexOfRecurrence = CursorUtil.getColumnIndex(_cursor, "reminder_recurrence");
            final int _cursorIndexOfNext = CursorUtil.getColumnIndex(_cursor, "reminder_next");
            final int _cursorIndexOfCount = CursorUtil.getColumnIndex(_cursor, "reminder_count");
            final int _cursorIndexOfDone = CursorUtil.getColumnIndex(_cursor, "reminder_done");
            final LongSparseArray<ArrayList<Label>> _collectionLabels = new LongSparseArray<ArrayList<Label>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey;
              _tmpKey = _cursor.getLong(_cursorIndexOfId);
              if (!_collectionLabels.containsKey(_tmpKey)) {
                _collectionLabels.put(_tmpKey, new ArrayList<Label>());
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshiplabelsAscomMaltaisnNotesModelEntityLabel(_collectionLabels);
            final List<NoteWithLabels> _result = new ArrayList<NoteWithLabels>(_cursor.getCount());
            while (_cursor.moveToNext()) {
              final NoteWithLabels _item;
              final Note _tmpNote;
              final long _tmpId;
              if (_cursorIndexOfId == -1) {
                _tmpId = 0;
              } else {
                _tmpId = _cursor.getLong(_cursorIndexOfId);
              }
              final NoteType _tmpType;
              if (_cursorIndexOfType == -1) {
                _tmpType = null;
              } else {
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfType);
                _tmpType = NoteTypeConverter.INSTANCE.toType(_tmp);
              }
              final String _tmpTitle;
              if (_cursorIndexOfTitle == -1) {
                _tmpTitle = null;
              } else {
                if (_cursor.isNull(_cursorIndexOfTitle)) {
                  _tmpTitle = null;
                } else {
                  _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
                }
              }
              final String _tmpContent;
              if (_cursorIndexOfContent == -1) {
                _tmpContent = null;
              } else {
                if (_cursor.isNull(_cursorIndexOfContent)) {
                  _tmpContent = null;
                } else {
                  _tmpContent = _cursor.getString(_cursorIndexOfContent);
                }
              }
              final NoteMetadata _tmpMetadata;
              if (_cursorIndexOfMetadata == -1) {
                _tmpMetadata = null;
              } else {
                final String _tmp_1;
                if (_cursor.isNull(_cursorIndexOfMetadata)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = _cursor.getString(_cursorIndexOfMetadata);
                }
                _tmpMetadata = NoteMetadataConverter.INSTANCE.toMetadata(_tmp_1);
              }
              final Date _tmpAddedDate;
              if (_cursorIndexOfAddedDate == -1) {
                _tmpAddedDate = null;
              } else {
                final long _tmp_2;
                _tmp_2 = _cursor.getLong(_cursorIndexOfAddedDate);
                _tmpAddedDate = DateTimeConverter.INSTANCE.toDate(_tmp_2);
              }
              final Date _tmpLastModifiedDate;
              if (_cursorIndexOfLastModifiedDate == -1) {
                _tmpLastModifiedDate = null;
              } else {
                final long _tmp_3;
                _tmp_3 = _cursor.getLong(_cursorIndexOfLastModifiedDate);
                _tmpLastModifiedDate = DateTimeConverter.INSTANCE.toDate(_tmp_3);
              }
              final NoteStatus _tmpStatus;
              if (_cursorIndexOfStatus == -1) {
                _tmpStatus = null;
              } else {
                final int _tmp_4;
                _tmp_4 = _cursor.getInt(_cursorIndexOfStatus);
                _tmpStatus = NoteStatusConverter.INSTANCE.toStatus(_tmp_4);
              }
              final PinnedStatus _tmpPinned;
              if (_cursorIndexOfPinned == -1) {
                _tmpPinned = null;
              } else {
                final int _tmp_5;
                _tmp_5 = _cursor.getInt(_cursorIndexOfPinned);
                _tmpPinned = PinnedStatusConverter.INSTANCE.toStatus(_tmp_5);
              }
              final Reminder _tmpReminder;
              if (!((_cursorIndexOfStart == -1 || _cursor.isNull(_cursorIndexOfStart)) && (_cursorIndexOfRecurrence == -1 || _cursor.isNull(_cursorIndexOfRecurrence)) && (_cursorIndexOfNext == -1 || _cursor.isNull(_cursorIndexOfNext)) && (_cursorIndexOfCount == -1 || _cursor.isNull(_cursorIndexOfCount)) && (_cursorIndexOfDone == -1 || _cursor.isNull(_cursorIndexOfDone)))) {
                final Date _tmpStart;
                if (_cursorIndexOfStart == -1) {
                  _tmpStart = null;
                } else {
                  final long _tmp_6;
                  _tmp_6 = _cursor.getLong(_cursorIndexOfStart);
                  _tmpStart = DateTimeConverter.INSTANCE.toDate(_tmp_6);
                }
                final Recurrence _tmpRecurrence;
                if (_cursorIndexOfRecurrence == -1) {
                  _tmpRecurrence = null;
                } else {
                  final String _tmp_7;
                  if (_cursor.isNull(_cursorIndexOfRecurrence)) {
                    _tmp_7 = null;
                  } else {
                    _tmp_7 = _cursor.getString(_cursorIndexOfRecurrence);
                  }
                  _tmpRecurrence = RecurrenceConverter.INSTANCE.toRecurrence(_tmp_7);
                }
                final Date _tmpNext;
                if (_cursorIndexOfNext == -1) {
                  _tmpNext = null;
                } else {
                  final long _tmp_8;
                  _tmp_8 = _cursor.getLong(_cursorIndexOfNext);
                  _tmpNext = DateTimeConverter.INSTANCE.toDate(_tmp_8);
                }
                final int _tmpCount;
                if (_cursorIndexOfCount == -1) {
                  _tmpCount = 0;
                } else {
                  _tmpCount = _cursor.getInt(_cursorIndexOfCount);
                }
                final boolean _tmpDone;
                if (_cursorIndexOfDone == -1) {
                  _tmpDone = false;
                } else {
                  final int _tmp_9;
                  _tmp_9 = _cursor.getInt(_cursorIndexOfDone);
                  _tmpDone = _tmp_9 != 0;
                }
                _tmpReminder = new Reminder(_tmpStart,_tmpRecurrence,_tmpNext,_tmpCount,_tmpDone);
              } else {
                _tmpReminder = null;
              }
              _tmpNote = new Note(_tmpId,_tmpType,_tmpTitle,_tmpContent,_tmpMetadata,_tmpAddedDate,_tmpLastModifiedDate,_tmpStatus,_tmpPinned,_tmpReminder);
              final ArrayList<Label> _tmpLabelsCollection;
              final long _tmpKey_1;
              _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpLabelsCollection = _collectionLabels.get(_tmpKey_1);
              _item = new NoteWithLabels(_tmpNote,_tmpLabelsCollection);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Flow<List<NoteWithLabels>> getByStatus(final NoteStatus status, final SortSettings sort) {
    return NotesDao.DefaultImpls.getByStatus(NotesDao_Impl.this, status, sort);
  }

  @Override
  public Flow<List<NoteWithLabels>> getByLabel(final long labelId, final SortSettings sort) {
    return NotesDao.DefaultImpls.getByLabel(NotesDao_Impl.this, labelId, sort);
  }

  @Override
  public Flow<List<NoteWithLabels>> search(final String query, final SortSettings sort) {
    return NotesDao.DefaultImpls.search(NotesDao_Impl.this, query, sort);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshiplabelsAscomMaltaisnNotesModelEntityLabel(
      @NonNull final LongSparseArray<ArrayList<Label>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    if (_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      RelationUtil.recursiveFetchLongSparseArray(_map, true, (map) -> {
        __fetchRelationshiplabelsAscomMaltaisnNotesModelEntityLabel(map);
        return Unit.INSTANCE;
      });
      return;
    }
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `labels`.`id` AS `id`,`labels`.`name` AS `name`,`labels`.`hidden` AS `hidden`,_junction.`noteId` FROM `label_refs` AS _junction INNER JOIN `labels` ON (_junction.`labelId` = `labels`.`id`) WHERE _junction.`noteId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      final long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      // _junction.noteId;
      final int _itemKeyIndex = 3;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfName = 1;
      final int _cursorIndexOfHidden = 2;
      while (_cursor.moveToNext()) {
        final long _tmpKey;
        _tmpKey = _cursor.getLong(_itemKeyIndex);
        final ArrayList<Label> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Label _item_1;
          final long _tmpId;
          _tmpId = _cursor.getLong(_cursorIndexOfId);
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final boolean _tmpHidden;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfHidden);
          _tmpHidden = _tmp != 0;
          _item_1 = new Label(_tmpId,_tmpName,_tmpHidden);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
