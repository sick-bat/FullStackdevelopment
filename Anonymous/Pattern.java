import java.util.*;

public class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i=0;i<n;i++){
        //     for (int j=0;j<n+1;j++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }
        
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        // for (int i=0;i<n;i++){
        //     for (int j=0;j<n;j++){
        //         if (i==0 || i==n-1 || j==0 || j==n-1){
        //             System.out.print("*");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    
        // *
        // **
        // ***
        // ****
        // for (int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // *****
        // ****
        // ***
        // **
        // *

        // for (int i=n;i>0;i--){
        //     for (int j=i;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
        // for (int i=0;i<n;i++){
        //     for (int j=0;j<n;j++){
        //         if (i<j){
        //             System.out.print("*");
        //         }
        //         else 
        //         {System.out.print(" ");}
        //     }
        //     System.out.println();
        // }

        // 1
        // 12
        // 123
        // 1234
        // 12345
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 54321
        // 4321
        // 321
        // 21
        // 1
        // for (int i=n;i>0;i--){
        //     for (int j=i;j>0;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // 12345
        // 1234
        // 123
        // 12
        // 1
        // for (int i=n;i>0;i--){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

// int count = 1;

// 1
// 23
// 456
// 78910

// for (int i=0;i<n;i++){
//     for (int j=0;j<i;j++){
//         System.out.print(count++);
//     }
//     System.out.println();
// }

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1

// for (int i=1;i<=n;i++){
//     for (int j=1;j<=i;j++){
//         if ((i+j) %2 ==0)
//         System.out.print(1+" ");
//         else 
//         System.out.print(0+ " ");
//     }
//     System.out.println();
// }

// *****
//    *****
//   *****
//  *****
// *****

// for (int i=1;i<=n;i++){
//     for (int j=n;j>i;j--){
//         System.out.print(" ");
//     }
//     for (int k=1;k<=n;k++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// ****
//     ****
//    ****
//   ****
//  ****

// for (int i=0;i<=n;i++){
//     for (int j=0;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for (int j=0;j<n;j++){
//         System.out.print("*");
//     }
// System.out.println();
// }


// *             * 
// * *         * * 
// * * *     * * * 
// * * * * * * * * 
// * * * * * * * * 
// * * *     * * * 
// * *         * * 
// *             *

// for (int i=1;i<=n;i++){
//     for (int j=1;j<=2*n;j++){
//         if (j<=i || j>=(2*n-i+1)){
//             System.out.print("*"+" ");
//         }
//         else {
//             System.out.print("  ");
//         }
//     }
//     System.out.println();
// }
// for (int i=n;i>=1;i--){
//     for (int j=2*n;j>=1;j--){
//         if (j<=i || j>=(2*n-i+1)){
//             System.out.print("*"+" ");
//         }
//         else {
//             System.out.print("  ");
//         }
//     }
//     System.out.println();
// }

for (int i=0;i<=n;i++){
    for (int j=n;j>=i;j--){
        System.out.print("  ");

    }
    for (int j=1;j<=i;j++){
        System.out.print(" " +i+" ");
    }
    System.out.println();
}

    


    }
    
}
