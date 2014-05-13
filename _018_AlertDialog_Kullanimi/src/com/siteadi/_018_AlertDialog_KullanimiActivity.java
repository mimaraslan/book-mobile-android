package com.siteadi;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class _018_AlertDialog_KullanimiActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button dugme1 = (Button)findViewById(R.id.button1);
        dugme1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			  
				// prepare the alert box
		        AlertDialog.Builder alertbox = new AlertDialog.Builder(_018_AlertDialog_KullanimiActivity.this);

		        // set the message to display
		        alertbox.setMessage("Tek düğmeli AlertDialog mesajı !");

		        // add a neutral button to the alert box and assign a click listener
		        alertbox.setNeutralButton("Evet", new DialogInterface.OnClickListener() {

		            // click listener on the alert box
		            public void onClick(DialogInterface arg0, int arg1) {
		                // the button was clicked
		                Toast.makeText(getApplicationContext(), 
		                		"Evet düğmesine basıldı.", 
		                		Toast.LENGTH_LONG).show();
		            }
		        });
				// show it
		        alertbox.show();
			}
		});
        
        
        
        
        Button dugme2 = (Button)findViewById(R.id.button2);
   
        
        
        dugme2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			  
				// prepare the alert box
	            AlertDialog.Builder alertbox = new AlertDialog.Builder(_018_AlertDialog_KullanimiActivity.this);
	 
	            // set the message to display
	            alertbox.setMessage("İki düğmeli AlertDialog mesajı!");
	 
	            // set a positive/yes button and create a listener
	            alertbox.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
	 
	                // do something when the button is clicked
	                public void onClick(DialogInterface arg0, int arg1) {
	                    Toast.makeText(getApplicationContext(), 
	                    		"Evet düğmesine basıldı.", 
	                    		Toast.LENGTH_SHORT).show();
	                }
	            });
	 
	            // set a negative/no button and create a listener
	            alertbox.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
	 
	                // do something when the button is clicked
	                public void onClick(DialogInterface arg0, int arg1) {
	                    Toast.makeText(getApplicationContext(), 
	                    		"İptal düğmesine basıldı.", 
	                    		Toast.LENGTH_SHORT).show();
	                }
	            });
	 
	            // display box
	            alertbox.show();
			}
		});
        
        
        
        
        Button dugme3 = (Button)findViewById(R.id.button3);   

        dugme3.setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick(View v) {
			  
			      final CharSequence[] items = {"Java", "Xml", "SQLite", "Eclipse IDE"};

		            final AlertDialog.Builder alertbox = new AlertDialog.Builder(_018_AlertDialog_KullanimiActivity.this);
		            alertbox.setTitle("ANDROID PROGRAMLAMA");
		            alertbox.setItems(items, new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int item) {
		                    Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
		                }
	            });
	 
	            // display box
	            alertbox.show();
			}
		});
        
        
    
        Button dugme4 = (Button)findViewById(R.id.button4); 
        dugme4.setOnClickListener(new OnClickListener() {
        	@Override
			public void onClick(View v) {
			  
			      final CharSequence[] items = {"Java", "Xml", "SQLite", "Eclipse IDE"};

		            final AlertDialog.Builder alertbox = new AlertDialog.Builder(_018_AlertDialog_KullanimiActivity.this);
		            alertbox.setTitle("ANDROID PROGRAMLAMA");
		            alertbox.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
		                public void onClick(DialogInterface dialog, int item) {
		                    Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
		                }
	            });
	 
	            // display box
	            alertbox.show();
			}
		});
         

    }
}