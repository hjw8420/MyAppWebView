package com.example.user.myappwebview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewConvertActivity extends Activity implements View.OnClickListener{ //alt+insert 눌러서 implementation
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_convert);
        imageView = (ImageView) findViewById(R.id.imageView);
        ((Button) findViewById(R.id.btNextImage)).setOnClickListener(this);
        ((Button) findViewById(R.id.btPrevImage)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
