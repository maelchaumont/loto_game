import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> dejaSortis = new ArrayList<>();

        while(true) {
            Random r = new Random();
            int high = 89;
            int result = r.nextInt(high)+1; //atteindra 90 au max

            //jamais sorti
            if(!dejaSortis.contains(result)) {
                System.out.println("");
                System.out.println("");
                System.out.println("Chiffre sorti : " + result);
                dejaSortis.add(result);
                if(result == 10) System.out.println("C'est le nombre que tatie a choisi");
                if(result == 14) System.out.println("Anniv de Léia ;)");
                if(result == 15) System.out.println("C'est mon chiffre préféré :)");
                if(result == 16) System.out.println("Anniv d'Anaïs");
                if(result == 25) System.out.println("Cool c'est Noël !");

                afficheNombresSortis(dejaSortis);

                Scanner sc = new Scanner(System.in);
                sc.nextLine(); //attente d'une entrée clavier
            }
            //sinon nvTour boucle
        }
    }



    public static void afficheNombresSortis(ArrayList<Integer> maListe) {
        Collections.sort(maListe);

        System.out.println("------------------------------------------");
        System.out.print(" 0 | ");
        for ( Integer nombre :
                maListe) {
            if(nombre < 10) System.out.print(nombre + ", ");
        }
        System.out.println("");


        System.out.println("---|");
        System.out.print(" 1 | ");
        for ( Integer nombre :
             maListe) {
            if(nombre < 20 && nombre > 9) System.out.print(nombre + ", ");
        }
        System.out.println("");


        System.out.println("---|");
        System.out.print(" 2 | ");
        for ( Integer nombre :
                maListe) {
            if(nombre < 30 && nombre > 19) System.out.print(nombre + ", ");
        }
        System.out.println("");


        System.out.println("---|");
        System.out.print(" 3 | ");
        for ( Integer nombre :
                maListe) {
            if(nombre < 40 && nombre > 29) System.out.print(nombre + ", ");
        }
        System.out.println("");


        System.out.println("---|");
        System.out.print(" 4 | ");
        for ( Integer nombre :
                maListe) {
            if(nombre < 50 && nombre > 39) System.out.print(nombre + ", ");
        }
        System.out.println("");


        System.out.println("---|");
        System.out.print(" 5 | ");
        for ( Integer nombre :
                maListe) {
            if(nombre < 60 && nombre > 49) System.out.print(nombre + ", ");
        }
        System.out.println("");


        System.out.println("---|");
        System.out.print(" 6 | ");
        for ( Integer nombre :
                maListe) {
            if(nombre < 70 && nombre > 59) System.out.print(nombre + ", ");
        }
        System.out.println("");


        System.out.println("---|");
        System.out.print(" 7 | ");
        for ( Integer nombre :
                maListe) {
            if(nombre < 80 && nombre > 69) System.out.print(nombre + ", ");
        }
        System.out.println("");

        System.out.println("---|");
        System.out.print(" 8 | ");
        for ( Integer nombre :
                maListe) {
            if(nombre < 90 && nombre > 79) System.out.print(nombre + ", ");
            if(nombre == 90) {
                System.out.println(" 9 | 90");
            }
        }
        System.out.println("");

        System.out.println("------------------------------------------");
    }
}
