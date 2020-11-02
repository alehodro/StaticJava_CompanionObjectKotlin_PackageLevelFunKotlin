import CatPackage.counter

/*
В Котлин нет статичных свойств или функций классов, но данная механика реализуется через объекты
(regular objects/singletons - по сути это уникальный класс-инстанс ), companion objects (это синглтон привязанный к
классу) или через свойства и функции объявляемые вне класса на уровне пакета.
Для того, чтобы записывать, обрабатывать и хранить статичные свойства и использовать статичные функции класса в Kotlin
можно использовать companion objects(по сути это сингтоны привязанные к классу), эти объекты должны быть
размещены в теле класса и иметь собственное тело окруженное фигурными скобками {}
*/

// Companion objects
/*
Ниже я переписал класс JavaCat в Kotlin класс, и реализовал те же свойства и функции что и в JavaCat,
только теперь все статичные свойства и функция теперь находятся в теле companion object в теле класса KotlinCat
 */


class KotlinCat (val name:String) {
    val id= counter++
    init {
        println("Cat $name  with Id:$id is created")
    }
    companion object{
        var lives = 9
        var counter=1
        fun say(){
            println("All cats say Meow")
        }
    }

    fun sleep(){
        println("$name sleeps ")
    }
}

/*
Package level members and functions
Я создал отдельный пакет CatPackage, куда перенес все статичные свойства и функции
Теперь перепишем класс (по сути теперь не существует  прямой  связи между классом KotlinCatPackageLevel и членами
объявленными в пакете CatPackage, однако теперь создание каждого нового инстанса класса KotlinCatPackageLevel, будет
 менять значение свойтва counter)
 */

class KotlinCatPackageLevel (val name:String) {
    val id= counter++
    init {
        println("Cat $name  with Id:$id is created")
    }
    fun sleep(){
        println("$name sleeps ")
    }
}

/*
Попрорбуем создать отдельный объект Cat, в который поместим статичные функции.
Перепишем класс Cat, чтобы он работал с нашим объектом Cat
 */

object Cat{
    var lives = 9
    var counter=1
    fun say(){
        println("All cats say Meow")
    }
}

class KotlinCatWithObject (val name:String) {
    val id= Cat.counter++
    init {
        println("Cat $name  with Id:$id is created")
    }
    fun sleep(){
        println("$name sleeps ")
    }
}