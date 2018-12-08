package app.androidwear.com.androidwearapp;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    TextView num1;
    TextView num2;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView)findViewById(R.id.num2);
        btn = (Button)findViewById(R.id.btn);
        txt = (TextView)findViewById(R.id.result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(""+Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString()));
                txt.setEnabled(true);
            }
        });

        // Enables Always-on
        setAmbientEnabled();
    }
}
