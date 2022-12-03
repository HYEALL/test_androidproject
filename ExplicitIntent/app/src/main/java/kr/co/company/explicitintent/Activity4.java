package kr.co.company.explicitintent;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.layout_result);
                String [] test1 = {"아주 침착한 사람이다. 애인이 생겨 기쁘지만\n여기저기 소문내는 스타일은 아니다.",
                        "애인이 생기면 아주 들뜨는 사람이다.\n표정, 행동, 말투까지 모두 변해 주위에서 금방 눈치챈다. ",
                        "좀 더 솔직할 필요가 있는 사람이다.\n겉으로는 침착해 보여도 속으로는 엄청 두근거리고 있다."};
                String [] test2 = {"적극적이지만 조용히 접근하는 스타일이다\n그/그녀가 관심 가져줄 때까지 계속 접근한다.",
                        "소극적인 스타일이다\n그/그녀가 당신의 존재를 알 때까지 한없이 기다리기만 한다.",
                        "사랑을 위해서라면 모든 것을 견뎌내는 스타일이다.\n그녀를 위해 모든 걸 다 해준다."};
                String [] test3 = {"사람에게 있어서 사랑은 즐기는 것 뿐이지\n동경할 대상은 아니라고 생각한다.",
                        "약간의 기대를 하고 언젠가는 반드시\n진정한 멋진 사랑을 하리라고 기대한다.",
                        "사랑에 대한 환상이 강한 타입이다."};
                String [] test4 = {"스트레스가 거의 없는 상태로 현재 생활에 만족한다.",
                        "스트레스가 많아 쌓인 상태로 현실에 불만이 많다.",
                        "스트레스가 없지는 않지만 약간의 불만이라서 참을 수 있을 만한 상태이다."};
                String [] test5 = {"당신은 다소 예민하고 신경질적이다.\n성격은 예민하지만 예술적으로 소질이 있어 특기가 생길 수 있다.",
                        "당신은 생각을 오래 하기보다는 몸을 먼저 움직이는 행동력이 강한사람이다.\n어떤 하나의 일에 집중하게 되면 다른 것들은 눈에 잘 안들어와서 한가지 일을\n제외하고 다른 것들은 소홀히 하는 경우가 있다.\n다만, 행동적이고 재치가 있어 사람들에게 인기가 좋다.",
                        "당신은 마음이 따듯하며 온화하고 인기가 많다.\n하지만 자신의 결점에 대해 알려지는 것을 꺼려해 사람들과\n벽을 쌓는 경우가 있다. 이로인해 사람들은 이 사람을 냉정하다고 오해하기도 한다.\n인맥은 넓지 않으나 한명이라도 깊게 관계를 맺어하는 성향으로 이공계쪽에 잘 어울린다.",
                        "당신은 다소 소극적이기 하지만 상당히 솔직함을 가지고 있다.\n타인을 믿는다거나 좋아하게 되는데에 있어 거부감을 느끼지 않기 때문에\n대인관계가 넓고 다툼이 적다."
                        ,"당신은 안정적인 것을 좋아해 큰 리스크를 안고 무리하게 진행하지 않는다.\n어떤 인간관계에 있어 문제가 있어도 합리적으로 어긋난 것을 하지 않는 편이다\n감정적으로 해결하기 보다는 이성적으로, 논리적으로 행동하기 때문에 사람들이 많이 따르는 편이다."};
                TextView result1 = (TextView) findViewById(R.id.tv_main);
                TextView result2 = (TextView) findViewById(R.id.tv_sub);
                Intent intent = getIntent();
                String selection = intent.getStringExtra("selection");
                if(selection.equals("담배")||selection.equals("아이스캔디")||selection.equals("우동/국수")) {
                        result1.setText("이 테스트는 당신에게 애인이 생기면 어떤 사람이 되는 지 알아보는 테스트입니다.");
                        if (selection.equals("담배")) {
                                result2.setText(test1[0]);
                        } else if (selection.equals("아이스캔디")) {
                                result2.setText(test1[1]);
                        } else if (selection.equals("우동/국수")) {
                                result2.setText(test1[2]);
                        }
                }else if(selection.equals("태양")||selection.equals("전구")||selection.equals("돈")){
                        result1.setText("이 테스트는 당신이 관심있는 사람에게 어떻게 행동하는 지 알아보는 테스트입니다.");
                        if (selection.equals("태양")) {
                                result2.setText(test2[0]);
                        } else if (selection.equals("전구")) {
                                result2.setText(test2[1]);
                        } else if (selection.equals("돈")) {
                                result2.setText(test2[2]);
                        }
                }else if(selection.equals("전화")||selection.equals("텔레비전")||selection.equals("망원경")){
                        result1.setText("이 테스트는 당신이 사랑에 대해 어떻게 생각하는 지 알아보는 테스트입니다.");
                        if (selection.equals("전화")) {
                                result2.setText(test3[0]);
                        } else if (selection.equals("텔레비전")) {
                                result2.setText(test3[1]);
                        } else if (selection.equals("망원경")) {
                                result2.setText(test3[2]);
                        }
                }else if(selection.equals("무스")||selection.equals("구름")||selection.equals("비누거품")){
                        result1.setText("이 테스트는 현재 당신의 스트레스 상태를 알아보는 테스트입니다.");
                        if (selection.equals("무스")) {
                                result2.setText(test4[0]);
                        } else if (selection.equals("구름")) {
                                result2.setText(test4[1]);
                        } else if (selection.equals("비누거품")) {
                                result2.setText(test4[2]);
                        }

                }else if(selection.equals("계속 버튼을 누른다")||selection.equals("주변을 둘러본다")
                        ||selection.equals("바닥만 쳐다본다")||selection.equals("엘레베이터 층수만 본다")){
                        result1.setText("이 테스트는 현재 당신의 스트레스 상태를 알아보는 테스트입니다.");
                        if (selection.equals("계속 버튼을 누른다")) {
                                result2.setText(test5[0]);
                        } else if (selection.equals("주변을 둘러본다")) {
                                result2.setText(test5[1]);
                        } else if (selection.equals("바닥만 쳐다본다")) {
                                result2.setText(test5[2]);
                        } else if (selection.equals("엘레베이터 층수만 본다")) {
                                result2.setText(test5[3]);
                        }
                }

        }
}