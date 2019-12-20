package com.example.myapplicationtetsintbook;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    Examenator ex=new Examenator();
    Button btn;
    Spinner spin;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.But);
        btn.setOnClickListener(this);
    }
    public void onClick(View view){
        if (view.getId()==R.id.But) {
            spin = findViewById(R.id.Spinner);
            text = findViewById(R.id.Text);
            String s = String.valueOf(spin.getSelectedItem());
            StringBuilder str = new StringBuilder();
            for (String ans : ex.GetExams(s)) {
                str.append(ans);
                str.append('\n');
            }
            text.setText(str);
        }
    }
}
