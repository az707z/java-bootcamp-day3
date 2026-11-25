void main() {
    // I but for you '/**/' for the things I did change to quick the process.

    
    
    
    /*
    //1.Write a program that checks the role of the user
    //If the role is admin print "welcome admin"
    //If the role is superuser print "welcome superuser"
    //If the role is user print "welcome user" (tip:
    //use if else)
    */
    Scanner input = new Scanner(System.in);
    System.out.println("Chois your role:\n" +
            "1-Aadmin.\n" +
            "2-Ssuperuser.\n" +
            "3-User.");
    int number = input.nextInt();
    if (number == 1) {
        System.out.println("Welcome admin");
    } else if (number == 2) {
        System.out.println("Welcome superuser");
    } else if (number == 3) {
        System.out.println("Welcome user");
    } else {
        System.out.println("Error!! it's not in the options.");
    }
/*
2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
*/
    System.out.println("Enter three number :");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    if (number1 > number2 && number1 > number3) {
        System.out.println("The greatest: " + number1);
    }
    if (number2 > number1 && number2 > number3) {
        System.out.println("The greatest: " + number2);
    }
    if (number3 > number1 && number3 > number2) {
        System.out.println("The greatest: " + number3);
    }
/*
3.Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.
*/
    int day =(int) Math.random()* 7 + 1 ;/**/
    System.out.println("The number is :" + day);

    switch (day) {
        case 1:
            System.out.println("The day is Sanday.");
            break;
        case 2:
            System.out.println("The day is Monday.");
            break;
        case 3:
            System.out.println("The day is Tuesday.");
            break;
        case 4:
            System.out.println("The day is Wednesday.");
            break;
        case 5:
            System.out.println("The day is Thursday.");
            break;
        case 6:
            System.out.println("The day is Friday.");
            break;
        case 7:
            System.out.println("The day is Saturday.");
            break;
        default:
            System.out.println("Error Wrong Enter !!");
    }
/*
4. Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
 */
    System.out.println("Your score is: ");
    double gread = input.nextDouble();
    if (gread <= 100 && gread >= 90) {
        System.out.println("A");
    } else if (gread <= 89 && gread >= 80) {/**/
        System.out.println("B");
    } else if (gread <= 79 && gread >= 70) {//**
        System.out.println("C");
    } else if (gread <= 69 && gread >= 60) {/**/
        System.out.println("D");
    } else if (gread <= 59) {
        System.out.println("F");
    } else {
        System.out.println("Incorrect Value!");
    }
     /*
5.Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
      */
    System.out.println("Enter yor age : ");
    int age = input.nextInt();
    if (age < 13) {
        System.out.println("You are an Child");
    } else if (age >= 13 && age <= 19) { /**/
        System.out.println("You are an Teenager");
    } else if (age >= 20) {
        System.out.println("You are an Adult");
    }

}

