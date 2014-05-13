package com.siteadi;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class _022_Activity_KullanimiActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    Spinner acilanListe = (Spinner) findViewById(R.id.spinner1);
        
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        		this, R.array.meslegi, 
        		android.R.layout.simple_spinner_dropdown_item);
        
       acilanListe.setAdapter(adapter);
 
       OnItemSelectedListener secileniAl = new OnItemSelectedListener() {
		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
			Toast.makeText(_022_Activity_KullanimiActivity.this,
					"Açılan Listeden "+arg0.getSelectedItem()+" mesleği seçildi."
		 			,Toast.LENGTH_SHORT).show();	
		}

		@Override	
		public void onNothingSelected(AdapterView<?> arg0) {
			Toast.makeText(_022_Activity_KullanimiActivity.this,
					"Mesleklerden henüz biri seçilmedi."
		 			,Toast.LENGTH_SHORT).show();
		}	
	}; 
	
	 acilanListe.setOnItemSelectedListener(secileniAl);

//-----------------------------------------------------------------
	 
	 Button temizleDugmesi = (Button) findViewById(R.id.button1);
	 Button gonderDugmesi = (Button) findViewById(R.id.button2);
	 final EditText adi= (EditText) findViewById(R.id.editText1);
	 final EditText soyadi= (EditText) findViewById(R.id.editText2);
	 final Spinner meslegi= (Spinner) findViewById(R.id.spinner1);
	 final CheckBox uzmanlikAlani1= (CheckBox) findViewById(R.id.checkBox1);
	 final CheckBox uzmanlikAlani2= (CheckBox) findViewById(R.id.checkBox2);
	 
	 temizleDugmesi.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				adi.setText(null);
				soyadi.setText(null);
				meslegi.setSelected(false);
				uzmanlikAlani1.setChecked(false);
				uzmanlikAlani2.setChecked(false);
			}
		});
	 
	 gonderDugmesi.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent intent = new Intent (_022_Activity_KullanimiActivity.this,SonucSayfasi.class);
			intent.putExtra("adiGonderilen", adi.getText().toString());
			intent.putExtra("soyadiGonderilen", soyadi.getText().toString());
			intent.putExtra("meslegiGonderilen", meslegi.getSelectedItem().toString());
			
			if(((CheckBox) uzmanlikAlani1).isChecked()){
				intent.putExtra("uzmanlikAlani1Gonderilen", uzmanlikAlani1.getText().toString());	
			}else{
				intent.putExtra("uzmanlikAlani1Gonderilen", "");
			}
			
			if(((CheckBox) uzmanlikAlani1).isChecked()){
				intent.putExtra("uzmanlikAlani2Gonderilen", uzmanlikAlani2.getText().toString());	
			}else{
				intent.putExtra("uzmanlikAlani2Gonderilen", "");
			}
			
			startActivity(intent);
		 }
	  }); 
   }
}