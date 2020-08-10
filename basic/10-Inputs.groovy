class Inputs {
    static main(args) {
        print("Whats your name ");
        def fName = System.console().readLine();
        println("Hello " + fName);
        
        // You must cast to the right value
        // toInteger, toDouble
        print("Enter a number ");
        def num1 = System.console().readLine().toDouble();
        print("Enter another ");
        def num2 = System.console().readLine().toDouble();
        printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
    }
}