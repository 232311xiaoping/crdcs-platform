package com.crdcs.workbench.dao;

import com.crdcs.workbench.model.po.User;
import com.crdcs.workbench.model.vo.UserQueryCondition;

import java.util.List;

/**
 * 用户dao
 *
 * @author zxm
 * @since 2019-11-27 15:08
 */
public interface UserDAO {

    /**
     *
     *
     * @param email
     * @param password
     * @return
     */
    User validateuser(String email, String password);

    /**
     *
     *
     * @param condition
     * @return
     */
    int getUserCount(UserQueryCondition condition);

    /**
     *
     *
     * @param condition
     * @return
     */
    List<User> getUserList(UserQueryCondition condition);

    /**
     *
     *
     * @param id
     * @return
     */
    User getUser(long id);

    /**
     *
     *
     * @param user
     */
    void editUser(User user);

    /**
     *
     * @param user
     */
    void addUser(User user);

    /**
     *
     * @param id
     * @param removed
     */
    void changeUserRemoved(long id, int removed);
}
