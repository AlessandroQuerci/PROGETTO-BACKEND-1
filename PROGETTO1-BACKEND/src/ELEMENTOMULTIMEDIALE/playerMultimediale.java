package ELEMENTOMULTIMEDIALE;

public class playerMultimediale {
    private elementoMultimediale[] elementi = new elementoMultimediale[5];

    public void aggiungiElemento(elementoMultimediale elemento, int indice) {
        if (indice >= 0 && indice < 5) {
            elementi[indice] = elemento;
        }
    }

    public void eseguiElemento(int indice) {
        if (indice >= 0 && indice < 5 && elementi[indice] != null) {
            if (elementi[indice] instanceof riproducibile) {
                ((riproducibile) elementi[indice]).play();
            }
        } else {
            System.out.println("L'Elemento è un immagine.");
        }
    }
}