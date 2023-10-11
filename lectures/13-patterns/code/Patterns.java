import java.util.Map;

public class Patterns {
    public static void main(String arg[]){
        Patterns patterns = new Patterns();
        patterns.pattern1();
        patterns.pattern2();
        patterns.pattern3();
        patterns.pattern4();
        patterns.pattern5();
        patterns.pattern6();
        patterns.pattern7();
        patterns.pattern8();
        patterns.pattern9();
        patterns.pattern10();
        patterns.pattern11();
        patterns.pattern12();
        patterns.pattern13();
        patterns.pattern14();
        patterns.pattern15();
        patterns.pattern16();
        patterns.pattern17();
    }
    void pattern1() {
      /* *****
         *****
         *****
         *****
         *****  */
        System.out.println("1_____________________________");
        for (int i =0; i <5;i++){
            for (int j = 0; j<=5;j++){
                System.out.print("*");
            }System.out.println();
        }


    }

    void pattern2() {
        /*  *
            **
            ***
            ****
            *****  */
        System.out.println("2_____________________________");
        for (int i =0; i <5;i++){
            for (int j = 0; j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }

    }

    void pattern3() {
        /*
            *****
             ****
              ***
               **
                *
         */
        System.out.println("3_____________________________");
        for (int i =0; i <5;i++){
            for (int j = 0; j<5;j++){
                if(j<i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }System.out.println();
        }
    }

    void pattern4() {
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        System.out.println("4_____________________________");
        for (int i =0; i <5;i++){
            for (int j = 0; j<=i;j++){
                    System.out.print(j+1);
            }System.out.println();
        }
    }

    void pattern5() {
        /*

         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         */
        System.out.println("5_____________________________");

        int rows = 9;
        int colms = 5;
        for (int i =0; i < rows;i++){
            int k = i ;
            if (k>=colms){
                k = rows - 1 - i;
            }
            int j = 0;
            while (j<=k){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

    void pattern6() {
        /*
            *
           **
          ***
         ****
        *****
         */
        int row = 5;
        System.out.println("6_____________________________");
        for (int i =0; i <5;i++){
            for (int j = 0; j<5;j++){
                if(j>=4-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }System.out.println();
        }
    }

    void pattern7() {
        /*

         *****
         ****
         ***
         **
         *

         */
        int row = 5;
        System.out.println("7_____________________________");
        for (int i =0; i <5;i++){
            for (int j = 0; j<5;j++){
                if(j>4-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }System.out.println();
        }
    }

    void pattern8() {
        /*

            *
           ***
          *****
         *******
        *********

         */
        int row = 5;
        int colm = 9;
        int mid = colm/2;

        int low = mid;
        int high = mid;
        System.out.println("8_____________________________");
        for (int i =0; i <5;i++){
            int j = 0;
            while (j<colm){
                if(j<low || high<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                j++;
            }
            low --;
            high++;
            System.out.println();
        }
    }

    void pattern9() {
        /*

        *********
         *******
          *****
           ***
            *

         */
        int row = 5;
        int colm = 9;
        int mid = colm/2;

        int low = 0;
        int high =8;
        System.out.println("9_____________________________");
        for (int i =0; i <5;i++){
            int j = 0;
            while (j<colm){
                if(j<low || high<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                j++;
            }
            low ++;
            high--;
            System.out.println();
        }
    }

    void pattern10() {
        /*

             *
            * *
           * * *
          * * * *
         * * * * *

         */
        int row = 5;
        int colm = 9;
        int mid = colm/2;

        int low = mid;
        int high =mid;
        System.out.println("10____________________________");
        for (int i =0; i <5;i++){
            int j = 0;
            while (j<colm){
                if(j<low || high<j || (i%2 ==0 && j%2!=0) || (i%2!=0 && j%2 ==0)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                j++;
            }
            low --;
            high++;
            System.out.println();
        }
    }

        void pattern11() {
        /*

        * * * * *
         * * * *
          * * *
           * *
            *

         */
        int row = 5;
        int colm = 9;
        int mid = colm/2;

        int low = 0;
        int high =8;
        System.out.println("11____________________________");
        for (int i =0; i <5;i++){
            int j = 0;
            while (j<colm){
                if(j<low || high<j || (i%2 ==0 && j%2!=0) || (i%2!=0 && j%2 ==0)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                j++;
            }
            low ++;
            high--;
            System.out.println();
        }
    }

    void pattern12() {
        /*

        * * * * *
         * * * *
          * * *
           * *
            *
            *
           * *
          * * *
         * * * *
        * * * * *

         */
        int row = 10;
        int colm = 9;
        int mid = colm/2;

        int low = 0;
        int high =8;
        System.out.println("12____________________________");
        for (int i =0; i <row;i++){
            int j = 0;
            while (j<colm){
                if(j<low || high<j
                         || (i<=4 && ((i%2 ==0 && j%2!=0) || (i%2!=0 && j%2 ==0)))
                         || (i>4 && ((i%2 ==0 && j%2==0) || (i%2!=0 && j%2 !=0))))
                {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                j++;
            }
            if(i>4){
                low--;
                high++;
            }else if(i<4){
                low ++;
                high--;
            }
            System.out.println();
        }
    }

    void pattern13() {
        /*

             *
            * *
           *   *
          *     *
         *********

         */
        int row = 5;
        int colm = 9;
        int mid = colm/2;

        int low = mid;
        int high =mid;
        System.out.println("13____________________________");
        for (int i =0; i <5;i++){
            int j = 0;
            while (j<colm){
                if(j==low || high==j || i==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            low --;
            high++;
            System.out.println();
        }
    }

    void pattern14() {
        /*

            *
           * *
          *   *
         *     *
        *********

         */
        int row = 5;
        int colm = 9;
        int mid = colm/2;

        int low = 0;
        int high =8;
        System.out.println("14____________________________");
        for (int i =0; i <5;i++){
            int j = 0;
            while (j<colm){
                if(j==low || high==j || i==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            low ++;
            high--;
            System.out.println();
        }
    }

    void pattern15() {
        /*

             *
            * *
           *   *
          *     *
         *       *
          *     *
           *   *
            * *
             *

         */
        int row = 10;
        int colm = 9;
        int mid = colm/2;

        int low = mid;
        int high =mid;
        System.out.println("15____________________________");
        for (int i =0; i <row;i++){
            int j = 0;
            while (j<colm){
                if(j==low || high==j )
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            if(i>4){
                low++;
                high--;
            }else if(i<4){
                low --;
                high++;
            }
            System.out.println();
        }
    }

    void pattern16() {
        /*

              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

         */
        int row = 5;
        int colm = 9;
        int mid = colm/2;

        int low = mid;
        int high =mid;
        System.out.println("16____________________________");
        for (int i =0; i <row;i++){
            int j = 0;
            while (j<colm){
                if(j<low || high<j || (i%2 ==0 && j%2!=0) || (i%2!=0 && j%2 ==0)){
                    System.out.print(" ");
                }else if(j==low || j == high){
                    System.out.print("1");
                }
                else if(j==low+2 || j==high-2){
                    System.out.print(i);
                }else{
                    System.out.print((i-1)+ (i-1));
                }
                j++;
            }
            low --;
            high++;
            System.out.println();
        }
    }

    void pattern17() {
        /*

         1
        212
       32123
      4321234
       32123
        212
         1

         */
        int row = 7;
        int colm = 7;
        int mid = colm/2;


        int low = mid;
        int high =mid;
        int l = 1;
        System.out.println("17____________________________");
        for (int i =0; i <row;i++){
            int j = 0;

            int k ;
            if(i>mid){
                k = i-l ;
                l=l+2;
            }else {
                k = i+1;
            }
            while (j<colm){
                if(j<low || high<j )
                {
                    System.out.print(" ");
                }else{
                    System.out.print(Math.abs(k));
                    k--;
                    if(k==0){
                       k= k-2;
                    }
                }
                j++;
            }
            if(i>mid){
                low++;
                high--;
            }else if(i<mid){

                low --;
                high++;
            }else{
                low++;
                high--;

            }
            System.out.println();
        }
    }
}
