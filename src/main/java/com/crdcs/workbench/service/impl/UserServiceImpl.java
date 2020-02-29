package com.crdcs.workbench.service.impl;

import com.crdcs.workbench.dao.UserDAO;
import com.crdcs.workbench.model.Page;
import com.crdcs.workbench.model.po.User;
import com.crdcs.workbench.model.vo.UserParam;
import com.crdcs.workbench.model.vo.UserQueryCondition;
import com.crdcs.workbench.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zam
 * @Description 用户逻辑
 * @since 2019/11/27
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public User validateuser(String email, String password) {
        return userDAO.validateuser(email,password);
    }

    @Override
    public Page<UserParam> userPage(UserQueryCondition condition) {
        return null;
    }

    @Override
    public UserParam user(long id) {
        return null;
    }

    @Override
    public void editUser(UserParam userParam) {

    }

    @Override
    public void addUser(UserParam userParam) {

    }

    @Override
    public void changeUserRemoved(long id, int removed) {

    }

    @Override
    public List<UserParam> exportUser(UserQueryCondition condition) {
        return null;
    }

    @Override
    public void batchAddUser(List<UserParam> list) {

    }
}
