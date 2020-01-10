package nomor2;

public class Hewan extends MakhlukHidup {
    String kakiEmpat;
    String kakiDua;

    public Hewan(String kakiEmpat, String kakiDua) {
        this.kakiEmpat = kakiEmpat;
        this.kakiDua = kakiDua;
    }

    @Override
    public void berdiri(String kaki) {
        super.berdiri(kaki);
    }

    @Override
    public void oksigen() {
        super.oksigen();
    }
}
