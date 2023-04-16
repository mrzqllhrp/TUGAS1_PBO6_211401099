public class Main {
    public static void main(String[] args) {
        Drakonius drakonius = new Drakonius("Drakonius", 1, 10);
        System.out.println(drakonius.getNama() + " memiliki kekuatan " + drakonius.getKekuatan());
        drakonius.berubahMenjadiNaga();
        drakonius.serang();
        drakonius.bertahan();
        drakonius.naikLevel();
        System.out.println(drakonius.getNama() + " sekarang berada di level " + drakonius.getLevel());
    }
}
