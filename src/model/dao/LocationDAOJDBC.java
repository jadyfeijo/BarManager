package model.dao;

import java.util.List;
import model.bean.Location;

/**
 *
 * @author josebraz
 */
public class LocationDAOJDBC implements LocationDAO {
    
    public DAOFactory daoFactory;
    
    LocationDAOJDBC(DAOFactory dao) {
        this.daoFactory = dao;
    }

    @Override
    public boolean create(Location loc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int idLoc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean find(int idLoc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Location> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Location loc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
