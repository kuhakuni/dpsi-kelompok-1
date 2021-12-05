import java.util.Scanner;

/**
 * Main
 */
public class Main {

	private static Scanner scan = new Scanner(System.in);
	private static Warehouse warehouse = new Warehouse();

	public static void main(String[] args) {
		System.out.println(
			"*******************************************\n" +
			"* SISTEM INFORMASI GUDANG MAKANAN/MINUMAN *\n" +
			"*******************************************\n" +
			"Oleh kelompok 1 DPSI-D\n"
		);

		menu();
	}

	public static void addProduct() {
		System.out.print(
			"---------------------------------\n" +
			"MENU TAMBAH PRODUK\n" +
			"---------------------------------\n" +
			"Berapa banyak produk yang ingin ditambahkan? "
		);
		int jumlahProduk = scan.nextInt();
		for (int i = 0; i < jumlahProduk; i++) {
			System.out.print("Pilih jenis produk (1. Makanan/2. Minuman): ");
			int jenisProduk = scan.nextInt();
			scan.nextLine();
			switch (jenisProduk) {
				case 1:
					System.out.print("Masukkan nama produk: ");
					warehouse.addProdukMentah(
						new RawProduct(scan.nextLine(), true)
					);
					System.out.println("Produk berhasil ditambahkan!");
					break;
				case 2:
					System.out.print("Masukkan nama produk: ");
					warehouse.addProdukMentah(
						new RawProduct(scan.nextLine(), false)
					);
					System.out.println("Produk berhasil ditambahkan!");
					break;
				default:
					System.out.println("Jenis produk tidak ditemukan.");
					--i;
					break;
			}
		}
	}

	public static void showProduct() {
		System.out.print(
			"---------------------------------\n" +
			"MENU TAMPILKAN PRODUK\n" +
			"---------------------------------\n"
		);
		for (RawProduct produkMentah : Warehouse.getProdukMentah()) {
			System.out.println(produkMentah);
		}
		for (FinishedProduct produkOlahan : Warehouse.getProdukOlahan()) {
			System.out.println(produkOlahan);
		}
	}

	public static void olahProduk() {
		if (Warehouse.getProdukMentah().isEmpty()) {
			System.out.println(
				"Tidak ada produk yang dapat diolah." +
				"\n" +
				"Silahkan tambahkan produk mentah terlebih dahulu!"
			);
			return;
		}
		System.out.print(
			"---------------------------------\n" +
			"MENU OLAH PRODUK\n" +
			"---------------------------------\n" +
			"Silahkan pilih produk yang ingin diolah: "
		);
		for (int i = 0; i < Warehouse.getProdukMentah().size(); i++) {
			System.out.println(
				i + 1 + ". " + Warehouse.getProdukMentah().get(i).getNama()
			);
		}
		System.out.print("Pilihan anda: ");
		String namaProdukMentah = scan.nextLine();
		System.out.print("Nama produk hasil olahan: ");
		String namaProdukOlahan = scan.nextLine();
		if (!warehouse.olahProduk(namaProdukMentah, namaProdukOlahan)) {
			System.out.println("Produk gagal diolah!");
			return;
		}
		System.out.println("Produk berhasil diolah!");
	}

	public static void menu() {
		int choice = 0;
		do {
			System.out.print(
				"---------------------------------\n" +
				"Silahkan pilih menu yang tersedia\n" +
				"1. Tambah produk\n" +
				"2. Olah produk\n" +
				"3. Tampilkan produk\n" +
				"4. Keluar\n" +
				"\nPilihan anda: "
			);
			choice = scan.nextInt();
			switch (choice) {
				case 1:
					addProduct();
					break;
				case 2:
					olahProduk();
					break;
				case 3:
					showProduct();
					break;
				case 4:
					System.out.println(
						"Terima kasih telah menggunakan program ini :)"
					);
					return;
				default:
					System.out.println("Pilihan tidak tersedia");
			}
		} while (choice != 4);
	}
}
