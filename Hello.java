// // java operator exercise
// public class Hello {

//     public static void main(String[] args) {
//         System.out.println("Hello, Tim");
//         System.out.println("hello world");

//         boolean isAlien = false;
//         if (isAlien == false) {
//             System.out.println("It is not an alien!");
//             System.out.println("And I am scared of aliens");
//         }

//         int topScore = 80;
//         if (topScore < 100) {
//             System.out.println("You got the high score!");
//         }

//         int secondTopScore = 95;
//         if ((topScore > secondTopScore) && (topScore < 100)) {
//             System.out.println("Greater than second top score and less than 100");
//         }

//         if ((topScore > 90) || (secondTopScore <= 90)) {
//             System.out.println("Either or both of the conditions are true");
//         }

//         int newValue = 50;
//         if (newValue == 50) {
//             System.out.println("This is true");
//         }

//         boolean isCar = false;
//         if (!isCar) {
//             System.out.println("This is not supposed to happen");
//         }

//         String makeOfCar = "Volkswagen";
//         boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

//         if (isDomestic) {
//             System.out.println("This car is domestic to our country");
//         }

//         String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

//         System.out.println(s);

//         double myFirstValue = 20.00d;
//         double mySecondValue = 80.00d;
//         double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
//         System.out.println("MyValuesTotal = " + myValuesTotal);
//         double theRemainder = myValuesTotal % 40.00d;
//         System.out.println("theRemainder = " + theRemainder);
//         boolean isNoRemainder = (theRemainder == 0) ? true : false;
//         System.out.println("isNoRemainder = " + isNoRemainder);
//         if (!isNoRemainder) {
//             System.out.println("Got some remainder");
//         }

//     }
// }

// Method challenge
// public class MethodChallenge {

//     public static void main(String[] args) {

//         int highScorePosition = calculateHighScorePosition(1500);
//         displayHighScorePosition("Tim", highScorePosition);

//         highScorePosition = calculateHighScorePosition(1000);
//         displayHighScorePosition("Bob", highScorePosition);

//         highScorePosition = calculateHighScorePosition(500);
//         displayHighScorePosition("Percy", highScorePosition);

//         highScorePosition = calculateHighScorePosition(100);
//         displayHighScorePosition("Gilbert", highScorePosition);

//         highScorePosition = calculateHighScorePosition(25);
//         displayHighScorePosition("James", highScorePosition);
//     }

//     public static void displayHighScorePosition(String playerName, int highScorePosition) {
//         System.out.println(playerName + " managed to get into position "
//                 + highScorePosition + " on the high score list");
//     }

//     public static int calculateHighScorePosition(int playerScore) {

//         int position = 4;
//         if (playerScore >= 1000) {
//             position = 1;
//         } else if (playerScore >= 500) {
//             position = 2;
//         } else if (playerScore >= 100) {
//             position = 3;
//         }

//         return position;
//     }
// }
// method overloading challenge
// public class Main {

//     public static void main(String[] args) {

//         System.out.println(getDurationString(3945));  // This is the first test case
//         System.out.println(getDurationString(65, 45));  // This is the second test case
//     }

//     public static String getDurationString(int seconds) {

//         int minutes = seconds / 60;
//         return getDurationString(minutes, seconds);
//     }

//     public static String getDurationString(int minutes, int seconds) {

//         int hours = minutes / 60;

//         int remainingMinutes = minutes % 60;
//         int remainingSeconds = seconds % 60;

//         return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
//     }
// }
// bonus time challange

// public class Main {

//     public static void main(String[] args) {
// java operator exercise
// public class Hello {

//     public static void main(String[] args) {
//         System.out.println("Hello, Tim");
//         System.out.println("hello world");// java operator exercise
// public class Hello {

//     public static void main(String[] args) {// java operator exercise// java operator exercise// java operator exercise
// public class Hello {

//     public static void main(String[] args) {
//         System.out.println("Hello, Tim");
//         System.out.println("hello world");

//         boolean isAlien = false;
//         if (isAlien == false) {
//             System.out.println("It is not an alien!");
//             System.out.println("And I am scared of aliens");
//         }

//         int topScore = 80;
//         if (topScore < 100) {
//             System.out.println("You got the high score!");
//         }

//         int secondTopScore = 95;
//         if ((topScore > secondTopScore) && (topScore < 100)) {
//             System.out.println("Greater than second top score and less than 100");
//         }

//         if ((topScore > 90) || (secondTopScore <= 90)) {
//             System.out.println("Either or both of the conditions are true");
//         }

//         int newValue = 50;
//         if (newValue == 50) {
//             System.out.println("This is true");
//         }

//         boolean isCar = false;
//         if (!isCar) {
//             System.out.println("This is not supposed to happen");
//         }

//         String makeOfCar = "Volkswagen";
//         boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

//         if (isDomestic) {
//             System.out.println("This car is domestic to our country");
//         }

//         String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

//         System.out.println(s);

//         double myFirstValue = 20.00d;
//         double mySecondValue = 80.00d;
//         double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
//         System.out.println("MyValuesTotal = " + myValuesTotal);
//         double theRemainder = myValuesTotal % 40.00d;
//         System.out.println("theRemainder = " + theRemainder);
//         boolean isNoRemainder = (theRemainder == 0) ? true : false;
//         System.out.println("isNoRemainder = " + isNoRemainder);
//         if (!isNoRemainder) {
//             System.out.println("Got some remainder");
//         }

//     }
// }
// public class Hello {

//     public static void main(String[] args) {
//         System.out.println("Hello, Tim");
//         System.out.println("hello world");

//         boolean isAlien = false;
//         if (isAlien == false) {
//             System.out.println("It is not an alien!");
//             System.out.println("And I am scared of aliens");
//         }

//         int topScore = 80;
//         if (topScore < 100) {
//             System.out.println("You got the high score!");
//         }

//         int secondTopScore = 95;
//         if ((topScore > secondTopScore) && (topScore < 100)) {
//             System.out.println("Greater than second top score and less than 100");
//         }

//         if ((topScore > 90) || (secondTopScore <= 90)) {
//             System.out.println("Either or both of the conditions are true");
//         }

//         int newValue = 50;
//         if (newValue == 50) {
//             System.out.println("This is true");
//         }

//         boolean isCar = false;
//         if (!isCar) {
//             System.out.println("This is not supposed to happen");
//         }

//         String makeOfCar = "Volkswagen";
//         boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

//         if (isDomestic) {
//             System.out.println("This car is domestic to our country");
//         }

//         String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

//         System.out.println(s);

//         double myFirstValue = 20.00d;
//         double mySecondValue = 80.00d;
//         double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
//         System.out.println("MyValuesTotal = " + myValuesTotal);
//         double theRemainder = myValuesTotal % 40.00d;
//         System.out.println("theRemainder = " + theRemainder);
//         boolean isNoRemainder = (theRemainder == 0) ? true : false;
//         System.out.println("isNoRemainder = " + isNoRemainder);
//         if (!isNoRemainder) {
//             System.out.println("Got some remainder");
//         }

