package com.siteadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class _015_OptionsMenu_KullanimiActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenusu, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:     
            	Toast.makeText(this, "Simgeli menü", 
            			Toast.LENGTH_LONG).show();
            	break;
            case R.id.item2:     
            	Toast.makeText(this, "Yazılı menü", 
            			Toast.LENGTH_LONG).show();
                break;
            case R.id.item3: 
            	Toast.makeText(this, "Yazılı ve simgeli menü", 
            			Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}