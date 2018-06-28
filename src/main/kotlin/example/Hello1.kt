package example

object Hello1 {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello1")
        println("args: ${args.joinToString(",")}")
    }

}

