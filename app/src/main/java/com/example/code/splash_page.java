package com.example.code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class splash_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_page);
        if (userIsLoggedIn()) {
            // User is logged in, navigate to Main Menu
            navigateToMainMenu();
        } else {
            // No user logged in, navigate to Signup/Login Page
            navigateToSignupLogin();
        }

    }
    private boolean userIsLoggedIn() {
        // Check for stored credentials or login token
        // This can be from SharedPreferences, a database, or some other storage mechanism
        // Return true if credentials exist, false otherwise
        return true; // Placeholder return
        //just changed to true to check the main **Chungman Kim
    }
    private void navigateToMainMenu() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 2000); // Delay for 2 seconds (2000 milliseconds)
    }

    private void navigateToSignupLogin() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(this, SpotifyApi.class);
            startActivity(intent);
            finish();
        }, 2000); // Delay for 2 seconds (2000 milliseconds)
    }

}