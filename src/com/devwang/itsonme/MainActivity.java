package com.devwang.itsonme;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void addListenerOnButton(){
    	final Context context=this;
    	add=(Button) findViewById(R.id.button1);
    	
    	add.setOnClickListener(new OnClickListener(){
    		@Override
    		public void onClick(View arg0){
    			Intent intent=new Intent(context,AddNew.class);
    			startActivity(intent);
    		}
    	});
    }
    
}
