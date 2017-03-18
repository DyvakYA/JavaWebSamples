package ua.training.model.services;

import ua.training.model.dao.CityDao;
import ua.training.model.dao.DaoConnection;
import ua.training.model.dao.DaoFactory;
import ua.training.model.entities.City;

import java.util.List;

/**
 * Created by Денис on 14.12.2016.
 */
public class CityService {
    //private CityDao cityDao = .createCityDao();
    DaoFactory daoFactory = DaoFactory.getInstance();
	
    private static class Holder{
    	static final CityService INSTANCE = new CityService(); 
    }
    
    public static CityService getInstance(){
    	return Holder.INSTANCE;
    }
    
//    void setCityDao(CityDao cityDao) {
//        this.cityDao = cityDao;
//    }

    public List<City> getAllCities(){
    	try(DaoConnection connection = daoFactory.getConnection()){
    		connection.begin();
    		CityDao cityDao = daoFactory.createCityDao(connection);

    		return cityDao.findAll();
    	}
    }
}
