package sudow.passingdatabetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_login;
    private EditText lbl_user;
    private EditText lbl_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button) findViewById(R.id.btn_login);
        lbl_user = (EditText) findViewById(R.id.lbl_user);
        lbl_password = (EditText) findViewById(R.id.lbl_password);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Children, do not do this at home
                if (lbl_user.getText().toString().equals("SUdoW") && lbl_password.getText().toString().equals("123qwe!@#")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    intent.putExtra("name", lbl_user.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Usuario ou senha incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
