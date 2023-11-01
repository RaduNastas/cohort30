package teacher_code;

// класс для наглядной демонстрации статических и не статических переменных и методов
// описывает некий тренажерный зал
public class Gym {
    // переменная характеризует штангу, тк это static переменная, "штанга" - общая для всех и ОДНА на всех
    private static String weights;

    // переменная характеризует полотенце. Тк данное поле НЕ статическое, это означает, что "полотенец" будет столько,
    // сколько клиентов в этом зале (экземпляров класса "Gym")
    private String towel;

    // данный метод описвает работу некого тренажера. Этот тренажер - статический, то есть им могут пользоваться все.
    // к тому же данный тренажер задействует в своей работе "штангу", тк "штанга" тоже статическая и может
    // использоваться для общих целей и работ.
    // Но не статические поля (частные) и объекты ("полотенце") - не могут быть использованы в статических (общих) блоках
    private static void doExercise() {
        System.out.println("Я делаю упражнение на общем тренажере с весом " + weights);
    }


    // не статический метод. Описывает некую "заботу о себе". Данный метод персонален для каждого пользователя
    // (для каждого экземпляра класса). В данном методе можно воспользоваться как:
    // А. НЕ статическим полотенцем (метод персональный - полотенце тоже)
    // Б. статическим методом или переменной (данные методы и переменные - "общие" для всех, следовательно и
    // пользоваться ими тоже могут все).
    private void takeCare() {
        System.out.println("я взял небольшу паузу, чтобы передохнуть и вытереть лицо " + towel);
        System.out.println(weights);
    }








    // стандартные геттеры и сеттеры
    public static String getWeights() {
        return weights;
    }

    public static void setWeights(String weights) {
        Gym.weights = weights;
    }

    public String getTowel() {
        return towel;
    }

    public void setTowel(String towel) {
        this.towel = towel;
    }
}
