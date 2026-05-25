public class Makanan extends MenuItem {

    private String jenisMakanan;

    public Makanan(String nama, double harga, String kategori, String jenisMakanan) {
        super(nama, harga, kategori);
        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    @Override
    public void tampilMenu() {
        System.out.println(
                "[Makanan] "
                + getNama()
                + " | Rp." + getHarga()
                + " | Jenis: " + jenisMakanan
        );
    }
}