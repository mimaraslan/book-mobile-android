package com.siteadi;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class _012_ListView_KullanimiActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
         
        ListView listviewNesnesi;
   
        String ogrDizisi [] = getResources().getStringArray(R.array.ogerncilerListesi);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.listele ,ogrDizisi) );
       
        listviewNesnesi = getListView();
        listviewNesnesi.setTextFilterEnabled(true);
  
        listviewNesnesi.setOnItemClickListener(new OnItemClickListener() {

    		@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
						
				 view.setPadding(25, 10, 10, 10);
		
				Toast.makeText(getApplicationContext(), 
						"Öğrenci Adı Soyadı : "+((TextView) view).getText(), 
						Toast.LENGTH_SHORT).show();
			}
		});
    }
}