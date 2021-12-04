import java.util.Date;

public class RawProduct {
    private String id = "MM-";
    private String nama;
    private boolean isMakanan;
    private String tipe;
    private Date tanggalMasuk;
    private Date tanggalKadaluarsa;
    private static int idCounter = 1;
    public RawProduct(String nama, boolean isMakanan, Date tanggalKadaluarsa) {
        this.setId(RawProduct.idCounter++);
        this.setMakanan(isMakanan);
        this.setNama(nama);
        this.tipe = (isMakanan) ? "Makanan" : "Minuman";
        this.setTanggalMasuk(new Date());
        this.setTanggalKadaluarsa(tanggalKadaluarsa);
    }
    public String getId() {
        return id;
    }
    public void setId(int id) {
        this.id += id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public boolean isMakanan() {
        return isMakanan;
    }
    public void setMakanan(boolean isMakanan) {
        this.isMakanan = isMakanan;
    }
    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }
    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }
    public Date getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(Date tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    //generate to string method
    @Override
    public String toString() {
        return "RawProduct{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", tipe='" + tipe + '\'' +
                ", tanggalMasuk=" + tanggalMasuk +
                ", tanggalKadaluarsa=" + tanggalKadaluarsa +
                '}';
    }

}
