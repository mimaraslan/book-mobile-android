package com.siteadi;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class _021_CustomDialog_KullanimiActivity extends Activity {
    
	Dialog mesaj;
	Button dugme2;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button dugme1 =(Button) findViewById(R.id.button1);
        dugme1.setOnClickListener(new OnClickListener() {        	 
        @Override
            public void onClick(View v) {
               
	        	mesaj = new Dialog(_021_CustomDialog_KullanimiActivity.this);
	        	mesaj.setContentView(R.layout.bizeozeldiyalog1);
	        	mesaj.setTitle("Özelleştirilmiş Diyalog");
	        	mesaj.setCancelable(true);
                Button button = (Button) mesaj.findViewById(R.id.mesajbtn1);
                button.setOnClickListener(new OnClickListener() {
                @Override
                    public void onClick(View v) {
                	mesaj.dismiss();
                    }
                });
                  mesaj.show();
            }
        });
        
        
        
        
        dugme2 =(Button) findViewById(R.id.button2);
        dugme2.setOnClickListener(new OnClickListener() {        	 
        @Override
            public void onClick(View v) {
               
	        	mesaj = new Dialog(_021_CustomDialog_KullanimiActivity.this);
	        	mesaj.setContentView(R.layout.bizeozeldiyalog2);
	        	mesaj.setTitle("Özelleştirilmiş Diyalog");
	        	mesaj.setCancelable(true);
                
	        	Button vazgecDugmesi = (Button) mesaj.findViewById(R.id.btn1);
                vazgecDugmesi.setOnClickListener(new OnClickListener() {
                @Override
                    public void onClick(View v) {
                	dugme2.setText("Lütfen anketemize katılın.");
                	mesaj.dismiss();
                    }
                });
                
                
                Button onayDugmesi = (Button) mesaj.findViewById(R.id.btn2);
                onayDugmesi.setOnClickListener(new OnClickListener() {
                @Override
                    public void onClick(View v) {
                	dugme2.setEnabled(false);
                	dugme2.setText("Oylama için teşekkürler");
                	mesaj.dismiss();
                    }
                });
                
                  mesaj.show();
            }
        });
        
        
        
        
    }
 }
        
    

       
 
/*       Button dugme1 =(Button) findViewById(R.id.button1);
       dugme1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {	  
			      Context mContext = getApplicationContext();
			       Dialog dialog = new Dialog(mContext);

			       dialog.setContentView(R.layout.custom_dialog);
			       dialog.setTitle("Custom Dialog");
			       dialog.show();
			}
		});*/
