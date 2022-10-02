package lekcijaViens.majasDarbs;

public class main {

    public static void main(String[] args) {

    String valstsNosaukums = "Monako";
    String teksts = "Valsts nosaukums: ";
    System.out.println(teksts + valstsNosaukums);

    int iedzivotajuSkaits = 39150;
    System.out.println("Iedzīvotāju skaits: " + iedzivotajuSkaits);

    float platiba = (float) 2.02;
    System.out.println("Platība (km2): " + platiba);

    String galvaspilseta = "Monako";
    System.out.println("Galvaspilsēta: " + galvaspilseta);

    String oficialaValoda = "Franču";
    System.out.println("Oficiālā valoda: " + oficialaValoda);

    boolean MonakoIsAnEUMemberState = true;
    boolean MonakoIsntAnEUMemberState = false;

    System.out.println("Vai Monako ir ES dalībvalsts? " + MonakoIsntAnEUMemberState);

    char valuta = '€';
    System.out.println("Valūta: " + valuta);

    System.out.println("Daži fakti par Monako valsti: \n" + valstsNosaukums + " dzīvo " + iedzivotajuSkaits + " iedzīvotāju. \n" + valstsNosaukums + " platība ir " + platiba + " km2. \n" + "Interesanti, ka " + valstsNosaukums + " galvaspilsēta ir nosaukta tādā pašā vārdā kā pati valsts - " + galvaspilseta + ". \n" + valstsNosaukums + " oficiālā valoda ir " + oficialaValoda + ". \n" + "Monako nav ES dalībvalsts, lai gan tās valūta kopš 2002. gada ir " + valuta + ". \n");


    // Aritmētiskie operatori
        // 1

    int a = 20;
    int b = 5;

    int rezultats = a + b;
    System.out.println(rezultats);

    rezultats = a - b;
    System.out.println(rezultats);

    rezultats = a * b;
    System.out.println(rezultats);

    rezultats = a / b;
    System.out.println(rezultats);

    rezultats = 22 % 5;
    System.out.println(rezultats);

    rezultats = (a+b)+(a-b)+(a*b)+(a/b);
    System.out.println(rezultats);
        //2

    int c = 30;
    int d = 3;

    int summa = c + d;
    System.out.println(summa);

    summa = c - d;
    System.out.println(summa);

    summa = c * d;
    System.out.println(summa);

    double summaDal = c / d;
    System.out.println(summaDal);

    summa = 31 % 3;
    System.out.println(summa);

    summa = (c+d)+(c-d)+(c*d)+(c/d);
    System.out.println(summa);

        //3

     int e = 12345;
     int f = 5;

     int iznakums = e + f;
     System.out.println(iznakums);

     iznakums = e - f;
     System.out.println(iznakums);

     iznakums = e * f;
     System.out.println(iznakums);

     iznakums = e / f;
     System.out.println(iznakums);

     iznakums = 12345 % 4;
     System.out.println(iznakums);

     iznakums = (e+f)+(e-f)+(e*f)+(e/f);
     System.out.println(iznakums);

    }
}
