/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penanganan;

/**
 *
 * @author hp
 */
public class exc13 {
    public static void main(String[] args){
        byte[] b = new byte[5];
        System.out.println("input bilangan bulat : ");
        try{
            System.in.read(b);
        }catch (java.io.IOException e){
            System.err.println(e);
        }
            String a = new String(b);
            int n = Integer.valueOf(a);
            System.out.println("Hasil : " + (n+2));
    }
}