//     }
// }
// public class Hello {

//     public static void main(String[] args) {
//         System.out.println("Hello, Tim");
//         System.out.println("hello world");

//         boolean isAlien = false;
//         if (isAlien == false) {
//             System.out.println("It is not an alien!");
//             System.out.println("And I am scared of aliens");
//         }

//         int topScore = 80;
//         if (topScore < 100) {
//             System.out.println("You got the high score!");
//         }

//         int secondTopScore = 95;
//         if ((topScore > secondTopScore) && (topScore < 100)) {
//             System.out.println("Greater than second top score and less than 100");
//         }

//         if ((topScore > 90) || (secondTopScore <= 90)) {
//             System.out.println("Either or both of the conditions are true");
//         }

//         int newValue = 50;
//         if (newValue == 50) {
//             System.out.println("This is true");
//         }

//         boolean isCar = false;
//         if (!isCar) {
//             System.out.println("This is not supposed to happen");
//         }

//         String makeOfCar = "Volkswagen";
//         boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

//         if (isDomestic) {
//             System.out.println("This car is domestic to our country");
//         }

//         String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

//         System.out.println(s);

//         double myFirstValue = 20.00d;
//         double mySecondValue = 80.00d;
//         double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
//         System.out.println("MyValuesTotal = " + myValuesTotal);
//         double theRemainder = myValuesTotal % 40.00d;
//         System.out.println("theRemainder = " + theRemainder);
//         boolean isNoRemainder = (theRemainder == 0) ? true : false;
//         System.out.println("isNoRemainder = " + isNoRemainder);
//         if (!isNoRemainder) {
//             System.out.println("Got some remainder");
//         }

//     }
// }
//         System.out.println("Hello, Tim");
//         System.out.println("hello world");

//         boolean isAlien = false;
//         if (isAlien == false) {
//             System.out.println("It is not an alien!");
//             System.out.println("And I am scared of aliens");
//         }

//         int topScore = 80;
//         if (topScore < 100) {
//             System.out.println("You got the high score!");
//         }

//         int secondTopScore = 95;
//         if ((topScore > secondTopScore) && (topScore < 100)) {
//             System.out.println("Greater than second top score and less than 100");
//         }

//         if ((topScore > 90) || (secondTopScore <= 90)) {
//             System.out.println("Either or both of the conditions are true");
//         }

//         int newValue = 50;
//         if (newValue == 50) {
//             System.out.println("This is true");
//         }

//         boolean isCar = false;
//         if (!isCar) {
//             System.out.println("This is not supposed to happen");
//         }

//         String makeOfCar = "Volkswagen";
//         boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

//         if (isDomestic) {
//             System.out.println("This car is domestic to our country");
//         }

//         String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

//         System.out.println(s);

//         double myFirstValue = 20.00d;
//         double mySecondValue = 80.00d;
//         double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
//         System.out.println("MyValuesTotal = " + myValuesTotal);
//         double theRemainder = myValuesTotal % 40.00d;
//         System.out.println("theRemainder = " + theRemainder);
//         boolean isNoRemainder = (theRemainder == 0) ? true : false;
//         System.out.println("isNoRemainder = " + isNoRemainder);
//         if (!isNoRemainder) {
//             System.out.println("Got some remainder");
//         }

//     }
// }

//         boolean isAlien = false;// java operator exercise
// public class Hello {

//     public static void main(String[] args) {
//         System.out.println("Hello, Tim");
//         System.out.println("hello world");

//         boolean isAlien = false;
//         if (isAlien == false) {
//             System.out.println("It is not an alien!");
//             System.out.println("And I am scared of aliens");
//         }

//         int topScore = 80;
//         if (topScore < 100) {
//             System.out.println("You got the high score!");
//         }

//         int secondTopScore = 95;
//         if ((topScore > secondTopScore) && (topScore < 100)) {
//             System.out.println("Greater than second top score and less than 100");
//         }

//         if ((topScore > 90) || (secondTopScore <= 90)) {
//             System.out.println("Either or both of the conditions are true");
//         }

//         int newValue = 50;
//         if (newValue == 50) {
//             System.out.println("This is true");
//         }

//         boolean isCar = false;
//         if (!isCar) {
//             System.out.println("This is not supposed to happen");
//         }

//         String makeOfCar = "Volkswagen";
//         boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

//         if (isDomestic) {
//             System.out.println("This car is domestic to our country");
//         }

//         String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

//         System.out.println(s);

//         double myFirstValue = 20.00d;
//         double mySecondValue = 80.00d;
//         double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
//         System.out.println("MyValuesTotal = " + myValuesTotal);
//         double theRemainder = myValuesTotal % 40.00d;
//         System.out.println("theRemainder = " + theRemainder);
//         boolean isNoRemainder = (theRemainder == 0) ? true : false;
//         System.out.println("isNoRemainder = " + isNoRemainder);
//         if (!isNoRemainder) {
//             System.out.println("Got some remainder");
//         }

//     }
// }
//         if (isAlien == false) {
//             System.out.println("It is not an alien!");
//             System.out.println("And I am scared of aliens");
//         }

//         int topScore = 80;
//         if (topScore < 100) {
//             System.out.println("You got the high score!");
//         }

//         int secondTopScore = 95;
//         if ((topScore > secondTopScore) && (topScore < 100)) {
//             System.out.println("Greater than second top score and less than 100");
//         }

//         if ((topScore > 90) || (secondTopScore <= 90)) {
//             System.out.println("Either or both of the conditions are true");
//         }

//         int newValue = 50;
//         if (newValue == 50) {
//             System.out.println("This is true");
//         }

//         boolean isCar = false;
//         if (!isCar) {
//             System.out.println("This is not supposed to happen");
//         }

//         String makeOfCar = "Volkswagen";
//         boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

//         if (isDomestic) {
//             System.out.println("This car is domestic to our country");
//         }

//         String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

//         System.out.println(s);

//         double myFirstValue = 20.00d;
//         double mySecondValue = 80.00d;
//         double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
//         System.out.println("MyValuesTotal = " + myValuesTotal);
//         double theRemainder = myValuesTotal % 40.00d;
//         System.out.println("theRemainder = " + theRemainder);
//         boolean isNoRemainder = (theRemainder == 0) ? true : false;
//         System.out.println("isNoRemainder = " + isNoRemainder);
//         if (!isNoRemainder) {
//             System.out.println("Got some remainder");
//         }

//     }
// }
//         System.out.println(getDurationString(-3945));  // This is the first test case
//         System.out.println(getDurationString(-65, 45));  // This is the second test case
//         System.out.println(getDurationString(65, 145));
//         System.out.println(getDurationString(65, 45));
//         System.out.println(getDurationString(3945));
//     }

