class ResepResto {
    String bahanUtama;
    String caraMembuat;

    public ResepResto(String bahanUtama, String caraMembuat) {
        this.bahanUtama = bahanUtama;
        this.caraMembuat = caraMembuat;
    }

    public void infoResepResto() {
        System.out.println("Bahan Utama: " + bahanUtama);
        System.out.println("Cara Membuat: \n" + caraMembuat + "\n");
    }
}