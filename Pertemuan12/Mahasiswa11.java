package Pertemuan12;
public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa11() {
    }
    public Mahasiswa11 (String nm, String name, String kls, double ipk) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ipk;
    }
    public void tampilInformasi() {
        System.out.printf("%-10s %-12s %-5s %.1f\n", 
        nama, nim, kelas, ipk);
    }
}
