package project_jdbcdao.model.dao;

import project_jdbcdao.model.entities.City;

import java.util.List;

/**
 * Created by Денис on 14.12.2016.
 */
public interface CityDao extends GenericDao<City> {
    List<City> findByName(String name);
}
