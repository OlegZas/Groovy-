
/*
for
for in
while
Keywords: upto, times, step
 */

// For Loop:
 for(int i = 490;// initializing variable
        i < 500; // conditon
        i++ ) // what to do
 {
     println i
 }

// for in
for (a in 385..391){ // loop through these numbers
    println a
}

// for in use with the list
def n=0;
for ( m in [0,1,2,3,4]){ //0+1=1 + 2=3 + 3=6 +4=10
    n +=m
    println n
}
// iterate over a map
def map = ["name": "Oleg", "lastname":"learning"]
for (e in map){
    println e.value + "nice"
}

//while loop
int i = 5
while(i <7){
    println i
    i+=1 //incriment by 1
}

// keywords for groovy
//upto
1.upto(3){ // creates a loop
    println "OZ $it" // it is an iteration of the loop
}
// times
3.times{// starts with 0 and goes up to 2
    println "OZ $it"
}

//step
22.step(30,2){ // will print until 30, increments of 2 : 22 24 26 28
    println "$it OZ"
}
