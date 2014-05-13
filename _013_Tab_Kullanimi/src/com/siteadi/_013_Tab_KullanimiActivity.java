package com.siteadi;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class _013_Tab_KullanimiActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        TabHost mTabHost = getTabHost();
        
        mTabHost.addTab(mTabHost.newTabSpec("tab1").
        		setIndicator("SEKME 1", getResources().getDrawable(R.drawable.offline_storage)).
        		setContent(R.id.textview1));
        mTabHost.addTab(mTabHost.newTabSpec("tab2").
        		setIndicator("SEKME 2", getResources().getDrawable(R.drawable.semantics)).
        		setContent(R.id.textview2));
        mTabHost.addTab(mTabHost.newTabSpec("tab3").
        		setIndicator("SEKME 3", getResources().getDrawable(R.drawable.ucd_effect)).
        		setContent(R.id.textview3));
        mTabHost.addTab(mTabHost.newTabSpec("tab4").
        		setIndicator("SEKME 4").    		
        		setContent(R.id.textview4));
  
        mTabHost.setCurrentTab(0);
    }
}