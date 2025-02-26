package com.example.financefit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class profile1 extends AppCompatActivity {
    private TextView profileDetailsLayout;
    private TextView notificationLayout;
    private TextView settingsLayout;
    private TextView supportLayout;
    private TextView logoutLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);

        // Initialize TextViews
        profileDetailsLayout = findViewById(R.id.profileDetailsTextView);
        notificationLayout = findViewById(R.id.notificationTextView);
        settingsLayout = findViewById(R.id.settingsTextView);
        supportLayout = findViewById(R.id.supportTextView);
        logoutLayout = findViewById(R.id.logoutTextView);

        // Click listener for "Profile Details"
        profileDetailsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("profileDetails", "Some profile details here"); // Example data
                setResult(RESULT_OK, resultIntent);
                finish(); // Close the activity and return to MainActivity
            }
        });

        // Click listener for "Notifications"
        notificationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(profile1.this, "Notifications Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Click listener for "Settings"
        settingsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(profile1.this, "Settings Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Click listener for "Support"
        supportLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile1.this, Support.class);
                startActivity(intent); // Start the Support activity
            }
        });

        // Click listener for "Logout"
        logoutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(profile1.this, "Logged out", Toast.LENGTH_SHORT).show();
                finish(); // Close this activity
            }
        });
    }
}
