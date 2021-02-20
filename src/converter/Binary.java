/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;
public class Binary{

    Decimal decimal = new Decimal();

    public long toDecimal(long n){
        long d;
        long s=0,i=0,s1,s3;
        while(n>0)
        {
            d=n%10;
            double p2=Math.pow(2,i);
            s3=(long)p2;
            s1=d*s3;
            s=s+s1;
            n=n/10;
            i=i+1;
        }
        return s;
    }

    public String toOctal(String n)
    {
        return decimal.toOctal(toDecimal(Long.parseLong(n)));
    }

    public String toHexadecimal(String n){
        return decimal.toHexadecimal(toDecimal(Long.parseLong(n)));
    }
}
