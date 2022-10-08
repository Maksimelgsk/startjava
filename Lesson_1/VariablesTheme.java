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
        System.out.println("\n Количество ядер процессора = "  + numCore + "шт.");
        System.out.println("\n Частота процессора = " + freqCpu + "МГц");
        System.out.println("\n Оперативная память = " + sizeRam + "КБ");
        System.out.println("\n Объем жесткого диска D = " + sizeHdd1 + "байт");
        System.out.println("\n Объем жесткого диска C = " + sizeHdd2 + "Гб");
        System.out.println("\n Объем сетевого жесткого диска E = " + sizeHdd3);
        System.out.println("\n Измерение объема диска 'E'-" + unitOfcharge1 + unitOfcharge2);
        System.out.println("\n У тебя ноутбук?-" + comp);
        System.out.println("\n У тебя компьютер?-" + lapTop);

        System.out.println("\n Задача №2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        float discount = 0.11F;
        float discountPrice = (pricePen - discount * pricePen) + (priceBook - discount * priceBook);
        System.out.println("\n Сумма скидки = " + (discount * pricePen + discount * priceBook));
        System.out.println("\n Общая стоимость товара со скидкой = " + discountPrice);

        System.out.println("\n Задача №3. Вывод на консоль слова JAVA");
        char bigJ = 'J';
        char smallA ='a';
        char smallV ='v';
        char bigV = 'V';
        char space = ' ';
        System.out.println("\n" + space + space + space + bigJ + space + space + space + space + smallA + space + space + smallV
        + space + space + space + space + space + smallV + space + space + smallA);
        System.out.println("" + space + space + space + bigJ + space + space + space + smallA + space + smallA + space + space
        + smallV + space + space + space + smallV + space + space + smallA + space + smallA + space);
        System.out.println("" + bigJ+ space + space + bigJ + space + space + smallA + smallA + smallA + smallA + smallA 
        + space + space + bigV + space + bigV + space + space + smallA + smallA + smallA + smallA + smallA);
        System.out.println("" + space + bigJ + bigJ + space + space + smallA + space + space + space + space + space + smallA 
        + space + space + bigV + space + space + smallA + space + space + space + space + space + smallA);

        System.out.println("\n Задача №4.Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("\n Первоначальное значение byte = " + byteMax);
        System.out.println(" Значение после инкремента = " + ((int)byteMax + 1));
        System.out.println(" Значение после декремента = " + (byteMax - 1));
        System.out.println("\n Первоначальное значение short = " + shortMax);
        System.out.println(" Значение после инкремента = " + ((int)shortMax + 1));
        System.out.println(" Значение после декремента = " + (shortMax - 1));
        System.out.println("\n Первоначальное значение int = " + intMax);
        System.out.println(" Значение после инкремента = " + ((long)intMax + 1));
        System.out.println(" Значение после декремента = " + (intMax -1));
        System.out.println("\n Первоначальное значение long = " + longMax);
        System.out.println(" Значение после инкремента = " + ((float)longMax + 1));
        System.out.println(" Значение после декремента = " + (longMax - 1));

        System.out.println("\n Задача №5. Перестановка значений переменных");
        System.out.println("\n Перестановка значений с помощью третьей переменной");
        int a = 2;
        int b = 5;
        System.out.println("\n Исходное значение a=" + a + "\n Исходное значение b=" + b);
        int c = b;
        b = a;
        a = c;
        System.out.println("\n Новые значения переменных" + "\n a=" + a + "\n b=" + b);
        System.out.println("\n Перестановка значений с помощью арифметических операций");
        a = 2;
        b = 5;
        System.out.println("\n Исходное значение a=" + a + "\n Исходное значение b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\n Новые значения переменных" + "\n a = " + a + "\n b = " + b);
        System.out.println("\n Перестановка значений с помощью побитовой операции ^");
        a = 2;
        b = 5;
        System.out.println("\n Исходное значение a = " + a + "\n Исходное значение b = " + b);
        // a=5^2=0101^0010=0111=7
        a = a^b;
        // b=7^2=0111^0010=0101=5
        b = a^b;
        // a=5^7=0101^0111=0010=2
        a = b^a;
        System.out.println("\n Новые значения переменных" + "\n a=" + a + "\n b=" + b);

        System.out.println("\n Задача №6. Вывод символов и их кодов");
        char codeChar1 = '#';
        char codeChar2 = '&';
        char codeChar3 = '@';
        char codeChar4 = '^';
        char codeChar5 = '_';
        System.out.println("\n Код символа ASII - " + (int)35 + " Символ - " + codeChar1);
        System.out.println("\n Код символа ASII - " + (int)38 + " Символ - " + codeChar2);
        System.out.println("\n Код символа ASII - " + (int)64 + " Символ - " + codeChar3);
        System.out.println("\n Код символа ASII - " + (int)94 + " Символ - " + codeChar4);
        System.out.println("\n Код символа ASII - " + (int)95 + " Символ - " + codeChar5);

        System.out.println("\n Задача №7. Отображение количества сотен, десятков и единиц числа");
        //Число N
        int srcNum = 123;
        // сотни числа N
        int hungredNum = (srcNum / 100) % 10;
        // десятки числа N
        int tenNum = (srcNum / 10) % 10;
        // единицы числа N
        int oneNum =srcNum  % 10;
        System.out.println("\n Число N = " + srcNum + " содержит");
        System.out.println("\n X сотен " + hungredNum);
        System.out.println("\n X десятков " + tenNum);
        System.out.println("\n X единиц " + oneNum);

        System.out.println("\n Задача №8. Вывод на консоль ASCII-арт Дюка");
        char rightSlash = '/';
        char doubleSlash = '\\';
        char lowSlash = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("        " + rightSlash + "" + doubleSlash);
        System.out.println("       " + rightSlash + "  " + doubleSlash);
        System.out.println("      " + rightSlash + "" + lowSlash + "" + openBracket + "" + "" + closeBracket + " " + doubleSlash);
        System.out.println("     " + rightSlash + "      " + doubleSlash);
        System.out.println("    " + rightSlash + "" + lowSlash + "" + lowSlash + "" + lowSlash + "" + lowSlash +"" + rightSlash + "" 
        + doubleSlash + "" + lowSlash + "" + lowSlash + "" + doubleSlash);

        System.out.println("\n Задача №9. Произведение и сумма цифр числа");
        //Число N
        int srcNum1 = 345;
        // сотни числа N
        int hungredNum1 = (srcNum1 / 100) % 10;
        // десятки числа N
        int tenNum1 = (srcNum1 / 10) % 10;
        // единицы числа N
        int oneNum1 = srcNum1 % 10;
        int sumNum = hungredNum1 + tenNum1 + oneNum1;
        int multNum = hungredNum1 * tenNum1 * oneNum1;
        System.out.println("\n Сумма цифр числа 345 = " + sumNum + "\n Произведение цифр числа 345 = " + multNum);

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