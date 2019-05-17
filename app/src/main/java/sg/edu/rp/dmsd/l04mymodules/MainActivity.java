package sg.edu.rp.dmsd.l04mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.android);
        tv2 = findViewById(R.id.ipad);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(), ModuleDetailActivity.class);
                intent.putExtra("module", "android");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(), ModuleDetailActivity.class);
                intent.putExtra("module", "ipad");
                startActivity(intent);
            }
        });


    }
}
