import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();
        Pesanan pesanan = new Pesanan();

        int pilih;

        do {

            System.out.println("\n===== RESTORAN =====");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Tampilkan Menu");
            System.out.println("3. Pesan Menu");
            System.out.println("4. Tampilkan Struk");
            System.out.println("5. Simpan File");
            System.out.println("0. Keluar");

            System.out.print("Pilih : ");
            pilih = input.nextInt();

            switch (pilih) {

                case 1:

                    System.out.println("\n1. Makanan");
                    System.out.println("2. Minuman");
                    System.out.println("3. Diskon");

                    System.out.print("Pilih jenis : ");
                    int jenis = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama : ");
                    String nama = input.nextLine();

                    System.out.print("Harga : ");
                    double harga = input.nextDouble();
                    input.nextLine();

                    if (jenis == 1) {

                        System.out.print("Jenis Makanan : ");
                        String jm = input.nextLine();

                        menu.tambahMenu(
                                new Makanan(
                                        nama,
                                        harga,
                                        "Makanan",
                                        jm
                                )
                        );

                    } else if (jenis == 2) {

                        System.out.print("Jenis Minuman : ");
                        String jn = input.nextLine();

                        menu.tambahMenu(
                                new Minuman(
                                        nama,
                                        harga,
                                        "Minuman",
                                        jn
                                )
                        );

                    } else if (jenis == 3) {

                        System.out.print("Diskon (%) : ");
                        double diskon = input.nextDouble();

                        menu.tambahMenu(
                                new Diskon(
                                        nama,
                                        harga,
                                        "Diskon",
                                        diskon
                                )
                        );
                    }

                    break;

                case 2:

                    menu.tampilkanMenu();

                    break;

                case 3:

                    try {

                        menu.tampilkanMenu();

                        System.out.print("Pilih nomor menu : ");
                        int nomor = input.nextInt();

                        MenuItem item = menu.cariMenu(nomor - 1);

                        pesanan.tambahPesanan(item);

                        System.out.println("Pesanan berhasil ditambahkan.");

                    } catch (Exception e) {

                        System.out.println(e.getMessage());
                    }

                    break;

                case 4:

                    pesanan.tampilPesanan();

                    break;

                case 5:

                    FileHelper.simpanMenu(menu);
                    FileHelper.simpanStruk(pesanan);

                    break;

                case 0:

                    System.out.println("Program selesai.");

                    break;

                default:

                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
    }
}