package tr.com.firmaadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class _002_Button_KullanimiActivity extends Activity {
    /** Called when the activity is first created. */
	private Button dugme;
	private TextView yaziEtiketi;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        dugme = (Button)findViewById(R.id.button1);
        yaziEtiketi = (TextView)findViewById(R.id.textview1);
        
        dugme.setOnClickListener(dugmeTiklanmasiniDinleyenMetotAdi);
        
    }
    
    private OnClickListener dugmeTiklanmasiniDinleyenMetotAdi = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			yaziEtiketi.setText("www.umuttepeyayinlari.com");
			dugme.setText("ANDROID");
		}
	};
}