package com.verifyingcodestyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by shijun on 2018/03/17
 */
public class MainActivity extends AppCompatActivity implements CustomerCodeView.InputCompleteListener {

    private CustomerCodeView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (CustomerCodeView) findViewById(R.id.edit_code);

        editText.setInputCompleteListener(this);

    }

    @Override
    public void inputComplete() {
        if (!editText.getEditContent().equals("123456")) {
            Toast.makeText(getApplicationContext(), "验证码失败", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void deleteContent(boolean isDelete) {

    }
}
