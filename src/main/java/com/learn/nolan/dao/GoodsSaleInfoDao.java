package com.learn.nolan.dao;

import com.learn.nolan.model.DO.GoodsSaleInfoDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description:
 *
 * @author zhun.huang 2018-12-18
 */
@Repository
public interface GoodsSaleInfoDao {

    GoodsSaleInfoDO queryById(@Param("id") int id);

    List<GoodsSaleInfoDO> query();

    boolean insert(GoodsSaleInfoDO goodsSaleInfoDO);

    boolean update(GoodsSaleInfoDO goodsSaleInfoDO);

    boolean delete(long id);

}
