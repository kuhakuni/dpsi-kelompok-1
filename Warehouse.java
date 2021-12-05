import java.util.LinkedList;

public class Warehouse {

	private static int stokDataMentah;
	private static int stokDataOlahan;
	private static int stokMaksimum = 200;
	private static int jumlahStok;
	private static LinkedList<RawProduct> produkMentah;
	private static LinkedList<FinishedProduct> produkOlahan;

	public Warehouse() {
		produkMentah = new LinkedList<RawProduct>();
		produkOlahan = new LinkedList<FinishedProduct>();
	}

	public static int getStokDataMentah() {
		setStokDataMentah(produkMentah.size());
		return stokDataMentah;
	}

	public static void setStokDataMentah(int stokDataMentah) {
		Warehouse.stokDataMentah = stokDataMentah;
	}

	public static int getStokDataOlahan() {
		setStokDataOlahan(produkOlahan.size());
		return stokDataOlahan;
	}

	public static void setStokDataOlahan(int stokDataOlahan) {
		Warehouse.stokDataOlahan = stokDataOlahan;
	}

	public static int getStokMaksimum() {
		return stokMaksimum;
	}

	public static void setStokMaksimum(int stokMaksimum) {
		Warehouse.stokMaksimum = stokMaksimum;
	}

	public static int getJumlahStok() {
		setJumlahStok(
			Warehouse.getStokDataMentah() + Warehouse.getStokDataOlahan()
		);
		return jumlahStok;
	}

	public static void setJumlahStok(int jumlahStok) {
		Warehouse.jumlahStok = jumlahStok;
	}

	public static LinkedList<RawProduct> getProdukMentah() {
		return produkMentah;
	}

	public static RawProduct getProdukMentah(String nama) {
		for (int i = 0; i < produkMentah.size(); i++) {
			if (produkMentah.get(i).getNama().equals(nama)) {
				return produkMentah.get(i);
			}
		}
		return null;
	}

	public static LinkedList<FinishedProduct> getProdukOlahan() {
		return produkOlahan;
	}

	public boolean addProdukMentah(RawProduct produkMentah) {
		return (Warehouse.jumlahStok < Warehouse.stokMaksimum)
			? Warehouse.produkMentah.add(produkMentah)
			: false;
	}

	public boolean addProdukOlahan(FinishedProduct produkOlahan) {
		return (Warehouse.jumlahStok < Warehouse.stokMaksimum)
			? Warehouse.produkOlahan.add(produkOlahan)
			: false;
	}

	public boolean olahProduk(String namaProdukMentah, String nama) {
		RawProduct produkMentah = Warehouse.getProdukMentah(namaProdukMentah);
		if (Warehouse.produkMentah.contains(produkMentah)) {
			Warehouse.produkMentah.remove(produkMentah);
			return Warehouse.produkOlahan.add(
				new FinishedProduct(produkMentah, nama)
			);
		}
		return false;
	}

	//generate tostring
	@Override
	public String toString() {
		return (
			"Warehouse{" +
			"stokDataMentah=" +
			getStokDataMentah() +
			",\n stokDataOlahan=" +
			getStokDataOlahan() +
			",\n stokMaksimum=" +
			stokMaksimum +
			",\n jumlahStok=" +
			getJumlahStok() +
			",\n produkMentah=" +
			getProdukMentah() +
			",\n produkOlahan=" +
			getProdukOlahan() +
			'}'
		);
	}
}
