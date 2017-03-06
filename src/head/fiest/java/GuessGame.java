package head.fiest.java;

/**
 * Created by Александр on 06.03.2017.
 */
public class GuessGame {

    //           Объявляем переменные для хранения вариантов от каждого игрока
    private int guessp1 = 0;
    private int guessp2 = 0;
    private int guessp3 = 0;

    //            Генерируем случайное число от 0 до 10 которое нужно угадать
    private final int targetNumber = (int) (Math.random() * 10);

    public GuessGame() {
        System.out.println("Я загадываю число от 0 до 9: ");
    }

    public void startGame() {

//    Создаем игроков
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

//     Создаем цикл
        while (true) {

            System.out.println("Число которое нужно угадать, - " + targetNumber);
            System.out.println("");

//     Вызываем метод guess() для каждого игрока
            p1.guess();
            p2.guess();
            p3.guess();

//      Извлекаем варианты каждого игрока (результаты работы метода guess(), получая доступ к его переменной number
            guessp1 = p1.nunber;
            System.out.println("Первый игорк думает, что это - " + guessp1);

            guessp2 = p2.nunber;
            System.out.println("Второй игорк думает, что это - " + guessp2);

            guessp3 = p3.nunber;
            System.out.println("Третий игорк думает, что это - " + guessp3);

//      Проверяем варианты каждого из игроков, и если он верен, заканчиваем игру
            if (guessp1 == targetNumber || guessp2 == targetNumber || guessp3 == targetNumber) {
                System.out.println("У нас есть победитель!");
                break;

            } else {
                System.out.println("");
                System.out.println("Попробуйте еще раз!");
            }
        }
    }
}


