package com.demon.mybatis.generator.model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    /**
     * 数据库名称
     */
    private String databaseName;

    /**
     * 数据库类型
     */
    private String databaseProductName;

    /**
     * 数据库版本
     */
    private String databaseVersion;

    /**
     * 当前数据库中的表
     */
    private List<Table> tableList=new ArrayList<Table>();


    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    public List<Table> getTableList() {
        return tableList;
    }

    public void setTableList(List<Table> tableList) {
        this.tableList = tableList;
    }

    public String getDatabaseProductName() {
        return databaseProductName;
    }

    public void setDatabaseProductName(String databaseProductName) {
        this.databaseProductName = databaseProductName;
    }


}
