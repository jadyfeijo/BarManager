package model.dao;

import java.util.List;
import model.bean.Bar;

public interface BarDAO {
    
    /**
     * 
     * @param loc
     * @return 
     */
    public boolean create(Bar bar);
    
    /**
     * 
     * @param idLoc
     * @return 
     */
    public boolean delete(int idBar);
    
    /**
     * 
     * @param idLoc
     * @return 
     */
    public boolean find(int idBar);
    
    /**
     * 
     * @return 
     */
    public List<Bar> list();
    
    /**
     * 
     * @param loc
     * @return a boolean which means the operation worked
     */
    public boolean update(Bar bar);
    
}
