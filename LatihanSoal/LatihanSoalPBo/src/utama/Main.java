package utama;

import dosen.Dosen;
import mahasiswa.Mahasiswa;
import matakuliah.MataKuliah;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dosen cahya = new Dosen("Cahya", "D001");
        Dosen budi = new Dosen("Budi", "D002");

        Mahasiswa tiara = new Mahasiswa("Tiara", "M001");
        Mahasiswa diana = new Mahasiswa("Diana", "M002");

        MataKuliah pbo = new MataKuliah("PBO", "123");
        ArrayList<Dosen> pengampuPBO = new ArrayList<>();
        pengampuPBO.add(cahya);
        pbo.setPengampu(pengampuPBO);

        ArrayList<Mahasiswa> mahasiswaPBO = new ArrayList<>();
        mahasiswaPBO.add(tiara);
        mahasiswaPBO.add(diana);
        pbo.setDaftarMahasiswa(mahasiswaPBO);

        MataKuliah kompar = new MataKuliah("Kompar", "124");
        ArrayList<Dosen> pengampuKompar = new ArrayList<>();
        pengampuKompar.add(budi);
        kompar.setPengampu(pengampuKompar);

        ArrayList<Mahasiswa> mahasiswaKompar = new ArrayList<>();
        mahasiswaKompar.add(tiara);
        mahasiswaKompar.add(diana);
        kompar.setDaftarMahasiswa(mahasiswaKompar);

        MataKuliah metnum = new MataKuliah("Metnum", "125");
        ArrayList<Dosen> pengampuMetnum = new ArrayList<>();
        pengampuMetnum.add(budi);
        metnum.setPengampu(pengampuMetnum);

        ArrayList<Mahasiswa> mahasiswaMetnum = new ArrayList<>();
        mahasiswaMetnum.add(tiara);
        metnum.setDaftarMahasiswa(mahasiswaMetnum);

        tampilkanData(pbo);
        tampilkanData(kompar);
        tampilkanData(metnum);
    }

    public static void tampilkanData(MataKuliah matkul) {

        System.out.println("=== Mata Kuliah ===");
        System.out.println("Nama     : " + matkul.getNama());
        System.out.println("Kode MK  : " + matkul.getKodeMK());

        System.out.print("Pengampu : ");

        for (Dosen dos : matkul.getPengampu()) {
            System.out.print(dos.getNama() + " ");
        }

        System.out.println();

        System.out.print("Mahasiswa: ");
        
        for (Mahasiswa mhs : matkul.getDaftarMahasiswa()) {
            System.out.print(mhs.getNama() + " ");
        }

        System.out.println("\n");
    }
}
