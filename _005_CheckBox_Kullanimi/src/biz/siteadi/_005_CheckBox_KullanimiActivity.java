package biz.siteadi;

import biz.siteadi.R;
import biz.siteadi._005_CheckBox_KullanimiActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class _005_CheckBox_KullanimiActivity extends Activity {
    /** Called when the activity is first created. */
	
	private TextView kullaniciAdiEtiketi;
	private EditText kullaniciAdiDuzenlenmeKutusu;
	
	private TextView adiSoyadiEtiketi;
	private EditText adiSoyadiDuzenlenmeKutusu;

	private TextView parolaEtiketi;
	private EditText parolaDuzenlenmeKutusu;
	
	private TextView epostaEtiketi;
	private EditText epostaDuzenlenmeKutusu;
	
	private CheckBox onayKutusu;
	
	private Button dugmemiz;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      //main.xml deki elemanlar ile bağlantiya gectik  
        
        kullaniciAdiEtiketi = (TextView) findViewById(R.id.textView1);
        kullaniciAdiDuzenlenmeKutusu = (EditText) findViewById(R.id.editText1);
        
        adiSoyadiEtiketi = (TextView) findViewById(R.id.textView2);
        adiSoyadiDuzenlenmeKutusu = (EditText) findViewById(R.id.editText2);
        
        parolaEtiketi = (TextView) findViewById(R.id.textView3);
        parolaDuzenlenmeKutusu = (EditText) findViewById(R.id.editText3);
        
        epostaEtiketi = (TextView) findViewById(R.id.textView4);
        epostaDuzenlenmeKutusu = (EditText) findViewById(R.id.editText4);
        
        //onay kutusunun yazısını java kod bölümünden yaptık
        onayKutusu = (CheckBox) findViewById(R.id.checkBox1);
        onayKutusu.setText("Onay");
        
        dugmemiz = (Button) findViewById(R.id.button1);
        dugmemiz.setEnabled(false);     
        
        
        
        onayKutusu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(((CheckBox) v).isChecked()){
					Toast.makeText(_005_CheckBox_KullanimiActivity.this, 
							"ONAY DURUMU AKTİF", 
							Toast.LENGTH_SHORT).show();
			                dugmemiz.setEnabled(true);
					
				}else{
					Toast.makeText(_005_CheckBox_KullanimiActivity.this, 
							"ONAY DURUMU PASİF", 
							Toast.LENGTH_SHORT).show();
					        dugmemiz.setEnabled(false);
				}
				
			}
		});
        
        
 
        
        dugmemiz.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				
			  String  verilecekMesaj;
			  verilecekMesaj=kullaniciAdiEtiketi.getText()+" "+kullaniciAdiDuzenlenmeKutusu.getText()+"\n"+
							 adiSoyadiEtiketi.getText()+" "+adiSoyadiDuzenlenmeKutusu.getText()+"\n"+
							 parolaEtiketi.getText()+" "+parolaDuzenlenmeKutusu.getText()+"\n"+
							 epostaEtiketi.getText()+" "+epostaDuzenlenmeKutusu.getText();
			  
			    Toast.makeText(_005_CheckBox_KullanimiActivity.this, 
			    		verilecekMesaj, 
			    		Toast.LENGTH_LONG).show();
			}
		});
        
    }
}