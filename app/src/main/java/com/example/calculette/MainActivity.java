package com.example.calculette;


/*import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText fistNb, secondeNb ;
    TextView result ;
    RadioButton plus , moins , multi , devise ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fistNb = findViewById(R.id.firstNb);
        secondeNb = findViewById(R.id.secondeNb);
        result = findViewById(R.id.result);
        plus = findViewById(R.id.plus);
        moins = findViewById(R.id.moins);
        multi = findViewById(R.id.multiplier);
        devise = findViewById(R.id.deviser);


    }

  /*  public void calculer(View view) {

        float nb1 = Float.parseFloat(fistNb.getText().toString());
        float nb2 = Float.parseFloat(secondeNb.getText().toString());
        float calcul;
        if(plus.isChecked()){
            calcul = nb1 + nb2 ;
            result.setText( calcul+"");
        }
        else if(moins.isChecked()){
            calcul = nb1 - nb2 ;
            result.setText( calcul+"");
        }
        else if(multi.isChecked()){
            calcul = nb1 * nb2 ;
            result.setText( calcul+"");
        }
        else if(devise.isChecked()){
            calcul = nb1 / nb2 ;
            result.setText( calcul+"");
        }
        else{
            result.setText( "Vous devez choisir une operation !");

        }*/

    }


