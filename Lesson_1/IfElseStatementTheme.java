public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println ("\n Задача №1. Перевод псевдокода на язык Java" + "\n");
        int personAge = 21;
        if (personAge > 20) {
            System.out.println (" Возраст " + personAge + " - кредит одобрен");
        } else {
            System.out.println (" Возраст " + personAge + " - кредит не одобрен");
        }
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println(" Женский отдел обозначен символом - Ж");
        } else {
            System.out.println(" Мужской отдел обозначен символом - М");
        }
        float height = 1.70f;
        if (height < 1.80) {
            System.out.println(" Рост - " + height + " (полевой игрок) ");
        } else {
            System.out.println(" Рост - " + height + " вратарь ");
        }
        char firstLetterName = "Maksim".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println(" Первая буква имени " + firstLetterName + " - команда №1 ");
        } else if (firstLetterName == 'I') {
            System.out.println(" Первая буква имени " + firstLetterName + " - команда №2 ");
        } else {
            System.out.println(" Первая буква имени " + firstLetterName + " - команда №3 ");
        }

        System.out.println("\n Задача №2. Поиск max и min числа");
        int num1 = 2; 
        int num2 = 1;
        if (num1 > num2) {
            System.out.println("\n max = " + num1 + " min = " + num2);
        } else if (num1 < num2) {
            System.out.println(" max = " + num2 + " min = " + num1);
        } else {
            System.out.println(" Числа равны " + num1 + " = " + num2);
        }

        System.out.println("\n Задача №3. Работа с числом");
        int num3 = 5;
        if(num3 == 0) {
            System.out.println("\n Заданное число = " + num3);
        } else if (num3 % 2 == 0) {
            System.out.println("\n Заданное число = " + num3 + " - четное");
        } else {
            System.out.println("\n Заданное число = " + num3 + " - нечетное");
        }
        if(num3 < 0) {
            System.out.println(" Заданное число = " + num3 + " - отрицательное");
        } else if (num3 > 0) {
            System.out.println(" Заданное число = " + num3 + " - положительное");
        }

        System.out.println("\n Задача №4. Поиск одинаковых цифр в числах");
        int num4 = 456;
        int num5 = 423;
        int hundredNum4 = (num4 / 100) % 10;
        int tenNum4 = (num4 /10 ) % 10;
        int oneNum4 = num4  % 10;
        int hundredNum5 = (num5 / 100) % 10;
        int tenNum5 = (num5 / 10) % 10;
        int oneNum5 = num5  % 10;
        System.out.println("\n Исходные числа: " + num4 + ", " + num5);
        if(hundredNum4 == hundredNum5) {
               System.out.println(" Найдены одинаковые цифры в 3-ем разряде " + hundredNum4 + " = " + hundredNum5);
        } else {
            System.out.println(" Нет одинаковых цифр в 3-ем разряде");
        }
        if(tenNum4 == tenNum5) {
            System.out.println(" Найдены одинаковые цифры во 2-м разряде " + " разряде " + tenNum4 + " = " + tenNum5);
        } else {
            System.out.println(" Нет одинаковых цифр во 2-м разряде");
        }
        if (oneNum4 == oneNum5) {
            System.out.println(" Найдены одинаковые цифры в 1-м разряде " + " разряде " + oneNum4 + " = " + oneNum5);
        } else {
            System.out.println(" Нет одинаковых цифр в 1-м разряде");
        }

        System.out.println("\n Задача №5. Определение буквы, числа или символа по их коду");
        char someSymbol = '\u0057';
        if((char)someSymbol >= 'A' & (char)someSymbol <= 'Z') {
            System.out.println("\n Символ Char - " + "'" + (char)someSymbol + "'" + ", его код Dec = " + (int)someSymbol + " и это большая буква"); 
        } else if ((char)someSymbol >= 'a' & (char)someSymbol <= 'z') {
            System.out.println("\n Символ Char - " + "'" + (char)someSymbol + "'" + ", его код Dec = " + (int)someSymbol + " и это маленькая буква"); 
        } else if ((char)someSymbol >= '0' & (char)someSymbol <= '9') {
            System.out.println("\n Символ Char - " + "'" + (char)someSymbol + "'" + ", его код Dec = " + (int)someSymbol + " и это число");
        } else {
          System.out.println("\n Символ Char - " + "'" + (char)someSymbol + "'" + ", его код Dec = " + (int)someSymbol + " и это не буква и не число, а символ");
        }

        System.out.println("\n Задача №6. Определение суммы вклада и начисленных банком %");
        int depositSum = 300_000;
        float discount1 = 5 / 100F;
        float discount2 = 7 / 100F;
        float discount3 = 10 / 100F;
        System.out.println("\n Сумма вклад - " + depositSum + " руб.");
        if(depositSum <= 100_000) {
            // начисленный процент
            float profit1 = discount1 * depositSum;
            // итоговая сумма с процентом
            float totalSum1 = profit1 + depositSum;
            System.out.println(" Начисленный процент - " + profit1 + ". Итоговая сумма - " + totalSum1);
        } else if(depositSum > 100_000 & depositSum < 300_000) {
              float profit2 = discount2 * depositSum;
              float totalSum2 = profit2 + depositSum;
              System.out.println(" Начисленный процент - " + profit2 + ". Итоговая сумма - " + totalSum2);
        } else {
              float profit3 = discount3 * depositSum;
              float totalSum3 = profit3 + depositSum;
              System.out.println(" Начисленный процент - " + profit3 + ". Итоговая сумма - " + totalSum3);
        }

        System.out.println("\n Задача №7. Определение оценки по предметам" + "\n");
        // итоговый балл по истории
        int valueHistory = 59;
        // итоговый балл по программированию
        int valueProg = 91;
        // средний % по предметам
        float mediumValuePercent = (valueHistory + valueProg) / 2F;
        if ((valueHistory <= 0) || (valueHistory > 100) || (valueProg <= 0) || (valueProg > 100)) {
            System.out.println("\n Неверно введены данные!!! Повторите попытку");
        } else if ((valueHistory <= 60) && (valueProg <=60)) {
              int mark1 = 2;
              int mark2 = 2;
              float mediumMark1 = (mark1 + mark2) / 2F;
              System.out.println(" Оценка - " + mark1 + " история");
              System.out.println(" Оценка - " + mark2 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark1);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 60) && (valueHistory <= 73) && (valueProg > 60) && (valueProg <=73)) {
              int mark3 = 3;
              int mark4 = 3;
              float mediumMark2 = (mark3 + mark4) / 2F;
              System.out.println(" Оценка - " + mark3 + " история");
              System.out.println(" Оценка - " + mark4 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark2);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 73) && (valueHistory <= 91) && (valueProg > 73) && (valueProg <=91)) {
              int mark5 = 4;
              int mark6 = 4;
              float mediumMark3 = (mark5 + mark6) / 2F;
              System.out.println(" Оценка - " + mark5 + " история");
              System.out.println(" Оценка - " + mark6 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark3);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 91) && (valueProg > 91)) {
              int mark7 = 5;
              int mark8 = 5;
              float mediumMark4 = (mark7 + mark8) / 2F;
              System.out.println(" Оценка - " + mark7 + " история");
              System.out.println(" Оценка - " + mark8 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark4);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory <= 60) && (valueProg > 60) && (valueProg <=73)) {
              int mark9 = 2;
              int mark10 = 3;
              float mediumMark5 = (mark9 + mark10) / 2F;
              System.out.println(" Оценка - " + mark9 + " история");
              System.out.println(" Оценка - " + mark10 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark5);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory <= 60) && (valueProg > 73) && (valueProg <=91)) {
              int mark11 = 2;
              int mark12 = 4;
              float mediumMark6 = (mark11 + mark12) / 2F;
              System.out.println(" Оценка - " + mark11 + " история");
              System.out.println(" Оценка - " + mark12 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark6);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory <= 60) && (valueProg > 91)) {
              int mark13 = 2;
              int mark14 = 5;
              float mediumMark7 = (mark13 + mark14) / 2F;
              System.out.println(" Оценка - " + mark13 + " история");
              System.out.println(" Оценка - " + mark14 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark7);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 60) && (valueHistory <= 73) && (valueProg <= 60)) {
              int mark15 = 3;
              int mark16 = 2;
              float mediumMark8 = (mark15 + mark16) / 2F;
              System.out.println(" Оценка - " + mark15 + " история");
              System.out.println(" Оценка - " + mark16 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark8);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 73) && (valueHistory <= 91) && (valueProg <= 60)) {
              int mark17 = 4;
              int mark18 = 2;
              float mediumMark9 = (mark17 + mark18) / 2F;
              System.out.println(" Оценка - " + mark17 + " история");
              System.out.println(" Оценка - " + mark18 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark9);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 91) && (valueProg <= 60)) {
              int mark19 = 5;
              int mark20 = 2;
              float mediumMark10 = (mark19 + mark20) / 2F;
              System.out.println(" Оценка - " + mark19 + " история");
              System.out.println(" Оценка - " + mark20 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark10);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 60) && (valueHistory <= 73) && (valueProg >  73) && (valueProg <= 91)) {
              int mark21 = 3;
              int mark22 = 4;
              float mediumMark11 = (mark21 + mark22) / 2F;
              System.out.println(" Оценка - " + mark21 + " история");
              System.out.println(" Оценка - " + mark22 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark11);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 60) && (valueHistory <= 73) && (valueProg >  91)) {
              int mark23 = 3;
              int mark24 = 5;
              float mediumMark12 = (mark23 + mark24) / 2F;
              System.out.println(" Оценка - " + mark23 + " история");
              System.out.println(" Оценка - " + mark24 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark12);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 73) && (valueHistory <= 91) && (valueProg > 60) && (valueProg <=73)) {
              int mark25 = 4;
              int mark26 = 3;
              float mediumMark13 = (mark25 + mark26) / 2F;
              System.out.println(" Оценка - " + mark25 + " история");
              System.out.println(" Оценка - " + mark26 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark13);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 73) && (valueHistory <= 91) && (valueProg >  91)) {
              int mark27 = 4;
              int mark28 = 5;
              float mediumMark14 = (mark27 + mark28) / 2F;
              System.out.println(" Оценка - " + mark27 + " история");
              System.out.println(" Оценка - " + mark28 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark14);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 91) && (valueProg >60) && (valueProg <= 73)) {
              int mark29 = 5;
              int mark30 = 3;
              float mediumMark15 = (mark29 + mark30) / 2F;
              System.out.println(" Оценка - " + mark29 + " история");
              System.out.println(" Оценка - " + mark30 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark15);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        } else if ((valueHistory > 91) && (valueProg >73) && (valueProg <= 91)) {
              int mark31 = 5;
              int mark32 = 4;
              float mediumMark16 = (mark31 + mark32) / 2F;
              System.out.println(" Оценка - " + mark31 + " история");
              System.out.println(" Оценка - " + mark32 + " программирование");
              System.out.println(" Средний балл оценок по предметам - " + mediumMark16);
              System.out.println(" Средний % по предметам - " + mediumValuePercent);
        }

        System.out.println("\n Задача №8. Расчет прибыли" + "\n");
        int rent = 5000;
        float monthlySales = 13000F;
        float costPrice = 9000F;
        float annualProfit = (monthlySales - costPrice - rent) * 12;
        if (annualProfit > 0) {
            System.out.println(" Прибыль за год = " + "+" + annualProfit + " руб.");
        } else {
              System.out.println(" Прибыль за год = " + annualProfit + " руб.");
        }

        System.out.println("\n Задача №9. Подсчет количества банкнот" + "\n");
        int needSum = 567;
        int usd100 = 100;
        int usd10 = 10;
        int usd1 = 1;
        int sum100 = (needSum / 100) % 10;
        int sum10 = (needSum / 10) % 10;
        int sum1 = needSum % 10;
        System.out.println(" Номиналы банкнот в банкомате: " + usd100 + "$, " + usd10 + "$, " + usd1 + "$");
        if ((needSum >= 100) && (needSum < 1000) && (sum10 >= 5)) {
            int needSumUsd10 = 5;
            System.out.println(" Требуемое количество 100$ = " + sum100);
            System.out.println(" Требуемое количество 10$ = " + needSumUsd10);
            System.out.println(" Требуемое количество 1$ = " + (10 * sum10 - 10 * needSumUsd10 + sum1));
            System.out.println(" Исходная сумма = " + (sum100 * usd100 + usd10 * needSumUsd10 + usd1 * (10 * sum10 - 10 * needSumUsd10 + sum1)) + "$");
        } else if ((needSum >= 100) && (needSum < 1000) && (sum10 < 5)) {
            int needSumUsd_10 = 4;
            System.out.println(" Требуемое количество 100$ = " + sum100);
            System.out.println(" Требуемое количество 10$ = " + needSumUsd_10);
            System.out.println(" Требуемое количество 1$ = " + (10 * sum10 - 10 * needSumUsd_10 + sum1));
            System.out.println(" Исходная сумма = " + (sum100 * usd100 + usd10 * needSumUsd_10 + usd1 * (10 * sum10 - 10 * needSumUsd_10 + sum1)) + "$");
        } else {
            System.out.println(" В банкомате нет требуемой суммы!");
        }
    }
}