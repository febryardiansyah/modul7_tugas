package nomor1;

public class laporanAkhir implements cetakLaporan,tampilLaporan{
    @Override
    public void cetakA4() {
        System.out.println("Cetak A4");
    }

    @Override
    public void cetakF4() {
        System.out.println("Cetak F4");
    }

    @Override
    public void tampilWeb() {
        System.out.println("Tampil Web");
    }

    @Override
    public void tampilHp() {
        System.out.println("Tampil HP");
    }

    public static void main(String[] args) {
        laporanAkhir lp = new laporanAkhir();

        lp.cetakA4();
        lp.cetakF4();
        lp.tampilWeb();
        lp.tampilHp();
    }
}
