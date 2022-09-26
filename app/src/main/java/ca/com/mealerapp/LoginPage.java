package ca.com.mealerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {
    private Button loginButton;
    private Button forgotPasswordButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page); //Activate the login_page.xml layout
        Button button = findViewById(R.id.login_button); //establishing login_button as a clickable button
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ //method to be executed when login_button is clicked
                /* Causes it to crash
                Intent intent = new Intent("home_page");
                startActivity(intent);
                */
            }
        });
    }


}