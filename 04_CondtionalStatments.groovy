
// conditonal Statments IF, ELSE, ELSE IF, SWITCH 
def num = 20

if (num -10 > 30){
    println "num is very big like Oleg"
}else if (num > 10 ){
    println "learning Groovy"
}
else{
    println "num is tiny, not like big O"
}

//Switch case

def x = 1
def result =""
switch(x){
    case 0: result = "it is zero"
        break
    case {x > 0}: result = "positive Oleg"
        break
    case {x<0}: result = "none"
    default:
        result = "invalid"
}
println result 
