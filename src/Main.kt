fun main() {
    val versao: Double = 1.0
    println("App de Sorteios ")
    println("Versão: $versao")

    print("Digite o título do sorteio: ")
    val entrada = readLine()

    val titulo: String? = if (entrada == "") {
        null
    } else {
        entrada
    }
    val motivoSorteio = titulo ?: "Sorteio Rápido"
    println("Título: $motivoSorteio")

    var continuar = true

    while (continuar) {

        println("1 - Sorteio de Nomes")
        println("2 - Cara ou Coroa")
        println("3 - Rolar Dado")
        println("4 - Roleta de Decisões")
        println("0 - Sair")

        print("Escolha uma opção:")
        val opcao = readLine()!!.toInt()

        when (opcao) {
            1 -> {
                println("Você escolheu Sorteio de Nomes")
                print("Digite a quantidade de participantes: ")
                val quantidade = readLine()!!.toInt()
                println("Quantidade de participantes: $quantidade")
                print("Digite a quantidade de ganhadores: ")
                val quantidadeGanhadores = readLine()!!.toInt()
                println("Quantidade de ganhadores: $quantidadeGanhadores")

                if (quantidade < quantidadeGanhadores) {
                    println("Participantes insuficientes")
                } else {

                    val participantes = mutableListOf<Participante>()

                    for (i in 1..quantidade) {
                        print("Digite o nome do participante $i: ")

                        val nome = readLine()!!
                        val participante = Participante(nome)
                        participantes.add(participante)
                    }
                    val sorteio = Sorteio(participantes, quantidadeGanhadores)
                    sorteio.sortear()
                }
            }

            2 -> {
                println("Resultado:")
                val resultado = (0..1).random()

                if (resultado == 0) {
                    println("Cara")
                } else {
                    println("Coroa")
                }
            }

            3 -> {
                println("Você escolheu Rolar Dado (D6)")
                val resultado = (1..6).random()
                println("Resultado do dado: $resultado")
            }

            4 -> {
                println("Você escolheu Roleta de Decisões")

                val opcoes = listOf("Sim", "Não")
                val resultado = opcoes.random()

                println("Resultado: $resultado")
            }
            0 -> {
                continuar = false
            }
        }
    }
}