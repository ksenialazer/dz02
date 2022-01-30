package com.company;

public class Main {

    public static void main(String[]args) {
        byte b = -128; // [-128, 127] 1 байт
        short s = -32768; // [-32768; 32767] 2 байта
        int i = 2_147_483_647; //[-2147483648, 2147483647] 4 байта
        long l = 9223372036854775807L; //[-922372036854775808,922372036854775807] 8 байт
        float f = 3.4028235E38f; //4 байта
        double d = 1.7976931348623158E308;//8 байт
        char a = 'a'; // 2 байта
        boolean e = true; // 4 байта


        float b1 = 78.2f;
        System.out.println(b1);
        double b2 = 87.7;
        System.out.println(b2);
        System.out.println("Sum: " + (b1 + b2));
        System.out.println("Diff: " + (b2 - b1));

float gramsInKg = 1000;
int bananaWeight = 80;
int milkWeight = 105;
int iceCreamWeight = 100;
int eggWeight = 70;
int bananaAmount = 5;
int milkAmount = 2;
int iceCreamAmount =2;
int eggAmount =4;
int result = (bananaWeight * bananaAmount) +(milkWeight * milkAmount) +(iceCreamWeight * iceCreamAmount) + (eggWeight * eggAmount);
float resultInKg = result / gramsInKg;
System.out.println(resultInKg);


int needToLoseKgs = 7;
int gramsInKilogram = 1000;
int needToLoseGs = needToLoseKgs + gramsInKilogram;
int minGramsPerDay = 250;
int maxGramsPerDay = 500;
int minDays = needToLoseGs / maxGramsPerDay;
int maxDays = needToLoseGs / minGramsPerDay;
int avgDays = (minDays + maxDays);
System.out.println("Min: " + minDays);
System.out.println("Max: " + maxDays);
System.out.println("Avg: " + avgDays);


int mashaSalary = 67_760;
int denisSalary = 83_690;
int kristinaSalary = 76_230;
int percent = 10;
float newSalaryMultiplier = 1 + (percent / 100f);
int mashaNewSalary = (int) (mashaSalary * newSalaryMultiplier);
int mashaTotalSalaryDiff = (mashaNewSalary - mashaSalary) * 12;
int denisNewSalary = (int) (denisSalary * newSalaryMultiplier);
int denisTotalSalaryDiff = (int) (denisNewSalary - denisSalary) * 12;
int kristinaNewSalary = (int) (kristinaSalary * newSalaryMultiplier);
int kristinaTotalSalaryDiff = (kristinaNewSalary - kristinaSalary) *12;
System.out.println("Маша теперь получает: " + mashaNewSalary + "." + "Годовой доход вырос на " + mashaTotalSalaryDiff + " рублей.");
System.out.println("Денис теперь получает: " + denisNewSalary + "." + "Годовой доход вырос на " + denisTotalSalaryDiff + " рублей.");
System.out.println("Кристина теперь получает: " + kristinaNewSalary + "." + "Годовой доход вырос на " + kristinaTotalSalaryDiff + " рублей.");



    }
}