//     public static String getDurationString(int seconds) {

//         if (seconds < 0) {
//             return "Invalid data for seconds(" + seconds
//                     + "), must be a positive integer value";
//         }

//         return getDurationString(seconds / 60, seconds % 60);
//     }

//     public static String getDurationString(int minutes, int seconds) {

//         if (minutes < 0) {
//             return "Invalid data for minutes(" + minutes
//                     + "), must be a positive integer value";
//         }

//         if (seconds <= 0 || seconds >= 59) {
//             return "Invalid data for seconds(" + seconds
//                     + "), must be between 0 and 59";
//         }

//         int hours = minutes / 60;

//         int remainingMinutes = minutes % 60;

//         return hours + "h " + remainingMinutes + "m " + seconds + "s";
//     }
// }

// switch case

//     public static void main(String[] args) {

//       int value = 3;
//       if (value == 1) {
//           System.out.println("Value was 1");
//       } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//       System.out.println("Was not 1 or 2");
//         }

//         int switchValue = 3;

//         switch (switchValue) {
//             case 1:
//                 System.out.println("Value was 1");
//                 break;
//             case 2:
//                 System.out.println("Value was 2");
//                 break;
//             case 3: case 4: case 5:
//                 System.out.println("Was a 3, a 4, or a 5");
//                 System.out.println("Actually it was a " + switchValue);
//                 break;
//             default:
//                 System.out.println("Was not 1, 2, 3, 4, or 5");
//                 break;
//         }
//          More code here
//     }
// }
//  SWITCH CASE challenge
//  public class Main {

//     public static void main(String[] args) {

//         printWeekDay(0);
//         printWeekDay(1);
//         printWeekDay(2);
//         printWeekDay(3);
//         printWeekDay(4);
//         printWeekDay(5);
//         printWeekDay(6);
//         printWeekDay(7);
//     }

//     public static void printDayOfWeek(int day) {

//         String dayOfWeek = switch (day) {
//             case 0 -> { yield "Sunday"; }
//             case 1 -> "Monday";
//             case 2 -> "Tuesday";
//             case 3 -> "Wednesday";
//             case 4 -> "Thursday";
//             case 5 -> "Friday";
//             case 6 -> "Saturday";
//             default -> "Invalid Day";
//         };

//         System.out.println(day + " stands for " + dayOfWeek);
//     }

//     public static void printWeekDay(int day) {

//         String dayOfWeek = "Invalid Day";
//         if (day == 0) {
//             dayOfWeek = "Sunday";
//         } else if (day == 1) {
//             dayOfWeek = "Monday";
//         } else if (day == 2) {
//             dayOfWeek = "Tuesday";
//         } else if (day == 3) {
//             dayOfWeek = "Wednesday";
//         } else if (day == 4) {
//             dayOfWeek = "Thursday";
//         } else if (day == 5) {
//             dayOfWeek = "Friday";
//         } else if (day == 6) {
//             dayOfWeek = "Saturday";
//         }

//         System.out.println(day + " stands for " + dayOfWeek);
//     }
// }

// =====================
// Sum 3 and 5 Challenge
// =====================

// *Create a for loop using a range of numbers from 1 to 1000 inclusive.

// *Sum all the numbers that can be divided by both 3 and 5

// public class Main {

//     public static void main(String[] args) {

//         int countOfMatches = 0;
//         int sumOfMatches = 0;

//         for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
//             if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
//                 countOfMatches++;
//                 sumOfMatches += loopNumber;
//                 System.out.println("Found a match = " + loopNumber);
//             }

//             if (countOfMatches == 5) {
//                 break;
//             }
//         }

//         System.out.println("Sum = " + sumOfMatches);
//     }
// }


// WHILE LOOP Challenge

// public class Main {

//     public static void main(String[] args) {

//         int number = 4;
//         int finishNumber = 20;
//         int evenCount = 0;
//         int oddCount = 0;

//         while (number <= finishNumber) {
//             number++;
//             if (!isEvenNumber(number)) {
//                 oddCount++;
//                 continue;
//             }
//             System.out.println("Even number " + number);
//             evenCount++;
//             if (evenCount >= 5) {
//                 break;
//             }
//         }

//         System.out.println("Total odd numbers found = " + oddCount);
//         System.out.println("Total even numbers found = " + evenCount);
//     }

//     public static boolean isEvenNumber(int number) {

//         if ((number % 2) == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }


// SUM OF DIGITS

// public class Main {

//     public static void main(String[] args) {

//         System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
//         System.out.println("The sum of the digits in number 1234 is " + sumDigits(-125));
//         System.out.println("The sum of the digits in number 1234 is " + sumDigits(4));
//         System.out.println("The sum of the digits in number 1234 is " + sumDigits(32123));
//     }

//     public static int sumDigits(int number) {

//         if (number < 0) {
//             return -1;
//         }

//         int sum = 0;

//         while (number > 9) {
//             sum += (number % 10);
//             number = number / 10;
//         }

//         sum += number;

//         return sum;
//     }
// }

// Reading input from terminal

// public class Main {

//     public static void main(String[] args) {

//         int currentYear = 2022;

//         System.out.println(getInputFromConsole(currentYear));

//         System.out.println(getInputFromScanner(currentYear));
//     }

//     public static String getInputFromConsole(int currentYear) {

//         String name = System.console().readLine("Hi, What's your Name? ");
//         System.out.println("Hi " + name + ", Thanks for taking the course!");

//         String dateOfBirth = System.console().readLine("What year were you born? ");
//         int age = currentYear - Integer.parseInt(dateOfBirth);

//         return "So you are " + age + " years old";
//     }

//     public static String getInputFromScanner(int currentYear) {

//         return "";
//     }
// }


// Exception Handling and reading input from scanner

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         int currentYear = 2022;

//         try {
//             System.out.println(getInputFromConsole(currentYear));
//         } catch (NullPointerException e) {
//             System.out.println(getInputFromScanner(currentYear));
//         }
//     }

//     public static String getInputFromConsole(int currentYear) {

//         String name = System.console().readLine("Hi, What's your Name? ");
//         System.out.println("Hi " + name + ", Thanks for taking the course!");

//         String dateOfBirth = System.console().readLine("What year were you born? ");
//         int age = currentYear - Integer.parseInt(dateOfBirth);

//         return "So you are " + age + " years old";
//     }

//     public static String getInputFromScanner(int currentYear) {

//         Scanner scanner = new Scanner(System.in);

// //        String name = System.console().readLine("Hi, What's your Name? ");
//         System.out.println("Hi, What's your Name? ");
//         String name = scanner.nextLine();

//         System.out.println("Hi " + name + ", Thanks for taking the course!");

// //        String dateOfBirth = System.console().readLine("What year were you born? ");
//         System.out.println("What year were you born? ");

//         boolean validDOB = false;
//         int age = 0;

