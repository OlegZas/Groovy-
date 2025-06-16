// Exception Handling
/* try-catch
try-catch-finally
try-finally
 */

try {
    int i = 32 / 0 // exception will stop the program if not handled
    def y = 2/2
}catch(ArithmeticException exp1){ // specifically for arithmetic
    println "catch block to specifically catch arithmetic exceptions"
} catch (Exception exp) { // for all other exeptions
    println "This is inside the excpeiton block"
    println exp.getCause()
    println exp.getMessage() // method to get the message of the exception
    exp.printStackTrace() // all information with the line wehre exception is, etc.
}finally { // will RUN NO MATTER WHAT 
    println "this is finally block. close your connections here!"
}

println "Another set of code"
