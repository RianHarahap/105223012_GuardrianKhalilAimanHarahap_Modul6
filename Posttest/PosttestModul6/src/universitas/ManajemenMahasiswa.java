package universitas;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkanSemua() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            System.out.println("DAFTAR MAHASISWA:");
            for (Mahasiswa mhs : daftarMahasiswa) {
                mhs.tampilkanData();
            }
        }
    }

    public void tampilkanIPKTertinggi() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        Mahasiswa tertinggi = daftarMahasiswa.get(0);
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getIpk() > tertinggi.getIpk()) {
                tertinggi = mhs;
            }
        }

        System.out.println("Mahasiswa dengan IPK tertinggi:");
        tertinggi.tampilkanData();
    }
}
