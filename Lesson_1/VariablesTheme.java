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
      System.out.println("\n Количество ядер процессора="  + numCore + "шт.");
      System.out.println("\n Частота процессора=" + freqCpu + "МГц");
      System.out.println("\n Оперативная память=" + sizeRam + "КБ");
      System.out.println("\n Объем жесткого диска D=" + sizeHdd1 + "байт");
      System.out.println("\n Объем жесткого диска C=" + sizeHdd2 + "Гб");
      System.out.println("\n Объем сетевого жесткого диска E=" + sizeHdd3);
      System.out.println("\n Измерение объема диска 'E'-" + unitOfcharge1 + unitOfcharge2);
      System.out.println("\n У тебя ноутбук?-" + comp);
      System.out.println("\n У тебя компьютер?-" + lapTop);

      System.out.println("\n Задача №2. Расчет стоимости товара со скидкой");
         //стоимость ручки
         int pricePen = 100;
         //стоимость книги
         int priceBook = 200;
         //сумма скидки
         float discount = 0.11F;
         //скидка на ручку
         float discountPen = discount * pricePen;
         //скидка на книгу
         float discountBook = discount * priceBook;
         //общая скидка
         float totalDiscount = discountPen + discountBook;
         //общая стоимость товара со скидкой
         float priceTotalDiscount = (pricePen - discountPen) + (priceBook - discountBook);
      System.out.println("\n Сумма скидки=" + totalDiscount);
      System.out.println("\n Общая стоимость товара со скидкой= " + priceTotalDiscount);

      System.out.println("\n Задача №3. Вывод на консоль слова JAVA");
         char letter1 = 'J';
         char letter2 ='a';
         char letter3 ='v';
         char letter4 = 'V';
         char void1 = ' ';
      System.out.println("\n" + void1 + void1 + void1 + letter1 + void1 + void1 + void1 +void1 + letter2 + void1 + void1 + letter3 + void1 + void1 + void1 + void1 + void1 + letter3 + void1 + void1 + letter2);
      System.out.println("" + void1 + void1 + void1 + letter1 + void1 + void1 + void1 + letter2 + void1 + letter2 + void1 + void1 + letter3 + void1 + void1 + void1 + letter3 + void1 + void1 + letter2 + void1 + letter2 + void1);
      System.out.println("" + letter1 + void1 + void1 + letter1 + void1 + void1 + letter2 + letter2 + letter2 + letter2 + letter2 + void1 + void1 + letter4 + void1 + letter4 + void1 + void1 + letter2 + letter2 + letter2 + letter2 + letter2);
      System.out.println("" + void1 + letter1 + letter1 + void1 + void1 + letter2 + void1 + void1 + void1 + void1 + void1 + letter2 + void1 + void1 + letter4 + void1 + void1 + letter2 + void1 + void1 + void1 + void1 + void1 + letter2);

      System.out.println("\n Задача №4.Отображение min и max значений числовых типов данных");
         // самое большое число типа byte
         byte byteMax = 127;
         // инкремент 127
         int byteMaxIncr = byteMax + 1;
         // декремент 127
         int byteMaxDecr = byteMax - 1;
         // самое большое число типа short
         short shortMax = 32767;
         // инкремент 32767
         int shortMaxIncr = shortMax + 1;
         // декремент 32767
         int shortMaxDecr = shortMax - 1;
         // самое большое число типа int
         int intMax = 2147483647;
         // инкремент 2147483647
         long intMaxIncr = intMax + 1L;
         // декремент 2147483647
         long intMaxDecr = intMax - 1L;
         // самое большое число типа long
         long longMax = 9223372036854775807L;
         // инкремент 9223372036854775807
         double longMaxIncr = longMax + 1D;
         // декремент 9223372036854775807
         long longMaxDecr = longMax - 1L;
      System.out.println("\n Максимальное значение переменной byte=" + byteMax);
      System.out.println("\n Инкремент максимального значения bute=" + byteMaxIncr);
      System.out.println("\n Декремент максимального значения bute=" + byteMaxDecr);
      System.out.println("\n Максимальное значение переменной short=" + shortMax);
      System.out.println("\n Инкремент максимального значения short=" + shortMaxIncr);
      System.out.println("\n Декремент максимального значения short=" + shortMaxDecr);
      System.out.println("\n Максимальное значение переменной int=" + intMax);
      System.out.println("\n Инкремент максимального значения int=" + intMaxIncr);
      System.out.println("\n Декремент максимального значения int=" + intMaxDecr);
      System.out.println("\n Максимальное значение переменной long=" + longMax);
      System.out.println("\n Инкремент максимального значения long=" + longMaxIncr);
      System.out.println("\n Декремент максимального значения long=" + longMaxDecr);

      System.out.println("\n Задача №5. Перестановка значений переменных");
      System.out.println("\n Перестановка значений с помощью третьей переменной");
         int a = 2;
         int b = 5;
      System.out.println("\n Исходное значение a=" + a + "\n Исходное значение b=" + b);
         int c;
         // c=5
         c = b;
         // b=2
         b = a;
         // a=5
         a = c;
      System.out.println("\n Новые значения переменных" + "\n a=" + a + "\n b=" + b);
      System.out.println("\n Перестановка значений с помощью арифметических операций");
         a = 2;
         b = 5;
      System.out.println("\n Исходное значение a=" + a + "\n Исходное значение b=" + b);
         // a=2+5=7
         a = a + b;
         // b=7-5=2
         b = a - b;
         // a=7-2=5
         a = a - b;
      System.out.println("\n Новые значения переменных" + "\n a=" + a + "\n b=" + b);
      System.out.println("\n Перестановка значений с помощью побитовой операции ^");
         a = 2;
         b = 5;
      System.out.println("\n Исходное значение a=" + a + "\n Исходное значение b=" + b);
         // a=5^2=0101^0010=0111=7
         a = a^b;
         // b=7^2=0111^0010=0101=5
         b = a^b;
         // a=5^7=0101^0111=0010=2
         a = b^a;
      System.out.println("\n Новые значения переменных" + "\n a=" + a + "\n b=" + b);

      System.out.println("\n Задача №6. Вывод символов и их кодов");
         char a1 = '#';
         int asii_a1 = (int)a1;
         char a2 = '&';
         int asii_a2 = (int)a2;
         char a3 = '@';
         int asii_a3 = (int)a3;
         char a4 = '^';
         int asii_a4 = (int)a4;
         char a5 = '_';
         int asii_a5 = (int)a5;
      System.out.println("\n Код символа ASII - " + asii_a1 + " Символ - " + a1);
      System.out.println("\n Код символа ASII - " + asii_a2 + " Символ - " + a2);
      System.out.println("\n Код символа ASII - " + asii_a3 + " Символ - " + a3);
      System.out.println("\n Код символа ASII - " + asii_a4 + " Символ - " + a4);
      System.out.println("\n Код символа ASII - " + asii_a5 + " Символ - " + a5);

      System.out.println("\n Задача №7. Отображение количества сотен, десятков и единиц числа");
         //Число N
         int n = 123;
         // сотни числа N
         int x = (n / 100) % 10;
         // десятки числа N
         int y = (n / 10) % 10;
         // единицы числа N
         int z =(n / 1) % 10;
      System.out.println("\n Число N содержит");
      System.out.println("\n X сотен " + x);
      System.out.println("\n X десятков " + y);
      System.out.println("\n X единиц " + z);

      System.out.println("\n Задача №8. Вывод на консоль ASCII-арт Дюка");
         char symb1 = '/';
         char symb2 = '\\';
         char symb3 = '_';
         char symb4 = '(';
         char symb5 = ')';
      System.out.println("        " + symb1 + "" + symb2);
      System.out.println("       " + symb1 + "  " + symb2);
      System.out.println("      " + symb1 + "" + symb3 + "" + symb4 + "" + "" + symb5 + " " + symb2);
      System.out.println("     " + symb1 + "      " + symb2);
      System.out.println("    " + symb1 + "" + symb3 + "" + symb3 + "" + symb3 + "" + symb3 +"" + symb1 + "" + symb2 + "" + symb3 + "" + symb3 + "" + symb2);

      System.out.println("\n Задача №9. Произведение и сумма цифр числа");
         //Число N
         int n1 = 345;
         // сотни числа N
         int x1 = (n1 / 100) % 10;
         // десятки числа N
         int y1 = (n1 / 10) % 10;
         // единицы числа N
         int z1 =(n1 / 1) % 10;
         int sumNum = x1 + y1 + z1;
         int multNum = x1 * y1 * z1;
      System.out.println("\n Сумма цифр числа 345 = " + sumNum + "\n Произведение цифр числа 345 = " + multNum);

      System.out.println("\n Задача №10. Преобразование секунд");
         // всего секунд
         int secs = 86399;
         // количество секунд
         int sec = secs / 1 % 60;
         // количество минут
         int min = secs / 60 % 60;
         // количество часов
         int hour = secs / 3600;
      System.out.println("\n ЧЧ:ММ:СС/" + hour + ":" + min + ":"+sec);
    }
}