/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.exceptions;

/**
 *
 * @author tanya
 */
public class StoreControlException extends Exception{

    public StoreControlException() {
    }

    public StoreControlException(String string) {
        super(string);
    }

    public StoreControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public StoreControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public StoreControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
