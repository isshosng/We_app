package com.example.a0316;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ExampleInstrumentedTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView vw = new MyView(this);
        setContentView(vw);
        //setContentView(R.layout.activity_main);

        // RelativeLayout relative = new RelativeLayout(this);
        //relative.setBackgroundColor(Color.LTGRAY);
        //TextView text2 = (TextView) View.inflate(this, R.layout.text_example, null);


        //relative.addView(text2);
        //setContentView(relative);
    }
    protected class MyView extends View{
        public MyView(Context context){
            super(context);
        }

        public void onDraw(Canvas canvas){
            //super.onDraw(canvas);
            canvas.drawColor(Color.LTGRAY);
            Paint pnt = new Paint();
            Resources res = getResources();
            BitmapDrawable bd = (BitmapDrawable) res.getDrawable(R.drawable.mysignuature);
            Bitmap bit = bd.getBitmap();
            canvas.drawBitmap(bit, 10,10,null);
            pnt.setColor(Color.BLUE);

            /*for(int y1 =90; y1<140; y1++){
                canvas.drawCircle(150,y1,10,pnt);
            }
            for(int x1= 100; x1<200; x1++){
                canvas.drawCircle(x1,150,10,pnt);
            }
            for(int x1y1=300; x1y1>100; x1y1--){
                canvas.drawCircle(x1y1,x1y1,10,pnt);
            }*/

            //canvas.drawCircle(150,90,10,pnt);
            //canvas.drawCircle(150,100,10,pnt);
            //canvas.drawCircle(150,110,10,pnt);
            //canvas.drawCircle(100,150,10,pnt);
        }
    }
}