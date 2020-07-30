package com.demo.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    private EditText editTextMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        editTextMsg = findViewById(R.id.editTextMessage);
    }

    public void onClickSendMsg(View view) {
        String msg = editTextMsg.getText().toString();
        Intent intent = new Intent(this, RecievedMessageActivity.class);
        intent.putExtra("msg", msg);
        startActivity(intent);
    }
}
