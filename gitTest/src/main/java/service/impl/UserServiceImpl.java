package service.impl;

import domain.User;
import mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        List<User> list = userDao.findAll();
        return list;
    }
}
