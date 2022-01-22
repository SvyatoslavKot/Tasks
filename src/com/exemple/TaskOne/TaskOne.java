package com.exemple.TaskOne;

import java.util.Scanner;

public class TaskOne {
        public static void main(String[] args) {
            One one = new One();
            SecondTask secondTask = new SecondTask();

            //one.oneMethod();
            secondTask.secondMethod();
        }

    }
    class One {
        public void oneMethod(){
            String str = "aftdy";
            System.out.println(str);
            char simbol[] = str.toCharArray();
            for (int x = simbol.length - 1; x >= 0; x--) {
                System.out.print(simbol[x]);
            }
        }

    }

    class SecondTask {
        public void  secondMethod(){
            String str;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите вашу строку.");
            str = scanner.nextLine();
            String[] temp = str.split("");
            for (int x=temp.length-1; x>=0;x--){
                System.out.print(temp[x] + " ");
            }


        }
    }

