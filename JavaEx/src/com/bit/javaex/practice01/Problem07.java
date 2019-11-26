package com.bit.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

   public static void Problem07() {

      Scanner scanner = new Scanner(System.in);
      int o = 0;
      String yn = "o";
      String yn1 = "n";
      int answer = 0;
      while (yn!="y") {
         System.out.println("================");
         System.out.println("[숫자 맞추기 게임 시작]");
         System.out.println("================");
         int q = (int) (Math.random() * 100) + 1;
         for (int i = 1; i <= 100; i++) {
            
            
            answer = scanner.nextInt();
//            System.out.println(q);  //math.random 숫자 확인
            if (q == answer) {

               System.out.println("맞았습니다.");
               break;
            } 
               if (q > answer) {
                  System.out.println("더 높게");
               } else {
                  System.out.println("더 낮게");
               }
            

         }
         while (true) {
            System.out.println("게임을 종료하시겠습니까?(y/n)");
            Scanner scanner1 = new Scanner(System.in);
            yn = scanner1.nextLine();
            
            if (yn.equals("y")) {
               System.out.println("숫자 게임을 종료합니다.");

               break;
            } else if (yn.equals("n")) {
               System.out.println("숫자 게임이 다시 시작됩니다.");
               break;
            } else {
               System.out.println("잘못된 문자를 입력하셨습니다.");
            }

         }
      }
      scanner.close();
      
   }

   public static void main(String[] args) {
      Problem07();
   }

}