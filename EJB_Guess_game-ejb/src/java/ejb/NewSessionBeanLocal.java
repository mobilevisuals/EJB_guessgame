/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.CreateException;
import javax.ejb.Local;

/**
 *
 * @author eyvind
 */
@Local
public interface NewSessionBeanLocal {


    String determineResult(int guess);
    
}
