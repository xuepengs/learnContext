package com.example.xuepeng.learncontext;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by xuepeng on 2018/1/27.
 */

public class Main2 extends Activity {
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);

        textView.setText("共享的数据是:"+getApp().getData());
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
