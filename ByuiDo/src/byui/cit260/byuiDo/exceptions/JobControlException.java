/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.exceptions;

/**
 *
 * @author Jake
 */
public class JobControlException extends Exception{

    public JobControlException() {
    }

    public JobControlException(String string) {
        super(string);
    }

    public JobControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public JobControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public JobControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
