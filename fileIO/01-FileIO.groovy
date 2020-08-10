class FileIO {
    static main(args) {
        // Open a file, read each line and output them
        new File("test.txt").eachLine {
            line -> println "$line";
        }

        // Overwrite the file
        new File("test.txt").withWriter('utf-8') {
            writer -> writer.writeLine("Line 4");
        }

        // Append the file
        File file = new File("test.txt");
        file.append('Line 5');

        // Get the file as a string
        println(file.text);

        // Get the file size
        println("File Size : ${file.length()} bytes");

        // Check if a file or directory
        println("File : ${file.isFile()}");
        println("Dir : ${file.isDirectory()}");

        // Copy file to another file
        def newFile = new File("test2.txt");
        newFile << file.text;

        // Delete a file
        newFile.delete();

        // Get directory files
        def dirFiles = new File("").listRoots();
        dirFiles.each {
        item -> println file.absolutePath;
        }
    }
}