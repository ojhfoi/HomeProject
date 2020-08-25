package home.project.DB.DAO;

import home.project.DB.Entity.HomeTableEntity;
import home.project.DB.Session.Service;

/**
 * DAO class
 */
public class HomeTableDAO {

    public HomeTableEntity findByID(int id){
        return Service.getSession().get(HomeTableEntity.class, id);
    }

}
