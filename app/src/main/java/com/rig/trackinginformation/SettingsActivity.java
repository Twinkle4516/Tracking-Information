package com.rig.trackinginformation;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, new SettingsFragment())
                    .commit();
        }
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.Contaminated:
                if (checked);
                    //report the issue
            else
                // Remove the contamination
                break;
            case R.id.Substituted:
                if (checked);
                // wrong drugs
            else
                    break;
            case R.id.Diluted:
                if (checked);
                // weak drugs
                else
                    break;
            case R.id.Mislabelling:
                if (checked);
                // wrong drugs
                else
                    break;
            case R.id.Good:
                if (checked);
                // No Tampering
                else
                    break;
            case R.id.Best:
                if (checked);
            // TODO: No issues
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.preferences, rootKey);
        }
    }
}