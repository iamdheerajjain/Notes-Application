// Generated by Dagger (https://dagger.dev).
package com.maltaisn.notes.ui.search;

import com.maltaisn.notes.model.PrefsManager;
import com.maltaisn.notes.ui.SharedViewModel;
import com.maltaisn.notes.ui.note.NoteFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class SearchFragment_MembersInjector implements MembersInjector<SearchFragment> {
  private final Provider<SharedViewModel> sharedViewModelProvider;

  private final Provider<PrefsManager> prefsManagerProvider;

  private final Provider<SearchViewModel.Factory> viewModelFactoryProvider;

  public SearchFragment_MembersInjector(Provider<SharedViewModel> sharedViewModelProvider,
      Provider<PrefsManager> prefsManagerProvider,
      Provider<SearchViewModel.Factory> viewModelFactoryProvider) {
    this.sharedViewModelProvider = sharedViewModelProvider;
    this.prefsManagerProvider = prefsManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SearchFragment> create(
      Provider<SharedViewModel> sharedViewModelProvider,
      Provider<PrefsManager> prefsManagerProvider,
      Provider<SearchViewModel.Factory> viewModelFactoryProvider) {
    return new SearchFragment_MembersInjector(sharedViewModelProvider, prefsManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SearchFragment instance) {
    NoteFragment_MembersInjector.injectSharedViewModelProvider(instance, sharedViewModelProvider);
    NoteFragment_MembersInjector.injectPrefsManager(instance, prefsManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.maltaisn.notes.ui.search.SearchFragment.viewModelFactory")
  public static void injectViewModelFactory(SearchFragment instance,
      SearchViewModel.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
