/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author Antonia Wunu
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // percabangan if
        //lulus apabila nilai 80 ke atas
        
        int nilai=0;
        String ket;
        
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Input Nilai: ");
        nilai = Integer.parseInt(dtIN.nextLine());
        
        if(nilai>=80) {
            ket = "Lulus";
        }else{
            ket = " Tidak Lulus";
        }
        System.out.printf("dinyatakan %s", ket);
    }
    
}
