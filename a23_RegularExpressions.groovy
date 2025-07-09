// regex - patterns used to find substrings in a text
// expression

def regexpcrating = "olegarioleg" =~ "oleg" //=~ is the "find operator" in Groovy.
// looks for match of oleg in string olegario
if (regexpcrating) { // if works as true, false here
    def i = 0
    while (i< regexpcrating.size())  {// to print all the matches
        print regexpcrating[i]
        // regexp is a match object hat behaves like a LIST of matches and requires and idex position
        i++
    }
} else {
    print "There is no match found"
}
