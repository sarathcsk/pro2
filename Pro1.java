/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro1;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Pro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       


      Scanner sc=new Scanner(System.in);
       int n,j;
         n=sc.nextInt();
          String a[]=new String[100];
        for(int i=0;i<n;i++)
         {
         a[i]=sc.next();
         }
         String lon=" ",check;
       if(a.length>0)
          lon=a[0];
          for(int i=1;i<a.length;i++)
           {
           check=a[i];
           for(j=0;j<Math.min(lon.length(),a[i].length());j++)
             {
             if(lon.charAt(j)!=check.charAt(j))
              break;
              }
                lon=a[i].substring(0, j);
            }
          System.out.println("longest prefix is:"+lon);
             }
           }
    
    

