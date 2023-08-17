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