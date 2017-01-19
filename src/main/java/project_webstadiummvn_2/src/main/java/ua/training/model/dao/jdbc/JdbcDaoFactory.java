package ua.training.model.dao.jdbc;

import ua.training.model.dao.CityDao;
import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.PersonDao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.jdbc.Driver;

/**
 * Created by Денис on 14.12.2016.
 */
public class JdbcDaoFactory extends DaoFactory {

    private Connection connection;
    private static final String DB_URL = "url";

    public JdbcDaoFactory() {
        try{


            InputStream inputStream =
                DaoFactory.class.getResourceAsStream(DB_FILE);
            Properties dbProps = new Properties();
            dbProps.load(inputStream);
            String url = dbProps.getProperty(DB_URL);
            new Driver();
            connection = DriverManager.getConnection(url , dbProps);

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public CityDao createCityDao() {
        return new JdbcCityDao(connection);
    }

    @Override
    public PersonDao createPersonDao() {
        return new JdbcPersonDao(connection);
    }


}
