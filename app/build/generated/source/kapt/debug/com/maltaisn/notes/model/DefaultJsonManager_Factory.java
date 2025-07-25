// Generated by Dagger (https://dagger.dev).
package com.maltaisn.notes.model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import kotlinx.serialization.json.Json;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DefaultJsonManager_Factory implements Factory<DefaultJsonManager> {
  private final Provider<NotesDao> notesDaoProvider;

  private final Provider<LabelsDao> labelsDaoProvider;

  private final Provider<Json> jsonProvider;

  private final Provider<ReminderAlarmManager> reminderAlarmManagerProvider;

  private final Provider<PrefsManager> prefsProvider;

  public DefaultJsonManager_Factory(Provider<NotesDao> notesDaoProvider,
      Provider<LabelsDao> labelsDaoProvider, Provider<Json> jsonProvider,
      Provider<ReminderAlarmManager> reminderAlarmManagerProvider,
      Provider<PrefsManager> prefsProvider) {
    this.notesDaoProvider = notesDaoProvider;
    this.labelsDaoProvider = labelsDaoProvider;
    this.jsonProvider = jsonProvider;
    this.reminderAlarmManagerProvider = reminderAlarmManagerProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public DefaultJsonManager get() {
    return newInstance(notesDaoProvider.get(), labelsDaoProvider.get(), jsonProvider.get(), reminderAlarmManagerProvider.get(), prefsProvider.get());
  }

  public static DefaultJsonManager_Factory create(Provider<NotesDao> notesDaoProvider,
      Provider<LabelsDao> labelsDaoProvider, Provider<Json> jsonProvider,
      Provider<ReminderAlarmManager> reminderAlarmManagerProvider,
      Provider<PrefsManager> prefsProvider) {
    return new DefaultJsonManager_Factory(notesDaoProvider, labelsDaoProvider, jsonProvider, reminderAlarmManagerProvider, prefsProvider);
  }

  public static DefaultJsonManager newInstance(NotesDao notesDao, LabelsDao labelsDao, Json json,
      ReminderAlarmManager reminderAlarmManager, PrefsManager prefs) {
    return new DefaultJsonManager(notesDao, labelsDao, json, reminderAlarmManager, prefs);
  }
}
