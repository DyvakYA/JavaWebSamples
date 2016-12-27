package a_jdbcdao;

import a_jdbcdao.model.dao.CityDao;
import a_jdbcdao.model.dao.DaoFactory;
import a_jdbcdao.model.entities.City;
import a_jdbcdao.model.services.CityService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        System.out.println( "Hello World!"   );
        CityService service = new CityService();

        System.out.println(service.getAllCities() );

        DaoFactory factory = DaoFactory.getInstance();
        CityDao dao = factory.createCityDao();
        System.out.println(dao.findAll());
        City city = new City.Builder().setName("Kharkiv").build();
        dao.create(city);
        System.out.println(city);


    }
}
