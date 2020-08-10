class IncrementDecrement() {
    static main(args) {
        // Variables are dynamically typed
        def age = "Dog";
        age = 23;
        
        // Increment and decrement
        println("age++ = " + (age++));
        println("++age = " + (++age));
        println("age-- = " + (age--));
        println("--age = " + (--age));
    }
}