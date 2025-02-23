let peoples = ["francisco", 'mariana', 'felipe', 'josué']

for (i in peoples) { // pega o index
    console.log(peoples[i])
    console.log(i)
}

console.log('com of')

for (i of peoples) { // pega o valor da variavel
    console.log(i)
}