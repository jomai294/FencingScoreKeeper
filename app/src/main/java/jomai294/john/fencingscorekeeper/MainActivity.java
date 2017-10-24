package jomai294.john.fencingscorekeeper;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.lang.*;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;
    private Button start;
    private ScoreKeeper sk;
    private String fencerWithPriority;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button)(findViewById(R.id.startButton));


    }
    private View.OnClickListener btnClicker = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.startButton) {
                //start the clock

                //placeholder for now
                int i = 0;
            } else if (v.getId()==R.id.double_touch) {

            }

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
        int priority = (int)Math.random() * 2;
        if(priority == 0) {
            fencerWithPriority= "left";
        } else {
            fencerWithPriority= "right";
        }
    }
}
