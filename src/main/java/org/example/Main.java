package org.example;

import org.example.dao.UserDAO;
import org.example.dao.UserDAOHibernat5Impl;


public class Main {

    public static UserDAO dao = new UserDAOHibernat5Impl();


    public static void main(String[] args) {

        dao.findById(2);
    }
}