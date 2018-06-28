package example

object Hello2 {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello2")
        println("args: ${args.joinToString(",")}")
    }

}

