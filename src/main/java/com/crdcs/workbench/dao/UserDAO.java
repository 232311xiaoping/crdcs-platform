package com.crdcs.workbench.dao;

import com.crdcs.workbench.model.po.User;
import com.crdcs.workbench.model.vo.UserQueryCondition;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

/**
 * 用户dao
 *
 * @author zxm
 * @since 2019-11-27 15:08
 */
@Mapper
public interface UserDAO {

    /**
     *
     *
     * @param email
     * @param password
     * @return
     */
    @Select("SELECT * FROM user WHERE email = #{email} AND password = #{password}")
    User validateuser(@Param("email") String email, @Param("password") String password);

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
