package sudow.soundofanimals;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_dog:
                play(R.raw.cao);
                break;
            case R.id.img_cat:
                play(R.raw.gato);
                break;
            case R.id.img_monkey:
                play(R.raw.macaco);
                break;
            case R.id.img_leon:
                play(R.raw.leao);
                break;
            case R.id.img_cow:
                play(R.raw.vaca);
                break;
            case R.id.img_sheep:
                play(R.raw.ovelha);
                break;
            default:
                Toast.makeText(this, "???????", Toast.LENGTH_SHORT).show();
        }
    }

    private void play(int songId) {
        mediaPlayer = MediaPlayer.create(MainActivity.this, songId);
        mediaPlayer.start();
    }
}
