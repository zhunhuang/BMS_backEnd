package com.learn.nolan.controller;

import com.learn.nolan.dao.GoodsSaleInfoDao;
import com.learn.nolan.model.DO.GoodsSaleInfoDO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author zhun.huang 2018-12-18
 */
@Controller
@RequestMapping("goods")
public class GoodsSaleResource {

    @Resource
    private GoodsSaleInfoDao goodsSaleInfoDao;

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    GoodsSaleInfoDO queryById(@PathVariable int id) {
        return goodsSaleInfoDao.queryById(id);
    }

    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.GET)
    List<GoodsSaleInfoDO> query() {
        return goodsSaleInfoDao.query();
    }

}
