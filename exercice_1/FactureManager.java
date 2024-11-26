public class FactureManager {

    /**
     * Calcul le total d'une facture
     * @param typeProduit
     * @param quantite
     * @param prixUnitaire
     * @return le return sera le total de la facture après les différentes réduction
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        //Total avant reduction
        double total = calculTotalBeforeReduction(quantite, prixUnitaire);

        // Reduction sur le type
        total = calculTotalWithReduction(total, reductionByType(total, typeProduit));

        // Reduction sur le total
        total = calculTotalWithReduction(total, reductionByTotal(total));

        return total;
    }

    /**
     * Cette fonction permettra de calculer le total d'une facture avant
     * @param quantite
     * @param prixUnitaire
     * @return se sera le avant la reduction
     */
    public double calculTotalBeforeReduction(int quantite, double prixUnitaire) {
        return quantite * prixUnitaire;
    }

    /**
     * Cette fonction permet de calculer la total avec la reduction
     * @param total
     * @param reduction
     * @return le return sera une variable de type double qui retourne le total avec reduction
     */
    public double calculTotalWithReduction(double total, double reduction) {
        return total = total - reduction;
    }

    /**
     *
     * @param total
     * @param typeProduit
     * @return
     */
    public double reductionByType(double total, String typeProduit) {
        //reduction selon la catégorie
        return switch (typeProduit) {
            case "Alimentaire" -> total * 0.05;
            case "Electronique" -> total * 1;
            case "Luxe" -> total * 1.5;
            default -> total;
        };
    }

    /**
     *
     * @param total
     * @return le return sera le total avec ou sans reduction par rapport à la quantité
     */
    public double reductionByTotal(double total) {
        return total > 1000 ? total * 0.05 : total ;
    }
}
