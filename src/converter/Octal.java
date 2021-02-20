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
public class Octal {
    
    Binary binary = new Binary();
    Decimal decimal = new Decimal();
    
    public String toBinary(String n){
        String o="";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='0')
                o=o+"000";
            else if(n.charAt(i)=='1')
                o=o+"001";
            else if(n.charAt(i)=='2')
                o=o+"010";
            else if(n.charAt(i)=='3')
                o=o+"011";
            else if(n.charAt(i)=='4')
                o=o+"100";
            else if(n.charAt(i)=='5')
                o=o+"101";
            else if(n.charAt(i)=='6')
                o=o+"110";
            else if(n.charAt(i)=='7')
                o=o+"111";
            else{}
        }
        int c=0;
        for(int i=0;i<o.length();i++){
            if(o.charAt(i)=='1')
                break;
            else{
                c++;
            }
        }
        o=o.substring(c,o.length());
        if (o.equals(""))
            return "0";
        else
            return o;
    }
    
    public long toDecimal(String n){
        return binary.toDecimal(Long.parseLong(toBinary(n)));
    }
    
    public String toHexadecimal(String n){
        return decimal.toHexadecimal(binary.toDecimal(Long.parseLong(toBinary(n))));
    }
}
