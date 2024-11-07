package ClassZakat;

public class ZakatPertanian{
    private double hasilPanen;

    public void setZakatPertanian(double hasilPanen) {
        this.hasilPanen = hasilPanen;
    }

    public double getCalculateZakat() {
        double nishabAgriculture = 653; // Nishab pertanian dalam kg
        if (hasilPanen >= nishabAgriculture) {
            return hasilPanen * 0.05; // 5% hasil panen
        }
        return 0;
    }
}
