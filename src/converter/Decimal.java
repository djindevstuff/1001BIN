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
public class Decimal {
    
    public String toBinary(long n){
        String b="";
        long d;
        while(n>0){
            d=n%2;
            b=d+b;
            n=n/2;
        }
        if(b.equals(""))
            return "0";
        else
            return b;
    }
    
    public String toOctal(long n){
        String b="";
        long d;
        while(n>0){
            d=n%8;
            b=d+b;
            n=n/8;
        }
        if(b.equals(""))
            return "0";
        else
            return b;
    }
    
    public String toHexadecimal(long n){
        String hx="";
        long d;
        while(n>0){
            d=n%16;
            if(d<10){
                hx=d+hx;
            }
            else if(d==10){
                hx="A"+hx;
            }
            else if(d==11){
                hx="B"+hx;
            }
            else if(d==12){
                hx="C"+hx;
            }
            else if(d==13){
                hx="D"+hx;
            }
            else if(d==14){
                hx="E"+hx;
            }
            else if(d==15){
                hx="F"+hx;
            }
            else{}
            n=n/16;
        }
        if(hx.equals(""))
            return "0";
        else
            return hx;
    }
}
