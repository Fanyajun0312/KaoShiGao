package com.example.kaoshigao.view;

import com.example.kaoshigao.bena.SqlBean;

import java.util.List;

/**
 * @date：2020/6/23
 * @describe：view
 * @author：FanYaJun
 */
public interface SqlView {
    void showToast(String str);
    void sqlList(List<SqlBean> sqlBeans);
}