//         do {
//             System.out.println("Enter a year of birth >= " +
//                     (currentYear - 125) + " and <= " + (currentYear));
//             try {
//                 age = checkData(currentYear, scanner.nextLine());
//                 validDOB = age < 0 ? false : true;
//             } catch (NumberFormatException badUserData) {
//                 System.out.println("Characters not allowed!!! Try again.");
//             }
//         } while (!validDOB);

//         return "So you are " + age + " years old";
//     }

//     public static int checkData(int currentYear, String dateOfBirth) {

//         int dob = Integer.parseInt(dateOfBirth);
//         int minimumYear = currentYear - 125;

//         if ((dob < minimumYear) || (dob > currentYear)) {
//             return -1;
//         }

//         return (currentYear - dob);
//     }
// }



// Reading user input challange

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         int counter = 1;
//         double sum = 0;

//         do {
//             System.out.println("Enter number #" + counter + ":");
//             String nextNumber = scanner.nextLine();
//             try {
// //                int number = Integer.parseInt(nextNumber);
//                 double number = Double.parseDouble(nextNumber);
//                 counter++;
//                 sum += number;
//             } catch (NumberFormatException nfe) {
//                 System.out.println("Invalid number");
//             }
//         } while (counter <= 5);

//         System.out.println("The sum of the 5 numbers = " + sum);
//     }
// }
// Getter and Setter method
// public class Car {

//     private String make = "Tesla";
//     private String model = "Model X";
//     private String color = "Gray";
//     private int doors = 2;
//     private boolean convertible = true;

//     public String getMake() {
//         return make;
//     }

//     public String getModel() {
//         return model;
//     }

//     public String getColor() {
//         return color;
//     }

//     public int getDoors() {
//         return doors;
//     }

//     public boolean isConvertible() {
//         return convertible;
//     }

//     public void setMake(String make) {

//         if (make == null) make = "Unknown";
//         String lowercaseMake = make.toLowerCase();
//         switch (lowercaseMake) {
//             case "holden", "porsche", "tesla" -> this.make = make;
//             default -> {
//                 this.make = "Unsupported ";
//             }
//         }
//     }

//     public void setModel(String model) {
//         this.model = model;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }

//     public void setDoors(int doors) {
//         this.doors = doors;
//     }

//     public void setConvertible(boolean convertible) {
//         this.convertible = convertible;
//     }

//     public void describeCar() {

//         System.out.println(doors + "-Door " +
//                 color + " " +
//                 make + " " +
//                 model + " " +
//                 (convertible ? "Convertible" : ""));
//     }
// }

// Constructor
// public class Account {

//     private String number;
//     private double balance;
//     private String customerName;
//     private String customerEmail;
//     private String customerPhone;

//     public Account() {
//         System.out.println("Empty constructor called");
//     }

//     public Account(String number, double balance, String customerName, String email,
//                    String phone) {
//         System.out.println("Account constructor with parameters called");
//         this.number = number;
//         this.balance = balance;
//         this.customerName = customerName;
//         customerEmail = email;
//         customerPhone = phone;
//     }

//     public void depositFunds(double depositAmount) {

//         balance += depositAmount;
//         System.out.println("Deposit of $" + depositAmount + " made. New balance is $" +
//                 balance);
//     }

//     public void withdrawFunds(double withdrawalAmount) {

//         if (balance - withdrawalAmount < 0) {
//             System.out.println("Insufficient Funds! You only have $" + balance +
//                     " in your account.");
//         } else {
//             balance -= withdrawalAmount;
//             System.out.println("Withdrawal of $" + withdrawalAmount +
//                     " processed, Remaining balance = $" + balance);
//         }
//     }

//     public String getNumber() {
//         return number;
//     }

//     public void setNumber(String number) {
//         this.number = number;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void setBalance(double balance) {
//         this.balance = balance;
//     }

//     public String getCustomerName() {
//         return customerName;
//     }

//     public void setCustomerName(String customerName) {
//         this.customerName = customerName;
//     }

//     public String getCustomerEmail() {
//         return customerEmail;
//     }

//     public void setCustomerEmail(String customerEmail) {
//         this.customerEmail = customerEmail;
//     }

//     public String getCustomerPhone() {
//         return customerPhone;
//     }

//     public void setCustomerPhone(String customerPhone) {
//         this.customerPhone = customerPhone;
//     }
// }
// POJO
// public class Student {

//     private String id;
//     private String name;
//     private String dateOfBirth;
//     private String classList;

//     public Student(String id, String name, String dateOfBirth, String classList) {
//         this.id = id;
//         this.name = name;
//         this.dateOfBirth = dateOfBirth;
//         this.classList = classList;
//     }

//     @Override
//     public String toString() {
//         return "Student{" +
//                 "id='" + id + '\'' +
//                 ", name='" + name + '\'' +
//                 ", dateOfBirth='" + dateOfBirth + '\'' +
//                 ", classList='" + classList + '\'' +
//                 '}';
//     }

//     public String getId() {
//         return id;
//     }

//     public void setId(String id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getDateOfBirth() {
//         return dateOfBirth;
//     }

//     public void setDateOfBirth(String dateOfBirth) {
//         this.dateOfBirth = dateOfBirth;
//     }

//     public String getClassList() {
//         return classList;
//     }

//     public void setClassList(String classList) {
//         this.classList = classList;
//     }
// }
// public class Main {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {
//             Student s = new Student("S92300" + i,
//                     switch (i) {
//                         case 1 -> "Mary";
//                         case 2 -> "Carol";
//                         case 3 -> "Tim";
//                         case 4 -> "Harry";
//                         case 5 -> "Lisa";
//                         default -> "Anonymous";
//                     },
//                     "05/11/1985",
//                     "Java Masterclass");
//             System.out.println(s);
//         }
//     }
// }
// public class Hello {
//     // write your code here
//     public double width;
//     public double height;

//     public Hello(double width, double height) {
//         if(width<0){
//             width=0;
//         }
//         if(height<0){
//             height=0;
//         }
//         this.width = width;
//         this.height = height;

//     }

//     public Hello() {
//     }

//     public double getWidth() {
//         return width;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public void setWidth(double width) {
//         this.width = width;
//         if(width<0){
//             width=0;
//         }

//     }

//     public void setHeight(double height) {
//         this.height = height;
//         if(height<0){
//             height=0;
//         }
//     }
//     public double getArea(){
//         return height*width;
//     }
// }

// INHERITANCE
// public class Animal {

//     private String type;
//     private String size;
//     private double weight;

//     public Animal() {

//     }

//     public Animal(String type, String size, double weight) {
//         this.type = type;
//         this.size = size;
//         this.weight = weight;
//     }

//     @Override
//     public String toString() {
//         return "Animal{" +
//                 "type='" + type + '\'' +
//                 ", size='" + size + '\'' +
//                 ", weight=" + weight +
//                 '}';
//     }

