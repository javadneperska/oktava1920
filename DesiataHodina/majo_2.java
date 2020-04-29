package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                System.out.println("Zadajte 1. cislo: ");
                int z = sc.nextInt();
                System.out.println("Zadajte 2. cislo: ");
                int k = sc.nextInt();

                if(z<k) {
                    for (int i=z; i<=k ; i++){


                        if(i%2==0){
                            System.out.println(i);
                        }
                    }


                }
                else{
                    for(int i = k; i<=z ; i++){


                        if(i%2==0){
                            System.out.println(i);
                        }
                    }
                }
            }
        }
