package nomor2;

public class kelasUtama {
    public static void main(String[] args) {
        MakhlukHidup mh1 = new Manusia("Dua kaki");
        MakhlukHidup hwn1 = new Hewan("Kaki empat","Kaki Dua");
        MakhlukHidup tmbh1 = new Tumbuhan("Akar");
        System.out.print("Manusia ");
        mh1.berdiri("Dua Kaki");
        mh1.oksigen();
        System.out.println("-----------------");
        System.out.print("Kambing ");
        hwn1.berdiri("empat Kaki");
        System.out.print("Ayam ");
        hwn1.berdiri("Dua Kaki");
        hwn1.oksigen();
        System.out.println("-----------------");
        tmbh1.berdiri("Akar");
        tmbh1.oksigen();


    }
}
