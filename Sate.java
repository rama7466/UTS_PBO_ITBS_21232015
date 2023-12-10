class Sate extends ResepResto {
    String bumbuHalus;
    String bahanSambal;
    String bahanPelengkap;

    public Sate(String bahanUtama, String caraMembuat, String bumbuHalus, String bahanSambal, String bahanPelengkap) {
        super(bahanUtama, caraMembuat);
        this.bumbuHalus = bumbuHalus;
        this.bahanSambal = bahanSambal;
        this.bahanPelengkap = bahanPelengkap;
    }

    @Override
    public void infoResepResto() {
        super.infoResepResto();
        System.out.println("Bumbu Halus: " + bumbuHalus);
        System.out.println("Bahan Sambal: " + bahanSambal);
        System.out.println("Bahan Pelengkap: " + bahanPelengkap);
    }
}