package com.rujirakongsomran.imageanalyzeazurecomputervision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button btnProcess;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
        imageView = (ImageView) findViewById(R.id.imageView);
        btnProcess = (Button) findViewById(R.id.btnProcess);
        txtResult = (TextView) findViewById(R.id.txtResult);
    }
}
