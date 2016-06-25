package com.example.user.myappwebview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroActivity extends Activity implements View.OnClickListener { // alt+insert 에서 아래 onClick 메소드 자동생성



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ((Button) findViewById(R.id.btWebView)).setOnClickListener(this);
        ((Button) findViewById(R.id.btImageView)).setOnClickListener(this);
        ((Button) findViewById(R.id.btImageViewConvert)).setOnClickListener(this);
        ((Button) findViewById(R.id.btGridView)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btWebView:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btImageView:
                startActivity(new Intent(this, ImageViewActivity.class));
                break;
            case R.id.btImageViewConvert:
                startActivity(new Intent(this, ImageViewConvertActivity.class));
                break;
            case R.id.btListView:
                startActivity(new Intent(this, ImageListActivity.class));
                break;
            case R.id.btGridView:
                startActivity(new Intent(this, ImageListActivity.class));
                break;
        }
    }
}
