import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SaeAlgoTest {

    @Test
    public final void triParInsertion() {

        int[] tabCasMoyen = {2, 7, 0, 5, 6};
        int[] tabResultat =  {0,2,5,6,7};
        assertArrayEquals(tabResultat, SaeAlgo.triParInsertion(tabCasMoyen), "cas avec des valeurs moyennes");

        int[] tablong0 = {};
        int[] tabResultatlong0 = {};
        assertArrayEquals(tabResultatlong0, SaeAlgo.triParInsertion(tablong0), "cas d'un tableau de longueur 0");

        int[] tabnegatif = {-5, -15, -1, -22, -2};
        int[] tabResultnegatif = {-22, -15, -5, -2, -1};
        assertArrayEquals(tabResultnegatif, SaeAlgo.triParInsertion(tabnegatif), "cas avec des valeurs négatifs");

        int[] tabnegpos = {-5, -15, 1, 22, -2, -20, 11};
        int[] tabResultnegpos = {-20, -15, -5, -2, 1, 11, 22};
        assertArrayEquals(tabResultnegpos, SaeAlgo.triParInsertion(tabnegpos), "cas avec des valeurs négatifs et positifs");

        int[] tabpirecas = {65, 60, 58, 55, 52, 44, 41, 33, 29, 20, 11, 4, 0};
        int[] tabRespirecas = { 0, 4, 11, 20, 29, 33, 41, 44, 52, 55, 58, 60, 65};
        assertArrayEquals(tabRespirecas, SaeAlgo.triParInsertion(tabpirecas), "cas avec un tableau trié dans l'ordre décroissant");

        int[] tabpetitelement = {2, 7, 5, 6, 0};
        int[] tabRespetitelement =  {0,2,5,6,7};
        assertArrayEquals(tabRespetitelement, SaeAlgo.triParInsertion(tabpetitelement), "cas d'un tableau ou le plus petit élément est en dernière position");

        int[] tabmeilleurcas = {0,2,5,6,7};
        int[] tabResmeilleurcas =  {0,2,5,6,7};
        assertArrayEquals(tabResmeilleurcas, SaeAlgo.triParInsertion(tabmeilleurcas), "cas d'un tableau déjà trié dans l'ordre croissant");
    }

    @Test
    public final void triABulle() {

        int[] tabCasMoyen = {2, 7, 0, 5, 6};
        int[] tabResultat =  {0,2,5,6,7};
        assertArrayEquals(tabResultat, SaeAlgo.triABulle(tabCasMoyen), "cas avec des valeurs moyennes");

        int[] tablong0 = {};
        int[] tabResultatlong0 = {};
        assertArrayEquals(tabResultatlong0, SaeAlgo.triABulle(tablong0), "cas d'un tableau de longueur 0");

        int[] tabnegatif = {-5, -15, -1, -22, -2};
        int[] tabResultnegatif = {-22, -15, -5, -2, -1};
        assertArrayEquals(tabResultnegatif, SaeAlgo.triABulle(tabnegatif), "cas avec des valeurs négatifs");

        int[] tabnegpos = {-5, -15, 1, 22, -2, -20, 11};
        int[] tabResultnegpos = {-20, -15, -5, -2, 1, 11, 22};
        assertArrayEquals(tabResultnegpos, SaeAlgo.triABulle(tabnegpos), "cas avec des valeurs négatifs et positifs");

        int[] tabpetitelement = {2, 7, 5, 6, 0};
        int[] tabRespetitelement =  {0,2,5,6,7};
        assertArrayEquals(tabRespetitelement, SaeAlgo.triABulle(tabpetitelement), "cas d'un tableau ou le plus petit élément est en dernière position");

        int[] tabmeilleurcas = {0,2,5,6,7};
        int[] tabResmeilleurcas =  {0,2,5,6,7};
        assertArrayEquals(tabResmeilleurcas, SaeAlgo.triABulle(tabmeilleurcas), "cas d'un tableau déjà trié dans l'ordre croissant");
    }

    @Test
    public final void triComptage() {
        int[] tabCasMoyen = {2, 7, 0, 5, 6};
        int[] tabResultat = {0, 2, 5, 6, 7};
        assertArrayEquals(tabResultat, SaeAlgo.triComptage(tabCasMoyen), "cas avec des valeurs moyennes");

        int[] tablong0 = {};
        int[] tabResultatlong0 = {};
        assertArrayEquals(tabResultatlong0, SaeAlgo.triComptage(tablong0), "cas d'un tableau de longueur 0");

        int[] tabnegatif = {-5, -15, -1, -22, -2};
        int[] tabResultnegatif = {-22, -15, -5, -2, -1};
        assertArrayEquals(tabResultnegatif, SaeAlgo.triComptage(tabnegatif), "cas avec des valeurs négatifs");

        int[] tabnegpos = {-5, -15, 1, 22, -2, -20, 11};
        int[] tabResultnegpos = {-20, -15, -5, -2, 1, 11, 22};
        assertArrayEquals(tabResultnegpos, SaeAlgo.triComptage(tabnegpos), "cas avec des valeurs négatifs et positifs");

        int[] tabpetitelement = {2, 7, 5, 6, 0};
        int[] tabRespetitelement =  {0,2,5,6,7};
        assertArrayEquals(tabRespetitelement, SaeAlgo.triComptage(tabpetitelement), "cas d'un tableau ou le plus petit élément est en dernière position");

        int[] tabmeilleurcas = {0,2,5,6,7};
        int[] tabResmeilleurcas =  {0,2,5,6,7};
        assertArrayEquals(tabResmeilleurcas, SaeAlgo.triComptage(tabmeilleurcas), "cas d'un tableau déjà trié dans l'ordre croissant");
    }

    @Test
    public final void triepeigne() {
        int[] tabCasMoyen = {2, 7, 0, 5, 6};
        int[] tabResultat = {0, 2, 5, 6, 7};
        assertArrayEquals(tabResultat, SaeAlgo.triePeigne(tabCasMoyen), "cas avec des valeurs moyennes");

        int[] tablong0 = {};
        int[] tabResultatlong0 = {};
        assertArrayEquals(tabResultatlong0, SaeAlgo.triePeigne(tablong0), "cas d'un tableau de longueur 0");

        int[] tabnegatif = {-5, -15, -1, -22, -2};
        int[] tabResultnegatif = {-22, -15, -5, -2, -1};
        assertArrayEquals(tabResultnegatif, SaeAlgo.triePeigne(tabnegatif), "cas avec des valeurs négatifs");

        int[] tabnegpos = {-5, -15, 1, 22, -2, -20, 11};
        int[] tabResultnegpos = {-20, -15, -5, -2, 1, 11, 22};
        assertArrayEquals(tabResultnegpos, SaeAlgo.triePeigne(tabnegpos), "cas avec des valeurs négatifs et positifs");

        int[] tabpetitelement = {2, 7, 5, 6, 0};
        int[] tabRespetitelement =  {0,2,5,6,7};
        assertArrayEquals(tabRespetitelement, SaeAlgo.triePeigne(tabpetitelement), "cas d'un tableau ou le plus petit élément est en dernière position");

        int[] tabmeilleurcas = {0,2,5,6,7};
        int[] tabResmeilleurcas =  {0,2,5,6,7};
        assertArrayEquals(tabResmeilleurcas, SaeAlgo.triePeigne(tabmeilleurcas), "cas d'un tableau déjà trié dans l'ordre croissant");
    }

}

