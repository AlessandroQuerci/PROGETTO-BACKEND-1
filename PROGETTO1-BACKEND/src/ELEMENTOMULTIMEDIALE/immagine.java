package ELEMENTOMULTIMEDIALE;

class immagine extends elementoMultimediale {
    private int luminosita;

    public immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }
}
