package com.example.xuepeng.learncontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //private TextView tv;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        tv = new TextView(this);
//        //tv.setText("hello myFriend");
//        tv.setText(R.string.helloworld);
//        ImageView iv=new ImageView(this);
//        iv.setImageResource(R.mipmap.ic_launcher);
//        setContentView(iv);

        setContentView(R.layout.main1);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        textView.setText("共享的数据是:"+((App)getApplicationContext()).getData());
        findViewById(R.id.savePublicData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((App)getApplicationContext()).setData(editText.getText().toString());
                textView.setText("共享的数据是:"+editText.getText().toString());

            }
        });
    }
    public App getApp(){
        return (App) getApplicationContext();
    }

}
