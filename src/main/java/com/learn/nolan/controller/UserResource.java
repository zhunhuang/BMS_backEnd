package com.learn.nolan.controller;

import com.learn.nolan.dao.ManagerUserDao;
import com.learn.nolan.model.DO.ManagerUserDO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author zhun.huang 2018-12-17
 */
@Controller
@RequestMapping("users")
public class UserResource {

    @Resource
    private ManagerUserDao managerUserDao;

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    ManagerUserDO queryById(@PathVariable int id) {
        return managerUserDao.queryById(id);
    }

    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.GET)
    List<ManagerUserDO> query() {
        return managerUserDao.query();
    }

    @ResponseBody
    @RequestMapping(value = "",method = RequestMethod.POST)
    boolean insert(@RequestBody ManagerUserDO managerUserDO) {
        return managerUserDao.insert(managerUserDO);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    boolean update(@PathVariable int id,@RequestBody ManagerUserDO managerUserDO) {
        return managerUserDao.update(managerUserDO);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    boolean delete(@PathVariable int id) {
        return managerUserDao.delete(id);
    }

    @ResponseBody
    @RequestMapping("/page/{page}")
    List<ManagerUserDO> pageQuery(@PathVariable int page, int size) {
        int start = (page - 1) * size;
        return managerUserDao.pageQuery(start, size);
    }

    @ResponseBody
    @RequestMapping("/size")
    long size() {
        return managerUserDao.size();
    }
}
