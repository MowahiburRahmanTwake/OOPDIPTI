package Abstruct

abstract class Person(val name: String) {
    fun display(name: String){
        println(name)
    }abstract fun personJob()
}