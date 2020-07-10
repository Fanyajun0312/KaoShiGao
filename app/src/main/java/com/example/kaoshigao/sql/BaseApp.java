package com.example.kaoshigao.sql;


import android.app.Application;

import com.example.kaoshigao.dao.DaoMaster;
import com.example.kaoshigao.dao.DaoSession;

/**
 * @date：2020/6/23
 * @describe：数据库
 * @author：FanYaJun
 */
public class BaseApp extends Application {
    private static BaseApp baseApp;
    private DaoSession daoSession;



    @Override
    public void onCreate() {
        super.onCreate();
        baseApp=this;
        greenDao();
    }
//*数据库方法 get可以访问
    private void greenDao() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "arrs.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        daoSession = daoMaster.newSession();

    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
    public static BaseApp getBaseApp() {
        return baseApp;
    }
}
