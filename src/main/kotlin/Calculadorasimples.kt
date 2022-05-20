fun main(){
    println("**** Sistema para realizar calculos *****\n")
    print("Digite o primeiro numero: ")
    var num1 = readln().toInt()

    print("Digite o segundo numero: ")
    var num2 = readln().toInt()

    print("\nQual função voçê quer chamar?" +
            "\nDigite: 1 - Soma" +
            "\nDigite: 2 - Multiplicação" +
            "\nDigite: 3 - Divisão " +
            "\nDigite: 4 - Subtração")

    print("\nDigite aqui: ")
    val func = readln().toInt()

    println("\n")

        if(func in 1..4) {
            when (func) {
                1 -> {
                    print(" A soma de $num1 + $num2 é ${soma(num1, num2)} ")
                }
                2 -> {
                    print(" A multplicação de $num1 * $num2 é ${mult(num1, num2)} ")
                }
                3 -> {
                    print(" A divisão de $num1  ÷  $num2 é ${divisao(num1, num2)} ")
                }
                4 -> {
                    print(" A subtração de $num1 - $num2 é ${subtracao(num1, num2)} ")
                }
            }
        }else{
            println("O sistema precisa de um valor para efecutar a função")
        }

}

fun soma(n1: Int, n2: Int): Int{
    return n1+n2
}

fun mult(n1: Int, n2: Int): Int{
    return n1*n2
}

fun divisao(n1: Int, n2: Int): Double {
    return n1/n2.toDouble()
}

fun subtracao(n1: Int, n2: Int): Int{
    return n1-n2
}
