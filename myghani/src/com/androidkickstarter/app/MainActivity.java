
package com.androidkickstarter.app;

import android.os.Bundle;
import com.actionbarsherlock.view.Menu;
import com.androidkickstarter.app.robosherlock.RoboSherlockActivity;

public class MainActivity
    extends RoboSherlockActivity
{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater();
        return true;
    }

}
