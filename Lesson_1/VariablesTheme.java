public class VariablesTheme {
   public static void main(String[] args) {
      System.out.println("\n Задача №1. Создание переменных и вывод их значений на консоль");
byte numCore = 1; /*количествово ядер процессора*/
short frequencyCPU = 3800; /*частота процессора в МГц*/
int sizeRAM = 8388608; /*объем оперативной памяти в КБ*/
long sizeHDD1 = 1000202039296L; /*объем жесткого диска D в байтах*/
float sizeHDD2 = 232.88F; /*объем жесткого диска С в Гб*/
double sizeHDD3 = 1.8; /*объем сетевого жесткого диска E без ед. измерения*/
char unitOfcharge1 = 'Т'; /*первая буква ед. измерения диска E*/
char unitOfcharge2 = 'б'; /*вторая буква ед. измерения диска E*/
boolean comp = false;
boolean lapTop = true;
      System.out.println("\n Количество ядер процессора="  + numCore + "шт.");
      System.out.println("\n Чаcтота процессора=" + frequencyCPU + "МГц");
      System.out.println("\n Оперативная память=" + sizeRAM + "КБ");
      System.out.println("\n Объем жесткого диска D=" + sizeHDD1 + "байт");
      System.out.println("\n Объем жесткого диска C=" + sizeHDD2 + "Гб");
      System.out.println("\n Объем сетевого жесткого диска E=" + sizeHDD3);
      System.out.println("\n Измерение объема диска 'E'-" + unitOfcharge1 + unitOfcharge2);
      System.out.println("\n У тебя ноутбук?-" + comp);
      System.out.println("\n У тебя компьютер?-" + lapTop);

      System.out.println("\n Задача №2. Расчет стоимости товара со скидкой");
int pricePen = 100; /*стоимость ручки*/
int priceBook = 200; /*стоимость книги*/
float discount = 0.11F; /*сумма скидки*/
float discountPen = discount * pricePen; /*скидка на рчку*/
float discountBook = discount * priceBook; /*скидка на книгу*/
float totalDiscount = discountPen + discountBook; /*общая скидка*/
float priceTotalDiscount = (pricePen - discountPen) + (priceBook - discountBook); /*общая стоимость товара со скидкой*/
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
byte byteMax = 127;
int byteIncr = byteMax + 1;
int byteDecr = byteMax - 1;
short shortMax = 32767;
int shortIncr = shortMax + 1;
int shortDecr = shortMax - 1;
int intMax = 2147483647;
long intIncr = intMax + 1L;
long intDecr = intMax - 1L;
long longMax = 9223372036854775807L;
longMax++;
long longDecr = longMax - 1L;
      System.out.println("\n Максимальное значение переменной byte=" + byteMax);
      System.out.println("\n Инкремент максимального значения bute=" + byteIncr);
      System.out.println("\n Декремент максимального значения bute=" + byteDecr);
      System.out.println("\n Максимальное значение переменной short=" + shortMax);
      System.out.println("\n Инкремент максимального значения short=" + shortIncr);
      System.out.println("\n Декремент максимального значения short=" + shortDecr);
      System.out.println("\n Максимальное значение переменной int=" + intMax);
      System.out.println("\n Инкремент максимального значения int=" + intIncr);
      System.out.println("\n Декремент максимального значения int=" + intDecr);
      System.out.println("\n Максимальное значение переменной long=" + longMax);
      System.out.println("\n Инкремент максимального значения long=" + longMax);
      System.out.println("\n Декремент максимального значения long=" + longDecr);

      System.out.println("\n Задача №5. Перестановка значений переменных");
      System.out.println("\n Перестановка значений с помощью третьей переменной");
int a = 2;
int b = 5;
      System.out.println("\n Исходное значение a=" + a + "\n Исходное значение b=" + b);
int c;
c = b; // c=5
b = a; // b=2
a = c; // a=5
      System.out.println("\n Новые значения перемнных" + "\n a=" + a + "\n b=" + b);
      System.out.println("\n Перестановка значений с помощью арифметических операций");
a = 2;
b = 5;
      System.out.println("\n Исходное значение a=" + a + "\n Исходное значение b=" + b);
a = a + b; // a=2+5=7
b = a - b; // b=7-5=2
a = a - b; // a=7-2=5
      System.out.println("\n Новые значения перемнных" + "\n a=" + a + "\n b=" + b);
      System.out.println("\n Перестановка значений с помощью побитовой операции ^");
a = 2;
b = 5;
      System.out.println("\n Исходное значение a=" + a + "\n Исходное значение b=" + b);
a = a^b; // a=5^2=0101^0010=0111=7
b = a^b; // b=7^2=0111^0010=0101=5
a = b^a; // a=5^7=0101^0111=0010=2
      System.out.println("\n Новые значения перемнных" + "\n a=" + a + "\n b=" + b);

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

      System.out.println("\n Задача №7. Отображение количества сотен, десятков и едениц числа");
int n = 123; //Число N
int x = (n/100)%10; // сотни
int y = (n/10)%10; // десятки
int z =(n/1)%10; // еденицы
      System.out.println("\n Число N содержит");
      System.out.println("\n X сотен " + x);
      System.out.println("\n X десятков " + y);
      System.out.println("\n X едениц " + z);

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
int n1 = 345; //Число N
int x1 = (n1/100)%10; // сотни
int y1 = (n1/10)%10; // десятки
int z1 =(n1/1)%10; // еденицы
int sumNumb = x1 + y1 + z1;
int multNumb = x1 * y1 * z1;
      System.out.println("\n Сумма цифр числа 345 = " + sumNumb + "\n Произведение цифр числа 345 = " + multNumb);

      System.out.println("\n Задача №10. Преобразование секунд");
int secs = 86399;
int sec = secs/1%60;
int min = secs/60%60;
int hour = secs/3600;
      System.out.println("\n ЧЧ:ММ:СС/" + hour + ":" + min + ":"+sec);
    }
}