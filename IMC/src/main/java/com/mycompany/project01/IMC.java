package com.mycompany.project01;

import java.util.Scanner;


public class IMC {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int idade = scanner.nextInt();
        
        System.out.println(idade);
        
        float peso=72;
        double altura=1.80;
        double imc = peso / (altura*altura);
        System.out.println("Seu IMC é: "+imc);
        System.out.println("Hello World!");
    }
}
