package tiketKereta;

public class Kereta {
   private String nama;
   private Kelas kel[] = new Kelas[3];
   int counter=0;

    public Kereta(String nama) {
        this.nama = nama;
    }

    public void setKel(Kelas kel) {
        this.kel[counter] = kel;
        counter ++;
    }


    public String getNama() {
        return nama;
    }

    public Kelas getKel(int i) {
        return kel[i];
    }

}
