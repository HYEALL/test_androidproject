package kr.co.company.explicitintent;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.layout_selection);

                String [] test1 = {"담배","아이스캔디","우동/국수"};
                String [] test2 = {"태양","전구","돈"};
                String [] test3 = {"전화","텔레비전","망원경"};
                String [] test4 = {"무스","구름","비누거품"};
                String [] test5 = {"계속 버튼을 누른다","주변을 둘러본다","바닥만 쳐다본다","엘레베이터 층수만 본다"};

                TextView q1 = (TextView) findViewById(R.id.option_1);
                TextView q2 = (TextView) findViewById(R.id.option_2);
                TextView q3 = (TextView) findViewById(R.id.option_3);
                TextView q4 = (TextView) findViewById(R.id.option_4);
                ImageView imageView = (ImageView) findViewById(R.id.btn_next);
                Intent intent = getIntent();
//                q1.setText(intent.getStringExtra("test"));
//                q1.setText(test1[0]);
//                q2.setText(test1[1]);
//                q3.setText(test1[2]);
//                q4.setText(test1[3]);
                if(intent.getStringExtra("test").equals("연애할 때 나는 어떨까?")){
                        q1.setText(test1[0]);
                        q2.setText(test1[1]);
                        q3.setText(test1[2]);
                        q4.setVisibility(View.INVISIBLE);
                        imageView.setImageResource(R.drawable.q1);
                        //test1 실행
                }else if(intent.getStringExtra("test").equals("연애할 때 나는 어떤 사람일까?")){
                        q1.setText(test2[0]);
                        q2.setText(test2[1]);
                        q3.setText(test2[2]);
                        q4.setVisibility(View.INVISIBLE);
                        imageView.setImageResource(R.drawable.q2);
                }else if(intent.getStringExtra("test").equals("나는 사랑을 어떻게 생각할까?")){
                        q1.setText(test3[0]);
                        q2.setText(test3[1]);
                        q3.setText(test3[2]);
                        q4.setVisibility(View.INVISIBLE);
                        imageView.setImageResource(R.drawable.q3);
                }
                else if(intent.getStringExtra("test").equals("나의 스트레스 지수는 어떨까?")){
                        q1.setText(test4[0]);
                        q2.setText(test4[1]);
                        q3.setText(test4[2]);
                        q4.setVisibility(View.INVISIBLE);
                        imageView.setImageResource(R.drawable.q4);
                }
                else if(intent.getStringExtra("test").equals("나의 진짜 성격은?")){
                        q1.setText(test5[0]);
                        q2.setText(test5[1]);
                        q3.setText(test5[2]);
                        q4.setText(test5[3]);
                        imageView.setImageResource(R.drawable.q5);
                }



                q1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent in = new Intent(Activity3.this,
                                        Activity4.class);
                                in.putExtra("selection", q1.getText().toString());
                                startActivity(in);
                        }
                });
                q2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent in = new Intent(Activity3.this,
                                        Activity4.class);
                                in.putExtra("selection", q2.getText().toString());
                                startActivity(in);
                        }
                });
                q3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent in = new Intent(Activity3.this,
                                        Activity4.class);
                                in.putExtra("selection", q3.getText().toString());
                                startActivity(in);
                        }
                });
                q4.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                Intent in = new Intent(Activity3.this,
                                        Activity4.class);
                                in.putExtra("selection", q4.getText().toString());
                                startActivity(in);
                        }
                });

        }
}
