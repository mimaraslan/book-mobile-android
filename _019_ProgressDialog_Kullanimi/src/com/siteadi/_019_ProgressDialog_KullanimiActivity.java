package com.siteadi;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class _019_ProgressDialog_KullanimiActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button dugme1 = (Button)findViewById(R.id.button1);
        dugme1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			    
				ProgressDialog dialog = ProgressDialog.show(_019_ProgressDialog_KullanimiActivity.this, "", 
		                     "Yükleniyor...1.YOL", true); 
	            dialog.setCancelable(true);
			}
		});  
//----------------------------------- 
        Button dugme2= (Button)findViewById(R.id.button2);
        dugme2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// prepare the dialog box
	            ProgressDialog dialog = new ProgressDialog(_019_ProgressDialog_KullanimiActivity.this);
	            // make the progress bar cancelable
	            dialog.setCancelable(true);
	            // set a message text
	            dialog.setMessage("Yükleniyor...2.YOL");
	            // show it
	            dialog.show();
			}
		});
//----------------------------------- 
        Button dugme3= (Button)findViewById(R.id.button3);
        dugme3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
		        ProgressDialog progressDialog;
		        progressDialog = new ProgressDialog(_019_ProgressDialog_KullanimiActivity.this);
		        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
		        progressDialog.setMessage("Yükleniyor...ProgressBar");
		        progressDialog.setCancelable(false);
		        progressDialog.show();
			}
		});
        

        
    }
}