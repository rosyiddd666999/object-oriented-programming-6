package ClassZakat;

public class ZakatPerak{
    private double totalPerak;

    public void setZakatPerak(double totalPerak) {
        this.totalPerak = totalPerak;
    }

    public double getCalculateZakat() {
        double nishabSilver = 595; // Nishab zakat perak dalam gram
        if (totalPerak >= nishabSilver) {
            return totalPerak * 0.025;
        }
        return 0;
    }
}
