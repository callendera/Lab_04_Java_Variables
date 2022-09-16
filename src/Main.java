public class Main {
    public static void main(String[] args) {
        int intOperandA = 3;
        int intOperandB = 10;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 4.53;
        double doubleOperandB = 7.23;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;
        System.out.println("This is the Integer section:");
        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is: " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is: " + intProduct);

        intDifference = intOperandB - intOperandA;
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is: " + intDifference);

        intQuotient = intOperandB / intOperandA;
        System.out.println("The quotient of " + intOperandB + " and " + intOperandA + " is: " + intQuotient);

        intModulo = intOperandB % intOperandA;
        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is: " + intModulo);

        System.out.println("This is the double section:");

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleModulo);


        int numberOfKids = 4;
        System.out.println("We have " + numberOfKids + " kids in our family.");

        String isItRaining = "Yup";
        System.out.println("Is it raining? " + isItRaining);

        double gasPricePerGallon = 4.55;
        System.out.println("Gas is $" + gasPricePerGallon + " per gallon");

        int favoriteNumber = 19;
        System.out.println("My favorite number is " + favoriteNumber);

        double shoeSize = 9.5;
        System.out.println("My shoe size is " + shoeSize);

        int birthMonth = 10;
        System.out.println("My birth month number is " + birthMonth);

        String fullName = "Autumn Breanna Price";
        System.out.println("My full name is " + fullName);
    }
}