package a_jdbcdao.model.services;

import a_jdbcdao.model.dao.CityDao;
import a_jdbcdao.model.dao.DaoFactory;
import a_jdbcdao.model.entities.City;

import java.util.List;

/**
 * Created by Денис on 14.12.2016.
 */
public class CityService {
    private CityDao cityDao = DaoFactory.getInstance().createCityDao();

    void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    public List<City> getAllCities(){
            return cityDao.findAll();
    }
}
