import java.util.Arrays;
import java.util.Random;

public class SaeAlgo {

    public static void main(String[] args) {

        //  int[] donnees = genererDonneesEntreBornes(200000, -1065556, 151112);

        int[] donnees = genererDonnees(20);
        System.out.println(Arrays.toString(donnees));

        long tempsDebut = System.nanoTime();

        //triePeigne(donnees);
        //triParInsertion(donnees);
        //triComptage(donnees);
        //triABulle(donnees);

        long tempsFin = System.nanoTime();

        System.out.println("Temps de calcul en millisecondes: " + ((tempsFin - tempsDebut) / 1000000));

        System.out.println(Arrays.toString(donnees));
    }

    /*
        Retourne un tableau de int de longueur n rempli avec des valeurs aléatoires
        (valeurs comprises entre Integer.MIN_VALUE=-2^31 et Integer.MAX_VALUE=2^31-1 inclus).
    */
    public static int[] genererDonnees(int n) {
        Random random = new Random();
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++)
            t[i] = random.nextInt(); // tirage aléatoire d'un int quelconque (compris entre -2^31 et 2^31-1)
        return t;
    }

    /*
        Retourne un tableau de int de longueur n rempli avec des valeurs aléatoires comprises entre min et max inclus.
    */
    public static int[] genererDonneesEntreBornes(int n, int min, int max) {
        Random random = new Random();
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++)
            t[i] = random.nextInt(max - min + 1) + min; // nextInt(borne) retourne un int compris entre 0 inclus et borne exclus.
        return t;
    }


    public static int[] triParInsertion(int[] tab) {

        for (int i = 0; i < tab.length; i++) {

            // On définit "pivot" comme étant l'élément courant du tableau.
            int pivot = tab[i];

            // On définit "j" comme étant l'indice de l'élément courant du tableau d'entrée. Cela va permettre de connaitre la position actuelle de l'élément courant pour
            // ensuite l'insérer à la bonne place parmi les éléments déjà triés.
            int j = i;

            // La boucle while vérifie si "j" est supérieur à 0 et si "pivot" est inférieur à l'élément précédent dans le tableau. Si ces deux conditions
            // sont remplies, alors l'élément précédent est déplacé vers la droite pour faire de la place pour "pivot". La boucle while continue de vérifier ces conditions jusqu'à ce qu'un élément
            // plus petit que "pivot" soit rencontré ou jusqu'à ce que "j" soit égal à 0.
            while (j > 0 && pivot < tab[j - 1]) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = pivot;
        }
        return tab;
    }

    public static int[] triABulle(int[] tab) {

        boolean aTrie;
        do {
            aTrie = false;
            for (int j = 1; j < tab.length; j++) {

                //On compare deux à deux les éléments t[j] et t[j-1] consécutifs d'un tableau et on effectue une permutation si t[j-1] > t[j].
                // Lors de la permutation pour ne pas perdre t[j] on le conserve dans un ‘PIVOT’ . On continue de trier jusqu'à ce qu'il n'y ait plus de permutation.
                if (tab[j - 1] > tab[j]) {
                    int pivot = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = pivot;
                    aTrie = true;
                }
            }
        } while (aTrie);
        // A un certain point lorsque la condition du if ne sera plus possible alors aTrie va rester à false donc on ne va plus rentrer dans le do while
        // donc c'est la fin et ce do while va permettre de ne faire aucun calcul si le tableau est déjà trié avant.

        return tab;
    }

    public static int[] triComptage ( int[] tabEntree) {


        int min = 0, max = 1;

        for (int i = 0; i< tabEntree.length; i++ ) {

            if (tabEntree[i]< min) {
                min = tabEntree[i];
            }
            if (tabEntree[i]>max) {
                max = tabEntree[i];
            }
        }

        int [] tabFinal = new int[tabEntree.length];
       
        int[] tabCompteur = new int[max - min + 1];


        // Cette méthode est possible seulement parcque les tableaux en java sont initialisé à 0 au début
        // si on voudrait l'adapter à un autre language il faudrait initialiser toute les valeurs du tableau à 0 avant

        for (int i = 0; i< tabEntree.length; i++ ) {
            int pivot = tabEntree[i];
            tabCompteur[pivot - min]++;
        }

        int index=0;

        for (int i=0; i< tabCompteur.length; i++) {

            //On à 2 boucles for car on peut avoir plusieurs fois le même chiffre donc c'est pour ne pas en sauter un
            //C'est grâce au tableau contage que l'on va dérouler que l'on va pouvoir entrer les valeurs dans le tableau final
            for (int j=0; j < tabCompteur[i] ; j++) {
                tabFinal[index] = i;
                index++;
            }
        }
        return tabFinal;
    }

    public static void afficherTableau(int[] tab) {
        System.out.println(Arrays.toString(tab));
    }

    public static int[] triePeigne(int[] tab) {

        int intervalle = tab.length;
        boolean echange;

        do {

            //si l'intervalle est inférieur à 1, il est mis à 1 pour éviter la boucle infinie.
            intervalle = (int) (intervalle / 1.3);
            if (intervalle < 1) {
                intervalle = 1;
            }

            echange = false;

            // La boucle "for" parcourt le tableau d'entrée, en comparan chaque élément avec l'élément situé "intervalle" positions
            // plus loin dans le tableau. Si l'élément courant est plus grand que l'élément comparé, les deux éléments sont
            // échangés et "echange" est défini à vrai.
            for (int i = 0; i + intervalle < tab.length; i++) {
                if (tab[i] > tab[i + intervalle]) {
                    int pivot = tab[i];
                    tab[i] = tab[i + intervalle];
                    tab[i + intervalle] = pivot;
                    echange = true;
                }
            }
        } while (intervalle > 1 || echange);
        // La boucle "do-while" continue jusqu'à ce que "echange" soit faux ou
        // intervalle sup à 1 , indiquant que le tableau est trié.

        return tab;
    }
}
