package com.example.administrator.nope;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText in=(EditText) findViewById(R.id.input);
        final TextView out=(TextView)findViewById(R.id.output);
        Button c=(Button) findViewById(R.id.click);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String k=in.getText().toString();
                Drawable u=out.getBackground();
                int t2=in.getCurrentTextColor();
                int t1=out.getCurrentTextColor();
                in.setTextColor(t1);
                out.setBackground(in.getBackground());
                in.setBackground(u);
                out.setTextColor(t2);
             String l= new StringBuilder(k).reverse().toString();
             out.setText(l);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("RVRS",l);
                startActivity(intent);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
