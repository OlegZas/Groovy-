
// Writing Files in Groovy

File ozFile = new File('oz_writing.txt') // This line creates a new File object in Groovy that points to a file named 'oz_writing.txt'.

ozFile.write("Writing to Oleg's file. ")
ozFile.renameTo('14_ozwriting')

ozFile << "\nSecond line of Oleg's - << adds the line to the file"

//ozFile.text = "the third one" // text function overwrites everyhting in the file

//ozFile.withWriter {writer -> // withWriter is a method that overwrites a file (everything)
//    writer.writeLine("This is line 4")
//}

ozFile.append("\n adding a line ") // will not overwrite but will add
println(ozFile.length())
println ozFile.text // text function is used to print the contents of the file

def newoz = new File("14b_ozwriting") // setting the name for the new object
newoz << ozFile.text // pushing all the data from file a to file b
print newoz.text

ozFile.bytes = [] // giving an empty list to a file empties it
