package com.siteadi;
//Aktivitemizin bulunduğu paketin adı

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
//Aktivitemizin kullandığı diğer Java sınıfları

public class sayfa2 extends Activity {
	private ImageButton geriDugmesi;
	private ImageButton ileriDugmesi;
	private Spinner acilanListe;

	//Her aktivite Aktivite sınıfından miras ile türetilir.
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sayfa2);
        
        
        acilanListe = (Spinner) findViewById(R.id.spMeslegi);
      //Açılır menü olan spinner elemanıyla iletişim kurduk.

      ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
              		this, R.array.meslegi, 
              		android.R.layout.simple_spinner_dropdown_item);
      /*
      Spinner elemanı ile listelenecek dizisi arasında aracı olacak bir adaptör oluşturuyoruz. 
      */        
             acilanListe.setAdapter(adapter);
       //Spinner elemanında listelenecek elemanların dizisiyle irtibat kuruldu. 
              
      OnItemSelectedListener secileniAl = new OnItemSelectedListener() {
      /* 
      Seçilen listenin dinleyenci metodu ile spinner’deki listelenen seçeneklerden biri seçildiği anda neler yapılacaksa bu kod kısmında belirleniyor. 
      */

      	@Override
      	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
       Toast.makeText(sayfa2.this,
      "Açılan Listeden "+arg0.getSelectedItem()+" mesleği seçildi."
      	,Toast.LENGTH_SHORT).show();	
      //Listeden seçilen eleman bir toast mesajı olarak gösteriliyor 
      		}

      	@Override	
      	public void onNothingSelected(AdapterView<?> arg0) {
      Toast.makeText(sayfa2.this,
      "Mesleklerden henüz biri seçilmedi."
      	,Toast.LENGTH_SHORT).show();
      //Burada da her hangi bir seçim yapılmadığını bir toast mesajı verilmektedir.
      		}	
      	}; 
      acilanListe.setOnItemSelectedListener(secileniAl);
      //Seçilen listenin dinleyenci metodu ile iletişim sağlanıyor.
      
        
        /*
        Java’da önce miras lan sınıfın hazırlayıcı metodu çağırılır. Üst sınıfın hazırlayıcısını super anahtar sözcüğünü kullanarak çağırırız. Alt sınıf ile yani miras alan sınıfla üstteki sınıfta aynı isimde metotlar yer alabilir. Bu durumda alt sınıftaki metodun üstüne @Override anahtar sözcüğü ile bir belirtme yapılır. Bu kullanım kodumuzun okunurluğunu arttırır.
        */
        final String adiSoyadiGelen = getIntent().getExtras().getString("adiAdiSoyadiGonderilen");
        final Spinner meslegiGonderilecek= (Spinner) findViewById(R.id.spMeslegi);
        
        /*
        Başka bir formdan gelen bilgiler getIntent().getExtras().getString() ile alınır. Intent nesnesi aktivitelerin, servislerin ve yayın alıcıların aktifleştirilmesinde kullanılan metoda ait bilgileri, mesajları bünyesinde barındırarak saklamaktadır. 
        */
        
        TextView tvAdiSoyadiGelen = (TextView) findViewById(R.id.tvAdiSoyadiGelen);
        tvAdiSoyadiGelen.setText(adiSoyadiGelen);

        geriDugmesi = (ImageButton) findViewById(R.id.imgBtnGeri);
        geriDugmesi.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent (sayfa2.this,_027_MotoDev_KullanimActivity.class);
				intent.putExtra("adiAdiSoyadiGonderilen", adiSoyadiGelen);
				startActivity(intent);
				/*
				Bir aktivite ya startActivity() veya startActivityForResult() metotu ile aktifleştirilir. Bir aktivitenin sonuç döndürmesi amaçlandığı zaman startActivityForResult() metodu kullanılır. Eğer sonuç döndürmesi amaçlanmıyorsa startActivity() metodu kullanılır. Burada startActivity(intent) metodunun içindeki Intent nesnesi aktivitelerin, servislerin ve yayın alıcıların aktifleştirilmesinde kullanılan metoda ait bilgileri, mesajları bünyesinde barındırarak saklamaktadır. 
				*/
			}
		});
        
        
        ileriDugmesi = (ImageButton) findViewById(R.id.imgBtnIleri);
        ileriDugmesi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent (sayfa2.this,sayfa3.class);
				intent.putExtra("adiAdiSoyadiGonderilen",adiSoyadiGelen);
				intent.putExtra("meslegiGonderilen", meslegiGonderilecek.getSelectedItem().toString());
				startActivity(intent);
				/*
				Bir aktivite ya startActivity() veya startActivityForResult() metotu ile aktifleştirilir. Bir aktivitenin sonuç döndürmesi amaçlandığı zaman startActivityForResult() metodu kullanılır. Eğer sonuç döndürmesi amaçlanmıyorsa startActivity() metodu kullanılır. Burada startActivity(intent) metodunun içindeki Intent nesnesi aktivitelerin, servislerin ve yayın alıcıların aktifleştirilmesinde kullanılan metoda ait bilgileri, mesajları bünyesinde barındırarak saklamaktadır. 
				*/
			}
		});
    }
}
