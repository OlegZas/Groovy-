// Reading .txt file in groovy

/** reading files **/

String filePath = "C:/Users/zasuk/IdeaProjects/01_Basics/13b_ReadingFiles"
File myFile = new File(filePath) //new File(filePath) creates a file object representing the actual file on disk.
//File is a built-in Groovy/Java class used for reading and writing files.


// reading contents as a string
println(myFile.text) //.text reads the entire file content as a single string.

// colelct lines into a list
def list = myFile.collect{it} // colect is a method used for iteration; it is an iterator representing each
println("list : $list")  // each line is an element

// store file content in an array
def array = myFile as String[] // as string converts file into a list of strings and then into an array
// its the same as : def array = myFile.readLines().toArray()

println "array : $array"

// read file into a list of Strings
def lines = myFile.readLines()
println "lines : $lines"

//reading file line by line
myFile.eachLine {line -> // this is a CLOSURE - line is a parameter that eachLine takes
        println "line : $line" }// eachLine is a function; then using a closure

//read file line by line with line number and based on the range
def lineNoRange = 2..4
def lineList = []
myFile.eachLine {line, lineNo ->
    if (lineNoRange.contains(lineNo)){
        lineList.add(line)
    }
  //  println "$lineNo : $line"
}
println "lineList : $lineList"

//read with reader
def line
myFile.withReader {reader -> // with reader is a method used to read a file ..
    while ((line = reader.readLine()) != null) // when there is data in the line (not <> null)
        println "line : $line"
}

// reading with new reader
def outputFile = "13c_ReadingFiles.txt" // this doesn't create the file but set's up the name
def reader = myFile.newReader() // myFile is an object that contains exisitng file (check beginning)
//.newReader() creates a Reader that lets you read characters from the file as a stream, line-by-line or all at once.
new File(outputFile).append(reader) // // ######## this creates a file
//new File(outputFile) creates a new File object representing "13c_ReadingFiles.txt".
//.append(reader) writes the content of reader (which represents myFile) to the file, appending it to the end.
// If file exists, content will be added to the existing file (not overwritten).
reader.close() //Closes the reader to release system resources.

//file size in bytes
println myFile.length()

//check if file is a file or directory
println myFile.isFile() // prints true or false if the it's a file
println myFile.isDirectory()

// get a list of files in the directory and their absolute path
new File("C:\\Users\\zasuk\\IdeaProjects\\01_Basics\\src").eachFile {
    files -> println files.getAbsolutePath()
}

// copy file data to another file
def newFile = new File("data3.txt") // newFile name is set up
newFile << myFile // will copy contexts
println(newFile)

//rename a file
//newFile.renameTo("renaming")

//delete a file
newFile.delete()
