package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAC,badd,bsub,bmul,bdiv,bdot,bper,badsub,bequalto;
    TextView ans;
    double var1,var2;
    boolean add,sub,mul,div,per;
    int q=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        b3=(Button) findViewById(R.id.btn3);
        b4=(Button) findViewById(R.id.btn4);
        b5=(Button) findViewById(R.id.btn5);
        b6=(Button) findViewById(R.id.btn6);
        b7=(Button) findViewById(R.id.btn7);
        b8=(Button) findViewById(R.id.btn8);
        b9=(Button) findViewById(R.id.btn9);
        b0=(Button) findViewById(R.id.btn0);
        badd=(Button) findViewById(R.id.btnadd);
        bsub=(Button) findViewById(R.id.btnsub);
        bmul=(Button) findViewById(R.id.btnmul);
        bdiv=(Button) findViewById(R.id.btndiv);
        bper=(Button) findViewById(R.id.btnper);
        badsub=(Button) findViewById(R.id.btnadsub);
        bdot=(Button) findViewById(R.id.btndot);
        bequalto=(Button) findViewById(R.id.btnequalto);
        bAC=(Button) findViewById(R.id.btnAC);

        ans = (TextView) findViewById(R.id.answer);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(ans.getText()+"0");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                try {
                    var1 = Double.parseDouble(ans.getText() + "");
                    add = true;
                    ans.setText(null);
                    q=0;
                }catch(Exception e){

                }


            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    var1 = Double.parseDouble(ans.getText() + "");
                    sub = true;
                    ans.setText(null);
                    q=0;
                }catch(Exception e){

                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    var1 = Double.parseDouble(ans.getText() + "");
                    mul = true;
                    ans.setText(null);
                    q=0;
                }catch (Exception e){
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    var1 = Double.parseDouble(ans.getText() + "");
                    div = true;
                    ans.setText(null);
                    q=0;
                }catch (Exception e){
                }
            }
        });
        bper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    var1 = Double.parseDouble(ans.getText() + "");
                    per = true;
                    ans.setText(null);
                    q=0;
                }catch(Exception e){
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick (View view){
                if(q<1){
                    ans.setText(ans.getText() + ".");
                    q++;
                }
                  else{
                      Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }

            }
        });

        bequalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ans.setText(ans.getText() + "");
                    var2 = Double.parseDouble(ans.getText() + "");
                    if (add == true) {
                        ans.setText(var1 + var2 + "");
                        add = false;
                    } else if (sub == true) {
                        ans.setText(var1 - var2 + "");
                        sub = false;
                    } else if (mul == true) {
                        ans.setText(var1 * var2 + "");
                        mul = false;
                    } else if (div == true) {
                        ans.setText(var1 / var2 + "");
                        div = false;
                    } else if (per == true) {
                        ans.setText(var1 % var2 + "");
                    }
                    q=0;
                }catch(Exception e) {

                }
            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ans.setText(null);
            q=0;
            }
        });

    }
}
