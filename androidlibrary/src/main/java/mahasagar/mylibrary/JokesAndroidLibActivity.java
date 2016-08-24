package mahasagar.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class JokesAndroidLibActivity extends AppCompatActivity {
    public static String JOKE_KEY = "keyToLaugh";
    TextView textview_joke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_jokes);
        textview_joke = (TextView) findViewById(R.id.textview_joke);
        String joke = getIntent().getStringExtra(JOKE_KEY);
        //Toast.makeText(getApplicationContext(),"welcome : "+joke,Toast.LENGTH_SHORT).show();
        if(joke == null) {
            textview_joke.setText("Its not a Joke");
        }
        textview_joke.setText(joke);
    }
}
