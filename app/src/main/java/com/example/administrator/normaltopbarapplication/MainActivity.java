package com.example.administrator.normaltopbarapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    NormalTopBar mNormalTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNormalTopBar=(NormalTopBar)findViewById(R.id.topbar);
        mNormalTopBar.setTitle("这是标题");
        mNormalTopBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "返回===", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
