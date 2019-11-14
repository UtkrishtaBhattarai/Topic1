package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnpoint, btnresult, btnadd, btnsub, btnmultiply, btndivide, btn0;
    EditText etdisplay;
    public int textone, texttwo;
    TextView textcheckSum;
    public int symbol = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnpoint = findViewById(R.id.btnpoint);
        btndivide = findViewById(R.id.btndivide);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmultiply = findViewById(R.id.btnmultiply);
        btnresult = findViewById(R.id.btnresult);
        etdisplay = findViewById(R.id.etdisplay);

        textcheckSum = findViewById(R.id.sumcheck);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symbol = 1;
                textone = Integer.parseInt(etdisplay.getText().toString());
                etdisplay.getText().clear();
                textcheckSum.setText(textone + "+");
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symbol = 2;
                textone = Integer.parseInt(etdisplay.getText().toString());
                etdisplay.getText().clear();
                textcheckSum.setText(textone + "-");
            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                symbol = 3;
                textone = Integer.parseInt(etdisplay.getText().toString());
                etdisplay.getText().clear();
                textcheckSum.setText(textone + "*");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divideresult();
            }
        });


        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttwo = Integer.parseInt(etdisplay.getText().toString());
                hulu();
                if (symbol == 1) {
                    addResult();
                } else if (symbol == 2) {
                    subractresult();
                } else if (symbol == 3) {
                    multiplyresult();
                } else if (symbol == 4) {
                    divideresult();
                }


            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "0");
            }
        });
    }

    public void hulu() {
        textcheckSum.setText(textone + "+" + texttwo);
    }

    public void addResult() {
        Integer result = textone + texttwo;
        etdisplay.setText(String.valueOf(result));
    }

    public void subractresult() {
        Integer result = textone - texttwo;
        etdisplay.setText(String.valueOf(result));
    }

    public void multiplyresult() {
        Integer result = textone * texttwo;
        etdisplay.setText(String.valueOf(result));
    }

    public void divideresult() {
        Integer result = textone / texttwo;
        etdisplay.setText(String.valueOf(result));
    }

}
