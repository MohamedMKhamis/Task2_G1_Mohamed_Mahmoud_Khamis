public class numbersloop {
    public static void main(String[] args) {

        // Print numbers 1 to 10 using a loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Use if to check if a number is even or odd
        int numberToCheck = 7;
        if (numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is Even.");
        } else {
            System.out.println(numberToCheck + " is Odd.");
        }

        numberToCheck = 10;
        if (numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is Even.");
        } else {
            System.out.println(numberToCheck + " is Odd.");
        }

        // Use switch to display the name of the day (1–7)
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println("Day " + day + ": " + dayName);

        day = 8;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println("Day " + day + ": " + dayName);

        // Print Multiplication Table (1 to 10) for a number
        int tableNumber = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
        }

        // Count Digits in a Number while
        int numberToCount = 12345;
        int count = 0;
        int tempNumber = numberToCount;

        if (tempNumber == 0) {
            count = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                count++;
            }
        }
        System.out.println("Number of digits in " + numberToCount + ": " + count);

        numberToCount = 0;
        count = 0;
        tempNumber = numberToCount;
        if (tempNumber == 0) {
            count = 1;
        } else {
            while (tempNumber != 0) {
                tempNumber /= 10;
                count++;
            }
        }
        System.out.println("Number of digits in " + numberToCount + ": " + count);


        // Reverse a Number while
        int numberToReverse = 12345;
        int reversedNumber = 0;
        int originalNumber = numberToReverse;

        while (numberToReverse != 0) {
            int digit = numberToReverse % 10;
            reversedNumber = reversedNumber * 10 + digit;
            numberToReverse /= 10;
        }
        System.out.println("Original Number: " + originalNumber + ", Reversed Number: " + reversedNumber);
    }
}

