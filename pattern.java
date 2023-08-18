public class pattern {
    public static void main(String[] args) {

// 1     
        // *****
        // *****
        // *****
        // *****

        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

// 2
        // *
        // **
        // ***
        // ****
        // *****

        // for(int i=1;i<=5;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

// 3
        // *****
        // ****
        // ***
        // **
        // *

        // for(int i=1;i<=5;i++){
        // for(int j=5;j>=i;j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

// 4
        // 1
        // 12
        // 123
        // 1234
        // 12345

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

// 5
        // A
        // BC
        // DEF
        // GHIJ

        // char ch = 'A';
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(ch);
        // ch++;
        // }
        // System.out.println();
        // }

// 6
        // ******
        // *    *
        // *    *
        // ******

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == 1 || i == 4 || j == 1 || j == 5) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

// 7
        //    *
        //   **
        //  ***
        // ****

            // for(int i=1;i<=4;i++){
            // for(int j=1;j<=4-i;j++){
            // System.out.print(" ");
            // }
            // for(int k=1;k<=i;k++){
            // System.out.print("*");
            // }
            // System.out.println();
            // }
// 8
        // 12345
        // 1234
        // 123
        // 12
        // 1

            // for (int i = 1; i <= 5; i++) {
            //     for(int j=1;j<=5-i+1;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }
// 9
        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15

            // int n=1;
            // for(int i=1;i<=5;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(n+" ");
            //         n++;
            //     }
            //     System.out.println();
            // }
// 10   
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

            // for(int i=1;i<=5;i++){
            //     for(int j=1;j<=i;j++){
            //         if((i+j)%2==0){
            //             System.out.print("1 ");
            //         }else{
            //             System.out.print("0 ");
            //         }
            //     }
            //     System.out.println();
            // }

// 11 
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        
        // int n=5;

        //for first half
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // for(int i=1;i<=n;i++){
        //     //star

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     //star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //for second half
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // for(int i=n;i>=1;i--){
        //     //star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     //star
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
// 12
        //            *****
        //           *****
        //          *****
        //         *****
        //        *****

        // int n=5;
        // for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i;j++){
        //                 System.out.print(" ");
        //         }
        //         for(int j=1;j<=n;j++){
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }

// 13 
        //            *****
        //           *   *
        //          *   *
        //         *   *
        //        *****

        // int n=5;
        // for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i;j++){
        //                 System.out.print(" ");
        //         }
        //         for(int j=1;j<=n;j++){
        //                 if(i==1 || i==n || j==1 || j==n){
        //                         System.out.print("*");
        //                 }else{
        //                         System.out.print(" ");
        //                 }
        //         }
        //         System.out.println();
        // }
// 14    
        // Diamond
        // int n=5;
        // for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i;j++){
        //                 System.out.print(" ");
        //         }
        //         for(int j=1;j<=(2*i-1);j++){
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //         for(int j=n-i;j>=1;j--){
        //                 System.out.print(" ");
        //         }
        //         for(int j=2*i-1;j>=1;j--){
        //                 System.out.print("*");
        //         }
        //         System.out.println();
        // }
// 15
        //            1
        //          2   2
        //        3   3   3
        //      4   4   4   4
        //    5   5   5   5   5

// 16 
        //           1
        //         2 1 2
        //       3 2 1 2 3
        //     4 3 2 1 2 3 4
        //   5 4 3 2 1 2 3 4 5
    }
}
