package com.example.kalagovairina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView avatarImageView;
    private TextView counterTextView;
    private EditText nameEditText;
    private Button button, likeButton;

    private int counter = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = findViewById(R.id.counterTextView);
        nameEditText = findViewById(R.id.nameEditText);
        button = findViewById(R.id.nameButton);
        likeButton = findViewById(R.id.like);


        counterTextView.setText(String.valueOf(counter));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = nameEditText.getText().toString();
                Toast.makeText(MainActivity.this, "Привет, " + name + "!!!", Toast.LENGTH_SHORT).show();
            }
        });


        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                counterTextView.setText(String.valueOf(counter));
            }
        });
    }
}