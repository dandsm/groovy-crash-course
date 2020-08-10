class Lists {
    static main(args) {
        // Lists hold a list of objects with an index
 
        def primes = [2,3,5,7,11,13];
        
        // Get a value at an index
        println("2nd Prime " + primes[1]);
        println("3rd Prime " + primes.get(2));
        
        // They can hold anything
        def employee = ['Andres', 40, 6.25, [1,2,3]];
        
        println("2nd Number " + employee[3][1]);
        
        // Get the length
        println("Length " + primes.size());
        
        // Add an index
        primes.add(17);
        
        // Append to the right
        primes<<19;
        primes.add(23);
        
        // Concatenate 2 Lists
        primes + [29,31];
        
        // Remove the last item
        primes - [31];
        
        // Check if empty
        println("Is empty " + primes.isEmpty());
        
        // Get 1st 3
        println("1st 3 " + primes[0..2]);
        
        println(primes);
        
        // Get matches
        println("Matches " + primes.intersect([2,3,7]));
        
        // Reverse
        println("Reverse " + primes.reverse());
        
        // Sorted
        println("Sorted " + primes.sort());
        
        // Pop last item
        println("Last " + primes.pop());
    }
}