package com.cqu.jcenterdemo;

import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.cqu.jcenterlib.AbsHandler;


public class MainActivity extends ActionBarActivity {

    private UpdateHandler mHanderl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHanderl = new UpdateHandler(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private static class UpdateHandler extends AbsHandler<MainActivity> {

        public UpdateHandler(MainActivity mActivity) {
            super(mActivity);
        }

        @Override
        protected void handleMessage(MainActivity mActivity, Message msg, Bundle mBundle) {

        }
    }

}
