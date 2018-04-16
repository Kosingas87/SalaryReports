/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasade;

import domen.Salaries;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PCa
 */
@Stateless
public class SalariesFacade extends AbstractFacade<Salaries> {

    @PersistenceContext(unitName = "com.obracunplata.nst2_EvidencijaPlata_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalariesFacade() {
        super(Salaries.class);
    }
    
  
    
}
