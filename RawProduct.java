import java.time.LocalDate;

public class RawProduct {

	private String id = "MM-";
	private String nama;
	private boolean isMakanan;
	private String tipe;
	private LocalDate tanggalMasuk;
	private LocalDate tanggalKadaluarsa;
	private static int idCounter = 1;

	public RawProduct(String nama, boolean isMakanan) {
		this.setId(RawProduct.idCounter++);
		this.setMakanan(isMakanan);
		this.setNama(nama);
		this.tipe = (isMakanan) ? "Makanan" : "Minuman";
		this.setTanggalMasuk(LocalDate.now());
		this.setTanggalKadaluarsa(LocalDate.now().plusYears(2));
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

	public String getTipe() {
		return tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}

	public LocalDate getTanggalMasuk() {
		return tanggalMasuk;
	}

	public void setTanggalMasuk(LocalDate tanggalMasuk) {
		this.tanggalMasuk = tanggalMasuk;
	}

	public LocalDate getTanggalKadaluarsa() {
		return tanggalKadaluarsa;
	}

	public void setTanggalKadaluarsa(LocalDate tanggalKadaluarsa) {
		this.tanggalKadaluarsa = tanggalKadaluarsa;
	}

	@Override
	public String toString() {
		return (
			"*************\n" +
			"Produk Mentah\n" +
			"*************\n" +
			"id = '" +
			id +
			"'" +
			",\nNama = '" +
			nama +
			"'" +
			",\nTipe = '" +
			tipe +
			"'" +
			",\nTanggal Masuk = " +
			tanggalMasuk +
			",\nTanggal Kadaluarsa = " +
			tanggalKadaluarsa +
			"\n"
		);
	}
}
