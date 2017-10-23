package jomai294.john.fencingscorekeeper;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;
    private Button start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button)(findViewById(R.id.startButton));


    }
    private View.OnClickListener btnClicker = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

        }
    };
    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    private void startBout() {

    }

    public void changeBoutType() {

    }

    public void determinePriority() {

    }

}
