package sg.edu.rp.dmsd.l04mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tv1 = findViewById(R.id.code);
        tv2 = findViewById(R.id.name);
        tv3 = findViewById(R.id.year);
        tv4 = findViewById(R.id.sem);
        tv5 = findViewById(R.id.cred);
        tv6 = findViewById(R.id.venue);
        // tvAnswer.setText("In Second Activity");
        Intent intentReceived = getIntent();
        if (intentReceived.getStringExtra("module").equalsIgnoreCase("android")) {
            tv1.append(" C346");
            tv2.append(" Android Programming");
            tv3.append(" 2018");
            tv4.append(" 1");
            tv5.append(" 4");
            tv6.append(" W66M");
        }
        else if (intentReceived.getStringExtra("module").equalsIgnoreCase("ipad")) {
            tv1.append(" C349");
            tv2.append(" iPad Programming");
            tv3.append(" 2019");
            tv4.append(" 2");
            tv5.append(" 4");
            tv6.append(" W65Q");
        }
    }
}
