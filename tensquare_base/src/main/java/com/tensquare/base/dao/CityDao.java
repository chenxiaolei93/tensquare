package com.tensquare.base.dao;

import com.tensquare.base.pojo.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CityDao extends JpaRepository<City,Integer> , JpaSpecificationExecutor<City> {


}
