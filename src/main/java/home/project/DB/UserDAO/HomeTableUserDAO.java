package home.project.DB.UserDAO;

import home.project.DB.DAO.HomeTableDAO;
import home.project.DB.Entity.HomeTableEntity;

public class HomeTableUserDAO {

    private HomeTableDAO homeTableDAO = new HomeTableDAO();

    /**
     * Search data in DB by ID
     * @param id
     * @return
     */
    public HomeTableEntity findData(int id){
        return homeTableDAO.findByID(id);
    }

}
