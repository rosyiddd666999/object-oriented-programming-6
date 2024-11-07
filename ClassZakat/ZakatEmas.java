package ClassZakat;

public class ZakatEmas{
    private double totalEmas;

    public void setZakatEmas(double totalEmas) {
        this.totalEmas = totalEmas;
    }

    public double getCalculateZakat() {
        double nishabGold = 85; // Nishab zakat emas dalam gram
        if (totalEmas >= nishabGold) {
            return totalEmas * 0.025;
        }
        return 0;
    }
}
