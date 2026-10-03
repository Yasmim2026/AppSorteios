class Sorteio(
    val listaNomes: MutableList<Participante>,
    val quantidadeGanhadores: Int) {
    fun sortear() {
        listaNomes.shuffle()

        for (i in 0 until quantidadeGanhadores) {
            println("Ganhador ${i + 1}: ${listaNomes[i].nome}")
        }
    }
}