package com.siteadi;

import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class _017_ContextMenu_KullanimiActivity extends Activity {
	private String[] ogrDizisi;

	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    ogrDizisi = getResources().getStringArray(R.array.ogerncilerListesi);
	    Arrays.sort(ogrDizisi);

	    ListView listviewNesnesi = (ListView)findViewById(R.id.listView1);
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listemiz, ogrDizisi);
	    listviewNesnesi.setAdapter(adapter);
	    registerForContextMenu(listviewNesnesi);
    } 
	  
	  public void onCreateContextMenu(ContextMenu menu, View v,
	      ContextMenuInfo menuInfo) {
	    if (v.getId()==R.id.listView1) {
	      AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)menuInfo;
	      menu.setHeaderTitle(ogrDizisi[info.position]);
	      String[] menuItems = getResources().getStringArray(R.array.ogerncilerListesi);
	      for (int i = 0; i<menuItems.length; i++) {
	        menu.add(Menu.NONE, i, i, menuItems[i]);
	      }
	    }
	  }
	  
	  
	  public boolean onContextItemSelected(MenuItem item) {
	    AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
	    int menuItemIndex = item.getItemId();
	    String[] menuItems = getResources().getStringArray(R.array.ogerncilerListesi);
	    String menuItemName = menuItems[menuItemIndex];
	    String listItemName = ogrDizisi[info.position];

	    TextView text = (TextView)findViewById(R.id.footer);
	    text.setText(String.format("Proje Yöneticisi : %s    Proje Sözcüsü : %s", listItemName, menuItemName));
	    return true;
	  }  
	  
}

