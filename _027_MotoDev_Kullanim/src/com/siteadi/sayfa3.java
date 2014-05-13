package com.siteadi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class sayfa3 extends Activity {
    private ImageButton geriDugmesi;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayfa3);
        /*
        Java’da önce miras lan sınıfın hazırlayıcı metodu çağırılır. Üst sınıfın hazırlayıcısını super anahtar sözcüğünü kullanarak çağırırız. Alt sınıf ile yani miras alan sınıfla üstteki sınıfta aynı isimde metotlar yer alabilir. Bu durumda alt sınıftaki metodun üstüne @Override anahtar sözcüğü ile bir belirtme yapılır. Bu kullanım kodumuzun okunurluğunu arttırır.
        */
        final String adiAdiSoyadiGelen = getIntent().getExtras().getString("adiAdiSoyadiGonderilen");
        final String meslegiGelen = getIntent().getExtras().getString("meslegiGonderilen");
        
        
        /*
        Başka bir formdan gelen bilgiler getIntent().getExtras().getString() ile alınır. Intent nesnesi aktivitelerin, servislerin ve yayın alıcıların aktifleştirilmesinde kullanılan metoda ait bilgileri, mesajları bünyesinde barındırarak saklamaktadır. 
        */
        
        TextView tvAdiSoyadiGelen = (TextView) findViewById(R.id.tvAdiSoyadiGelen);
        tvAdiSoyadiGelen.setText(adiAdiSoyadiGelen);
        
        TextView tvMeslegiGelen = (TextView) findViewById(R.id.tvMeslegiGelen);
        tvMeslegiGelen.setText(meslegiGelen);
        
        
        

        geriDugmesi = (ImageButton) findViewById(R.id.imgBtnGeri);
        geriDugmesi.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent (sayfa3.this,sayfa2.class);
				intent.putExtra("adiAdiSoyadiGonderilen", adiAdiSoyadiGelen.toString());
			
				startActivity(intent);
				/*
				Bir aktivite ya startActivity() veya startActivityForResult() metotu ile aktifleştirilir. Bir aktivitenin sonuç döndürmesi amaçlandığı zaman startActivityForResult() metodu kullanılır. Eğer sonuç döndürmesi amaçlanmıyorsa startActivity() metodu kullanılır. Burada startActivity(intent) metodunun içindeki Intent nesnesi aktivitelerin, servislerin ve yayın alıcıların aktifleştirilmesinde kullanılan metoda ait bilgileri, mesajları bünyesinde barındırarak saklamaktadır. 
				*/
			}
		});
        
        
    }
}
