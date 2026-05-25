import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> daftarMenu;

    public Menu() {
        daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(MenuItem item) {
        daftarMenu.add(item);
    }

    public ArrayList<MenuItem> getDaftarMenu() {
        return daftarMenu;
    }

    public void tampilkanMenu() {

        if (daftarMenu.isEmpty()) {
            System.out.println("Menu kosong.");
            return;
        }

        int nomor = 1;

        for (MenuItem item : daftarMenu) {

            System.out.print(nomor + ". ");
            item.tampilMenu();

            nomor++;
        }
    }

    public MenuItem cariMenu(int index) throws Exception {

        if (index < 0 || index >= daftarMenu.size()) {
            throw new Exception("Menu tidak ditemukan!");
        }

        return daftarMenu.get(index);
    }
}