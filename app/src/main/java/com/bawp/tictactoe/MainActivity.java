package com.bawp.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button button1,button2,button3, button4, button5, button6, button7, button8,button9;
    private TextView winningText;
    private Button resetButton;
    int activePlayer;
    String symbol1 = "X";
    String symbol2 = "O";
    String activeSymbol;
    public int tie =0;

    public void newGame()
    {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        activeSymbol = symbol1;
        activePlayer = 1;
        winningText.setText("Player "+ activePlayer +"'s Turn.");
    }

    public void winGame()
    {
        if((button1.getText()==button2.getText()) && (button2.getText()==button3.getText()) && (button1.getText()==symbol1 || button1.getText()==symbol2))
        {
            gameOver();
        }
        else if((button1.getText()==button4.getText()) && (button4.getText()==button7.getText()) && (button1.getText()==symbol1 || button1.getText()==symbol2))
        {
            gameOver();
        }
        else if((button1.getText()==button5.getText()) && (button5.getText()==button9.getText())&& (button1.getText()==symbol1 || button1.getText()==symbol2))
        {
            gameOver();
        }
        else if((button2.getText()==button5.getText()) && (button5.getText()==button8.getText())&& (button2.getText()==symbol1 || button2.getText()==symbol2))
        {
            gameOver();
        }
        else if((button3.getText()==button6.getText()) && (button6.getText()==button9.getText())&& (button3.getText()==symbol1 || button3.getText()==symbol2))
        {
            gameOver();
        }
        else if((button4.getText()==button5.getText()) && (button5.getText()==button6.getText())&& (button4.getText()==symbol1 || button4.getText()==symbol2))
        {
           gameOver();
        }
        else if((button3.getText()==button5.getText()) && (button5.getText()==button7.getText())&& (button3.getText()==symbol1 || button3.getText()==symbol2))
        {
            gameOver();
        }
        else if((button7.getText()==button8.getText()) && (button8.getText()==button9.getText())&& (button7.getText()==symbol1 || button7.getText()==symbol2))
        {
            gameOver();
        }
    }

    public void isTie()
    {
        if ((button1.getText()== symbol1 || button1.getText()==symbol2) && (button2.getText()== symbol1 || button2.getText()==symbol2) && (button3.getText()== symbol1 || button3.getText()==symbol2)
                && (button4.getText()== symbol1 || button4.getText()==symbol2) && (button5.getText()== symbol1 || button5.getText()==symbol2) && (button6.getText()== symbol1 || button6.getText()==symbol2)
                && (button7.getText()== symbol1 || button7.getText()==symbol2) && (button8.getText()== symbol1 || button8.getText()==symbol2) && (button9.getText()== symbol1 || button9.getText()==symbol2))
        {
            tie=1;
            gameOver();
        }
    }

    public void gameOver()
    {
        if (tie==0)
        {
            if(activePlayer==1)
            {
                winningText.setText(R.string.playerTwoWin);
            }
            else
            {
                winningText.setText(R.string.playerOneWin);
            }
        }
        else
        {
            winningText.setText(R.string.tie);
        }
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        activeSymbol = symbol1;
        activePlayer = 1;

        winningText = findViewById(R.id.winningText);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        resetButton = findViewById(R.id.resetButton);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                newGame();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                button1.setText(activeSymbol);
                button1.setEnabled(false);
                if (activeSymbol == symbol1)
                    {
                        activeSymbol = symbol2;
                    }
                else
                    {
                        activeSymbol = symbol1;
                    }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                button2.setText(activeSymbol);
                button2.setEnabled(false);
                if (activeSymbol == symbol1){
                    activeSymbol = symbol2;
                }
                else{
                    activeSymbol = symbol1;
                }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setText(activeSymbol);
                button3.setEnabled(false);
                if (activeSymbol == symbol1){
                    activeSymbol = symbol2;
                }
                else{
                    activeSymbol = symbol1;
                }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setText(activeSymbol);
                button4.setEnabled(false);
                if (activeSymbol == symbol1){
                    activeSymbol = symbol2;
                }
                else{
                    activeSymbol = symbol1;
                }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                button5.setText(activeSymbol);
                button5.setEnabled(false);
                if (activeSymbol == symbol1){
                    activeSymbol = symbol2;
                }
                else{
                    activeSymbol = symbol1;
                }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                button6.setText(activeSymbol);
                button6.setEnabled(false);
                if (activeSymbol == symbol1){
                    activeSymbol = symbol2;
                }
                else{
                    activeSymbol = symbol1;
                }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                button7.setText(activeSymbol);
                button7.setEnabled(false);
                if (activeSymbol == symbol1){
                    activeSymbol = symbol2;
                }
                else{
                    activeSymbol = symbol1;
                }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                button8.setText(activeSymbol);
                button8.setEnabled(false);
                if (activeSymbol == symbol1){
                    activeSymbol = symbol2;
                }
                else{
                    activeSymbol = symbol1;
                }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                button9.setText(activeSymbol);
                button9.setEnabled(false);
                if (activeSymbol == symbol1){
                    activeSymbol = symbol2;
                }
                else{
                    activeSymbol = symbol1;
                }
                if (activePlayer==1)
                {
                    activePlayer = 2;
                    winningText.setText(R.string.playerTwoTurn);
                }
                else
                {
                    activePlayer =1;
                    winningText.setText(R.string.playerOneTurn);
                }
                winGame();
                isTie();

            }
        });
    }
}
