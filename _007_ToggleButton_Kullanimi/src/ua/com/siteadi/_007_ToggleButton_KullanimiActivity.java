package ua.com.siteadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class _007_ToggleButton_KullanimiActivity extends Activity {
    /** Called when the activity is first created. */
  
	 private String verilecekMesaj=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//---------------------------------------------------------------  
       final ToggleButton ciftDurumluDugme = (ToggleButton) findViewById(R.id.toggleButton1);
        
       final TextView eposta = (TextView) findViewById(R.id.textView1);
       final EditText epostaDuzenlemeKutusu = (EditText) findViewById(R.id.editText1);
        
       final TextView parola = (TextView) findViewById(R.id.textView2);
       final EditText parolaDuzenlemeKutusu = (EditText) findViewById(R.id.editText2);
        
       final Button onayDugmesi = (Button) findViewById(R.id.button1); 
//---------------------------------------------------------------       
//Başlangıç durumunda ilk çalıştırılmadan elemanlarımız pasif olacaklar.      
		eposta.setEnabled(false);
		epostaDuzenlemeKutusu.setEnabled(false);
		parola.setEnabled(false);
		parolaDuzenlemeKutusu.setEnabled(false);
		onayDugmesi.setEnabled(false);
        
//---------------------------------------------------------------    	
        ciftDurumluDugme.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(ciftDurumluDugme.isChecked()){
					eposta.setEnabled(true);
					epostaDuzenlemeKutusu.setEnabled(true);
					parola.setEnabled(true);
					parolaDuzenlemeKutusu.setEnabled(true);
					onayDugmesi.setEnabled(true);
					
					Toast.makeText(_007_ToggleButton_KullanimiActivity.this, 
							"KAYIT İÇİN DURUM AKTİFLEŞTİRİLDİ.",Toast.LENGTH_SHORT).show();
				}else{
					eposta.setEnabled(false);
					epostaDuzenlemeKutusu.setEnabled(false);
					parola.setEnabled(false);
					parolaDuzenlemeKutusu.setEnabled(false);
					onayDugmesi.setEnabled(false);
					
					Toast.makeText(_007_ToggleButton_KullanimiActivity.this, 
							"KAYIT İÇİN DURUM PASİFLEŞTİRİLDİ.",Toast.LENGTH_SHORT).show();
					
					epostaDuzenlemeKutusu.setText("");
					parolaDuzenlemeKutusu.setText("");
				}
			}
		});
        
 //---------------------------------------------------------------     
        onayDugmesi.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				
				if(epostaDuzenlemeKutusu.getText().toString().equals("mimaraslan@gmail.com") &&
						parolaDuzenlemeKutusu.getText().toString().equals("1453"))
				{ 
					verilecekMesaj=eposta.getText()+" "+epostaDuzenlemeKutusu.getText()+"\n"+
									  parola.getText()+" "+parolaDuzenlemeKutusu.getText()+"\n"+
									  "Giriş Bilgileri Doğrulandı.\nHOŞ GELDİNİZ";
					Toast.makeText(_007_ToggleButton_KullanimiActivity.this, 
							verilecekMesaj, Toast.LENGTH_SHORT).show();
				}else{
								
					verilecekMesaj="E-Posta veya Parolanız Hatalı Girildi.";
					Toast.makeText(_007_ToggleButton_KullanimiActivity.this, 
							verilecekMesaj, Toast.LENGTH_SHORT).show();
					
					epostaDuzenlemeKutusu.setText("");
					parolaDuzenlemeKutusu.setText("");
				}	
			}
		});
//---------------------------------------------------------------    
    }
}