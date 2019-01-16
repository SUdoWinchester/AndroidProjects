package sudow.dogagecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_calc;
    private EditText lbl_age;
    private TextView tv_result;
    private TextView tv_error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_calc = (Button) findViewById(R.id.btn_calc);
        lbl_age = (EditText) findViewById(R.id.lbl_age);
        tv_result = (TextView) findViewById(R.id.tv_result);
        tv_error = (TextView) findViewById(R.id.tv_error);

        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lbl_age.getText().toString().isEmpty()) {
                    tv_error.setText("Please tell the dog's age");
                } else {
                    tv_result.setText("The age of the dog is: " + Integer.parseInt(lbl_age.getText().toString()) * 7);
                }
            }
        });
    }
}