//     public void move(String speed) {
//         System.out.println(type + " moves " + speed);
//     }

//     public void makeNoise() {
//         System.out.println(type + " makes some kind of noise");
//     }
// }

// public class Dog extends Animal {

//     public Dog() {
//         super("Mutt", "Big", 50);
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Animal animal = new Animal("Generic Animal", "Huge", 400);
//         doAnimalStuff(animal, "slow");

//         Dog dog = new Dog();
//         doAnimalStuff(dog, "fast");
//     }

//     public static void doAnimalStuff(Animal animal, String speed) {

//         animal.makeNoise();
//         animal.move(speed);
//         System.out.println(animal);
//         System.out.println("_ _ _ _");
//     }
// }

// String methods
// public class Main {

//     public static void main(String[] args) {

//         printInformation("Hello World");
//         printInformation("");
//         printInformation("\t   \n");

//         String helloWorld = "Hello World";
//         System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
//         System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

//         System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
//         System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

//         System.out.printf("index of l = %d %n", helloWorld.indexOf('l',
//                 3));
//         System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l',
//                 8));

//         String helloWorldLower = helloWorld.toLowerCase();
//         if (helloWorld.equals(helloWorldLower)) {
//             System.out.println("Values match exactly");
//         }
//         if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
//             System.out.println("Values match ignoring case");
//         }

//         if (helloWorld.startsWith("Hello")) {
//             System.out.println("String starts with Hello");
//         }
//         if (helloWorld.endsWith("World")) {
//             System.out.println("String ends with World");
//         }
//         if (helloWorld.contains("World")) {
//             System.out.println("String contains World");
//         }

//         if (helloWorld.contentEquals("Hello World")) {
//             System.out.println("Values match exactly");
//         }
//     }

//     public static void printInformation(String string) {

//         int length = string.length();
//         System.out.printf("Length = %d %n", length);

//         if (string.isEmpty()) {
//             System.out.println("String is Empty");
//             return;
//         }

//         if (string.isBlank()) {
//             System.out.println("String is Blank");
//         }

//         System.out.printf("First char = %c %n", string.charAt(0));

//         System.out.printf("Last char = %c %n", string.charAt(length - 1));
//     }
// }

// some other string methods
// public class StringMethods {

//     public static void main(String[] args) {

//         String birthDate = "25/11/1982";
//         int startingIndex = birthDate.indexOf("1982");
//         System.out.println("startingIndex = " + startingIndex);
//         System.out.println("Birth year = " + birthDate.substring(startingIndex));

//         System.out.println("Month = " + birthDate.substring(3, 5));

//         String newDate = String.join("/", "25", "11", "1982");
//         System.out.println("newDate = " + newDate);

//         newDate = "25";
//         newDate = newDate.concat("/");
//         newDate = newDate.concat("11");
//         newDate = newDate.concat("/");
//         newDate = newDate.concat("1982");
//         System.out.println("newDate = " + newDate);

//         newDate = "25" + "/" + "11" + "/" + "1982";
//         System.out.println("newDate = " + newDate);

//         newDate = "25".concat("/").concat("11").concat("/")
//                 .concat("1982");
//         System.out.println("newDate = " + newDate);

//         System.out.println(newDate.replace('/', '-'));
//         System.out.println(newDate.replace("2", "00"));

//         System.out.println(newDate.replaceFirst("/", "-"));
//         System.out.println(newDate.replaceAll("/", "---"));

//         System.out.println("ABC\n".repeat(3));
//         System.out.println("-".repeat(20));

//         System.out.println("ABC\n".repeat(3).indent(8));
//         System.out.println("-".repeat(20));

//         System.out.println("    ABC\n".repeat(3).indent(-2));
//         System.out.println("-".repeat(20));
//     }
// }

// StringBuilder
// public class Main {

//     public static void main(String[] args) {

//         String helloWorld = "Hello" + " World";
//         helloWorld.concat(" and Goodbye");

//         StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
//         helloWorldBuilder.append(" and Goodbye");

//         printInformation(helloWorld);
//         printInformation(helloWorldBuilder);

//         StringBuilder emptyStart = new StringBuilder();
//         emptyStart.append("a".repeat(57));

//         StringBuilder emptyStart32 = new StringBuilder(32);
//         emptyStart32.append("a".repeat(17));

//         printInformation(emptyStart);
//         printInformation(emptyStart32);

//         StringBuilder builderPlus = new StringBuilder("Hello" + " World");
//         builderPlus.append(" and Goodbye");

//         builderPlus.deleteCharAt(16).insert(16, 'g');
//         System.out.println(builderPlus);

//         builderPlus.replace(16, 17, "G");
//         System.out.println(builderPlus);

//         builderPlus.reverse().setLength(7);
//         System.out.println(builderPlus);
//     }

//     public static void printInformation(String string) {

//         System.out.println("String = " + string);
//         System.out.println("length = " + string.length());
//     }

//     public static void printInformation(StringBuilder builder) {

//         System.out.println("StringBuilder = " + builder);
//         System.out.println("length = " + builder.length());
//         System.out.println("capacity = " + builder.capacity());
//     }
// }

// Composition 
// public class Product {

//     private String model;
//     private String manufacturer;
//     private int width;
//     private int height;
//     private int depth;

//     public Product(String model, String manufacturer) {
//         this.model = model;
//         this.manufacturer = manufacturer;
//     }
// }

// class Monitor extends Product {

//     private int size;
//     private String resolution;

//     public Monitor(String model, String manufacturer) {
//         super(model, manufacturer);
//     }

//     public Monitor(String model, String manufacturer, int size, String resolution) {
//         super(model, manufacturer);
//         this.size = size;
//         this.resolution = resolution;
//     }

//     public void drawPixelAt(int x, int y, String color) {
//         System.out.println(String.format(
//                 "Drawing pixel at %d,%d in color %s ", x, y, color));
//     }
// }

// class Motherboard extends Product {

//     private int ramSlots;
//     private int cardSlots;
//     private String bios;

//     public Motherboard(String model, String manufacturer) {
//         super(model, manufacturer);
//     }

//     public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots,
//                        String bios) {
//         super(model, manufacturer);
//         this.ramSlots = ramSlots;
//         this.cardSlots = cardSlots;
//         this.bios = bios;
//     }

//     public void loadProgram(String programName) {
//         System.out.println("Program " + programName + " is now loading...");
//     }
// }

// class ComputerCase extends Product {

//     private String powerSupply;

//     public ComputerCase(String model, String manufacturer) {
//         super(model, manufacturer);
//     }

//     public ComputerCase(String model, String manufacturer, String powerSupply) {
//         super(model, manufacturer);
//         this.powerSupply = powerSupply;
//     }

//     public void pressPowerButton() {
//         System.out.println("Power button pressed");
//     }
// }

// public class PersonalComputer extends Product {

//     private ComputerCase computerCase;
//     private Monitor monitor;
//     private Motherboard motherboard;

