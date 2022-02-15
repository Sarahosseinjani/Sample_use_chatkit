package com.stfalcon.chatkit.sample.features.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.stfalcon.chatkit.sample.R;
import com.stfalcon.chatkit.sample.features.demo.custom.media.CustomMediaMessagesActivity;

public class MainActivity extends AppCompatActivity {
    EditText yourName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToChat(View view) {
        yourName = findViewById(R.id.editTextPersonName);
        Toast.makeText(this,"Hello "+yourName.getText().toString(),Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, CustomMediaMessagesActivity.class);
        startActivity(intent);
    }
}
