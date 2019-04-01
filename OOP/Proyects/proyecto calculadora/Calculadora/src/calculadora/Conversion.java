/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.lang.Integer;
/**
 *
 * @author alex
 */
public class Conversion {
    
    public String intoHex(int n){
        return Integer.toHexString(n).toUpperCase();
    }
    public String intoOct(int n){
        return Integer.toOctalString(n);
                }
    public String inToBin(int n){
        return Integer.toBinaryString(n);
    }
}
