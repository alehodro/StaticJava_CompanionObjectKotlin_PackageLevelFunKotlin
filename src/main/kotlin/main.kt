import CatPackage.lives
import CatPackage.say

fun main(){
    val manu = KotlinCat("Ману")
    println("This cat's name is ${manu.name}")
    println("All cats have ${KotlinCat.lives} lives")
    KotlinCat.lives=8
    println("All cats have ${KotlinCat.lives} lives")
    manu.sleep()
    KotlinCat.say()
    val viki = KotlinCat("Viki")

// тестим package level members как статичные члены класса
    val melisa = KotlinCatPackageLevel("Мелиса")
    println("This cat's name is ${melisa.name}")
    println("All cats have ${lives} lives")
    lives=8
    println("All cats have ${lives} lives")
    val murzik = KotlinCatPackageLevel("Мурзик")

//тестим использование отдельного объекта как контейнер статичных членов класса Cat
    val tuna=KotlinCatWithObject("Тьюна")
    println("All cats have ${Cat.lives} lives")
    Cat.lives=8
    println("All cats have ${Cat.lives} lives")
    val chip = KotlinCatWithObject("Чип")
}