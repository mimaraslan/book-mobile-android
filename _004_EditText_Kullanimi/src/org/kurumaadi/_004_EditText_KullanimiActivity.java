package org.kurumaadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class _004_EditText_KullanimiActivity extends Activity {
    /** Called when the activity is first created. */
	
	private TextView adiEtiketi;
	private EditText adiDuzenlenmeKutusu;
	
	private TextView soyadiEtiketi;
	private EditText soyadiDuzenlenmeKutusu;
	
	private TextView epostaEtiketi;
	private EditText epostaDuzenlenmeKutusu;
	
	private Button dugmemiz;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
   //main.xml deki elemanlar ile bağlantiya gectik  
        adiEtiketi = (TextView) findViewById(R.id.textView1);
        adiDuzenlenmeKutusu = (EditText) findViewById(R.id.editText1);
        
        soyadiEtiketi = (TextView) findViewById(R.id.textView2);
        soyadiDuzenlenmeKutusu = (EditText) findViewById(R.id.editText2);
        
        epostaEtiketi = (TextView) findViewById(R.id.textView3);
        epostaDuzenlenmeKutusu = (EditText) findViewById(R.id.editText3);
        
        dugmemiz = (Button) findViewById(R.id.button1);
            
        
        dugmemiz.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				adiEtiketi.setText("ADI");
				soyadiEtiketi.setText("SOYADI");
				epostaEtiketi.setText("E-POSTA ADRESİ");	
			    dugmemiz.setText("TAMAM");
				
			  String  verilecekMesaj;
			  verilecekMesaj=adiEtiketi.getText()+" "+adiDuzenlenmeKutusu.getText()+"\n"+
							 soyadiEtiketi.getText()+" "+soyadiDuzenlenmeKutusu.getText()+"\n"+
							 epostaEtiketi.getText()+" "+epostaDuzenlenmeKutusu.getText();
			  
			    Toast.makeText(_004_EditText_KullanimiActivity.this, 
			    		verilecekMesaj, 
			    		Toast.LENGTH_LONG).show();
			}
		});
        
    }
}