//     public PersonalComputer(String model, String manufacturer,
//                             ComputerCase computerCase, Monitor monitor,
//                             Motherboard motherboard) {
//         super(model, manufacturer);
//         this.computerCase = computerCase;
//         this.monitor = monitor;
//         this.motherboard = motherboard;
//     }

//     public ComputerCase getComputerCase() {
//         return computerCase;
//     }

//     public Monitor getMonitor() {
//         return monitor;
//     }

//     public Motherboard getMotherboard() {
//         return motherboard;
//     }
// }
// ENCAPSULATION
// public class Player {

//     public String fullName;
//     public int health;
//     public String weapon;

//     public void loseHealth(int damage) {

//         health = health - damage;
//         if (health <= 0) {
//             System.out.println("Player knocked out of game");
//         }
//     }

//     public int healthRemaining() {
//         return health;
//     }

//     public void restoreHealth(int extraHealth) {

//         health = health + extraHealth;
//         if (health > 100) {
//             System.out.println("Player restored to 100%");
//             health = 100;
//         }
//     }
// }

// POLYMORPHISM
// public class Movie {

//     private String title;

//     public Movie(String title) {
//         this.title = title;
//     }

//     public void watchMovie() {

//         String instanceType = this.getClass().getSimpleName();
//         System.out.println(title + " is a " + instanceType + " film");
//     }
// }

// class Adventure extends Movie {

//     public Adventure(String title) {
//         super(title);
//     }

//     @Override
//     public void watchMovie() {
//         super.watchMovie();
//         System.out.printf(".. %s%n".repeat(3),
//                 "Pleasant Scene",
//                 "Scary Music",
//                 "Something Bad Happens");
//     }
// }

// class Comedy extends Movie {

//     public Comedy(String title) {
//         super(title);
//     }

//     @Override
//     public void watchMovie() {
//         super.watchMovie();
//         System.out.printf(".. %s%n".repeat(3),
//                 "Something funny happens",
//                 "Something even funnier happens",
//                 "Happy Ending");
//     }
// }

// class ScienceFiction extends Movie {

//     public ScienceFiction(String title) {
//         super(title);
//     }

//     @Override
//     public void watchMovie() {
//         super.watchMovie();
//         System.out.printf(".. %s%n".repeat(3),
//                 "Bad Aliens do Bad Stuff",
//                 "Space Guys Chase Aliens",
//                 "Planet Blows Up");
//     }
// }
// public class Main {

//     public static void main(String[] args) {

//         Movie theMovie = new Adventure("Star Wars");
//         theMovie.watchMovie();
//     }
// }

// ARRAYS
// public class Main {

//     public static void main(String[] args) {

//         int[] myIntArray = new int[10];
//         myIntArray[0] = 45;
//         myIntArray[1] = 1;
//         myIntArray[5] = 50;

//         double[] myDoubleArray = new double[10];
//         myDoubleArray[2] = 3.5;
//         System.out.println(myDoubleArray[2]);

//         int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         System.out.println("first = " + firstTen[0]);
//         int arrayLength = firstTen.length;
//         System.out.println("length of array = " + arrayLength);
//         System.out.println("last = " + firstTen[arrayLength - 1]);

//         int[] newArray;
//         newArray = new int[] {5, 4, 3, 2, 1};
//         for (int i = 0; i < newArray.length; i++) {
//             System.out.print(newArray[i] + " ");
//         }
//     }
// }


// Reverse an array
// package dev.lpa;

// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         int[] returnedArray = readIntegers();
//         System.out.println(Arrays.toString(returnedArray));

// //        int returnedMin = findMin(returnedArray);
// //        System.out.println("min = " + returnedMin);

// //        reverse(returnedArray);
// //        System.out.println("Final: " + Arrays.toString(returnedArray));

//         int[] reversedCopy = reverseCopy(returnedArray);
//         System.out.println("After reverse " + Arrays.toString(returnedArray));
//         System.out.println("reversedCopy " + Arrays.toString(reversedCopy));
//     }

//     private static int[] readIntegers() {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a list of integers, separated by commas:");
//         String input = scanner.nextLine();

//         String[] splits = input.split(",");
//         int[] values = new int[splits.length];

//         for (int i = 0; i < splits.length; i++) {
//             values[i] = Integer.parseInt(splits[i].trim());
//         }

//         return values;
//     }

//     private static int findMin(int[] array) {

//         int min = Integer.MAX_VALUE;
//         for (int el : array) {
//             if (el < min) {
//                 min = el;
//             }
//         }

//         return min;
//     }

//     private static void reverse(int[] array) {

//         int maxIndex = array.length - 1;
//         int halfLength = array.length / 2;

//         for (int i = 0; i < halfLength; i++) {
//             int temp = array[i];
//             array[i] = array[maxIndex - i];
//             array[maxIndex - i] = temp;
//             System.out.println("--> " + Arrays.toString(array));
//         }
//     }

//     private static int[] reverseCopy(int[] array) {

//         int[] reversedArray = new int[array.length];
//         int maxIndex = array.length - 1;
//         for (int el : array) {
//             reversedArray[maxIndex--] = el;
//         }

//         return reversedArray;
//     }
// }

// Two dimensional Arrays

// package dev.lpa;

// import java.util.Arrays;

// public class Main {

//     public static void main(String[] args) {

//         int[][] array2 = new int[4][4];
//         System.out.println(Arrays.toString(array2));
//         System.out.println("array2.length = " + array2.length);

//         for (int[] outer : array2) {
//             System.out.println(Arrays.toString(outer));
//         }

//         for (int i = 0; i < array2.length; i++) {
//             var innerArray = array2[i];
//             for (int j = 0; j < innerArray.length; j++) {
// //                System.out.print(array2[i][j] + " ");
//                 array2[i][j] = (i * 10) + (j + 1);
//             }
// //            System.out.println();
//         }

// //        for (var outer : array2) {
// //            for (var element : outer) {
// //                System.out.print(element + " ");
// //            }
// //            System.out.println();
// //        }

//         System.out.println(Arrays.deepToString(array2));
//     }
// }

// ArrayList 

// package dev.lpa;

// import java.util.ArrayList;
// import java.util.Arrays;

// record GroceryItem(String name, String type, int count) {

//     public GroceryItem(String name) {
//         this(name, "DAIRY", 1);
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         GroceryItem[] groceryArray = new GroceryItem[3];
//         groceryArray[0] = new GroceryItem("milk");
//         groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
//         groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
//         System.out.println(Arrays.toString(groceryArray));

//         ArrayList objectList = new ArrayList();
//         objectList.add(new GroceryItem("Butter"));
//         objectList.add("Yogurt");

//         ArrayList<GroceryItem> groceryList = new ArrayList<>();
//         groceryList.add(new GroceryItem("Butter"));
//     }
// }

// Linked List

// package dev.lpa;

