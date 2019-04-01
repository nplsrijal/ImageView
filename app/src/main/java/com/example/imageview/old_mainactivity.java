package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class old_mainactivity extends AppCompatActivity {
    private RadioButton rbtn_daya,rbtn_rajesh,rbtn_nischal,rbtn;

    private RadioGroup rbtn_actor;
    private ImageView image_load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_load=findViewById(R.id.image_load);
        rbtn_actor =findViewById(R.id.rbtn_actor);
        rbtn_actor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                int selectedID =rbtn_actor.getCheckedRadioButtonId();

                rbtn=findViewById(selectedID);

               // String val=rbtn.getText().toString();
//                switch(selectedID)
//                {
//                    case R.id.rbtn_daya:
//                        break;
//                    case R.id.rbtn_nischal;
//                        break;
//                        case R.id.rbtn_nischal;
//                        break;
//                }











            }

        });



    }
}
