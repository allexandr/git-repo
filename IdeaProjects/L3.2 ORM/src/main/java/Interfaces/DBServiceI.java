package Interfaces;

import dbService.DBException;
import dbService.dataSets.UsersDataSet;

/**
 * Created by alex on 17.01.2016.
 */
public interface DBServiceI {
    UsersDataSet getUser(long id) throws DBException;

    UsersDataSet getUser(String name) throws DBException;

    long addUser(String name, String pass) throws DBException;

    void printConnectInfo();
}
