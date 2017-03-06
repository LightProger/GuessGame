package head.fiest.java;

/**
 * Created by Александр on 06.03.2017.
 */
public class Player {

    //    Переменная где будет хранится случайное число
    public int nunber;

    //    Метод генерации чисел
    public void guess() {

//    Генерируем случайное число предложенное игроками
        nunber = (int) (Math.random() * 10);

    }
}
