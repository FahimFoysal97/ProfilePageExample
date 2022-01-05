package com.example.profilepageexample;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.profilepageexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initUI();
    }

    private void initUI() {
        binding.includeProfileOptionsPart.textviewOrder.setOnClickListener(v -> showCustomToastWithText(getString(R.string.order_pressed)));
        binding.includeProfileOptionsPart.textviewLike.setOnClickListener(v -> showCustomToastWithText(getString(R.string.like_pressed)));
        binding.includeProfileOptionsPart.textviewComment.setOnClickListener(v -> showCustomToastWithText(getString(R.string.comment_pressed)));
        binding.includeProfileOptionsPart.textviewDownload.setOnClickListener(v -> showCustomToastWithText(getString(R.string.download_pressed)));
        binding.includeProfileOptionsPart.textviewEdit.setOnClickListener(v -> showCustomToastWithText(getString(R.string.edit_pressed)));
    }

    private void showCustomToastWithText(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}