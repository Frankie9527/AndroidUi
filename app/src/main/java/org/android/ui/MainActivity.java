package org.android.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.android.live.ui.activity.BeautyLiveActivity;

public class MainActivity extends AppCompatActivity {
public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void beauty_live(View view) {
        intent=new Intent(this, BeautyLiveActivity.class);
        startActivity(intent);
    }
}
