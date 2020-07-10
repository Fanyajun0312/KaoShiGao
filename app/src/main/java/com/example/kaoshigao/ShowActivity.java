package com.example.kaoshigao;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kaoshigao.adapter.RlvAdapter;
import com.example.kaoshigao.bena.SqlBean;
import com.example.kaoshigao.dao.SqlBeanDao;
import com.example.kaoshigao.persener.ImpSqlPersener;
import com.example.kaoshigao.sql.BaseApp;
import com.example.kaoshigao.view.SqlView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowActivity extends AppCompatActivity implements SqlView {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rlv)
    RecyclerView rlv;
    private ArrayList<SqlBean> list;
    private RlvAdapter rlvAdapter;
    private ImpSqlPersener impSqlPersener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        ButterKnife.bind(this);
        /**
         * 实现p
         */
        impSqlPersener = new ImpSqlPersener(this);
        initView();
        initData();
    }

    private void initData() {
        /**
         * 回调方法
         */
        impSqlPersener.query();

    }

    private void initView() {
        //分割线
        rlv.addItemDecoration(new DividerItemDecoration(this,RecyclerView.VERTICAL));
        //管理器
        rlv.setLayoutManager(new LinearLayoutManager(this));
        //数据源
        list = new ArrayList<>();
        rlvAdapter = new RlvAdapter(this, list);
        rlv.setAdapter(rlvAdapter);
    }

    @Override
    public void showToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
    //刷新适配器 绑定数据
    @Override
    public void sqlList(List<SqlBean> sqlBeans) {
        list.addAll(sqlBeans);
        rlvAdapter.notifyDataSetChanged();
    }
}
