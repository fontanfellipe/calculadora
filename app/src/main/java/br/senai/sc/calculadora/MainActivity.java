package br.senai.sc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView  display;
    private String firstNumber = "";
    private String secondNumber = "";
    private String operation = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tv_display);
    }

    public void onClickBtn1(View v) {
        updateTypedNumber("1");
        updateDisplay("1");
    }

    public void onClickBtn2(View v){
        updateTypedNumber("2");
        updateDisplay("2");
    }

    public void onClickBtn3(View v){
        updateTypedNumber("3");
        updateDisplay("3");
    }

    public void onClickBtn4(View v){
        updateTypedNumber("4");
        updateDisplay("4");
    }

    public void onClickBtn5(View v){
        updateTypedNumber("5");
        updateDisplay("5");
    }

    public void onClickBtn6(View v){
        updateTypedNumber("6");
        updateDisplay("6");
    }

    public void onClickBtn7(View v){
        updateTypedNumber("7");
        updateDisplay("7");
    }

    public void onClickBtn8(View v){
        updateTypedNumber("8");
        updateDisplay("8");
    }

    public void onClickBtn9(View v){
        updateTypedNumber("9");
        updateDisplay("9");
    }

    public void onClickBtn0(View v){
        updateTypedNumber("0");
        updateDisplay("0");
    }

    public void onClickAdicao(View v){
        operation = "+";
        updateDisplay("+");
    }

    public void onClickSubtracao(View v){
        operation = "-";
        updateDisplay("-");
    }

    public void onClickMultiplicao(View v){
        operation = "x";
        updateDisplay("x");
    }

    public void onClickDivisao(View v){
        operation = "/";
        updateDisplay("÷");
    }

    public void onClickEqual(View v) {

        if(!firstNumber.isEmpty() && !secondNumber.isEmpty()){
            int numberOne = Integer.parseInt(firstNumber);
            int numberTwo = Integer.parseInt(secondNumber);
            if(operation.equals("+")){
                int result = numberOne + numberTwo;
                display.setText(String.valueOf(result));
            } else if(operation.equals("-")){
                int result = numberOne - numberTwo;
                display.setText(String.valueOf(result));
            } else if(operation.equals("x")){
                int result = numberOne * numberTwo;
                display.setText(String.valueOf(result));
            } else if(operation.equals("/")){
                    if(numberTwo == 0) {
                        Toast.makeText(MainActivity.this, "Não é possivel dividir um número por zero", Toast.LENGTH_LONG).show();
                    } else {
                        int result = numberOne / numberTwo;
                        display.setText(String.valueOf(result));
                    }
            }
        } else {
            Toast.makeText(MainActivity.this,"nenhuma operação foi solicitada", Toast.LENGTH_LONG).show();
        }

    }

    private void updateTypedNumber(String number) {
        if(operation.isEmpty()) {
            firstNumber = firstNumber + number;
        } else {
            secondNumber = secondNumber + number;
        }
    }

    private void updateDisplay(String text){
        String textDisplay = display.getText().toString();
        textDisplay = textDisplay + text;
        display.setText(textDisplay);
    }
}