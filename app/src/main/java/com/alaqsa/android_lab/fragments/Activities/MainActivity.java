package com.alaqsa.android_lab.fragments.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alaqsa.android_lab.fragments.Fragments.PersonalFragment;
import com.alaqsa.android_lab.fragments.R;
import com.alaqsa.android_lab.fragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(binding.fragmentContainer.getId(),new PersonalFragment()).commit();
    }
}