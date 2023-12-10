public class Main {
    public static void main(String[] args) {
        MieKocok mieKocok = new MieKocok("2250 gr mie jenis lebar\n200 gr taoge\n500 gr daging tetelan sapi",
                "1. Rebus tetelan daging yang sudah ditaburi garam hingga lunak...\n5. Sajikan selagi panas...",
                "1500 cc air\n1 liter air mendidih",
                "4 siung bawang putih, haluskan\n5 butir kemiri, haluskan\n2 sdm irisan kucai...",
                "Sambal cabai rawit - Kecap, irisan cabai dan tomat, Kacang",
                "Kerupuk merah, Kecap manis dan cuka, secukupnya - Oncom");

        Pecel pecel = new Pecel("2 ikat kangkung\n1/4 kol\n1 buah labu siam...",
                "1. Cuci bersih semua sayuran...\n3. Lotek siap disajikan...",
                "5 buah cabai merah\n1 ruas kencur...\n1/2 sdt terasi");

        Sate sate = new Sate("500 gr daging sapi, dipotong\n250 gr lemak sapi, potong kecil\nTusuk sate",
                "1. Campurkan semua bumbu halus dengan daging...\n3. Sate siap disajikan...",
                "2 sdm asam jawa\n5 siung bawang merah...\n20 gr gula jawa, iris halus",
                "Sambal cabai rawit - Kecap, irisan cabai dan tomat, Kacang",
                "Kerupuk merah, Kecap manis dan cuka, secukupnya");

        mieKocok.infoResepResto();
        pecel.infoResepResto();
        sate.infoResepResto();
    }
}