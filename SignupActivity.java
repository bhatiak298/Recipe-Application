package com.example.recipeapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.recipeapplication.AppCompatActivity;
import com.example.recipeapplication.R;

public class SignupActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextEmail, editTextPassword, editTextConfirmPassword;
    private Button buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onCreate(R.layout.activity_signup);

        editTextUsername = (EditText) editTextUsername.findViewById();
        editTextEmail = editTextEmail.findViewById();
        editTextPassword = editTextPassword.findViewById();
        editTextConfirmPassword = editTextConfirmPassword.findViewById();
        buttonSignup = buttonSignup.findViewById();

        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle signup logic here
                // Validate input fields, create account, etc.
            }
        });
    }

    private void onCreate(int activitySignup) {
    }
}
