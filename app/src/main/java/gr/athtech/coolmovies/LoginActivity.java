package gr.athtech.coolmovies;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AbstractActivity {

    EditText username;
    TextInputLayout password;
    Button btnLogin, btnCancel;
    String correct_username = "athtech";
    String correct_password = "123456";

    @Override
    int getLayout() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        return R.layout.activity_login;
    }

    @Override
    void initLayout() {
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.login_button);
        btnCancel = findViewById(R.id.cancel_button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        if (TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getEditText().getText().toString()))
            Toast.makeText(LoginActivity.this, "Username/password are not provided", Toast.LENGTH_LONG).show();
        else if (username.getText().toString().equals(correct_username)) {
            if (password.getEditText().getText().toString().equals(correct_password)) {
                Toast.makeText(LoginActivity.this, "Successfully login", Toast.LENGTH_LONG).show();
                {
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
             else {
                Toast.makeText(LoginActivity.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
            }
        }
            else
                {
                    Toast.makeText(LoginActivity.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                }
        }});
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity.this.finish();
            }
        });
    }

    @Override
    void runOperations() {

    }

    @Override
    void stopOperations() {

    }

}