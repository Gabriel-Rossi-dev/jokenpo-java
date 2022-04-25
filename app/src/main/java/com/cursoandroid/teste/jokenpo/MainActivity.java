package com.cursoandroid.teste.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectedRock (View view){

        this.selectedOption("pedra");
    }

    public void selectedPaper(View view){

        this.selectedOption("papel");
    }

     public void selectedScissors(View view){

        this.selectedOption("tesoura");
     }

     public void selectedOption(String optionSelected){

         ImageView resultedImage = findViewById(R.id.resultImage);
         TextView resultedChoise = findViewById(R.id.resultChoise);

        int number = new Random().nextInt(3);
        String[] choice = {"pedra", "papel", "tesoura"};
        String appChoise = choice[number];

      switch ( appChoise ){
          case "pedra":
              resultedImage.setImageResource(R.drawable.pedra);
              break;
          case "papel":
              resultedImage.setImageResource(R.drawable.papel);
              break;
          case "tesoura":
              resultedImage.setImageResource(R.drawable.tesoura);
              break;
      }




         if(
             (optionSelected == "pedra" && appChoise == "tesoura" )||
             (optionSelected == "papel" && appChoise == "pedra" )	||
             (optionSelected == "tesoura" && appChoise == "papel" )
         ){
             resultedChoise.setText("Você ganhou!! :)");
         }else if(
             (optionSelected == "pedra" && appChoise == "papel" ) ||
             (optionSelected == "papel" && appChoise == "tesoura" ) ||
             (optionSelected == "tesoura" && appChoise == "pedra" )
         ){
             resultedChoise.setText("Você perdeu :(");
         }else{
             resultedChoise.setText("Empate");
         }


     }

}
