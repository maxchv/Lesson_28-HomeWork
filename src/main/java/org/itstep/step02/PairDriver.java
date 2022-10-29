package org.itstep.step02;

// TODO: Пишите ваш код здесь

import org.itstep.step01.ObjectPair;

public class PairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        Pair<String,Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<>("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair<>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<>("Lane Stadium", 66233);

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(Pair<String,Integer>[] stadiums) {
        // TODO: реализуйте это метод в соответствии с комментариями



        Pair<String,Integer> lagestStadium = new Pair<>(" ", 0);                    // создаем объект в котором будет сохранено максимальное значение
        for (Pair<String,Integer> stadium: stadiums) {


            // закомментированный код из ObjectPairDriver становится ненужным, т.к.при указании типа искулючается неверный ввод данных

//            //вначале исправляем возможные ошибки ввода, т.е. вместимость стадиона могла быть стрингом с пробелои или через запятую
//            String amount = stadium.getSecond().toString();
//            String amount = stadium.getSecond();
//            String[] amountStrings = amount.split("\\D"); //создаем массив с разделением "не цифрами" (убираем лишнее и останутся только цифры)
//            String str = "";
//            for (int i = 0; i < amountStrings.length; i++) { // соединяем массив в одно число
//                str = str + amountStrings[i];
//            }
//
//            if (Integer.parseInt(str) > (int) lagestStadium.getSecond()) { // перебираем в цикле и ищем максимальное значение
//                lagestStadium = stadium;
//            }


            if (stadium.getSecond() >  lagestStadium.getSecond()) { // перебираем в цикле и ищем максимальное значение
                lagestStadium = stadium;
            }
        }
        return lagestStadium.getFirst();
    }

}
