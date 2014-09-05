package br.com.example.olamundo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OlaMundoActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
		
		
		
		EditText findViewById = (EditText) findViewById(R.id.campo);
		Button botao = (Button) findViewById(R.id.botao);
		
		botao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.i("TAG", "Botão Clicado!");
				Toast.makeText(OlaMundoActivity.this, "Oi ! :D", Toast.LENGTH_LONG).show();
			}
		});
		
	}

}
