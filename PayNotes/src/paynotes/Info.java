/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paynotes;

public class Info {
    char kamar; 
    int harga = 10000; 
    
public void Info(){
        System.out.println("Select Class : ");
        System.out.println("Class A :");
        System.out.println("Class B: ");
        System.out.println("Class C: ");    
       

switch(kamar){
case 'A':
System.out.println("Terdapat AC, WiFi Gratis, Lokasi Strategis, dan SpringBed"); 
    System.out.println("Harga: " + harga);;
break; 

case 'B':
System.out.println("Terdapat WiFi Gratis, Lokasi Strategis, dan Kasur");
    System.out.println("Rp. 1.000.000");
break;

case 'C': 
System.out.println("Terdapat AC, Lokasi Strategis, dan Karpet"); 
    System.out.println("Rp. 500.000");
}
}


    }
