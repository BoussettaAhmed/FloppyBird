/*
package com.example.floppybird;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class GameView extends View {

    //this our custume view class
 Handler handler;
 Runnable runnable;

    public GameView(Context context) {
        super(context);
      handler = new Handler();
      runnable = new Runnable() {
          @Override
          public void run() {
          invalidate();
          }
      };

    }
@Override
     protected void  onDraw(Canvas canvas){
        super.onDraw(canvas);
      //We'll draw our view inside onDraw()

     handler.postDelayed(runnable.Update_MILLES )
}

}
*/
