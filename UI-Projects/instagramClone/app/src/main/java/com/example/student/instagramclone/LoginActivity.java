package com.example.student.instagramclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class     LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView tvLanguage = (TextView) findViewById(R.id.tvLanguage);
        ImageView ivLogo = (ImageView) findViewById(R.id.ivlogo);
        EditText etName = (EditText) findViewById(R.id.etName);
        EditText etPassword = (EditText) findViewById(R.id.etPassword);
        Button login_button = (Button) findViewById(R.id.login_button);
        TextView tvIcon = (TextView) findViewById(R.id.tvIcon);
        TextView tvFacebook = (TextView) findViewById(R.id.tVFacebook);
        Button button_singup = (Button) findViewById(R.id.button_signup);

    }
}
