import java.lang.reflect.Array;
import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

    Random rand = new Random();

    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!

    public String randomBoyName() {

        String[] names;
        Data data = new Data();
        names = data.getRandomDrengeNavne();
        // LASSE names = new Data().getRandomDrengeNavne();

        int arrayLength = names.length;
        int randomInt = rand.nextInt(arrayLength);
        String randomName = names[randomInt];
        return randomName;
        // LASSE return names[rand.nextInt(names.length)];
    }

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)
    // Se løsning test klassen Algorithms1Test

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen
    public String randomGirlName() {
        String[] names;
        names = new Data().getRandomPigeNavne();
        return names[rand.nextInt(names.length)];
    }
    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer et navn fra det

    public String[] randomName()  {
        String[] allNames;
        String[] boyNames = new Data().getRandomDrengeNavne();
        String[] girlNames = new Data().getRandomPigeNavne();
        int hvorStortSkalDetVære = boyNames.length + girlNames.length;
        allNames = new String[hvorStortSkalDetVære];
        //put alle piger ned i allNames
        int i = 0;
        for (String name : boyNames) {
            allNames[i++] = name;
        }
        for (String name : girlNames) {
            allNames[i++] = name;
        }
        //put alle drenge ned i allNames
        return allNames;
    }


    // TODO 6 - Skriv en test til randomName() metoden
    // Se i tests

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)
    public String randomBogstav() {
        String bogstaver[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        return bogstaver[rand.nextInt(bogstaver.length)];
    }

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)
    public boolean pletEllerKrone() {
        if (rand.nextInt(2)==1) {
            return true;
        }
        return false;
    }

    // TODO 9 - Lav en ny array i Data klassen, som skal indeholde navne på medlemmer af din gruppe. Lav metoden whoShall() i Algorithms1, som skal returnere et navn fra gruppen
    String whoShall() {
        String[] teamet = new Data().getTeamet();
        return teamet[rand.nextInt(teamet.length)];
    }
    // TODO 10 - Lav en method override til whoShall() således, at den kan tage imod "int n". Nu skal metoden returnere et array med n elementer, som skal være et tilfældigt navn hver
    String[] whoShall(int x) {
        String[] teamet = new Data().getTeamet();
        String[] array = new String[x];
        for (int i = 0; i < x; i++) {
            array[x] = teamet[rand.nextInt(teamet.length)];
        }
        return array;
    }
    public static void main(String[] args) {
        // exampleOfPredictableRandomNumber();
         Algorithms1 a1 = new Algorithms1();
        // System.out.println("Et random navn er " + a1.randomBoyName());
        //System.out.println(a1.randomName());
        for (int i = 0; i < 100; i++) {
            String coin = "Plet";
            if (a1.pletEllerKrone()) coin = "Krone";
            System.out.println("Random bogstav og mønt: " + a1.randomBogstav() + " " + coin);
        }
    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(7); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

}
