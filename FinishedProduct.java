import java.time.LocalDate;

public class FinishedProduct {

	private String id = "MJ-";
	private String nama;
	private String tipe;
	private LocalDate tanggalMasuk;
	private LocalDate tanggalKadaluarsa;

	public FinishedProduct(RawProduct rawProduct, String nama) {
		this.setNama(nama);
		this.setId(this.getId() + rawProduct.getId());
		this.setTipe(rawProduct.getTipe());
		this.setTanggalMasuk(LocalDate.now());
		this.setTanggalKadaluarsa(LocalDate.now().plusYears(1));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
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

	//generate tostring method
	@Override
	public String toString() {
		return (
			"*************\n" +
			"Produk Olahan\n" +
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
			tanggalKadaluarsa
		);
	}
}
