/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cameracomparison;

/**
 *
 * @author jorda
 */
public class Cameracomparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//declaring the 2D array and printing it to display the prices

/**here is the old code that i used. i thought it would work by using 2 different 2d arrays, but it ran into trouble when it came to the spacing of the elements in the arrays, 
 * so i decided to just revamp it and start this area new!
 */
/**String[][] prices = new String[ 3][4];
prices[0][0] = "";
prices[1][0] = "Mirrorless";
prices[2][0] = "DSLR";
prices[0][1] = "Canon";
prices[1][1] = "R10 500";
prices[2][1] = "8 500";
prices[0][2] = "Sony";
prices[1][2] = "R9 500";
prices[2][2] = "R7 200";
prices[0][3] = "Nikon";
prices[1][3] = "R12 000";
prices[2][3] = "R8 000";


          System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
     System.out.println("Camera Technology Report");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (String[] price1 : prices) {
            System.out.println();
            for (String price : price1) {
                System.out.println(price + "");
            }
        }
        //declaring the 2d array to display the differences
                  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("");
        System.out.println("Camera Technology Results");
           System.out.println("");
             System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
String[][] diff = new String[2][3];
diff[0][0] = "Canon";
diff[1][0] = "R2 000";
diff[0][1] = "Sony";
diff[1][1] = "R2 300";
diff[0][2] = "Nikon";
diff[1][2] = "R4 000 ***";

        for (String[] diff1 : diff) {
            System.out.println();
    for (String diff11 : diff1) {
        System.out.println(diff11 + "");
    }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("The company with the biggest price difference between technologies is: Nikon");
     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
     //simply printed out the company with the highest difference
        */   
      System.out.println("----------------------------------------------------------------------------------------------------");
      System.out.println("Computer Technology Report");
      System.out.println("----------------------------------------------------------------------------------------------------");
      //decided not to use the extra print statements to create a blank space between the heading and the border because it just looked better.
   String [][] Printing = { {"Canon", "R10 500.00", "R8 500.00"}, {"Sony", "R9 500.00", "R7 200.00"}, {"Nikon", "R12 000.00", "R8 000.00"} };
    System.out.println("        Mirrorless      DRSL        ");
        //im keeping the 2 types of technologies as a simple print statement as it can make iteasier when it comes to spacing.
        //using a nested for loop to get it to register the array and then printing the contents of the array
        for (String[] Printing1 : Printing) {
          for (String Printing11 : Printing1) {
              System.out.println(Printing11 + "                       ");
              //[J.Farrell, 2023, Java Programming, page 380-381]
          }
        }
    
 
          System.out.println("----------------------------------------------------------------------------------------------------");
               System.out.println("Computer Technology Results");
        System.out.println("----------------------------------------------------------------------------------------------------");
        String[][] Printed = { {"Canon", "R2 000.00"}, {"Sony", "R2 300.00"}, {"Nikon", "R4 000.00 ***"} };
        for (String[] Printed1 : Printed) {
              for (String Printed11 : Printed1) {
                  System.out.println(Printed11 + "                    ");
                  //[J.Farrell, 2023, Java Programming, page 380-381]
              }
        }
          System.out.println("----------------------------------------------------------------------------------------------------");
                  System.out.println("The brand with the highest difference between the two technologies is: Nikon");
                  System.out.println("----------------------------------------------------------------------------------------------------");
    }
              }
        
    
    

    

