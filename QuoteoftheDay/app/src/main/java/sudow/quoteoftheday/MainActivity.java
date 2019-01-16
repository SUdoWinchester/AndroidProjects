package sudow.quoteoftheday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_newQuote;
    private TextView tv_quote;
    private String[] quotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_newQuote = (Button) findViewById(R.id.btn_newQuote);
        tv_quote = (TextView) findViewById(R.id.tv_quote);
        quotes = startQuotes();

        btn_newQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                tv_quote.setText(quotes[random.nextInt(quotes.length)]);
            }
        });
    }

    private String[] startQuotes() {
        String[] quote = {"People often say that motivation doesn't last. Well, neither does bathing -- that's why we recommend it daily",
                            "Someday is not a day of the week",
                            "Hire character. Train skill",
                            "Your time is limited, so don't waste it living someone else's life",
                            "Sales are contingent upon the attitude of the salesman -- not the attitude of the prospect",
                            "Everyone lives by selling something",
                            "If you are not taking care of your customer, your competitor will",
                            "The golden rule for every businessman is this: Put yourself in your customer's place",
                            "If you cannot do great things, do small things in a great way"};

        return quote;
    }
}
