// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel : Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val listaConteudos = listOf(ConteudoEducacional("Aula 1"), ConteudoEducacional("Aula 2"), ConteudoEducacional("Aula 3"))
    val formacoes = listOf( Formacao("Curso de Kotlin Avancado", listaConteudos, Nivel.AVANCADO), Formacao("Curso de Java Basico", listaConteudos, Nivel.BASICO), Formacao("Curso de web intermediario", listaConteudos, Nivel.INTERMEDIARIO))
    formacoes[0].matricular(Usuario("Carlos"))
    formacoes[1].matricular(Usuario("Usuario teste"))
    formacoes[2].matricular(Usuario("Jose"))


    formacoes.forEach {
        println("\n${it}")
        println("${it.inscritos}")
    }
}
