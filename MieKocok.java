class MieKocok extends ResepResto {
    String bahanKuah;
    String bumbuHalus;
    String bahanSambal;
    String bahanPelengkap;

    public MieKocok(String bahanUtama, String caraMembuat, String bahanKuah, String bumbuHalus, String bahanSambal, String bahanPelengkap) {
        super(bahanUtama, caraMembuat);
        this.bahanKuah = bahanKuah;
        this.bumbuHalus = bumbuHalus;
        this.bahanSambal = bahanSambal;
        this.bahanPelengkap = bahanPelengkap;
    }

    @Override
    public void infoResepResto() {
        super.infoResepResto();
        System.out.println("Bahan Kuah: " + bahanKuah);
        System.out.println("Bumbu Halus: " + bumbuHalus);
        System.out.println("Bahan Sambal: " + bahanSambal);
        System.out.println("Bahan Pelengkap: " + bahanPelengkap);
    }
}
