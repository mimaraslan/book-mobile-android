package tr.gov.resmikurumadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class _006_RadioButton_KullanimiActivity extends Activity {
    /** Called when the activity is first created. */
    


	 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
   	
 //-----------------------------------------------------------------
     //  TextView secenekDugmeleriBaslikYazisi = (TextView) findViewById(R.id.textView1);
    	 RadioButton secenekDugmesi1 = (RadioButton) findViewById(R.id.radioButton1);
    	 RadioButton secenekDugmesi2 = (RadioButton) findViewById(R.id.radioButton2);
    	 RadioButton secenekDugmesi3 = (RadioButton) findViewById(R.id.radioButton3);
   
    	
     //	 TextView grupSecenekDugmeleriBaslikYazisi = (TextView) findViewById(R.id.textView2);
    	 RadioButton grupSecenekDugmesi1 = (RadioButton) findViewById(R.id.radio0);
    	 RadioButton grupSecenekDugmesi2 = (RadioButton) findViewById(R.id.radio1);
    	 RadioButton grupSecenekDugmesi3 = (RadioButton) findViewById(R.id.radio2);
    	 
    	Button secenekDugmelerininSonucunuGonderenDugme = (Button) findViewById(R.id.button1);
    	Button grupsecenekDugmelerininSonucunuGonderenDugme = (Button) findViewById(R.id.button2); 
  //-----------------------------------------------------------------       
    	 OnClickListener secileniAl = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				 RadioButton seciliDurumdakiDugme = (RadioButton) v;
				
				Toast.makeText(_006_RadioButton_KullanimiActivity.this, 
							   seciliDurumdakiDugme.getText()+" SEÇİLİ DURUMDA",
							   Toast.LENGTH_SHORT).show();
				
				
			}
		};
    	 
		secenekDugmesi1.setOnClickListener(secileniAl);
		secenekDugmesi2.setOnClickListener(secileniAl);
		secenekDugmesi3.setOnClickListener(secileniAl);
		
	
	secenekDugmelerininSonucunuGonderenDugme.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
					Toast.makeText(_006_RadioButton_KullanimiActivity.this, 
							"GRUBU OLMAYAN SEÇİM DÜĞMELERİ",
							Toast.LENGTH_SHORT).show();
					
			}
		});
		
//-----------------------------------------------------------------
	 OnClickListener gruptanSecileniAl = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				RadioButton gruptakiSeciliDurumdakiDugme = (RadioButton) v;
				
				Toast.makeText(_006_RadioButton_KullanimiActivity.this, 
						"BU "+gruptakiSeciliDurumdakiDugme.getText()+" SEÇİLİ DURUMDA",
							   Toast.LENGTH_SHORT).show();
				
			//	grupsecenekDugmelerininSonucunuGonderenDugme.setText(gruptakiSeciliDurumdakiDugme.getText());
			}
		};		
		
		grupSecenekDugmesi1.setOnClickListener(gruptanSecileniAl);
		grupSecenekDugmesi2.setOnClickListener(gruptanSecileniAl);
		grupSecenekDugmesi3.setOnClickListener(gruptanSecileniAl);
			
		
	grupsecenekDugmelerininSonucunuGonderenDugme.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			 
				Toast.makeText(_006_RadioButton_KullanimiActivity.this, 
						"GRUBU OLAN SEÇİM DÜĞMELERİ",
						Toast.LENGTH_SHORT).show();
				
		}
	});
//-----------------------------------------------------------------
	
    }
}