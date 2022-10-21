package com.javacource.se;

import java.time.Year;

public class homework8 {
    public static void main(String[] args) {
        //Задание 1
//Продолжим работать с накоплениями. Продолжите работать с кодом, который вы написали в предыдущем уроке.
//С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
//Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений равна … рублей" с тем количеством месяцев, необходимым для накопления данной суммы.
        System.out.println("ЗАДАНИЕ 1 БЛОК1");
int start = 0;
int put = 15000;
int month = 1;
while (start < 2_459_000) {
start = start + put;
month++;
System.out.println("Месяц " + month + "сумма накоплений равна " + start + "рублей");
}


            // Задание 2
//Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
//На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
//Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
//Не забудьте выполнить переход на новую строку между двумя циклами.
//В результате программы вывод должен получиться следующий:
            // 1 2 3 4 5 6 7 8 9 10
            //10 9 8 7 6 5 4 3 2 1
            System.out.println("ЗАДАНИЕ 2 БЛОК1");
int i = 0;
while (i < 10) {
i++;
System.out.println(i);
int k = 10;
for (k = 10; k > 0; k--) {
System.out.println(k);
}
    
                //Задание 3
//В стране Y население равно 12 миллионам человек.
// За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек. Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
//В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "
                System.out.println("Задание 3 блок 1");
int population = 12_000_000;
int born = 17 * population / 1000;
int died = 8 * population / 1000;
int populationEveryYear = 0;
for (int year = 1; year <= 10; year++) {
populationEveryYear = born - died + population + populationEveryYear;
System.out.println("год " + year + " численность населения составляет " + populationEveryYear);
}

                    //Условие
//Напишите программу, которая выводит в консоль сумму накоплений.
                    //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.
//Первоначальная сумма вклада Василия составляет 15 тысяч рублей.

//Задание 1
//Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%. Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
  System.out.println("Задание 4 блок 2");
 int monthNumber = 0;
 int percent = 7;
 int sum = 0;
 int monthPut = 15000;
 for (sum = 0; sum <= 12_000_000; monthNumber++) {
 sum = sum + (monthPut * 7) / 100;
 if (monthNumber % 6 == 0) {
 System.out.println("Месяц " + monthNumber + " сумма накоплений равна " + sum + "рублей");
 }

                            //Задание 2
//Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
                            System.out.println("Задание 2 блок 2 выполнено внутри первого задания");

                            // Задание 3
//Василий решил, что год копить деньги ближайшие 9 лет. И он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
//Исход сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
//Напишит программу, которая будет выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.
                            System.out.println("Задание 3 блок 2");
  int money = 15000;
  int month1 = 1;
  int Percent = 7;
  int moneyOFPercent = 0;
  for (month1 = 1; month1 < 9 * 12; month1++) {
  moneyOFPercent = moneyOFPercent + (money * 7) / 100;
  if (month1 % 6 == 0) ;
  System.out.println("Месяц "+month1+" сумма накоплений равна"+moneyOFPercent);
  }
                         //Задание 4 блок 2
  System.out.println("Задание 4 блок 2");
      
  int friday=5;
  for (friday=5;friday<31;friday+=7) {
  System.out.println("Сегодня пятница "+friday+" число.Необходимо подготовить отчет.");
  }
                                     //Задания из третьего блока
  System.out.println("Задание из третьего блока");
  int currentYear=2022;
  int begining=currentYear-200;
  int ending=currentYear+100;
  for (int m=begining;m<ending;m++) {
  if (m % 79==0) {
  System.out.println(m);
  }
 

                                       //Второе задание из третьего блока
  System.out.println("второе задание третьего блока");

  for (int table=1;table<=10;table++) {
  System.out.println("2 * "+ table +"= "+2 * table );
   }
  }
                                    

                                
                            
                        
                    
              
           
 
