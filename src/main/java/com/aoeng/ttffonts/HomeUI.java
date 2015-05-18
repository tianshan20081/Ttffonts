package com.aoeng.ttffonts;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class HomeUI extends ActionBarActivity {

    private TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ui);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/fzxz.ttf");
        tvMsg = (TextView) findViewById(R.id.tvMsg);
        tvMsg.setTypeface(tf);
        tvMsg.setText("作为14年摘得最佳可穿戴移动技术的Moto 360，许多人认为其一直是目前最好看的智能手表，符合大众对于手表的认知(圆的)，而最近这款最佳智能手表又传来了新的消息。据悉，新一代Moto 360智能手表或于5月28日至29日亮相谷歌I/O 2015。 ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_ui, menu);
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
}
