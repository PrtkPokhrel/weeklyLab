// import java.lang.Math;

// public class Rough {
//     public static void main(String[] args) {
//         double random;
//         int a=0;
//         double[] r=new double [4];
    


//         // System.out.println(random);

//         for (int i = 0; i < 2; i++) {
//             random = Math.random();
//             random = 20 * random;
//             random = Math.floor(random);
//             random = random + 1;

//             if (random < 10) {
//                 random = random + 10;
//                 r[a]=random;
//                 a++;
               

                
//             } else {

//                 r[a]=random;
//                 a++;
//             }
//         }

//     System.out.print(r[0]+r[1]);

//     }
//     }



import java.lang.Math;

public class Rough {
    public static void main(String[] args) {
        double random;
        double[] r = new double[2]; // Changed the array size to 2

        for (int i = 0; i < 2; i++) {
            random = Math.random();
            random = 11 * random; // Scale to range [0, 11)
            random = Math.floor(random); // Round down to integer
            random = random + 10; // Adjust range to [10, 20]
            r[i] = random; // Store each random number in the array
        }

        System.out.print(r[0] + " " + r[1]); // Print both random numbers with space between them
    }
}
