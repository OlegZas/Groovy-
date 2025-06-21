// Maps are
// unordered and are defined by key value pairs

def almohada = ['confesar':'to confess', 'alegre':'happy']

println almohada
println almohada.confesar
println almohada.get('alegre')
println almohada.size() // to ge the size of the map
almohada.put('fall', 'caer') // adding an element
println almohada
println almohada.containsKey('fall') // check if map contain a specific key
println almohada.containsValue('caer') // contain specific value
println almohada.getClass() // class where maps are implemented
def ascensor = almohada.clone() // cloning 1 map into another
print ascensor
//Iterating
almohada.each {key,value -> println "$key : $value"} // loops throug heach key vlaue and prints
ascensor.eachWithIndex { key,value, i -> println "$i | $key : $value"  } // indexing the map (normal is not indexed)

ascensor.eachWithIndex { entry, i -> println "$i | $entry.key : $entry.value"}
