package ClassZakat;

public class Human {
    private String name;
    private int balighAge;
    private boolean isCrazy;
    private String alamat;
    private String pekerjaan;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }
    
    public void setBalighAge(int age) {
        this.balighAge = age;
    }

    public int getBalighAge() {
        return balighAge >= 9 ? balighAge : 0;
    }
    
    public void setIsCrazy(boolean isCrazy) {
        this.isCrazy = isCrazy;
    }

    public boolean getIsCrazy() {
        return isCrazy;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
    
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }
}
