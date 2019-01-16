package sudow.gasolineorethanol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText lbl_ethanol;
    private EditText lbl_gasoline;
    private Button btn_check;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbl_ethanol = (EditText) findViewById(R.id.lbl_ethanol);
        lbl_gasoline = (EditText) findViewById(R.id.lbl_gasoline);
        btn_check = (Button) findViewById(R.id.btn_check);
        tv_result = (TextView) findViewById(R.id.tv_result);

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lbl_ethanol.getText().toString().isEmpty() || lbl_gasoline.getText().toString().isEmpty()) {
                    String msg = "Informe ambos os valores";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
                } else {
                    if (Double.parseDouble(lbl_ethanol.getText().toString()) / Double.parseDouble(lbl_gasoline.getText().toString()) >= 0.7) {
                        tv_result.setText("É melhor utilizar Gasolina");
                    } else {
                        tv_result.setText("É melhor utilizar Álcool");
                    }
                }
            }
        });
    }
}
