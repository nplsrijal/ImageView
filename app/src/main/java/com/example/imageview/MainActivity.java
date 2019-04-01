package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rdoDaya,rdoRajesh,rdoNischal;

    private RadioGroup rbtn_actor;
    private ImageView image_load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_load=findViewById(R.id.image_load);
        rbtn_actor =findViewById(R.id.rbtn_actor);
        rdoDaya=findViewById(R.id.rdoDaya);
        rdoRajesh=findViewById(R.id.rdoRajesh);
        rdoNischal=findViewById(R.id.rdoNischal);

        rdoDaya.setOnClickListener(this);
        rdoRajesh.setOnClickListener(this);
        rdoNischal.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.rdoDaya:
              Toast toast =Toast.makeText(this,"Daya Hang Rai",Toast.LENGTH_LONG);
              toast.show();
              break;
            case R.id.rdoRajesh:

                break;
            case R.id.rdoNischal:

                break;
        }


    }
}
