package com.siteadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class _016_SubMenu_KullanimiActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater menuInflater=getMenuInflater();
		menuInflater.inflate(R.menu.altmenuler, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()) {
		
		case R.id.item1:
		case R.id.item2: optionMenuSecildi(); break;
		
		case R.id.item3: menu3Secildi();	break;
		
		case R.id.item4:
		case R.id.item5:
		case R.id.item6:
		case R.id.item7:
		case R.id.item8:
		case R.id.item9:
		case R.id.item10: optionMenuSecildi(); break;

		case R.id.item11:subMenuSecildi();	break;
		
		case R.id.item12:menu12Secildi();	break;
		
		case R.id.item13:
		case R.id.item14: subMenuSecildi();	break;
		
		case R.id.item15:
		case R.id.item16: optionMenuSecildi(); break;
		
		case R.id.item17:
		case R.id.item18: subMenuSecildi();	break;
		
		case R.id.item19: optionMenuSecildi(); break;
		
		case R.id.item20:
		case R.id.item21: hangisubMenuSecildi(item.getTitle()); break;
		case R.id.item22:
		case R.id.item23:			
		case R.id.item24: subMenuSecildi(); break;
		}

		return super.onOptionsItemSelected(item);
	}

	private void optionMenuSecildi() {
		Toast.makeText(getApplicationContext(), 
				"Herhangi bir OptionMenu seçildi.", 
				Toast.LENGTH_SHORT).show();
	}

	private void subMenuSecildi() {
		Toast.makeText(getApplicationContext(), 
				"Herhangi bir SubMenu seçildi.",
				Toast.LENGTH_SHORT).show();
	}

	private void menu3Secildi() {
		Toast.makeText(getApplicationContext(),
				R.string.menu3, 
				Toast.LENGTH_SHORT).show();
		optionMenuSecildi();
	}
	
	private void menu12Secildi() {
		Toast.makeText(getApplicationContext(),
				R.string.menu12, 
				Toast.LENGTH_SHORT).show();
		subMenuSecildi();
	}
	
	private void hangisubMenuSecildi(CharSequence charSequence) {
		Toast.makeText(getApplicationContext(),
				charSequence, 
				Toast.LENGTH_SHORT).show();
		subMenuSecildi();
	}
	
	
}