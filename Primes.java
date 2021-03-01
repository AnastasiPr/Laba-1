package com.company;

public class Primes {

    public static boolean IsPrime (int n){
        for (int i=2; i<n; i++){
            if (n%i==0) {  //как только происходит целочисленное деоение нацело, метод завершается и возвращает false
                return false;
            }
        }return true; //если if не сработал, то число простое и возвращется true
    }

    public static void main(String[] args) {

        for (int j=2; j<=100; j++){
            if (IsPrime(j)==true){
                System.out.print(j+" ");
            }
        }

    }
}
