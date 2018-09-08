package com.lyl.study.cloud.gateway.core.service;

import com.lyl.study.cloud.base.dto.PageInfo;
import com.lyl.study.cloud.gateway.core.entity.Role;
import com.lyl.study.cloud.gateway.core.entity.User;
import com.baomidou.mybatisplus.service.IService;
import com.lyl.study.cloud.gateway.api.dto.request.UserListConditions;
import com.lyl.study.cloud.gateway.api.dto.request.UserSaveForm;
import com.lyl.study.cloud.gateway.api.dto.request.UserUpdateForm;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author liyilin
 * @since 2018-09-07
 */
public interface UserService extends IService<User> {
    /**
     * 条件筛选用户分页列表
     *
     * @param conditions 筛选条件
     * @return 用户分页列表
     */
    PageInfo<User> listByConditions(UserListConditions conditions);

    /**
     * 查询用户带有的角色
     *
     * @param userId 用户ID
     * @return 用户带有的角色
     */
    List<Role> getRolesByUserId(Long userId);

    /**
     * 新增用户信息
     *
     * @param userSaveForm 表单
     * @return 新增用户ID
     * @throws IllegalArgumentException 用户名已存在时，抛出此异常
     */
    long save(UserSaveForm userSaveForm) throws IllegalArgumentException;

    /**
     * 修改用户信息
     *
     * @param userUpdateForm 表单
     */
    void update(UserUpdateForm userUpdateForm);

    /**
     * 删除用户信息
     *
     * @param id 用户ID
     * @return 删除记录数
     */
    int deleteById(long id);
}