// import java.util.LinkedList;

// public class Main {

//     public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
//         var placesToVisit = new LinkedList<String>();

//         placesToVisit.add("Sydney");
//         placesToVisit.add(0, "Canberra");
//         System.out.println(placesToVisit);

//         addMoreElements(placesToVisit);
//         System.out.println(placesToVisit);

//         removeElements(placesToVisit);
//         System.out.println(placesToVisit);

//     }

//     private static void addMoreElements(LinkedList<String> list) {

//         list.addFirst("Darwin");
//         list.addLast("Hobart");
//         // Queue methods
//         list.offer("Melbourne");
//         list.offerFirst("Brisbane");
//         list.offerLast("Toowoomba");
//         // Stack Methods
//         list.push("Alice Springs");

//     }

//     private static void removeElements(LinkedList<String> list) {

//         list.remove(4);
//         list.remove("Brisbane");

//         System.out.println(list);
//         String s1 = list.remove(); // removes first element
//         System.out.println(s1 + " was removed");

//         String s2 = list.removeFirst(); // removes first element
//         System.out.println(s2 + " was removed");

//         String s3 = list.removeLast(); // removes last element
//         System.out.println(s3 + " was removed");
//         // Queue/Deque poll methods
//         String p1 = list.poll();  // removes first element
//         System.out.println(p1 + " was removed");
//         String p2 = list.pollFirst();  // removes first element
//         System.out.println(p2 + " was removed");
//         String p3 = list.pollLast();  // removes last element
//         System.out.println(p3 + " was removed");

//         list.push("Sydney");
//         list.push("Brisbane");
//         list.push("Canberra");
//         System.out.println(list);

//         String p4 = list.pop();  // removes first element
//         System.out.println(p4 + " was removed");

//     }
// }
//   private static void gettingElements(LinkedList<String> list) {

//         System.out.println("Retrieved Element = " + list.get(4));

//         System.out.println("First Element = " + list.getFirst());
//         System.out.println("Last Element = " + list.getLast());

//         System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
//         System.out.println("Melbourne is at position: " +
//                 list.lastIndexOf("Melbourne"));
//         // Queue retrieval method
//         System.out.println("Element from element() = " + list.element());
//         // Stack retrieval methods
//         System.out.println("Element from peek() = " + list.peek());
//         System.out.println("Element from peekFirst() = " + list.peekFirst());
//         System.out.println("Element from peekLast() = " + list.peekLast());
//     }

//     public static void printItinerary(LinkedList<String> list) {

//         System.out.println("Trip starts at " + list.getFirst());
//         for (int i = 1; i < list.size(); i++) {
//             System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
//         }
//         System.out.println("Trip ends at " + list.getLast());
//     }

//     public static void printItinerary2(LinkedList<String> list) {

//         System.out.println("Trip starts at " + list.getFirst());
//         String previousTown = list.getFirst();
//         for (String town : list) {
//             System.out.println("--> From: " + previousTown + " to " + town);
//             previousTown = town;
//         }

//         System.out.println("Trip ends at " + list.getLast());
//     }

//     public static void printItinerary3(LinkedList<String> list) {

//         System.out.println("Trip starts at " + list.getFirst());
//         String previousTown = list.getFirst();
//         ListIterator<String> iterator = list.listIterator(1);
//         while (iterator.hasNext()) {
//             var town = iterator.next();
//             System.out.println("--> From: " + previousTown + " to " + town);
//             previousTown = town;
//         }

//         System.out.println("Trip ends at " + list.getLast());
//     }

// Iterator
//  private static void testIterator(LinkedList<String> list) {

//         var iterator = list.listIterator();
//         while (iterator.hasNext()) {
// //            System.out.println(iterator.next());
//             if (iterator.next().equals("Brisbane")) {
//                 iterator.add("Lake Wivenhoe");
//             }
//         }
//         while (iterator.hasPrevious()) {
//             System.out.println(iterator.previous());
//         }

//         System.out.println(list);

//         var iterator2 = list.listIterator(3);
//         System.out.println(iterator2.previous());

//     }


// AutoBoxing and UnBoxing

// package dev.lpa;

// public class Main {

//     public static void main(String[] args) {

//         Integer boxedInt = Integer.valueOf(15);      // preferred but unnecessary
//         Integer deprecatedBoxing = new Integer(15);  // deprecated since JDK 9
//         int unboxedInt = boxedInt.intValue();        // unnecessary

//         // Automatic
//         Integer autoBoxed = 15;
//         int autoUnboxed = autoBoxed;
//         System.out.println(autoBoxed.getClass().getName());
// //        System.out.println(autoUnboxed.getClass().getName());

//         Double resultBoxed = getLiteralDoublePrimitive();
//         double resultUnboxed = getDoubleObject();

//     }

//     private static Double getDoubleObject() {

//         return Double.valueOf(100.00);
//     }

//     private static double getLiteralDoublePrimitive() {

//         return 100.0;
//     }
// }

// ENUM


// public enum DayOfTheWeek {

//     SUN, MON, TUES, WED, THURS, FRI, SAT
// }

// import java.util.Random;

// public class Main {

//     public static void main(String[] args) {

//         DayOfTheWeek weekDay = DayOfTheWeek.TUES;
//         System.out.println(weekDay);

//         for (int i = 0; i < 10; i++ ) {
//             weekDay = getRandomDay();

//             System.out.printf("Name is %s, Ordinal Value = %d%n",
//                     weekDay.name(), weekDay.ordinal());

//             if (weekDay == DayOfTheWeek.FRI) {
//                 System.out.println("Found a Friday!!!");
//             }

//         }
//     }

//     public static DayOfTheWeek getRandomDay() {

//         int randomInteger = new Random().nextInt(7);
//         var allDays = DayOfTheWeek.values();

//         return allDays[randomInteger];
//     }

// }

// public class Hello {
//     public static void main(String[] args) {
//         // Integer p=new Integer(8);
//         System.out.println("hello World");
//     }
// }

// Generics


// import java.util.ArrayList;
// import java.util.Arrays;

// public class CustomArrayList {

//     private int[] data;
//     private static int DEFAULT_SIZE = 10;
//     private int size = 0; // also working as index value

//     public CustomArrayList() {
//         this.data = new int[DEFAULT_SIZE];
//     }

//     public void add(int num) {
//         if (isFull()) {
//             resize();
//         }
//         data[size++] = num;
//     }

//     private void resize() {
//         int[] temp = new int[data.length * 2];

//         // copy the current items in the new array
//         for (int i = 0; i < data.length; i++) {
//             temp[i] = data[i];
//         }
//         data = temp;
//     }

//     private boolean isFull() {
//         return size == data.length;
//     }

//     public int remove() {
//         int removed = data[--size];
//         return removed;
//     }

//     public int get(int index) {
//         return data[index];
//     }

//     public int size() {
//         return size;
//     }

//     public void set(int index, int value) {
//         data[index] = value;
//     }

