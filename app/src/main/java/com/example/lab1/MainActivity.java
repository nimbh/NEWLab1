package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText login = findViewById(R.id.editTextTextEmailAddress);
    public EditText password = findViewById(R.id.editTextTextPassword);
    public Button button = findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
 всплывающее окно
    public void answerInfo(String text){
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
*/

    public void goNext(View view){
        Intent intent = new Intent(this, MainActivity2.class);

        String login_enter = login.getText().toString();
        String password_enter = password.getText().toString();
        if (login_enter.equals("admin@admin.ru") && password_enter.equals("123")){
            intent.putExtra("answer", "Welcome, admin!");
        } else {
            intent.putExtra("answer", "Login or password entered incorrectly");
        }

        startActivity(intent);
    }
}

