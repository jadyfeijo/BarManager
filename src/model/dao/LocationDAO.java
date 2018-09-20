package model.dao;

import java.util.List;
import model.bean.Location;


public interface LocationDAO {
    
    /**
     * 
     * @param loc
     * @return 
     */
    public boolean create(Location loc);
    
    /**
     * 
     * @param idLoc
     * @return 
     */
    public boolean delete(int idLoc);
    
    /**
     * 
     * @param idLoc
     * @return 
     */
    public boolean find(int idLoc);
    
    /**
     * 
     * @return 
     */
    public List<Location> list();
    
    /**
     * 
     * @param loc
     * @return a boolean which means the operation worked
     */
    public boolean update(Location loc);
    
}
