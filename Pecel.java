class Pecel extends ResepResto {
    String bumbuHalus;

    public Pecel(String bahanUtama, String caraMembuat, String bumbuHalus) {
        super(bahanUtama, caraMembuat);
        this.bumbuHalus = bumbuHalus;
    }

    @Override
    public void infoResepResto() {
        super.infoResepResto();
        System.out.println("Bumbu Halus: " + bumbuHalus);
    }
}
