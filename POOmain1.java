package com.mycompany.orientadaaobjeto;

import java.util.Scanner;

public class OrientadaAObjeto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();
        
        r1.base = sc.nextInt();
        r1.altura = sc.nextInt();
        
        r2.base = sc.nextInt();
        r2.altura = sc.nextInt();
        
        System.out.println(r1.area()); 
        System.out.println(r2.area());
        
        System.out.println(r1.perimetro());
        System.out.println(r2.perimetro());
    }
}
