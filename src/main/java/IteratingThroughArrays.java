public class IteratingThroughArrays {
    // Arrays are like containers that store a specific type of data
    // Datatype[] variableName = new Datatype[] {elements of your array}

    public String[] names = new String[] {"Kristo", "Ralph", "Gucci", "Zara"};

    public int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};

    float[] prices = new float[] {100.0f, 150.0f, 300.0f, 200.0f, 500.0f};
    float discount = 0.25f;

    // to get an element in array, pass the index into the array like such: names[0], names[2]

    public void forLoop() {
        // for (condition1; condition2; condition3) {code to execute}
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public void evenOrOdd() {
        // for (datatype variableName: ArrayName) {code to execute}
        for (int num: numbers) {

            // module operator %: this returns the remainder of an element after division

            if (num % 2 == 0) {
                System.out.println("Even number:" + num);
            } else {
                System.out.println("Odd number: " + num);
            }
        }
    }
    // Print discounted amount

    // Variable arguments are variables that are unknown but can be used in the method
    // Variable arguments are defined inside the method brackets
    public void whileLoop(float discount) {
        int counter = 0;


       // while (condition) {code to execute}
        while (counter < prices.length) {
            float discountedAmount = prices[counter] * discount;
            float newPrice = prices[counter] - discountedAmount;

            System.out.println("Discounted price is: " + newPrice);
            counter++;
        }
    }

    // doWhile loop: similar to while loop, except the do block is executed first
    public void doWhile() {
        int counter = 0;
        do {
            System.out.println(names[counter]);
            counter++;
        } while(counter < names.length);
    }

    // Variable arguments
    public void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);

    }

}
