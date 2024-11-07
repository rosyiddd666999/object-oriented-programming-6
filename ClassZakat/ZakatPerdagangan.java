package ClassZakat;

public class ZakatPerdagangan{
    private double totalAsetDagang;

    public void setZakatPerdagangan(double totalAsetDagang) {
        this.totalAsetDagang = totalAsetDagang;
    }

    public double getCalculateZakat() {
        double nishabTrade = 85250000; // Nishab zakat perdagangan
        if (totalAsetDagang >= nishabTrade) {
            return totalAsetDagang * 2.5 / 100;
        }
        return 0;
    }
}
