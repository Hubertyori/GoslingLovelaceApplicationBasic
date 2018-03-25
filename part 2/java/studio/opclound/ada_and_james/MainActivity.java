package studio.opclound.ada_and_james;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String able= getResources().getConfiguration().locale.getCountry();
        if(able.equals("CN")){
            Configuration config = getResources().getConfiguration();
            DisplayMetrics dm = getResources() .getDisplayMetrics();
            config.locale = Locale.SIMPLIFIED_CHINESE;
            getResources().updateConfiguration(config, dm);
        }
        TextView tv = (TextView) findViewById(R.id.text_ada);
        tv.setMovementMethod(ScrollingMovementMethod.getInstance());
//        TextView tv2 = (TextView) findViewById(R.id.text_james);
//        tv2.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

}
