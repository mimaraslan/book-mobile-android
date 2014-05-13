package com.siteadi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SonucSayfasi extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sonucsayfasi);
          
        String adiAlinan = getIntent().getExtras().getString("adiGonderilen");
        String soyadiAlinan = getIntent().getExtras().getString("soyadiGonderilen");
        String meslegiAlinan = getIntent().getExtras().getString("meslegiGonderilen");
        String uzmanlikAlani1Alinan = getIntent().getExtras().getString("uzmanlikAlani1Gonderilen");
        String uzmanlikAlani2Alinan = getIntent().getExtras().getString("uzmanlikAlani2Gonderilen");
        
        TextView adisoyadiBilgisi = (TextView) findViewById(R.id.textView5);
        adisoyadiBilgisi.setText(adiAlinan+" "+soyadiAlinan);
        
        TextView meslegiBilgisi = (TextView) findViewById(R.id.textView6);
        meslegiBilgisi.setText(meslegiAlinan);
        
        TextView uzmanlikAlanBilgisi = (TextView) findViewById(R.id.textView7);
        uzmanlikAlanBilgisi.setText(uzmanlikAlani1Alinan+"   "+uzmanlikAlani2Alinan);
        
    }
 }
