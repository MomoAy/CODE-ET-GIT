/**
 * Gère le stock en fonction du type d'opération spécifié (ajout ou retrait).
 *
 * @param typeOperation Le type d'opération ("ajout" ou "retrait").
 * @param produit        Le nom du produit concerné.
 * @param quantite       La quantité à ajouter ou retirer du stock.
 * @param stock          Le stock actuel du produit.
 * @return Le nouveau stock après l'opération.
 */
public int gererStock(String typeOperation, String produit, int quantite, int stock) {
    switch (typeOperation.toLowerCase()) {
        case "ajout":
            return ajouterStock(produit, quantite, stock);
        case "retrait":
            return retirerStock(produit, quantite, stock);
        default:
            System.out.println("Opération inconnue.");
            return stock; // Retourne le stock inchangé si l'opération est inconnue.
    }
}

/**
 * Ajoute une quantité spécifiée au stock d'un produit.
 *
 * @param produit  Le nom du produit concerné.
 * @param quantite La quantité à ajouter au stock.
 * @param stock    Le stock actuel du produit.
 * @return Le nouveau stock après l'ajout.
 */
private int ajouterStock(String produit, int quantite, int stock) {
    stock += quantite;
    System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    return stock;
}

/**
 * Retire une quantité spécifiée du stock d'un produit, si suffisant.
 *
 * @param produit  Le nom du produit concerné.
 * @param quantite La quantité à retirer du stock.
 * @param stock    Le stock actuel du produit.
 * @return Le nouveau stock après le retrait, ou l'ancien si insuffisant.
 */
private int retirerStock(String produit, int quantite, int stock) {
    if (stock >= quantite) {
        stock -= quantite;
        System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
    } else {
        System.out.println("Stock insuffisant pour le produit : " + produit);
    }
    return stock;
}
