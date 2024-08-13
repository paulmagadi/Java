/* public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World! This is my first Java code.");
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome!");
  }
} 
*/


// public class Main {
//     public static void main(String[] args) {
//       // Student data
//       String studentName = "John Doe";
//       int studentID = 15;
//       int studentAge = 23;
//       float studentFee = 75.25f;
//       char studentGrade = 'B';
      
//       // Print variables
//       System.out.println("Student name: " + studentName);
//       System.out.println("Student id: " + studentID);
//       System.out.println("Student age: " + studentAge);
//       System.out.println("Student fee: " + studentFee);
//       System.out.println("Student grade: " + studentGrade);
//     }
// }


// // Calculate the area of a rectangle
// public class Main {
//     public static void main(String[] args) {
//       // Create integer variables
//       int length = 4;
//       int width = 6;
//       int area;
  
//       // Calculate the area of a rectangle
//       area = length * width;
  
//       // Print variables
//       System.out.println("Length is: " + length);
//       System.out.println("Width is: " + width);
//       System.out.println("Area of the rectangle is: " + area);
//     }
//   }
  

// public class Main {
//     public static void main(String[] args) {
//       // Create variables of different data types
//       int items = 50;
//       float costPerItem = 9.99f;
//       float totalCost = items * costPerItem;
//       char currency = '$';
  
//       // Print variables
//       System.out.println("Number of items: " + items);
//       System.out.println("Cost per item: " + costPerItem + currency);
//       System.out.println("Total cost = " + totalCost + currency);
//     }
//   }


// Widening Casting
// Widening casting is done automatically when passing a smaller size type to a larger size type:

// ExampleGet your own Java Server
// public class Main {
//   public static void main(String[] args) {
//     int myInt = 9;
//     double myDouble = myInt; // Automatic casting: int to double

//     System.out.println(myInt);      // Outputs 9
//     System.out.println(myDouble);   // Outputs 9.0
//   }
// }

// public class Main {
//     public static void main(String[] args) {
//       // An array storing different ages
//       int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
  
//       float avg, sum = 0;
  
//       // Get the length of the array
//       int length = ages.length;
  
//       // Loop through the elements of the array
//       for (int age : ages) {
//         sum += age;
//       }
      
//       // Calculate the average by dividing the sum by the length
//       avg = sum / length;
  
//       // Print the average
//       System.out.println("The average age is: " + avg);
//     }
//   }

public class Main {
    public static void main(String[] args) {
      // An array storing different ages
      int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
  
      float avg, sum = 0;
  
      // Get the length of the array
      int length = ages.length;
      
      // Create a 'lowest age' variable and assign the first array element of ages to it
      int lowestAge = ages[0];
  
      // Loop through the elements of the ages array to find the lowest age
      for (int age : ages) {
        // Check if the current age is smaller than the current 'lowest age'
        if (lowestAge > age) {
          // If the smaller age is found, update 'lowest age' with that element
          lowestAge = age;
        }
      }
  
      // Output the value of the lowest age
      System.out.println("The lowest age in the array is: " + lowestAge);
    }
  }
  