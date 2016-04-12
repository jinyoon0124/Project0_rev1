package com.example.jinyoon.project0_rev1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;

import butterknife.OnClick;
import butterknife.OnItemClick;

import static com.example.jinyoon.project0_rev1.R.id.btnProject1;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btnProject1,R.id.btnProject2,R.id.btnProject3,R.id.btnProject4
    ,R.id.btnProject5,R.id.btnProject6})
    public void showToast(Button btn){
        Toast.makeText(MainActivity.this, String.format(getString(R.string.msg),btn.getText()), Toast.LENGTH_SHORT).show();
        //String.format(getString(R.string.msg),button.getText(), "apps!")
    }



}
