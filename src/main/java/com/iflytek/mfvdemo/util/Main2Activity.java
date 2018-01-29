package com.iflytek.mfvdemo.util;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.iflytek.mfvdemo.R;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText editText = (EditText)findViewById(R.id.edt_group_id);
        
    }
}
