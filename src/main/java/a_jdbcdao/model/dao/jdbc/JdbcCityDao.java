package a_jdbcdao.model.dao.jdbc;

import a_jdbcdao.model.dao.CityDao;
import a_jdbcdao.model.entities.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Денис on 14.12.2016.
 */
public class JdbcCityDao implements CityDao {

    private static final String SELECT_FROM_CITY = "SELECT * FROM city";
    private static final String CITY_ID = "city_id";
    private static final String NAME = "name";
    private Connection connection;

    public JdbcCityDao() {
    }

    JdbcCityDao(Connection connection) {
        this.connection = connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<City> findByName(String name) {
        return null;
    }

    @Override
    public City find(int id) {
        return null;
    }

    @Override
    public List<City> findAll() {
        List<City> result = new ArrayList<>();
        try(Statement query =
                    connection.createStatement();
            ResultSet resultSet = query.executeQuery(SELECT_FROM_CITY)){

            while (resultSet.next()) {
                result.add( new City.Builder()

                                 .setId(resultSet.getInt(CITY_ID))
                                 .setName(resultSet.getString(NAME) , resultSet.wasNull() )
                                 .build());

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public void create(City city) {

        try( PreparedStatement query =
                         connection.prepareStatement("INSERT INTO city (name) VALUES ( ? )"
                                 , Statement.RETURN_GENERATED_KEYS ) ){
            query.setString( 1 , city.getName());
            query.executeUpdate();
            ResultSet keys =  query.getGeneratedKeys();
            if( keys.next()){
                city.setId( keys.getInt(1) );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(City city) {

    }

    @Override
    public void delete(int id) {

    }
}
