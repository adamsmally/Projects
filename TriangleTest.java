/**
*
* Student name:  Adam Ally
* Completion date: 6/04/24
*
* TriangleTest.txt: the template file of TriangleTest.java
* Student tasks: 
* - Write 20 JUnit test cases for Triangle class 
* - Then run this file on the command line with the jar files provided
*
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

  @Test
  public void test1() {
    Triangle triangle = new Triangle("12", "12", "12");
    assertEquals("This is an equilateral triangle. ", triangle.triangleType());
  }

  @Test
  public void test2() {
    Triangle triangle = new Triangle("3", "3", "5");
    assertEquals("This is an isosceles triangle. ", triangle.triangleType());
  }

  @Test
  public void test3() {
    Triangle triangle = new Triangle("4", "5", "6");
    assertEquals("This is a scalene triangle. ", triangle.triangleType());
  }

  @Test
  public void test4() {
    Triangle triangle = new Triangle("10", "10", "4");
    assertEquals("Not a valid triangle!\n", triangle.triangleType());
  }

  @Test
  public void test5() {
    Triangle triangle = new Triangle("a", "2", "3");
    assertEquals("The side 1 is not an integer number.\n\n", triangle.triangleType());
  }

  @Test
  public void test6() {
    Triangle triangle = new Triangle("-2", "2", "3");
    assertEquals("At least one side is negative!\n", triangle.triangleType());
  }

  @Test
  public void test7() {
    Triangle triangle = new Triangle("100", "500", "501");
    assertEquals("This triangle is too big.\n", triangle.triangleType());
  }

  @Test
  public void test8() {
    Triangle triangle = new Triangle("5", "5", "6");
    assertEquals("This is an isosceles triangle. ", triangle.triangleType());
  }

  @Test
  public void test9() {
    Triangle triangle = new Triangle("0", "0", "0");
    assertEquals("This is an equilateral triangle. ", triangle.triangleType());
  }

  @Test
  public void test10() {
    Triangle triangle = new Triangle("3", "4", "5");
    assertEquals("This is a scalene triangle. ", triangle.triangleType());
  }

  @Test
  public void test11() {
    Triangle triangle = new Triangle("7", "24", "25");
    assertEquals("This is a scalene triangle. ", triangle.triangleType());
  }

  @Test
  public void test12() {
    Triangle triangle = new Triangle("10", "15", "30");
    assertEquals("Not a valid triangle!\n", triangle.triangleType());
  }

  @Test
  public void test13() {
    Triangle triangle = new Triangle("5", "5", "5");
    assertEquals("This is an equilateral triangle. ", triangle.triangleType());
  }

  @Test
  public void test14() {
    Triangle triangle = new Triangle("0", "10", "15");
    assertEquals("Not a valid triangle!\n", triangle.triangleType());
  }

  @Test
  public void test15() {
    Triangle triangle = new Triangle("3", "3", "3");
    assertEquals("This is an equilateral triangle. ", triangle.triangleType());
  }

  @Test
  public void test16() {
    Triangle triangle = new Triangle("15", "9", "12");
    assertEquals("This is a scalene triangle. ", triangle.triangleType());
  }

  @Test
  public void test17() {
    Triangle triangle = new Triangle("8", "8", "8");
    assertEquals("This is an equilateral triangle. ", triangle.triangleType());
  }

  @Test
  public void test18() {
    Triangle triangle = new Triangle("7", "7", "11");
    assertEquals("This is an isosceles triangle. ", triangle.triangleType());
  }

  @Test
  public void test19() {
    Triangle triangle = new Triangle("5", "12", "13");
    assertEquals("This is a scalene triangle. ", triangle.triangleType());
  }

  @Test
  public void test20() {
    Triangle triangle = new Triangle("2", "4", "6");
    assertEquals("Not a valid triangle!\n", triangle.triangleType());
  }
}






// Triangle class 

public class Triangle {
    // Instance variables for 3 triangle sides
    private String side1;
    private String side2;
    private String side3;

    // Constructors
    public Triangle() {
        // a default triangle
        this("0", "0", "0");
    }
    
    public Triangle(String str1, String str2, String str3) {
        this.side1 = str1;
        this.side2 = str2;
        this.side3 = str3;
    }

  public static void main(String[] args) {
      // Example usage in the main method
      Triangle equilateralTriangle = new Triangle("5", "5", "5");
      System.out.println(equilateralTriangle.triangleType());

      Triangle isoscelesTriangle = new Triangle("3", "3", "5");
      System.out.println(isoscelesTriangle.triangleType());

      // Add more test cases as needed
  }
    
    // Instance methods
    public String triangleType() {
        
        String type = "";
        
        int s1 = 0, s2 = 0, s3 = 0;
        String errMessage = "";
        try {
            s1 = Integer.parseInt(side1);
        } catch (NumberFormatException e) {
           errMessage += "The side 1 is not an integer number.\n\n";
        }
        try {
            s2 = Integer.parseInt(side2);
        } catch (NumberFormatException e) {
           errMessage += "The side 2 is not an integer number.\n\n";
        }
        try {
            s3 = Integer.parseInt(side3);
        } catch (NumberFormatException e) {
           errMessage += "The side 3 is not an integer number.\n\n";
        }
        
        // Check for a negative side
        if (s1 < 0 || s2 < 0 || s3 < 0) {
               errMessage += "At least one side is negative!\n";            
        }
        
        // Check for vaide sides
        if ((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)) {
               errMessage += "Not a valid triangle!\n";
        }  
         
        if (s1 + s2 + s3 > 1000) {
            errMessage += "This triangle is too big.\n";
        } 
               
        if (errMessage.length() > 0) {
           type = errMessage ;   
        } 
        else {            
            if ((s1 == s2) && (s2 == s3)) {
               type = "This is an equilateral triangle. ";
           } 
           else if (( s1 == s2) || (s2 == s3) || (s1 == s3)) {
               type = "This is an isosceles triangle. ";
           } 
           else {
               type = "This is a scalene triangle. ";
           }                 
        }
        
        return type;
    }
}
