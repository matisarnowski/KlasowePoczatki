import java.util.Locale;
import java.util.Scanner;

//Zaimportowaliśmy Biblioteki służące do wczytywania danych.

public class Glowna {
    public static void main(String[] args){

        //Tutaj ustawiamy możliwość wczytywania danych i sposób ich wczytywania. Będzie, to notacja dla liczb o rozwinięciu dziesiętnym z kropką.

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        //Teraz policzymy pole koła.

        System.out.println("Podaj liczbę stanowiącą o promieniu koła: ");
        double promien1 = scanner.nextDouble();
        double pi1 = Math.PI;

        //Tu program tworzy klasę.

        Circle kolo = new Circle();

        //Tu program przypisuje wartości do zmiennych, które same nadaliśmy.

        kolo.promien = promien1;
        kolo.pi = pi1;

        System.out.println("Pole koła wynosi" + kolo.liczPoleKola());

        //Tu program wyrzucił dane na standardowe wyjście.
        //Teraz policzymy pole ośmiokąta.

        System.out.println("Podaj liczbę stanowiącą o boku ośmiokąta: ");
        double ramie = scanner.nextDouble();
        double pierwiastek1 = Math.sqrt(3.0);

        //Tu program tworzy klasę.

        Hexagon osmiokat = new Hexagon();

        //Tu program przypisuje wartości do zmiennych, które sami nadaliśmy.

        osmiokat.bok = ramie;
        osmiokat.pierwiastek = pierwiastek1;

        System.out.println("Pole ośmiokąta wynosi: " + kolo.liczPoleKola());

        //Tu program wyrzucił dane na standardowe wyjście.
        //Teraz policzymy pole trójkąta prostokątnego.

        System.out.println("Podaj liczbę stanowiącą o podstawie trójkąta: ");
        double podstawa1 = scanner.nextDouble();
        System.out.println("Podaj liczbę stanowiącą o wysokości trójkąta opuszczonej na tą podstawę: ");
        double wysokosc1 = scanner.nextDouble();

        //Tu program tworzy klasę.

        Triangle trojkat = new Triangle();

        //Tu program przypisuje wartości do zmiennych, które sami nadaliśmy.

        trojkat.podstawa = podstawa1;
        trojkat.wysokosc = wysokosc1;

        System.out.println("Pole trójkąta wynosi: " + trojkat.liczPoleTrojkata());

        //Tu program wyrzucił dane na standardowe wyjście.
        //Teraz policzymy pole prostokąta.

        System.out.println("Podaj liczbę stanowiącą o pierwszym boku prostokąta: ");
        double bok1 = scanner.nextDouble();
        System.out.println("Podaj liczbę stanowiącą o drugim boku prostokąta: ");
        double bok2 = scanner.nextDouble();

        //Tu program tworzy klasę.

        Rectangle prostokat = new Rectangle();

        //Tu program przypisuje wartości do zmiennych, które sami nadaliśmy.

        prostokat.dlugoscBokuPierwsza = bok1;
        prostokat.dlugoscBokuDruga = bok2;

        System.out.println("Pole prostokąta wynosi: " + prostokat.liczPoleProstokata());

        //Tu program wyrzucił dane na standardowe wyjście.
        //Teraz policzymy pole kwadratu.

        System.out.println("Podaj liczbę stanowiącą o boku kwadratu: ");
        double bokKwadratu = scanner.nextDouble();

        //Tu program tworzy klasę.

        Square kwadrat = new Square();

        //Tu program przypisuje wartości do zmiennych, które sami nadaliśmy.

        kwadrat.dlugoscBoku = bokKwadratu;

        System.out.println("Pole kwadratu wynosi: " + kwadrat.liczPoleKwadratu());


    }
}
