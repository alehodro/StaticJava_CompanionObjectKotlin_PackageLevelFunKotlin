public class App {

    public static void main(String[] args) {
        // Создаем объект класса Cat
        Cat manu = new Cat("Ману");
        System.out.println("This cat's name is" + " " + manu.name);
        // Вызываем не статичный метод класса из объекта класса
        manu.sleep();
        // Вызываем статичный метод класса без создания объекта
        Cat.say();
        // Вызываем статичное свойство класса
        System.out.println("All cats have" + " " + Cat.lives + " " + "lives");
        // Вызвать статичный метод или свойство класса  из объекта класса нельзя
        // Можно изменять значения статичных свойств класс
        Cat.lives = 8;
        // проверяем значение свойства и оно изменилось
        System.out.println("All cats have" + " " + Cat.lives + " " + "lives");
        // проверяем часть с формированием id экземпляра класса через взаимодействие со статичным свойством.
        System.out.println("ID of " + manu.name + ": " + manu.id);
        //Создаем новый экземпляр класса и проверяем его id, он отличается от id предыдущего класса на единицу
        Cat viki = new Cat("Вики");
        System.out.println("ID of " + viki.name + ": " + viki.id);

    }
}



