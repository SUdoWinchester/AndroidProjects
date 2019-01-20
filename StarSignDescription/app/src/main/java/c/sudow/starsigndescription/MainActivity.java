package c.sudow.starsigndescription;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv_sign;

    private String[] signos = {
            "Áries", "Touro","Gêmeos","Câncer","Leão","Virgem",
            "Libra","Escorpião","Sagitário","Capricórnio","Aquário",
            "Peixes"
    };

    private String[] perfis = {
            "Arianos são animados, independentes, individualistas, dinâmicos, corajosos e aventureiros",
            "Taurinos são positivos, pacientes, determinados, noturnos, leais e românticos",
            "Geminianos são positivos, mutáveis, racionais e bastante voláteis",
            "...","...","...","...","...","...","...","...","...",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_sign = (ListView) findViewById(R.id.lv_sign);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, signos);

        lv_sign.setAdapter(adapter);

        lv_sign.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, perfis[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
