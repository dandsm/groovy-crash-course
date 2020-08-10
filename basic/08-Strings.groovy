class Strings {
    static main(args) {
        def name = "Andres";

        // A string surrounded by single quotes is taken literally
        // but backslashed characters are recognized
        println('I am ${name}\n');
        println("I am $name\n");
        
        // Triple quoted strings continue over many lines
        def multString = '''I am
        a string
        that goes on
        for many lines''';
        
        println(multString);

        // You can access a string by index
        println("3rd Index of Name " + name[3]);
        println("Index of r " + name.indexOf('r'));
        
        // You can also get a slice
        println("1st 3 Characters " + name[0..2]);
        
        // Get specific Characters
        println("Every Other Character " + name[0,2,4]);
        
        // Get characters starting at index
        println("Substring at 1 " + name.substring(1));
        
        // Get characters at index up to another
        println("Substring at 1 to 4 " + name.substring(1,4));
        
        // Concatenate strings
        println("My Name " + name);
        println("My Name ".concat(name));
        
        // Repeat a string
        def repeatStr = "What I said is " * 2;
        println(repeatStr);
        
        // Check for equality
        println("Andres == Andres : " + ('Andres'.equals('Andres')));
        println("Andres == andres : " + ('Andres'.equalsIgnoreCase('andres')));
        
        // Get length of string
        println("Size " + repeatStr.length());
        
        // Remove first occurance
        println(repeatStr - "What");
        
        // Split the string
        println(repeatStr.split(' '));
        println(repeatStr.toList());
        
        // Replace all strings
        println(repeatStr.replaceAll('I', 'she'));
        
        // Uppercase and lowercase
        println("Uppercase " + name.toUpperCase());
        println("Lowercase " + name.toLowerCase());
        
        // <=> returns -1 if 1st string is before 2nd
        // 1 if the opposite and 0 if equal
        println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
        println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
        println("Ant <=> Ant " + ('Ant' <=> 'Ant'));
    }

}