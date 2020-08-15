package com.PantmathDevelopers.planeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Missile {

    int x,y;
    int mVelocity;
    Bitmap missile;



    public Missile(Context context) {
    missile= BitmapFactory.decodeResource(context.getResources(),R.drawable.missile);
    x= GameView.dWidth/2-  getMissileWidth()/2;
    y= GameView.dHeight- GameView.tankHeight- getMissileheight()/2;
    mVelocity=55;

    }





    public int getMissileWidth()
    {
        return missile.getWidth();
    }
    public int getMissileheight()
    {
        return missile.getHeight();
    }
}
