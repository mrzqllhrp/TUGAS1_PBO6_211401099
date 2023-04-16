public class Drakonius {
    private String nama;
    private int level;
    private int kekuatan;

    public Drakonius(String nama, int level, int kekuatan) {
        this.nama = nama;
        this.level = level;
        this.kekuatan = kekuatan;
    }

    public void berubahMenjadiNaga() {
        System.out.println(nama + " berubah menjadi naga!");
        kekuatan *= 2;
    }

    public void serang() {
        System.out.println(nama + " menyerang dengan nafas api!");
    }

    public void bertahan() {
        System.out.println(nama + " bertahan dengan perisai!");
    }

    public void naikLevel() {
        level++;
        System.out.println(nama + " naik level menjadi " + level);
    }

    public String getNama() {
        return nama;
    }

    public int getLevel() {
        return level;
    }

    public int getKekuatan() {
        return kekuatan;
    }
}
