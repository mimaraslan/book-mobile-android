package net.sirketadi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class _003_TextView_KullanimiActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button dugmemiz = (Button)findViewById(R.id.button1);
        final TextView yaziEtiketAlaniVarsayilan= (TextView)findViewById(R.id.textView1);
        final TextView yaziEtiketAlaniBuyuk= (TextView)findViewById(R.id.textView2);
        final TextView yaziEtiketAlaniOrta= (TextView)findViewById(R.id.textView3);
        final TextView yaziEtiketAlaniKucuk= (TextView)findViewById(R.id.textView4);
        
        dugmemiz.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			yaziEtiketAlaniVarsayilan.setText("Güzel gören");
			yaziEtiketAlaniBuyuk.setText("Güzel düşünür.");
			yaziEtiketAlaniOrta.setText("Güzel düşünen");
			yaziEtiketAlaniKucuk.setText("Hayatından lezzet alır.");
			dugmemiz.setText("B.S.N.");
				
			}
		});
        
    }
}