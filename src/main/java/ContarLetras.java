public class ContarLetras {
    /**
     * @Author Xinyu
     * */

    public static void main(String[] args) {
        String cadena1 = "tres";
        String cadena2 = "tress";
        int consonantes1 = 0;
        int consonantes2 = 0;


        for (int x = 0; x < cadena1.length(); x++) {
            char letra = cadena1.charAt(x);
            if (esConsonante(letra)) {
                consonantes1++;
            }
        }
        for (int y = 0; y < cadena2.length(); y++) {
            char letra = cadena2.charAt(y);
            if (esConsonante(letra)) {
                consonantes2++;
            }
        }

        if (consonantes1 < consonantes2) {
            System.out.println("La primera palabra es menor que la segunda");
        } else if (consonantes1 > consonantes2){
                System.out.println("La primera palabra es mayor que la segunda");
            }
            else if (consonantes1 == consonantes2){
            System.out.println("Las palatras tienen las mismas consonantes");
        }
        System.out.println();
        System.out.printf("La primera palabra %s tiene %d consonantes", cadena1, consonantes1);
        System.out.println();
        System.out.printf("La segunda palabra %s tiene %d consonantes", cadena2, consonantes2);
    }

    public static boolean esConsonante(char letra) {
        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
    }
}


