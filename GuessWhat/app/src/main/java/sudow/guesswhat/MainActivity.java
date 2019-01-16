package sudow.guesswhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_jogar;
    private TextView tv_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jogar = (Button) findViewById(R.id.btb_play);
        tv_num = (TextView) findViewById(R.id.tv_num);

        btn_jogar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random random = new Random();
                int numRandom = random.nextInt(10);
                tv_num.setText("Número escolhido: " + numRandom);
            }
        });
    }
}
