import javax.swing.JOptionPane;

import VCD.*;

import java.util.ArrayList;

public class RentalVCD{
    public static void main(String[] args) {
        ArrayList<FilmVCD> daftarVCD = new ArrayList<>();

        String input = JOptionPane.showInputDialog("Masukkan jumlah data VCD yang akan dientrikan:");
        int jumlahVCD = Integer.parseInt(input);

        for (int i = 0; i < jumlahVCD; i++) {
            JOptionPane.showMessageDialog(null, "Entri Data VCD " + (i + 1));

            String judul = JOptionPane.showInputDialog("Judul:");
            String aktor = JOptionPane.showInputDialog("Aktor:");
            String sutradara = JOptionPane.showInputDialog("Sutradara:");
            String publisher = JOptionPane.showInputDialog("Publisher:");
            String kategori = JOptionPane.showInputDialog("Kategori (SU/D/R/A):");
            int stok = Integer.parseInt(JOptionPane.showInputDialog("Stok:"));

            FilmVCD filmVCD = new FilmVCD(judul, aktor, sutradara, publisher, kategori, stok);
            daftarVCD.add(filmVCD);
        }

        System.out.println("\nDaftar VCD yang Telah Dientrikan:");
        for (FilmVCD filmVCD : daftarVCD) {
            filmVCD.displayInfo();
        }
    }
}
