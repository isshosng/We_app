package com.example.a0316;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView vw = new MyView(this);
        setContentView(vw);
    }

    protected class MyView extends View{
        public MyView(Context context){
            super(context);
        }

        public void onDraw(Canvas canvas){
            super.onDraw(canvas);
            canvas.drawColor(Color.LTGRAY);
            Paint pnt = new Paint();
            pnt.setColor(Color.BLUE);

            // 최
            for(int y1=90; y1<140; y1++){
                canvas.drawCircle(150,y1,10,pnt);
            }
            for(int x1= 100; x1<200; x1++){
                canvas.drawCircle(x1,150,10,pnt);
            }
            int y2=150;
            for(int x2=200; x2>100; x2--,y2++){
                canvas.drawCircle(x2,y2,10,pnt);
            }
            int y3=200;
            for(int x3=160; x3<210; x3++,y3++){
                canvas.drawCircle(x3,y3,10,pnt);
           }

            for(int y4=280; y4<330; y4++){
                canvas.drawCircle(150, y4, 10, pnt);
            }

            for(int x4=90; x4<220; x4++){
                canvas.drawCircle(x4,330,10,pnt);
            }

            for(int y5=100; y5<330; y5++){
                canvas.drawCircle(260, y5,10,pnt);
            }

            //태
            for(int a1=330; a1<430; a1++){
                canvas.drawCircle(a1,150,10,pnt);
                canvas.drawCircle(a1,210,10,pnt);
                canvas.drawCircle(a1,270,10,pnt);
            }

            for(int a2=150; a2<270; a2++){
                canvas.drawCircle(330,a2,10,pnt);
                canvas.drawCircle(490,a2,10,pnt);
                canvas.drawCircle(550,a2,10,pnt);
            }
            for (int a3=490; a3<550; a3++){
                canvas.drawCircle(a3,210,10,pnt);
            }

            //승
            int d1=120;
            for(int c1=710;c1>640;c1--,d1++){
                canvas.drawCircle(c1,d1,10,pnt);
            }

            int d2=130;
            for(int c2=700;c2<760;c2++,d2++){
                canvas.drawCircle(c2,d2,10,pnt);
            }

            for(int c3=630; c3<760; c3++){
                canvas.drawCircle(c3,230,10,pnt);
            }

            float PI = (float) 3.1415926535;
            float i, angle, c4, d4;
            for(i = 0; i < 360; i += 0.1)
                {
                    angle = i;
                    c4 = (float) (30 * Math.cos(angle * PI / 180));
                    d4 = (float) (30 * Math.sin(angle * PI / 180));
                    canvas.drawCircle(c4+700,d4+290,10,pnt);
                }
            }
    }
}
