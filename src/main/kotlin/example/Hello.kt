package example

object Hello {
    @JvmStatic
    fun main(args: Array<String>) {
        println(hello("Kotlin"))
        println("args: ${args.joinToString(",")}")
    }

    fun hello(name: String): String = "Hello, $name!"

}

