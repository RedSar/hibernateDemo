package org.example.dao;

import org.example.entity.User;

import java.util.List;

public interface UserDAO {

    public abstract User findById(int id);
    public abstract List<User> findAll();
    public abstract void deleteById(int id);
    public abstract void save(User user);
    public abstract void update(User user);
}
