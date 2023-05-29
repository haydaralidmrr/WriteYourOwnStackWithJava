public class Kisi {
    private String isim;
    private long tcNo;
    private int yas;

    public Kisi() {
        isim = "henüz atanmadi";
        tcNo = 0;
        yas = 18;
        System.out.println("Kisi sinifi calisti");
    }

    public Kisi(String isim, long tcNo, int yas) {
        this.isim = isim;
        this.tcNo = tcNo;
        setYas(yas);
        System.out.println("Kisi sinifi calisti");
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 18) {
            this.yas = yas;
        }else yas=18;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                ", yas=" + yas +
                '}';
    }
}
