package com.example.game3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3,button4,button5,button6,button7 ,button8, button9;
    TextView textView;
    String krest[][] = {{"","",""} ,{"","",""}, {"","",""}};
    String znak,znak1;
    int r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
        znak = "X";
        znak1 ="O";
    }

    //Ходы человека

    public void k1(View v){
        krest[0][0] = znak;
        button.setText(znak);
        button.setEnabled(false);
        proverka();
        obrot_hod();
    }

    public void k2(View v){
        krest[0][1] = znak;
        button2.setText(znak);
        button2.setEnabled(false);
        proverka();
        obrot_hod();
    }

    public void k3(View v){
        krest[0][2] = znak;
        button3.setText(znak);
        button3.setEnabled(false);
        proverka();
        obrot_hod();
    }


    public void k4(View v){
        krest[1][0] = znak;
        button4.setText(znak);
        button4.setEnabled(false);
        proverka();
        obrot_hod();
    }

    public void k5(View v){
        krest[1][1] = znak;
        button5.setText(znak);
        button5.setEnabled(false);
        proverka();
        obrot_hod();
    }



    public void k6(View v){
        krest[1][2] = znak;
        button6.setText(znak);
        button6.setEnabled(false);
        proverka();
        obrot_hod();
    }


    public void k7(View v){
        krest[2][0] = znak;
        button7.setText(znak);
        button7.setEnabled(false);
        proverka();
        obrot_hod();
    }
    public void k8(View v){
        krest[2][1] = znak;
        button8.setText(znak);
        button8.setEnabled(false);
        proverka();
        obrot_hod();
    }
    public void k9(View v) {
        krest[2][2] = znak;
        button9.setText(znak);
        button9.setEnabled(false);
        proverka();
        obrot_hod();
    }

    //Ходы компьютера

    public void random_comp(){
        r1 = (int) (0+(Math.random()*3));
        r2 = (int) (0+(Math.random()*3));
    }

    public void obrot_hod(){
        random_comp();

        if (krest[r1][r2].equals("X")||krest[r1][r2].equals("O"));
        random_comp();

        krest [r1][r2] = znak1;
        smort();
        proverka();
        onStart();
    }
    public void smort(){
        button.setText(krest[0][0]);
        button2.setText(krest[0][1]);
        button3.setText(krest[0][2]);
        button4.setText(krest[1][0]);
        button5.setText(krest[1][1]);
        button6.setText(krest[1][2]);
        button7.setText(krest[2][0]);
        button8.setText(krest[2][1]);
        button9.setText(krest[2][2]);

    }

   public void proverka(){
        if ((button.getText().equals("X") && button2.getText().equals("X") && button3.getText().equals("X"))){
            textView.setText("Игрок победил!!!");
        }

       if ((button.getText().equals("X") && button4.getText().equals("X") && button7.getText().equals("X"))){
           textView.setText("Игрок победил!!!");
       }

       if ((button.getText().equals("X") && button5.getText().equals("X") && button9.getText().equals("X"))){
           textView.setText("Игрок победил!!!");
       }
   }
}