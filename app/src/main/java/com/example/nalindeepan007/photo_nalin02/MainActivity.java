package com.example.nalindeepan007.photo_nalin02;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView iv = (ImageView) findViewById(R.id.qwd);
        ImageView iv1 = (ImageView) findViewById(R.id.imageView2);

        iv.animate().alpha(0f).setDuration(2000);
        iv1.animate().alpha(1f).setDuration(2000);
    }

    public void go(View view2){
        ImageView iv = (ImageView) findViewById(R.id.qwd);
        ImageView iv1 = (ImageView) findViewById(R.id.imageView2);


        //iv1.animate().rotationXBy(10f).setDuration(4000);
        //iv1.animate().rotationYBy(0f).setDuration(5000);
        //iv.animate().scaleX(5).setDuration(4500);
        //iv.animate().scaleY(5).setDuration(4500);
        iv.animate().translationXBy(1000f).translationYBy(1000f).rotationBy(360).setDuration(2000);
        //iv1.animate().alpha(1f).setDuration(5000);

    }

/*    public void replace(View view3) {
        ImageView iv = (ImageView) findViewById(R.id.qwd);

        iv.animate().translationXBy(-1000f).translationYBy(-1000f).setDuration(2000);
}*/





    @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.qwd);

        iv.setTranslationX(-1000f);
    }

}
