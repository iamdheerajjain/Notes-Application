// Generated by Dagger (https://dagger.dev).
package com.maltaisn.notes.ui.settings;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SettingsViewModel_Factory_Impl implements SettingsViewModel.Factory {
  private final SettingsViewModel_Factory delegateFactory;

  SettingsViewModel_Factory_Impl(SettingsViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public SettingsViewModel create(SavedStateHandle savedStateHandle) {
    return delegateFactory.get(savedStateHandle);
  }

  public static Provider<SettingsViewModel.Factory> create(
      SettingsViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new SettingsViewModel_Factory_Impl(delegateFactory));
  }
}
