import java.io.*;

public class FileHelper {

    // Simpan Menu
    public static void simpanMenu(Menu menu) {

        try {

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("menu.txt")
            );

            for (MenuItem item : menu.getDaftarMenu()) {

                writer.write(
                        item.getNama() + "," +
                        item.getHarga() + "," +
                        item.getKategori()
                );

                writer.newLine();
            }

            writer.close();

            System.out.println("Menu berhasil disimpan.");

        } catch (IOException e) {

            System.out.println("Error simpan menu.");
        }
    }

    // Simpan Struk
    public static void simpanStruk(Pesanan pesanan) {

        try {

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("struk.txt")
            );

            writer.write("===== STRUK =====");
            writer.newLine();

            for (MenuItem item : pesanan.getDaftarPesanan()) {

                writer.write(
                        item.getNama() + " - Rp." + item.getHarga()
                );

                writer.newLine();
            }

            writer.write("Total : Rp." + pesanan.hitungTotal());

            writer.close();

            System.out.println("Struk berhasil disimpan.");

        } catch (IOException e) {

            System.out.println("Error simpan struk.");
        }
    }
}