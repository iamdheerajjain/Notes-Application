package com.maltaisn.notes.ui.settings

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.preference.PreferenceFragmentCompat
import com.google.android.material.transition.MaterialElevationScale
import com.maltaisn.notes.databinding.FragmentSettingsBinding
import com.google.android.material.R as RMaterial

/**
 * Secondary settings fragment for showing nested preference screens.
 * See [https://developer.android.com/guide/topics/ui/settings/organize-your-settings#split_your_hierarchy_into_multiple_screens].
 *
 * Instead of making one fragment per nested screen, this fragment takes an argument indicating
 * the preferences XML to display. The argument is passed via navigation component safe args.
 */
class NestedSettingsFragment : PreferenceFragmentCompat() {

    private val args: NestedSettingsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enterTransition = MaterialElevationScale(false).apply {
            duration = resources.getInteger(RMaterial.integer.material_motion_duration_short_2).toLong()
        }
        exitTransition = MaterialElevationScale(true).apply {
            duration = resources.getInteger(RMaterial.integer.material_motion_duration_short_2).toLong()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentSettingsBinding.bind(view)

        binding.toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }
        binding.toolbar.setTitle(args.prefsTitle)
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(args.prefsXml, rootKey)
    }
}
