package com.softwaresolutions.tictoy;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Button buselected;
    int cellID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, bexit;
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        bexit = findViewById(R.id.ebtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 1;
                buselected = findViewById(R.id.btn1);
                Playgame(cellID, buselected);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 2;
                buselected = findViewById(R.id.btn2);
                Playgame(cellID, buselected);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 3;
                buselected = findViewById(R.id.btn3);
                Playgame(cellID, buselected);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 4;
                buselected = findViewById(R.id.btn4);
                Playgame(cellID, buselected);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 5;
                buselected = findViewById(R.id.btn5);
                Playgame(cellID, buselected);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 6;
                buselected = findViewById(R.id.btn6);
                Playgame(cellID, buselected);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 7;
                buselected = findViewById(R.id.btn7);
                Playgame(cellID, buselected);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 8;
                buselected = findViewById(R.id.btn8);
                Playgame(cellID, buselected);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cellID = 9;
                buselected = findViewById(R.id.btn9);
                Playgame(cellID, buselected);
            }
        });

        bexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Home.class);
                startActivity(in);
                finish();
            }
        });

    }

    ArrayList<Integer>Player1 = new ArrayList<>();
    ArrayList<Integer>Player2 = new ArrayList<>();
    int ActivePlayer = 1;
    public void Playgame(int cellID, Button buselected){
        if(ActivePlayer == 1){
            buselected.setText("O");
            buselected.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            Player1.add(cellID);
            ActivePlayer = 2;
            AutoPlay();
        }

        else {
            buselected.setText("X");
            buselected.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            Player2.add(cellID);
            ActivePlayer = 1;
        }
        CheckWinner();
    }

    public void CheckWinner(){
        int Winner = -1;
        //row 1 for Player 1
        if(Player1.contains(1) && Player1.contains(2) && Player1.contains(3)){
            Winner = 1;
        }
        //row 2 for Player 1
        else if(Player1.contains(4) && Player1.contains(5) && Player1.contains(6)){
            Winner = 1;
        }
        //row 3 for Player1
        else if(Player1.contains(7) && Player1.contains(8) && Player1.contains(9)){
            Winner = 1;
        }
        //row 1 for Player2
        else if(Player2.contains(1) && Player2.contains(2) && Player2.contains(3)){
            Winner = 2;
        }
        //row 2 for Player2
        else if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6)){
            Winner = 2;
        }
        //row 3 for Player2
        else if(Player2.contains(7) && Player2.contains(8) && Player2.contains(9)){
            Winner = 2;
        }
        //colum 1 for Player1
        else if(Player1.contains(1) && Player1.contains(4) && Player1.contains(7)){
            Winner = 1;
        }
        //colum 2 for Player1
        else if(Player1.contains(2) && Player1.contains(5) && Player1.contains(8)){
            Winner = 1;
        }
        //colum 3 for Player1
        else if(Player1.contains(3) && Player1.contains(6) && Player1.contains(9)){
            Winner = 1;
        }
        //colum 1 for Player2
        else if(Player2.contains(1) && Player2.contains(4) && Player2.contains(7)){
            Winner = 2;
        }
        //colum 2 for Player2
        else if(Player2.contains(2) && Player2.contains(5) && Player2.contains(8)){
            Winner = 2;
        }
        //colum 3 for Player2
        else if(Player2.contains(3) && Player2.contains(6) && Player2.contains(9)){
            Winner = 2;
        }
        //cross 1 for Player1
        else if (Player1.contains(1) && Player1.contains(5) && Player1.contains(9)) {
            Winner = 1;
        }
        //cross 2 for Player1
        else if(Player1.contains(3) && Player1.contains(5) && Player1.contains(7)){
            Winner = 1;
        }
        //cross 1 for Player2
        else if(Player2.contains(1) && Player2.contains(5) && Player2.contains(9)){
            Winner = 2;
        }
        //cross 2 for Player2
        else if(Player2.contains(3) && Player2.contains(5) && Player2.contains(7)){
            Winner = 2;
        }
        if(Winner != -1){
            if(Winner == 1){
                Toast.makeText(MainActivity.this, "Player-1 is the Winner", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Player-2 is the Winner", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void AutoPlay(){
        ArrayList<Integer>emptycells = new ArrayList<>();
        for(cellID = 1; cellID<=9; cellID++) {
            if (!Player1.contains(cellID) || Player2.contains(cellID)) {
                emptycells.add(cellID);
            }
        }
        Random r = new Random();
        int randindex = r.nextInt(emptycells.size());
        int cellID = emptycells.get(randindex);
        Button buselected;

        switch (cellID){
            case 1:
                buselected = findViewById(R.id.btn1);
                break;
            case 2:
                buselected = findViewById(R.id.btn2);
                break;
            case 3:
                buselected = findViewById(R.id.btn3);
                break;
            case 4:
                buselected = findViewById(R.id.btn4);
                break;
            case 5:
                buselected = findViewById(R.id.btn5);
                break;
            case 6:
                buselected = findViewById(R.id.btn6);
                break;
            case 7:
                buselected = findViewById(R.id.btn7);
                break;
            case 8:
                buselected = findViewById(R.id.btn8);
                break;
            case 9:
                buselected = findViewById(R.id.btn9);
                break;
            default:
                buselected = findViewById(R.id.btn1);
                break;
        }
        Playgame(cellID, buselected);

    }
}
