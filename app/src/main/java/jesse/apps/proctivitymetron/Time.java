package jesse.apps.proctivitymetron;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Calendar;

public class Time extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        linearLayout = (LinearLayout) findViewById(R.id.linear_layout);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int daysInTheMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        int myMonth=cal.get(Calendar.MONTH);

        while (myMonth==cal.get(Calendar.MONTH)) {
            System.out.println(cal.getTime());
            cal.add(Calendar.DAY_OF_MONTH, 1);
            Button btn = new Button(this);
            btn.setText(""+ daysInTheMonth);
            linearLayout.addView(btn);
        }

    }

    public void changeColor(View view) {
    }
}
