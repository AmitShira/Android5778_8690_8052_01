package com.example.amit.android5778_8690_8052_01.model.backend;

import com.example.amit.android5778_8690_8052_01.model.datasource.List_DB_Manager;

/**
 * Created by Amit on 06/12/2017.
 */

public class DBManagerFactory {
    static DB_manager manager=null;

    public static DB_manager getManager()
    {
        if (manager==null)
            manager=new List_DB_Manager(); //MrSQL_DB_Manager
        return manager  ;
    }
}
