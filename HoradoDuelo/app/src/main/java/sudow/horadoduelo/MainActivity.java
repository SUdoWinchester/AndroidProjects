package sudow.horadoduelo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button play;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.btn_play);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.its_time_to_duel);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    Toast.makeText(MainActivity.this, "?????", Toast.LENGTH_SHORT).show();
                } else {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        play.setText("É hora do duelo");
                    } else {
                        mediaPlayer.start();
                        play.setText("Sua Vez");
                    }
                }
            }
        });
    }
}
