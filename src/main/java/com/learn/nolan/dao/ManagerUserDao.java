package com.learn.nolan.dao;

import com.learn.nolan.model.DO.ManagerUserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description:
 *
 * @author zhun.huang 2018-12-17
 */
@Repository
public interface ManagerUserDao {

    long size();

    ManagerUserDO queryById(@Param("id") int id);

    List<ManagerUserDO> query();

    boolean insert(ManagerUserDO managerUserDO);

    boolean update(ManagerUserDO managerUserDO);


    boolean delete(long id);

    List<ManagerUserDO> pageQuery(@Param("start") int start, @Param("size") int size);

}
