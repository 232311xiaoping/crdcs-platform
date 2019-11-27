package com.crdcs.workbench.service;



import com.crdcs.workbench.model.Page;
import com.crdcs.workbench.model.po.User;
import com.crdcs.workbench.model.vo.UserParam;
import com.crdcs.workbench.model.vo.UserQueryCondition;

import java.util.List;

/**
 * @Author: zxm
 * @Date: 2019/11/27 13:28
 */
public interface UserService {

    User validateuser(String email, String password);

    Page<UserParam> userPage(UserQueryCondition condition);

    UserParam user(long id);

    void editUser(UserParam userParam);

    void addUser(UserParam userParam);

    void changeUserRemoved(long id, int removed);

    List<UserParam> exportUser(UserQueryCondition condition);

    void batchAddUser(List<UserParam> list);
}
