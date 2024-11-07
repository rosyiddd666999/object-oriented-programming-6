package ClassZakat;

public class ZakatMal{
    private double totalHarta;

    public void setZakatMal(double totalHarta) {
        this.totalHarta = totalHarta;
    }

    public double getCalculateZakat() {
        double nishabMal = 85250000; // Contoh nishab zakat mal
        if (totalHarta >= nishabMal) {
            return totalHarta * 2.5 / 100;
        }
        return 0;
    }
}
