package org.techtown.waitingsystem;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    private Context context;
    private EditText id, password;
    private Button signUp; /*페이지 전환버튼*/
    private Button signIn; /*페이지 전환버튼*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        context = getApplicationContext();

        id = (EditText) findViewById(R.id.login_id);
        password = (EditText) findViewById(R.id.login_pw);

        signIn = (Button)findViewById(R.id.signIn_btn);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println(id.getText().toString());

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);//액티비티 띄우기
            }
        });
        signUp = (Button)findViewById(R.id.signUp_btn);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(intent);//액티비티 띄우기
            }
        });

    }

}
