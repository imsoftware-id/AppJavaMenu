public class Minuman extends MenuItem {

    private String jenisMinuman;

    public Minuman(String nama, double harga, String kategori, String jenisMinuman) {
        super(nama, harga, kategori);
        this.jenisMinuman = jenisMinuman;
    }

    public String getJenisMinuman() {
        return jenisMinuman;
    }

    @Override
    public void tampilMenu() {
        System.out.println(
                "[Minuman] "
                + getNama()
                + " | Rp." + getHarga()
                + " | Jenis: " + jenisMinuman
        );
    }
}