public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println ("\n Задача №1. Перевод псевдокода на язык Java");
        int personAge = 21;
        if (personAge > 20) {
            System.out.println ("\n Возраст " + personAge + " - кредит одобрен");
         } else {
            System.out.println ("\n Возраст " + personAge + " - кредит не одобрен");
         }
        char male = 'М';
        char female = 'Ж';
        boolean sex = true;
        if (!sex){
            System.out.println("\n Женский отдел обозначен символом - " + female);
        } else {
            System.out.println("\n Мужской отдел обозначен символом - "  + male);
        }
        float height = 1.70f;
        if (height < 1.80) {
            System.out.println("\n Рост - " + height + " (полевой игрок) ");
        } else {
            System.out.println("\n Рост - " + height + " вратарь ");
        }
        char firstLetterName = "Maksim".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("\n Первая буква имени " + firstLetterName + " - команда №1 ");
        } else if (firstLetterName == 'I') {
            System.out.println("\n Первая буква имени " + firstLetterName + " - команда №2 ");
        } else {
            System.out.println("\n Первая буква имени " + firstLetterName + " - команда №3 ");
        }

        System.out.println("\n Задача №2. Поиск max и min числа");
        int num1 = 2; 
        int num2 = 1;
        if (num1 > num2) {
            System.out.println("\n max = " + num1 + " min = " + num2);
        } else if (num1 < num2) {
            System.out.println("\n max = " + num2 + " min = " + num1);
        } else {
            System.out.println("\n Числа равны " + num1 + " = " + num2);
        }

        System.out.println("\n Задача №3. Работа с числом");
        int num3;
        num3 = 0;
        if(num3 == 0) {
            System.out.println("\n Заданное число = " + num3);
        } else if (num3 % 2 == 0) {
        System.out.println("\n Заданное число = " + num3 + " - четное");
        } else {
            System.out.println("\n Заданное число = " + num3 + " - нечетное");
        }
        if(num3 < 0) {
            System.out.println("\n Заданное число = " + num3 + " - отрицательное");
        } else if (num3 > 0) {
            System.out.println("\n Заданное число = " + num3 + " - положительное");
        }

        System.out.println("\n Задача №4. Поиск одинаковых цифр в числах");
        int num4 = 456;
        int num5 = 423;
        // сотни num4
        int hungredNum4 = (num4 / 100) % 10;
        // десятки num4
        int tenNum4 = (num4 /10 ) % 10;
        //единицы num4
        int oneNum4 =(num4 / 1) % 10;
        // сотни num5
        int hungredNum5 = (num5 / 100) % 10;
        // десятки num5
        int tenNum5 = (num5 / 10) % 10;
        // единицы num5
        int oneNum5 =(num5 / 1) % 10;
        int class1 = 3;
        int class2 = 2;
        int class3 = 1;
        System.out.println("\n Исходные числа: " + num4 + ", " + num5);
        if(hungredNum4 == hungredNum5) {
               System.out.println("\n Найдены одинаковые цифры в " + class1 + " разряде " + hungredNum4 + " = " + hungredNum5);
        } else {
            System.out.println("\n Нет одинаковых цифр в " + class1 + " разряде");
        }
        if(tenNum4 == tenNum5) {
            System.out.println("\n Найдены одинаковые цифры в " + class2 + " разряде " + tenNum4 + " = " + tenNum5);
        } else {
            System.out.println("\n Нет одинаковых цифр в " + class2 + " разряде");
        }
        if (oneNum4 == oneNum5) {
            System.out.println("\n Найдены одинаковые цифры в " + class3 + " разряде " + oneNum4 + " = " + oneNum5);
        } else {
            System.out.println("\n Нет одинаковых цифр в " + class3 +" разряде");
        }

        System.out.println("\n Задача №5. Определение буквы, числа или символа по их коду");
        char someSymbol = '\u0057';
        int ascii = someSymbol;
        char asciiChar = (char)ascii;
        if(ascii > 64 & ascii <91) {
        System.out.println("\n Символ Char - " + "'" + asciiChar + "'" + ", его код Dec = " + ascii + " и это большая буква"); 
        }
        else if (ascii > 96 & ascii < 123){
            System.out.println("\n Символ Char - " + "'" + asciiChar + "'" + ", его код Dec = " + ascii + " и это маленькая буква"); 
        }
        else if (ascii > 47 & ascii < 58) {
            System.out.println("\n Символ Char - " + "'" + asciiChar + "'" + ", его код Dec = " + ascii + " и это число");
        }
        else {
          System.out.println("\n Символ Char - " + "'" + asciiChar + "'" + ", его код Dec = " + ascii + " и это не буква и не число, а символ");
        }

        System.out.println("\n Задача №6. Определение суммы вклада и начисленных банком %");
        // сумма вклада
        int depositSum = 300_000;
        // 5% годовых
        float discount1 = 5 / 100F;
        // 7% годовых
        float discount2 = 7 / 100F;
        // 10% годовых
        float discount3 = 10 / 100F;
        System.out.println("\n Сумма вклад - " + depositSum + " руб.");
        if(depositSum <= 100_000) {
            // начисленный процент
            float profit1 = discount1 * depositSum;
            // итоговая сумма с процентом
            float totalsum1 = profit1 + depositSum;
            System.out.println("\n начисленный процент - " + profit1 + ". Итоговая сумма - " + totalsum1);
        }
        else if(depositSum > 100_000 & depositSum < 300_000) {
            // начисленный процент
            float profit2 = discount2 * depositSum;
            // итоговая сумма с процентом
            float totalsum2 = profit2 + depositSum;
            System.out.println("\n начисленный процент - " + profit2 + ". Итоговая сумма - " + totalsum2);
        }
        else {
            // начисленный процент
            float profit3 = discount3 * depositSum;
            // итоговая сумма с процентом
            float totalsum3 = profit3 + depositSum;
            System.out.println("\n начисленный процент - " + profit3 + ". Итоговая сумма - " + totalsum3);
        }

        System.out.println("\n Задача №7. Определение оценки по предметам");
         // итоговый балл по истории
         int valueHistory = 59;
         // итоговый балл по программированию
         int valueProg = 91;
         // средний % по предметам
         float mediumValuePercent = (valueHistory + valueProg) / 2F;
         if ((valueHistory <= 0) || (valueHistory > 100) || (valueProg <= 0) || (valueProg > 100)) {
            System.out.println("\n Неверно введены данные!!! Повторите попытку");
        }
         else if ((valueHistory <= 60) && (valueProg <=60)) {
            int mark1 = 2;
            int mark2 = 2;
            float mediumMark1 = (mark1 + mark2) / 2F;
            System.out.println("\n Оценка - " + mark1 + " история");
            System.out.println("\n Оценка - " + mark2 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark1);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
         }
         else if ((valueHistory > 60) && (valueHistory <= 73) && (valueProg > 60) && (valueProg <=73)) {
            int mark3 = 3;
            int mark4 = 3;
            float mediumMark2 = (mark3 + mark4) / 2F;
            System.out.println("\n Оценка - " + mark3 + " история");
            System.out.println("\n Оценка - " + mark4 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark2);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
         }
          else if ((valueHistory > 73) && (valueHistory <= 91) && (valueProg > 73) && (valueProg <=91)) {
            int mark5 = 4;
            int mark6 = 4;
            float mediumMark3 = (mark5 + mark6) / 2F;
            System.out.println("\n Оценка - " + mark5 + " история");
            System.out.println("\n Оценка - " + mark6 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark3);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
         }
         else if ((valueHistory > 91) && (valueProg > 91)) {
            int mark7 = 5;
            int mark8 = 5;
            float mediumMark4 = (mark7 + mark8) / 2F;
            System.out.println("\n Оценка - " + mark7 + " история");
            System.out.println("\n Оценка - " + mark8 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark4);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
         }
         else if ((valueHistory <= 60) && (valueProg > 60) && (valueProg <=73)) {
            int mark9 = 2;
            int mark10 = 3;
            float mediumMark5 = (mark9 + mark10) / 2F;
            System.out.println("\n Оценка - " + mark9 + " история");
            System.out.println("\n Оценка - " + mark10 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark5);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
         }
         else if ((valueHistory <= 60) && (valueProg > 73) && (valueProg <=91)) {
            int mark11 = 2;
            int mark12 = 4;
            float mediumMark6 = (mark11 + mark12) / 2F;
            System.out.println("\n Оценка - " + mark11 + " история");
            System.out.println("\n Оценка - " + mark12 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark6);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
         }
         else if ((valueHistory <= 60) && (valueProg > 91)) {
            int mark13 = 2;
            int mark14 = 5;
            float mediumMark7 = (mark13 + mark14) / 2F;
            System.out.println("\n Оценка - " + mark13 + " история");
            System.out.println("\n Оценка - " + mark14 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark7);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 60) && (valueHistory <= 73) && (valueProg <= 60)) {
            int mark15 = 3;
            int mark16 = 2;
            float mediumMark8 = (mark15 + mark16) / 2F;
            System.out.println("\n Оценка - " + mark15 + " история");
            System.out.println("\n Оценка - " + mark16 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark8);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 73) && (valueHistory <= 91) && (valueProg <= 60)) {
            int mark17 = 4;
            int mark18 = 2;
            float mediumMark9 = (mark17 + mark18) / 2F;
            System.out.println("\n Оценка - " + mark17 + " история");
            System.out.println("\n Оценка - " + mark18 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark9);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 91) && (valueProg <= 60)) {
            int mark19 = 5;
            int mark20 = 2;
            float mediumMark10 = (mark19 + mark20) / 2F;
            System.out.println("\n Оценка - " + mark19 + " история");
            System.out.println("\n Оценка - " + mark20 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark10);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 60) && (valueHistory <= 73) && (valueProg >  73) && (valueProg <= 91)) {
            int mark21 = 3;
            int mark22 = 4;
            float mediumMark11 = (mark21 + mark22) / 2F;
            System.out.println("\n Оценка - " + mark21 + " история");
            System.out.println("\n Оценка - " + mark22 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark11);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 60) && (valueHistory <= 73) && (valueProg >  91)) {
            int mark23 = 3;
            int mark24 = 5;
            float mediumMark12 = (mark23 + mark24) / 2F;
            System.out.println("\n Оценка - " + mark23 + " история");
            System.out.println("\n Оценка - " + mark24 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark12);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 73) && (valueHistory <= 91) && (valueProg > 60) && (valueProg <=73)) {
            int mark25 = 4;
            int mark26 = 3;
            float mediumMark13 = (mark25 + mark26) / 2F;
            System.out.println("\n Оценка - " + mark25 + " история");
            System.out.println("\n Оценка - " + mark26 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark13);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 73) && (valueHistory <= 91) && (valueProg >  91)) {
            int mark27 = 4;
            int mark28 = 5;
            float mediumMark14 = (mark27 + mark28) / 2F;
            System.out.println("\n Оценка - " + mark27 + " история");
            System.out.println("\n Оценка - " + mark28 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark14);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 91) && (valueProg >60) && (valueProg <= 73)) {
            int mark29 = 5;
            int mark30 = 3;
            float mediumMark15 = (mark29 + mark30) / 2F;
            System.out.println("\n Оценка - " + mark29 + " история");
            System.out.println("\n Оценка - " + mark30 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark15);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else if ((valueHistory > 91) && (valueProg >73) && (valueProg <= 91)) {
            int mark31 = 5;
            int mark32 = 4;
            float mediumMark16 = (mark31 + mark32) / 2F;
            System.out.println("\n Оценка - " + mark31 + " история");
            System.out.println("\n Оценка - " + mark32 + " программирование");
            System.out.println("\n Средний балл оценок по предметам - " + mediumMark16);
            System.out.println("\n Средний % по предметам - " + mediumValuePercent);
        }
        else {
        }
    }
}