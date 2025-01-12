package ELEMENTOMULTIMEDIALE;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        playerMultimediale player = new playerMultimediale();


        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci tipo di elemento (1 = Immagine, 2 = Audio, 3 = Video): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            if (tipo == 1) {
                System.out.print("Inserisci luminosità: ");
                int luminosita = scanner.nextInt();
                player.aggiungiElemento(new immagine(titolo, luminosita), i);
            } else if (tipo == 2) {
                System.out.print("Inserisci durata: ");
                int durata = scanner.nextInt();
                System.out.print("Inserisci volume: ");
                int volume = scanner.nextInt();
                player.aggiungiElemento(new registrazioneAudio(titolo, durata, volume), i);
            } else if (tipo == 3) {
                System.out.print("Inserisci durata: ");
                int durata = scanner.nextInt();
                System.out.print("Inserisci volume: ");
                int volume = scanner.nextInt();
                System.out.print("Inserisci luminosità: ");
                int luminosita = scanner.nextInt();
                player.aggiungiElemento(new Video(titolo, durata, volume, luminosita), i);
            }
            scanner.nextLine();
        }


        int scelta = -1;
        while (scelta != 0) {
            System.out.println("Scegli un elemento da eseguire (1-5 per gli elementi, 0 per uscire): ");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                player.eseguiElemento(scelta - 1);
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        }
        scanner.close();
    }
}