package org.example;


public class App 
{
    public static void main( String[] args )
    {

        /* Zadanie 2:
        Stwórz tablicę nazw europejskich miast i następnie wypisz je na następujące sposoby:
        od początku do końca
        od końca do początku
        co drugie miasto */

        String[] cities = new String[4];
        cities[0] = "Berlin";
        cities[1] = "Kraków";
        cities[2] = "Paryż";
        cities[3] = "Wiedeń";

        for (Integer i = 0; i < cities.length; i++) {
            String city = cities[i];
            System.out.println(city);
        }
        System.out.println();

        for (Integer i = 3; i >= 0 ; i--) {
            String newCity = cities[i];
            System.out.println(newCity);
        }
        System.out.println();

        for (Integer i = 0; i < cities.length; i+=2) {
            String city = cities[i];
            System.out.println(city);
        }

        /* Zadanie 3:
        Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb. */

        Float[] floats1 = new Float[] {4.05f , 2.3f , 8.94f , -1.0f};

        Float sum1 = 0f;
        for (int i = 0; i < floats1.length; i++) {
            sum1 = floats1[i] + sum1;
        }
        System.out.println("Suma liczb wynosi " + sum1);

        Float average1 = sum1/ floats1.length;
        System.out.println("Średnia wynosi " + average1);

        System.out.println();


        /* Zadanie 4:
        Stwórz tablicę imion (z powtórzeniami) i następnie policz, ile razy występuje w niej imię "Jan". */

        String[] names = new String[] {"Jan", "Ania", "Jan"};

        int iterator = 0;
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (name.equals("Jan")) {
                iterator++;
                System.out.println(name);
            }
        }
        System.out.println("Imię Jan występuje " + iterator + " razy");


        /* Zadanie 5:
        Stwórz tablicę imion (bez powtórzeń) i następnie podaj, na którym indexie znajduje się w niej imię "Jan". */

        String[] names1 = new String[] {"Janek", "Jan", "Jasiek"};

        for (int i = 0; i < names1.length; i++) {
            String name = names1[i];
            if (name.equals("Jan")) {
                System.out.println("Imię " + name + " znajduje się na " + i + " indeksie");
            }
        }

        /* Zadanie 6: 
        Stwórz tablicę liczb całkowitych i następnie znajdź największy i najmniejszy element tej tablicy. */

        Integer[] numbers = new Integer[] {1, 4, 6, 10};
        
        /*robimy zalozenie, chcemy zeby chwilowo przypisac pierwsza wartosc z tabeli i zaczac w petli sprawdzac od drugiej */

                Integer valueMax = numbers[0];
                Integer valueMin = numbers[0];

                for (int i = 1; i < numbers.length; i++) {
                    if (valueMax < numbers[i]) {
                        valueMax = numbers[i];
                    }
                     if (valueMin > numbers[i]) {
                         valueMin = numbers[i];
                     }
                }
                    System.out.println("Najmniejszy element tablicy to " + valueMin);
                    System.out.println("Największy element tablicy to " + valueMax);
    }
}
