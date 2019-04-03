package com.example.xiaosiyuan.a0402;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView etName = (TextView)findViewById(R.id.etName);
        Drawable dwLeft = getResources().getDrawable(R.drawable.icon_user);
        dwLeft.setBounds(0,0,40,40);
        etName.setCompoundDrawables(dwLeft,null,null,null);

        TextView etPassword = (TextView)findViewById(R.id.etPassword);
        Drawable dwLeftPass = getResources().getDrawable(R.drawable.icon_password);
        dwLeftPass.setBounds(0,0,40,40);
        etPassword.setCompoundDrawables(dwLeftPass,null,null,null);
    }
}
