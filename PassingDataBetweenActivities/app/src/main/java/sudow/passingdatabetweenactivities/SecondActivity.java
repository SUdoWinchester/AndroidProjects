package sudow.passingdatabetweenactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView tv_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_welcome = (TextView) findViewById(R.id.tv_welcome);

        Bundle extra = getIntent().getExtras();

        if( extra != null) {
            // neither this
            tv_welcome.setText(tv_welcome.getText().toString() + " " + extra.getString("name"));
        } else {
            onDestroy();
        }
    }
}
