package com.tensquare.base.service;

import com.tensquare.base.dao.CityDao;
import com.tensquare.base.pojo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.IdWorker;

@Service
public class CityService {

    @Autowired
    private CityDao cityDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 新增城市
      * @param city
     */
  public void add(City city){
      //生成ID
      city.setId(String.valueOf(idWorker.nextId()));
      cityDao.save(city);
  }

    /**
     * 删除城市
     * @param id
     */
  public void deleteById(Integer id){
      cityDao.deleteById(id);

  }

}
