package com.example.cj.testimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private ImageView image;
    private Button pre;
    private Button next;
    private ImageView showImage;
    private int[] images = {R.mipmap.dog1, R.mipmap.dog2, R.mipmap.dog3, R.mipmap.dog4, R.mipmap.dog5, R.mipmap.dog6, R.mipmap.cat1};
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*image = (ImageView) findViewById(R.id.iamge);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击", Toast.LENGTH_SHORT).show();
            }
        });*/
        showImage = (ImageView) findViewById(R.id.showImage);
        pre = (Button) findViewById(R.id.pre);
        next = (Button) findViewById(R.id.next);

    }

    public void click(View v) {
        switch (v.getId()) {
            case R.id.pre:
                if (num == 0) {
                    Toast.makeText(MainActivity.this, "这已经是第一张图片了", Toast.LENGTH_SHORT).show();
                } else {
                    num--;
                    showImage.setImageResource(images[num]);
                }
                break;
            case R.id.next:
                num++;
                if (num >= images.length) {
                    num = 0;
                }
                showImage.setImageResource(images[num]);
                break;
        }
    }
}
