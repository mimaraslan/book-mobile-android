package com.siteadi;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.Toast;

public class _020_ProgressBar_KullanimiActivity extends Activity {
    private ProgressBar progressBar1;
    private CheckBox onayKutusu;
    private Button dugme1;
    private Handler handler;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        handler=new Handler();
        progressBar1=(ProgressBar) findViewById(R.id.progressBar1);
        onayKutusu = (CheckBox) findViewById(R.id.checkBox1);
        progressBar1.setProgress(0);
        dugme1 =(Button) findViewById(R.id.button1);
//Cihazinizi cevirdiginizde(oriantasyon degistiginde) activity yeniden baslatiyor
//ve bar daha once kalinan yerde kaliyor. Yani barin tamamen dolmasş icin buttona tekrar tiklamaniz lazim.
    
        
        onayKutusu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(((CheckBox) v).isChecked()){
					
			
					// prepare the alert box
		            AlertDialog.Builder alertbox = new AlertDialog.Builder(_020_ProgressBar_KullanimiActivity.this);
		 
		            // set the message to display
		            alertbox.setMessage("Yükleme işlemi başlatılsın mı?");
		 
		            // set a positive/yes button and create a listener
		            alertbox.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
		 
		                // do something when the button is clicked
		                public void onClick(DialogInterface arg0, int arg1) {
		                	
		                	onayKutusu.setChecked(true);
		                	dugme1.setEnabled(true);
		              

		                    Toast.makeText(getApplicationContext(), 
		                    		"Evet düğmesine basıldı. YÜKLENEN : " + progressBar1.getProgress(),  
		                    		Toast.LENGTH_SHORT).show();
		                    
		                    
		                    
		                    
		                }
		            });
		 
		            // set a negative/no button and create a listener
		            alertbox.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
		 
		                // do something when the button is clicked
		                public void onClick(DialogInterface arg0, int arg1) {
		                	
		                	onayKutusu.setChecked(false);
		                	dugme1.setEnabled(false);
		                	
		                    Toast.makeText(getApplicationContext(), 
		                    		"İptal düğmesine basıldı. YÜKLENEN : " + progressBar1.getProgress(),  
		                    		Toast.LENGTH_SHORT).show();
		                }
		            });
		 
		            // display box
		            alertbox.show();
		            
			        
			               
					
				}else{
					
					onayKutusu.setChecked(false);
					dugme1.setEnabled(false);
					
					Toast.makeText(_020_ProgressBar_KullanimiActivity.this, 
							"YÜKLENEN : " + progressBar1.getProgress(),  
							Toast.LENGTH_SHORT).show();
					       
				}

			}
		});
        
        

        dugme1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {	  
				handler.post(runaRunnable);
				dugme1.setText("Yükleniyor...");
			}
		});
    
    }

    
    
    Runnable runaRunnable=new Runnable() {

		@Override
		public void run() {
			progressBar1.setProgress(progressBar1.getProgress()+1);

			if(progressBar1.getProgress()<100)
			{
				handler.postDelayed(runaRunnable, 100);
			}else{
				handler.removeCallbacks(runaRunnable);
			}

		}
	};
}
