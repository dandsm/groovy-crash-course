class Looping {
    static main(args) {
        // While loop

        def i = 0;

        while(i < 10){

            // If i is odd skip back to the beginning of the loop
            if(i % 2){
            i++;
            continue;
            }

            // If i equals 8 stop looping
            if(i == 8){
            break;
            }

            println(i);
            i++;
        }

        // Normal for i loop
        for (i = 0; i < 5; i++) {
            println(i);
        }

        // for loop with a range
        for(j in 2..6){
            println(j);
        }

        // for loop with a list (Same with string)
        def randList = [10,12,13,14];

        for(j in randList){
            println(j);
        }

        // for loop with a map
        def custs = [
            100 : "Paul",
            101 : "Sally",
            102 : "Sue"
        ];

        for(cust in custs){
            println("$cust.value : $cust.key ");
        }
    }
}