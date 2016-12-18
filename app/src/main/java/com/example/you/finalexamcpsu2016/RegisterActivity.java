package com.example.you.finalexamcpsu2016;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by You on 18/12/2559.
 */

public class RegisterActivity extends AppCompatActivity {
    EditText editTextName,editTextPassword,editTextUserName;
    Button btnCreateAccount;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        editTextUserName=(EditText)findViewById(R.id.editTextUserName);
        editTextPassword=(EditText)findViewById(R.id.editTextPassword);
        editTextName=(EditText)findViewById(R.id.editTextName);

        btnCreateAccount=(Button)findViewById(R.id.buttonCreateAccount);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                //String Name=editTextName.getText().toString();
                String userName=editTextUserName.getText().toString();
                String password=editTextPassword.getText().toString();


                // check if any of the fields are vaccant
                if(userName.equals("")||password.equals("")||password.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Create Account Successfully.", Toast.LENGTH_LONG).show();
                    return;
                }
                // check if both password matches
                AlertDialog.Builder dialog = new AlertDialog.Builder(RegisterActivity.this);
                if(!password.equals(password))
                {
                    dialog.setMessage("Registration Failed");
                }

            }
        });
    }



}
