package com.example.kaoshigao;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.kaoshigao.bena.SqlBean;
import com.example.kaoshigao.dao.SqlBeanDao;
import com.example.kaoshigao.sql.BaseApp;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private EditText ed_name;
    private EditText ed_pass;
    private Button btn_rig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        ed_name = (EditText) findViewById(R.id.ed_name);
        ed_pass = (EditText) findViewById(R.id.ed_pass);
        btn_rig = (Button) findViewById(R.id.btn_rig);

        btn_rig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_rig:
                sub();
                break;
        }
    }

    private void sub() {
        /**
         * 判断是通过4) 登录用户名必须为刚刚存入数据库的人员，根据姓名判断此人属于哪个班，点击登录跳转到图2页面。（15分）
         */
        String name = ed_name.getText().toString();
        String pass = ed_pass.getText().toString();
        for(int i=0;i<10 ;i++){
            if(name.equals("范亚军")){
                SqlBeanDao sqlBeanDao = BaseApp.getBaseApp().getDaoSession().getSqlBeanDao();
                SqlBean sqlBean = new SqlBean();
                sqlBean.setId(null);
                sqlBean.setName(name);
                sqlBean.setAge(18+i);
                sqlBean.setSex("男");
                sqlBean.setArresstio("H1909A");
                sqlBeanDao.insertOrReplace(sqlBean);

            }else {
                SqlBeanDao sqlBeanDao = BaseApp.getBaseApp().getDaoSession().getSqlBeanDao();
                SqlBean sqlBean = new SqlBean();
                sqlBean.setId(null);
                sqlBean.setName(name);
                sqlBean.setAge(18+i);
                sqlBean.setSex("男");
                sqlBean.setArresstio("H1909B");
                sqlBeanDao.insertOrReplace(sqlBean);
            }
        }

        startActivity(new Intent(MainActivity.this,ShowActivity.class));
    }
}
