package ELEMENTOMULTIMEDIALE;

public class registrazioneAudio extends elementoMultimediale implements riproducibile {
    private int durata;
    private int volume;

    public registrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    public void abbassaVolume() {
        if (volume > 1) volume--;
    }

    public void alzaVolume() {
        volume++;
    }
}

