package com.siteadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class _027_MotoDev_KullanimActivity extends Activity {
    private Button gonderDugmesi;
	private EditText adiSoyadi;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        adiSoyadi= (EditText) findViewById(R.id.etAdiSoyadi);   
        gonderDugmesi = (Button) findViewById(R.id.btnGonder);
       /*
      String adiAdiSoyadiGelen = getIntent().getExtras().getString("adiAdiSoyadiGonderilen");
      adiSoyadi.setText(adiAdiSoyadiGelen);  
        */
        gonderDugmesi.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
		Intent intent = new Intent (_027_MotoDev_KullanimActivity.this,sayfa2.class);
		intent.putExtra("adiAdiSoyadiGonderilen",adiSoyadi.getText().toString());
		startActivity(intent);
				/*
				Bir aktivite ya startActivity() veya startActivityForResult() metotu ile aktifleştirilir. Bir aktivitenin sonuç döndürmesi amaçlandığı zaman startActivityForResult() metodu kullanılır. Eğer sonuç döndürmesi amaçlanmıyorsa startActivity() metodu kullanılır. Burada startActivity(intent) metodunun içindeki Intent nesnesi aktivitelerin, servislerin ve yayın alıcıların aktifleştirilmesinde kullanılan metoda ait bilgileri, mesajları bünyesinde barındırarak saklamaktadır. 
				*/
			}
		});
    }
}