//     @Override
//     public String toString() {
//         return "CustomArrayList{" +
//                 "data=" + Arrays.toString(data) +
//                 ", size=" + size +
//                 '}';
//     }

//     public static void main(String[] args) {
// //        ArrayList list = new ArrayList();
//         CustomArrayList list = new CustomArrayList();
// //        list.add(3);
// //        list.add(5);
// //        list.add(9);

//         for (int i = 0; i < 14; i++) {
//             list.add(2 * i);
//         }

//         System.out.println(list);

//         ArrayList<Integer> list2 = new ArrayList<>();
// //        list2.add("dfghj");
//     }
// }
// Custom generic ArrayList


// import java.util.ArrayList;
// import java.util.Arrays;

// // https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

// public class CustomGenArrayList<T> {

//     private Object[] data;
//     private static int DEFAULT_SIZE = 10;
//     private int size = 0; // also working as index value

//     public CustomGenArrayList() {
//         data = new Object[DEFAULT_SIZE];
//     }

//     public void add(T num) {
//         if (isFull()) {
//             resize();
//         }
//         data[size++] = num;
//     }

//     private void resize() {
//         Object[] temp = new Object[data.length * 2];

//         // copy the current items in the new array
//         for (int i = 0; i < data.length; i++) {
//             temp[i] = data[i];
//         }
//         data = temp;
//     }

//     private boolean isFull() {
//         return size == data.length;
//     }

//     public T remove() {
//         T removed = (T)(data[--size]);
//         return removed;
//     }

//     public T get(int index) {
//         return (T)data[index];
//     }

//     public int size() {
//         return size;
//     }

//     public void set(int index, T value) {
//         data[index] = value;
//     }

//     @Override
//     public String toString() {
//         return "CustomGenArrayList{" +
//                 "data=" + Arrays.toString(data) +
//                 ", size=" + size +
//                 '}';
//     }

//     public static void main(String[] args) {
// //        ArrayList list = new ArrayList();
//         CustomGenArrayList list = new CustomGenArrayList();
// //        list.add(3);
// //        list.add(5);
// //        list.add(9);

// //        for (int i = 0; i < 14; i++) {
// //            list.add(2 * i);
// //        }

// //        System.out.println(list);

//         ArrayList<Integer> list2 = new ArrayList<>();
// //        list2.add("dfghj");


//         CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
//         for (int i = 0; i < 14; i++) {
//             list3.add(2 * i);
//         }

//         System.out.println(list3);

//     }
// }
// Lambda Functions


// import java.util.ArrayList;
// import java.util.function.Consumer;

// public class LambdaFunctions {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         for (int i = 0; i < 5; i++) {
//             arr.add(i + 1);
//         }
// //        arr.forEach((item) -> System.out.println(item * 2));

//         Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//         arr.forEach(fun);

//         Operation sum = (a, b) -> a + b;
//         Operation prod = (a, b) -> a * b;
//         Operation sub = (a, b) -> a - b;

//         LambdaFunctions myCalculator = new LambdaFunctions();
//         System.out.println(myCalculator.operate(5, 3, sum));
//         System.out.println(myCalculator.operate(5, 3, prod));
//         System.out.println(myCalculator.operate(5, 3, sub));
//     }

//     private int operate(int a, int b, Operation op) {
//         return op.operation(a, b);
//     }
// }

// interface Operation {
//     int operation(int a, int b);
// }

// Exception Handling


// public class Main {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 0;
//         try {
// //            divide(a, b);
//             // mimicing
//             String name = "Kunal";
//             if (name.equals("Kunal")) {
//                 throw new MyException("name is kunal");
//             }
//         } catch (MyException e) {
//             System.out.println(e.getMessage());
//         } catch (ArithmeticException e) {
//             System.out.println(e.getMessage());
//         } catch (Exception e) {
//             System.out.println("normal exception");
//         } finally {
//             System.out.println("this will always execute");
//         }

//     }

//     static int divide(int a, int b) throws ArithmeticException{
//         if (b == 0) {
//             throw new ArithmeticException("please do no divide by zero");
//         }

//         return  a / b;
//     }
// }


// Java Collections
// ArrayList and Iterators

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.LinkedList;
// import java.util.List;

// public class LearnArrayList {

//     public static void main(String[] args) {

//         List<Integer> list = new LinkedList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         System.out.println(list);

//         list.add(4);  // This will add 4 at the end of the List.
//         System.out.println(list);

//         list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
//         System.out.println(list);

//         List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
//         newList.add(150);
//         newList.add(160);

//         list.addAll(newList); // This will add all the elements present in newList to list.
//         System.out.println(list);

//         System.out.println(list.get(1));

//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//
//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("the element is " + list.get(i));
//        }
//
//        for (Integer element: list) {
//            System.out.println("foreach element is " + element);
//        }
//
//        Iterator<Integer> it = list.iterator();
//
//        while (it.hasNext()) {
//            System.out.println("iterator " + it.next());
//        }

//        list.set(2, 1000);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(500));

//        list.remove(1);  // This will remove the element at index 1 i.e 20.
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(30)); // This will remove 30 from the list
//        System.out.println(list);
//
//        list.clear(); //This will remove all the elements from the list.
//        System.out.println(list);
//      }
// }

// Queue
// import java.util.LinkedList;
// import java.util.Queue;

// public class LearnLinkedListQueue {

//     public static void main(String[] args) {

//         Queue<Integer> queue = new LinkedList<>();

//         queue.offer(12);
//         queue.offer(24);
//         queue.offer(36);

//         System.out.println(queue);

//         System.out.println(queue.poll());

//         System.out.println(queue);

//         System.out.println(queue.peek());

//     }
// }

// PriorityQueue
// import java.util.Comparator;
// import java.util.PriorityQueue;
// import java.util.Queue;

// public class LearnPriorityQueue {

//     public static void main(String[] args) {

//         Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.offer(40);
//         pq.offer(12);
//         pq.offer(24);
//         pq.offer(36);

//         System.out.println(pq);
//         pq.poll();
//         System.out.println(pq);

//         System.out.println(pq.peek());

//     }

// }

// ArrayDequeue
// import java.util.ArrayDeque;

// public class LearnArrayDeque {

//     public static void main(String[] args) {

//         ArrayDeque<Integer> adq = new ArrayDeque<>();

//         adq.offer(23);
//         adq.offerFirst(12);
//         adq.offerLast(45);
//         adq.offer(26);

//         System.out.println(adq);

//         System.out.println(adq.peek());
//         System.out.println(adq.peekFirst());
//         System.out.println(adq.peekLast());

//         System.out.println(adq.poll());
//         System.out.println("poll() " +adq);

//         System.out.println(adq.pollFirst());
//         System.out.println("pollFirst() " +adq);

//         System.out.println(adq.pollLast());
//         System.out.println("pollLast() " +adq);

//     }

// }


