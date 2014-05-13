package com.firmaadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class _001_Toast_KullanimiActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button btnNesnesi = (Button)findViewById(R.id.button1);
        btnNesnesi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(_001_Toast_KullanimiActivity.this, "Toast Mesajı", Toast.LENGTH_LONG).show();		
			}
		});
 
    }
}