package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] [] a = new int [4] [4];
        int e=1;
        for (int i = 0; i < 4; i++) {

                if (i%2==0) {
                    for(int j = 0; j < 4; j++) {
                        a[i][j] = e;
                        e++;
                    }
                }
                else{
                    for(int j = 3; j >= 0; j--){
                        a[i][j]=e;
                        e++;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+a[i][3]);
            }
        }
    }
