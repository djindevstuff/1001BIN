/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

/**
 *
 * @author Adil
 */
public class Hexadecimal {
    Binary binary = new Binary();
    Decimal decimal = new Decimal();
    
    public String toBinary(String n){
        n=n.toUpperCase();
        String hx="";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='A'){
                hx=hx+"1010";
            }
            if(n.charAt(i)=='B'){
                hx=hx+"1011";
            }
            if(n.charAt(i)=='C'){
                hx=hx+"1100";
            }
            if(n.charAt(i)=='D'){
                hx=hx+"1101";
            }
            if(n.charAt(i)=='E'){
                hx=hx+"1110";
            }
            if(n.charAt(i)=='F'){
                hx=hx+"1111";
            }
            if(n.charAt(i)=='0'){
                hx=hx+"0000";
            }
            if(n.charAt(i)=='1'){
                hx=hx+"0001";
            }
            if(n.charAt(i)=='2'){
                hx=hx+"0010";
            }
            if(n.charAt(i)=='3'){
                hx=hx+"0011";
            }
            if(n.charAt(i)=='4'){
                hx=hx+"0100";
            }
            if(n.charAt(i)=='5'){
                hx=hx+"0101";
            }
            if(n.charAt(i)=='6'){
                hx=hx+"0110";
            }
            if(n.charAt(i)=='7'){
                hx=hx+"0111";
            }
            if(n.charAt(i)=='8'){
                hx=hx+"1000";
            }
            if(n.charAt(i)=='9'){
                hx=hx+"1001";
            }
            
        }
        int c=0;
        for(int i=0;i<hx.length();i++){
            if(hx.charAt(i)=='1')
                break;
            else{
                c++;
            }
        }
        hx=hx.substring(c,hx.length());
        if(hx.equals(""))
            return "0";
        else
            return hx;
    }
    
    public long toDecimal(String n){
        return binary.toDecimal(Long.parseLong(toBinary(n)));
    }
    
    public String toOctal(String n){
        return decimal.toOctal(toDecimal(n));
    }
}