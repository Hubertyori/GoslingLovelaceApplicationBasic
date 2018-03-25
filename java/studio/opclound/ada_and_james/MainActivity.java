package studio.opclound.ada_and_james;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.text_ada);
        tv.setMovementMethod(ScrollingMovementMethod.getInstance());
//        TextView tv2 = (TextView) findViewById(R.id.text_james);
//        tv2.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
