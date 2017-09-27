package jmendez.escoladeltreball.org.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button) findViewById(R.id.btn_clickMe);
        button2 = (Button) findViewById(R.id.button);
        //alternative1

/*        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };

        button.setOnClickListener(listener);*/

    //alternative2

//       button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Hola Mundo!", Toast.LENGTH_LONG).show();
//
//            }
//        });


    //lambda expretion

        button.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Hola Mundo!", Toast.LENGTH_LONG).show() );
        button2.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Hola mundo 2", Toast.LENGTH_SHORT).show() );

    }

    //alternative3
//    public void btn_clickOnClick(View view){
//        Toast.makeText(this, "Hola Mundo!", Toast.LENGTH_LONG).show();
//    }
}
