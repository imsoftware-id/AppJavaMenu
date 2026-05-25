import java.util.ArrayList;

public class Pesanan {

    private ArrayList<MenuItem> daftarPesanan;

    public Pesanan() {
        daftarPesanan = new ArrayList<>();
    }

    public void tambahPesanan(MenuItem item) {
        daftarPesanan.add(item);
    }

    public void tampilPesanan() {

        System.out.println("\n===== STRUK PESANAN =====");

        for (MenuItem item : daftarPesanan) {
            item.tampilMenu();
        }

        System.out.println("-------------------------");
        System.out.println("Total : Rp." + hitungTotal());
    }

    public double hitungTotal() {

        double total = 0;
        double potongan = 0;

        for (MenuItem item : daftarPesanan) {

            if (item instanceof Diskon) {

                Diskon d = (Diskon) item;
                potongan += d.getDiskon();

            } else {

                total += item.getHarga();
            }
        }

        total = total - (total * potongan / 100);

        return total;
    }

    public ArrayList<MenuItem> getDaftarPesanan() {
        return daftarPesanan;
    }
}