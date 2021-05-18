package org.techtown.waitingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private Context context;
    private EditText id, password, passwordCheck, email, name, address, phone;
    private Button register;
    private Button cancel_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
    }

    private void init() {

        context = getApplicationContext();

        id = (EditText) findViewById(R.id.editTextId);
        password = (EditText) findViewById(R.id.editTextPassword);
        passwordCheck = (EditText) findViewById(R.id.editTextPasswordCheck);
        name = (EditText) findViewById(R.id.editTextName);
        address = (EditText) findViewById(R.id.editTextAddress);
        email = (EditText) findViewById(R.id.editTextEmail);
        phone = (EditText) findViewById(R.id.editTextPhone);

        register = (Button) findViewById(R.id.signUpRegister_btn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println(address.getText().toString());

            }
        });

        cancel_btn = (Button) findViewById(R.id.cancel_btn);

        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),SignInActivity.class);
                startActivity(intent);
            }
        });

    }
}
