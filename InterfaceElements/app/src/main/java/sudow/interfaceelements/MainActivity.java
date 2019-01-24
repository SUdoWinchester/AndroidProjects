package sudow.interfaceelements;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // Dialog
    private Button btn_dialog;
    private AlertDialog.Builder dialog;

    // CheckBox
    private CheckBox cb_1;
    private CheckBox cb_2;
    private CheckBox cb_3;
    private Button btn_check;

    // SeekBar
    private SeekBar sb_seekBar;
    private Button btn_seek;
    private TextView tv_txt;

    // Radio Button
    private RadioGroup radioGroup_group;
    private RadioButton radioButton_selected;
    private Button btn_radio;

    // Toggle Button
    private ToggleButton toggleButton_onOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Dialog
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_dialog = (Button) findViewById(R.id.btn_dialog);

        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new AlertDialog.Builder(MainActivity.this);

                dialog.setTitle("Dialog");
                dialog.setMessage("Mensagem do dialog");
                dialog.setCancelable(false);
                dialog.setIcon(android.R.drawable.ic_partial_secure);

                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Botão não", Toast.LENGTH_SHORT).show();
                            }
                        });

                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Botão sim", Toast.LENGTH_SHORT).show();
                            }
                        });

                dialog.create();
                dialog.show();
            }
        });

        //****************************************************************************************\\
        //Checkbox

        cb_1 = (CheckBox) findViewById(R.id.cb_1);
        cb_2 = (CheckBox) findViewById(R.id.cb_2);
        cb_3 = (CheckBox) findViewById(R.id.cb_3);
        btn_check = (Button) findViewById(R.id.btn_checkbox);

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = "Opções marcadas: " + (cb_1.isChecked() ? "Opção 1\n" : "") + (cb_2.isChecked() ? "Opção 2\n" : "") + (cb_3.isChecked() ? "Opção 3\n" : "");

                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();
            }
        });

        //****************************************************************************************\\
        //SeekBar

        sb_seekBar = (SeekBar) findViewById(R.id.sb_seekBar);
        btn_seek = (Button) findViewById(R.id.btn_seek);
        tv_txt = (TextView) findViewById(R.id.tv_txt);

        sb_seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_txt.setText("Movendo, valor: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Tocou o seekbar", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Soltou o seekbar", Toast.LENGTH_SHORT).show();
                tv_txt.setText("");
            }
        });

        btn_seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_txt.setText("Valor atual: " + sb_seekBar.getProgress());
            }
        });

        //****************************************************************************************\\
        //Radio Button

        radioGroup_group = (RadioGroup) findViewById(R.id.radioGroup_group);
        btn_radio = (Button) findViewById(R.id.btn_radio);

        btn_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton_selected = (RadioButton) findViewById(radioGroup_group.getCheckedRadioButtonId());

                if(radioButton_selected != null)
                    Toast.makeText(MainActivity.this, "RadioButton selecionado: " + radioButton_selected.getText(), Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Selecione umas das opções", Toast.LENGTH_SHORT).show();
            }
        });

        //****************************************************************************************\\
        //Radio Button

        toggleButton_onOff = (ToggleButton) findViewById(R.id.toggleButton_onOff);

        toggleButton_onOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, (isChecked ? "Ligado" : "Desligado"), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
