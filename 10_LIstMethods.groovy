
// List is a structure to store a collection of the data items

def frutas = ['manzanas', 'naranjas', 'uvas']
println frutas[1]
println frutas.get(2)
def verduras = [1,2,3,['pepino','lechuga', 'cebolla']]
println verduras[3][2] //getting cebolla
println verduras.get(3).get(2) // also getting cebolla
println verduras[0..2]
println verduras.contains(2) // contains method evaluates whether conditon is true or false
println verduras[3].contains('cebolla')

//check the size
println verduras[3].size()
verduras.add(11) // adding element to the list
println verduras
verduras<<34 // adding element to the list as well
println verduras

verduras.remove(4) // removing an element
println verduras

verduras = verduras + [10] // another way to append values to the list
print verduras

verduras = verduras.plus([434])
println verduras
verduras = verduras.minus('pepino')
println verduras

verduras.pop() // removes the first item from the list
println(verduras)

verduras.removeLast() // remove last
println(verduras)

verduras = verduras.reverse()
println verduras

verduras = verduras.sort()
println verduras

println verduras.isEmpty() // check if empty: false or true
