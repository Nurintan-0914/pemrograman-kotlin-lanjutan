fun main(args: Array<String>){
    //Array methods
    //sort()
    val simpsonA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonA.sort()
    for (simpson in simpsonA){
        print(simpson + ' ')
    }
    print('\n')

    //sorted()
    val simpsonB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonB.sortedArray()
    for (simpson in simpsons_sorted){
        print(simpson + ' ')
    }
    print('\n')

    //reverse() and reservedArray()
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC){
        print(simpson)
    }
    print('\n')

    //indexOf()
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1){
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }

    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+ simpsonsE.min())
    println("Max = " + simpsonsE.max())
    println("First = " + simpsonsE.first())
    println("Last = " +simpsonsE.last())
    println(simpsonsE.contains("Marge"))
}