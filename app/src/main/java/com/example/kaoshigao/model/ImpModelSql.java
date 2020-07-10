package com.example.kaoshigao.model;

import com.example.kaoshigao.bena.SqlBean;
import com.example.kaoshigao.call.Sqlcall;
import com.example.kaoshigao.dao.SqlBeanDao;
import com.example.kaoshigao.persener.ImpSqlPersener;
import com.example.kaoshigao.sql.BaseApp;

import java.util.List;

/**
 * @date：2020/6/23
 * @describe：m
 * @author：FanYaJun
 */
public class ImpModelSql {
    public void getquery(Sqlcall sqlcall) {
        /**
         * m查询数据库
         */
            SqlBeanDao sqlBeanDao = BaseApp.getBaseApp().getDaoSession().getSqlBeanDao();
            List<SqlBean> list = sqlBeanDao.queryBuilder().where(SqlBeanDao.Properties.Arresstio.like("%A")).list();

            sqlcall.sqlList(list);
    }
}
