package kr.co.company.explicitintent;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.layout_test);
                TextView op1 = (TextView) findViewById(R.id.option_1);
                TextView op2 = (TextView) findViewById(R.id.option_2);
                TextView op3 = (TextView) findViewById(R.id.option_3);
                TextView op4 = (TextView) findViewById(R.id.option_4);
                TextView op5 = (TextView) findViewById(R.id.option_5);
                op1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent intent = new Intent(Activity2.this,
                                        Activity3.class);
                                intent.putExtra("test", op1.getText().toString());
                                startActivity(intent);
                        }
                });
                op2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent intent = new Intent(Activity2.this,
                                        Activity3.class);
                                intent.putExtra("test", op2.getText().toString());
                                startActivity(intent);
                        }
                });
                op3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent intent = new Intent(Activity2.this,
                                        Activity3.class);
                                intent.putExtra("test", op3.getText().toString());
                                startActivity(intent);
                        }
                });
                op4.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent intent = new Intent(Activity2.this,
                                        Activity3.class);
                                intent.putExtra("test", op4.getText().toString());
                                startActivity(intent);
                        }
                });
                op5.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent intent = new Intent(Activity2.this,
                                        Activity3.class);
                                intent.putExtra("test", op5.getText().toString());
                                startActivity(intent);
                        }
                });
        }
}
