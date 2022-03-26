package com.alaqsa.android_lab.fragments.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alaqsa.android_lab.fragments.databinding.ActivityInfoBinding;

public class InfoActivity extends AppCompatActivity {
    ActivityInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding=ActivityInfoBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());
    }
}