public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n Задача №1. Создание переменных и вывод их значений на консоль");
        //количество ядер процессора
        byte numCore = 1; 
        //частота процессора в МГц
        short freqCpu = 3800;
        //объем оперативной памяти в КБ
        int sizeRam = 8388608;
        //объем жесткого диска D в байтах
        long sizeHdd1 = 1000202039296L;
        //объем жесткого диска С в Гб
        float sizeHdd2 = 232.88F;
        //объем сетевого жесткого диска E без ед. измерения
        double sizeHdd3 = 1.8; 
        //первая буква ед. измерения диска E
        char unitOfcharge1 = 'Т';
        //вторая буква ед. измерения диска E
        char unitOfcharge2 = 'б';
        boolean comp = false;
        boolean lapTop = true;
        System.out.println("\n Количество ядер процессора = "  + numCore + " шт.");
        System.out.println(" Частота процессора = " + freqCpu + " МГц");
        System.out.println(" Оперативная память = " + sizeRam + " КБ");
        System.out.println(" Объем жесткого диска D = " + sizeHdd1 + " байт");
        System.out.println(" Объем жесткого диска C = " + sizeHdd2 + " Гб");
        System.out.println(" Объем сетевого жесткого диска E = " + sizeHdd3);
        System.out.println(" Измерение объема диска 'E'- " + unitOfcharge1 + unitOfcharge2);
        System.out.println(" У тебя ноутбук? - " + comp);
        System.out.println(" У тебя компьютер? - " + lapTop);

        System.out.println("\n Задача №2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        float discount = 0.11F;
        float discountSum = (pricePen + priceBook) * discount;
        float discountPrice = pricePen + priceBook - discountSum;
        System.out.println("\n Сумма скидки = " + discountSum);
        System.out.println(" Общая стоимость товара со скидкой = " + discountPrice);

        System.out.println("\n Задача №3. Вывод на консоль слова JAVA");
        char bigJ = 'J';
        char smallA ='a';
        char smallV ='v';
        char bigV = 'V';
        System.out.println("\n" + " " + " " + " " + bigJ + " " + " " + " " + " " + smallA + " " + " " + 
               smallV + " " + " " + " " + " " + " " + smallV + " " + " " + smallA);
        System.out.println("" + " " + " " + " " + bigJ + " " + " " + " " + smallA + " " + smallA + " " + " "+ 
               smallV + " " + " " + " " + smallV + " " + " " + smallA + " " + smallA + " ");
        System.out.println("" + bigJ+ " " + " " + bigJ + " " + " " + smallA + smallA + smallA + smallA + 
                smallA + " " + " " + bigV + " " + bigV + " " + " " + smallA + smallA + smallA + smallA + smallA);
        System.out.println("" + " " + bigJ + bigJ + " " + " " + smallA + " " + " " + " " + " " + " " + smallA + " " + " " + 
                bigV + " " + " " + smallA + " " + " " + " " + " " + " " + smallA);

        System.out.println("\n Задача №4.Отображение min и max значений числовых типов данных. Решение №1");
        byte byteMax = 127;
        System.out.println("\n Первоначальное значение byte = " + byteMax);
        System.out.println(" Значение после инкремента = " + ++byteMax);
        System.out.println(" Значение после декремента = " + --byteMax);
        short shortMax = 32767;
        System.out.println("\n Первоначальное значение short = " + shortMax);
        System.out.println(" Значение после инкремента = " + ++shortMax);
        System.out.println(" Значение после декремента = " + --shortMax);
        int intMax = 2147483647;
        System.out.println("\n Первоначальное значение int = " + intMax);
        System.out.println(" Значение после инкремента = " + ++intMax);
        System.out.println(" Значение после декремента = " + --intMax);
        long longMax = 9223372036854775807L;
        System.out.println("\n Первоначальное значение long = " + longMax);
        System.out.println(" Значение после инкремента = " + ++longMax);
        System.out.println(" Значение после декремента = " + --longMax);

        System.out.println("\n Задача №5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("\n Исходные значения: a = " + a + " b = " + b);
        System.out.println(" \n Перестановка значений с помощью третьей переменной");
        int c = b;
        b = a;
        a = c;
        System.out.println(" Новые значения переменных" + " a = " + a + " b = " + b);
        System.out.println("\n Перестановка значений с помощью арифметических операций");
        a += b;
        b = a - b;
        a -= b;
        System.out.println(" Новые значения переменных" + " a = " + a + " b = " + b);
        System.out.println("\n Перестановка значений с помощью побитовой операции ^");
        // a=5^2=0101^0010=0111=7
        a ^= b;
        // b=7^2=0111^0010=0101=5
        b ^= a;
        // a=5^7=0101^0111=0010=2
        a ^= b;
        System.out.println(" Новые значения переменных" + " a = " + a + " b = " + b);

        System.out.println("\n Задача №6. Вывод символов и их кодов");
        char codeChar1 = '#';
        char codeChar2 = '&';
        char codeChar3 = '@';
        char codeChar4 = '^';
        char codeChar5 = '_';
        System.out.println("\n Код символа ASII - " + (int) codeChar1 + " Символ - " + codeChar1);
        System.out.println("\n Код символа ASII - " + (int) codeChar2 + " Символ - " + codeChar2);
        System.out.println("\n Код символа ASII - " + (int) codeChar3 + " Символ - " + codeChar3);
        System.out.println("\n Код символа ASII - " + (int) codeChar4 + " Символ - " + codeChar4);
        System.out.println("\n Код символа ASII - " + (int) codeChar5 + " Символ - " + codeChar5);

        System.out.println("\n Задача №7. Отображение количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int hundred = (srcNum / 100) % 10;
        int ten = (srcNum / 10) % 10;
        int one = srcNum % 10;
        System.out.println("\n Число N = " + srcNum + " содержит");
        System.out.println("\n X сотен " + hundred);
        System.out.println("\n X десятков " + ten);
        System.out.println("\n X единиц " + one);

        System.out.println("\n Задача №8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underline = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("        " + slash + "" + backslash);
        System.out.println("       " + slash + "  " + backslash);
        System.out.println("      " + slash + "" + underline + "" + openBracket + "" + " " + closeBracket + backslash);
        System.out.println("     " + slash + "      " + backslash);
        System.out.println("    " + slash + "" + underline + "" + underline + "" + underline + "" + underline +"" + 
                slash + "" + backslash + "" + underline + "" + underline + "" + backslash);

        System.out.println("\n Задача №9. Произведение и сумма цифр числа");
        int srcNum1 = 345;
        int hundred1 = (srcNum1 / 100) % 10;
        int ten1 = (srcNum1 / 10) % 10;
        int one1 = srcNum1 % 10;
        int sumDigits = hundred1 + ten1 + one1;
        int multDigits = hundred1 * ten1 * one1;
        System.out.println("\n Сумма цифр числа 345 = " + sumDigits + "\n Произведение цифр числа 345 = " + multDigits);

        System.out.println("\n Задача №10. Преобразование секунд");
        // всего секунд
        int secs = 86399;
        // количество секунд
        int sec = secs % 60;
        // количество минут
        int min = secs / 60 % 60;
        // количество часов
        int hour = secs / 3600;
        System.out.println("\n ЧЧ:ММ:СС/" + hour + ":" + min + ":"+sec);
    }
}