package com.example.kaoshigao.persener;

import com.example.kaoshigao.bena.SqlBean;
import com.example.kaoshigao.call.Sqlcall;
import com.example.kaoshigao.model.ImpModelSql;
import com.example.kaoshigao.view.SqlView;

import java.util.List;

/**
 * @date：2020/6/23
 * @describe：p
 * @author：FanYaJun
 */
public class ImpSqlPersener implements Sqlcall {
    private SqlView sqlView;
    private final ImpModelSql impModelSql;

    public ImpSqlPersener(SqlView sqlView) {
        this.sqlView = sqlView;
        impModelSql = new ImpModelSql();
    }

    public void query() {
        impModelSql.getquery(this);
    }

    /**
     * 向view层传递数据
     * @param str
     */
    @Override
    public void showToast(String str) {
        sqlView.showToast(str);
    }

    @Override
    public void sqlList(List<SqlBean> sqlBeans) {
        sqlView.sqlList(sqlBeans);
    }
}
