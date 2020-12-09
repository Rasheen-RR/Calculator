package com.infinium.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,
            btnSeven, btnEight, btnNine, btnAdd, btnSub, btnDivision,
            btnMul, btnC, btnDel, btnEqual, btnDecimal;

    EditText editInput, editAns;

    double numberOne, numberTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDivision = findViewById(R.id.btnDivision);
        btnMul = findViewById(R.id.btnMul);
        btnC = findViewById(R.id.btnC);
        btnDel = findViewById(R.id.btnDel);
        btnEqual = findViewById(R.id.btnEqual);
        btnDecimal = findViewById(R.id.btnDecimal);


        editInput = findViewById(R.id.editInput);
        editAns = findViewById(R.id.editAns);


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "0");

            }
        });


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "1");
            }
        });


        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "8");
            }
        });


        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    editInput.setText(editInput.getText() + "9");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editInput.getText().toString();
                if(!input.equals("")) {
                    if (!(input.substring(input.length() - 1).equals("-")) && !(input.substring(input.length() - 1).equals("+")) && !(input.substring(input.length() - 1).equals("/"))  && !(input.substring(input.length() - 1).equals("*"))) {
                        editInput.setText(editInput.getText() + "+");
                    }
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editInput.getText().toString();
                if(!input.equals("")) {
                    if (!(input.substring(input.length() - 1).equals("-")) && !(input.substring(input.length() - 1).equals("+")) && !(input.substring(input.length() - 1).equals("/"))  && !(input.substring(input.length() - 1).equals("*"))) {
                        editInput.setText(editInput.getText() + "-");
                    }
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editInput.getText().toString();
                if(!input.equals("")) {
                    if (!(input.substring(input.length() - 1).equals("-")) && !(input.substring(input.length() - 1).equals("+")) && !(input.substring(input.length() - 1).equals("/"))  && !(input.substring(input.length() - 1).equals("*"))) {
                        editInput.setText(editInput.getText() + "*");
                    }
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editInput.getText().toString();
                if(!input.equals("")){
                    if (!(input.substring(input.length() - 1).equals("-")) && !(input.substring(input.length() - 1).equals("+")) && !(input.substring(input.length() - 1).equals("/"))  && !(input.substring(input.length() - 1).equals("*"))) {
                        editInput.setText(editInput.getText() + "/");
                    }
                }
            }
        });


        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editInput.getText().toString();
                if(!input.equals("")) {
                    String[] parts = input.split("(?=[/*+-])|(?<=[/*+-])");
                    if(parts.length > 0){
                        String result = parts[parts.length - 1];
                        if(!(result.contains("."))){
                            editInput.setText(editInput.getText() + ".");
                        }
                    }else{
                        if (!(input.substring(input.length() - 1).equals("."))) {
                            editInput.setText(editInput.getText() + ".");
                        }
                    }
                }else{
                    editInput.setText(editInput.getText() + ".");
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText("");
                editAns.setText("");
            }
        });


        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editInput.setText(removeCharacter(editInput.getText().toString()));
                editAns.setText("");
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    editAns.setText(getResult());
                }catch (Exception ex){
                    editAns.setText("Invalid Equation");
                }
            }
        });

    }






    public String getResult(){
       String eq = editInput.getText().toString();

        String[] parts = eq.split("(?=[/*+-])|(?<=[/*+-])");

        double result = Double.parseDouble(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            String op = parts[i];
            double val = Double.parseDouble(parts[i+1]);
            switch (op) {
                case "*" :
                    result *= val;
                    break;
                case "/" :
                    result /= val;
                    break;
                case "+" :
                    result += val;
                    break;
                case "-" :
                    result -= val;
                    break;
            }
        }

       if(result % 1 == 0){
           return String.valueOf((int) result);
       }else {
           return String.valueOf(result);
       }
    }

    public static String removeCharacter(String equation) {
        return (equation == null || equation.length() == 0)
                ? null
                : (equation.substring(0, equation.length() - 1));
    }

}