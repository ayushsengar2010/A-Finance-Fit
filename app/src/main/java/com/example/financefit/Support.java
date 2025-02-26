package com.example.financefit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Support extends AppCompatActivity {
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText issueEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        nameEditText = findViewById(R.id.name);
        emailEditText = findViewById(R.id.email);
        issueEditText = findViewById(R.id.comment);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String comment = issueEditText.getText().toString().trim();

                if (name.isEmpty() || email.isEmpty() || comment.isEmpty()) {
                    Toast.makeText(Support.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Support.this, "Submitted successfully", Toast.LENGTH_SHORT).show();

                    // Redirect to profile1 after submission
                    Intent intent = new Intent(Support.this, profile1.class);
                    startActivity(intent); // Start profile1
                    finish(); // Close current Support activity
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Navigate back to profile1 when the back button is pressed
        super.onBackPressed();
        Intent intent = new Intent(Support.this, profile1.class);
        startActivity(intent); // Start profile1
        finish(); // Close current Support activity
    }
}
