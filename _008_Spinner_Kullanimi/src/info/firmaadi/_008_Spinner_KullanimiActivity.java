package info.firmaadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class _008_Spinner_KullanimiActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        Spinner acilanListe = (Spinner) findViewById(R.id.spinner1);
        
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        		this, R.array.cinsiyetDurumu, 
        		android.R.layout.simple_spinner_dropdown_item);
        
        acilanListe.setAdapter(adapter);
 
       
    
    
    OnItemSelectedListener secileniAl = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			
			Toast.makeText(_008_Spinner_KullanimiActivity.this,
					"Açılan Listeden "+arg0.getItemIdAtPosition(arg2)+". Cinsiyet Seçildi."
		 			,Toast.LENGTH_SHORT).show();
			
		}

		@Override
		
		public void onNothingSelected(AdapterView<?> arg0) {
			Toast.makeText(_008_Spinner_KullanimiActivity.this,
					"Seçilen Bir Seçenek Henüz Yok."
		 			,Toast.LENGTH_SHORT).show();
			
		}
	}; 
    	
	
	 acilanListe.setOnItemSelectedListener(secileniAl);

//-----------------------------------------------------------------
	
  }
}