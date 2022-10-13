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
               System.out.println(" Найдены одинаковые цифры в 3-ем разряде " + hundredNum4 + 
                       " = " + hundredNum5);
        } else {
            System.out.println(" Нет одинаковых цифр в 3-ем разряде");
        }
        if(tenNum4 == tenNum5) {
            System.out.println(" Найдены одинаковые цифры во 2-м разряде " + " разряде " + tenNum4 +
                     " = " + tenNum5);
        } else {
            System.out.println(" Нет одинаковых цифр во 2-м разряде");
        }
        if (oneNum4 == oneNum5) {
            System.out.println(" Найдены одинаковые цифры в 1-м разряде " + " разряде " + oneNum4 + 
                    " = " + oneNum5);
        } else {
            System.out.println(" Нет одинаковых цифр в 1-м разряде");
        }

        System.out.println("\n Задача №5. Определение буквы, числа или символа по их коду");
        char someSymbol = '\u0057';
        if(someSymbol >= 'A' && someSymbol <= 'Z') {
            System.out.println("\n Символ Char - " + "'" + someSymbol + "'" + ", его код Dec = " + 
                    (int)someSymbol + " и это большая буква"); 
        } else if (someSymbol >= 'a' && someSymbol <= 'z') {
            System.out.println("\n Символ Char - " + "'" + someSymbol + "'" + ", его код Dec = " + 
                    (int)someSymbol + " и это маленькая буква"); 
        } else if (someSymbol >= '0' && someSymbol <= '9') {
            System.out.println("\n Символ Char - " + "'" + someSymbol + "'" + ", его код Dec = " + 
                    (int)someSymbol + " и это число");
        } else {
            System.out.println("\n Символ Char - " + "'" + someSymbol + "'" + ", его код Dec = " + 
                    (int)someSymbol + " и это не буква и не число, а символ");
        }

        System.out.println("\n Задача №6. Определение суммы вклада и начисленных банком %");
        int depositSum = 300_000;
        // начисленный процент
        float profit;
        // итоговая сумма с процентом
        float totalSum;
        System.out.println("\n Сумма вклад - " + depositSum + " руб.");
        if(depositSum <= 100_000) {
            profit = 0.05F * depositSum;
        } else if(depositSum > 100_000 & depositSum < 300_000) {
            profit = 0.07F * depositSum;
        } else {
            profit = 0.1F * depositSum;
        }
        System.out.println(" Начисленный процент - " + profit + ". Итоговая сумма - " + (profit + depositSum));

        System.out.println("\n Задача №7. Определение оценки по предметам" + "\n");
        // итоговый балл по истории
        int percentHistory = 59;
        // итоговый балл по программированию
        int percentProg = 99;
        // средний % по предметам
        float mediumValuePercent = (percentHistory + percentProg) / 2F;
        // средняя оценка
        float mediumMark = 0;
        // оценка по истории
        int markHistory = 0;
        // оценка по программированию
        int markProg = 0;
        if ((percentHistory <= 0) || (percentHistory > 100) || (percentProg <= 0) || (percentProg > 100)) {
            System.out.println("\n Неверно введены данные!!! Повторите попытку");
        } else if ((percentHistory <= 60) && (percentProg <=60)) {
            markHistory = 2;
            markProg = 2;
        } else if ((percentHistory > 60) && (percentHistory <= 73) && (percentProg > 60) && (percentProg <=73)) {
            markHistory = 3;
            markProg = 3;
        } else if ((percentHistory > 73) && (percentHistory <= 91) && (percentProg > 73) && (percentProg <=91)) {
            markHistory = 4;
            markProg = 4;
        } else if ((percentHistory > 91) && (percentProg > 91)) {
            markHistory = 5;
            markProg = 5;
        } else if ((percentHistory <= 60) && (percentProg > 60) && (percentProg <=73)) {
            markHistory = 2;
            markProg = 3;
        } else if ((percentHistory <= 60) && (percentProg > 73) && (percentProg <=91)) {
            markHistory = 2;
            markProg = 4;
        } else if ((percentHistory <= 60) && (percentProg > 91)) {
            markHistory = 2;
            markProg = 5;
        } else if ((percentHistory > 60) && (percentHistory <= 73) && (percentProg <= 60)) {
            markHistory = 3;
            markProg = 2;
        } else if ((percentHistory > 73) && (percentHistory <= 91) && (percentProg <= 60)) {
            markHistory = 4;
            markProg = 2;
        } else if ((percentHistory > 91) && (percentProg <= 60)) {
            markHistory = 5;
            markProg = 2;
        } else if ((percentHistory > 60) && (percentHistory <= 73) && (percentProg >  73) && (percentProg <= 91)) {
            markHistory = 3;
            markProg = 4;
        } else if ((percentHistory > 60) && (percentHistory <= 73) && (percentProg >  91)) {
            markHistory = 3;
            markProg = 5;
        } else if ((percentHistory > 73) && (percentHistory <= 91) && (percentProg > 60) && (percentProg <=73)) {
            markHistory = 4;
            markProg = 3;
        } else if ((percentHistory > 73) && (percentHistory <= 91) && (percentProg >  91)) {
            markHistory = 4;
            markProg = 5;
        } else if ((percentHistory > 91) && (percentProg >60) && (percentProg <= 73)) {
            markHistory = 5;
            markProg = 3;
        } else if ((percentHistory > 91) && (percentProg >73) && (percentProg <= 91)) {
            markHistory = 5;
            markProg = 4;
        }
        System.out.println(" Оценка - " + markHistory + " история");
        System.out.println(" Оценка - " + markProg + " программирование");
        System.out.println(" Средний балл оценок по предметам - " + ((markHistory + markProg) / 2F));
        System.out.println(" Средний % по предметам - " + mediumValuePercent);

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