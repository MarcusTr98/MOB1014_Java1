
package mob1014.huyentt_pp03261_test1;

public class Meo extends DongVat{
    private String tiengKeu;

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public Meo(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public Meo(String maDongVat, String tenDongVat, String noiSong, int canNang, String tiengKeu) {
        super(maDongVat, tenDongVat, noiSong, canNang);
        this.tiengKeu = tiengKeu;
    }

    public Meo() {
    }

    @Override
    public void inThongTin() {
        System.out.printf("\n %10s || %12s || %15s || %6s || %15s ",
        "Ma DV", "Ten DV", "Noi Song", "Can Nang", "Tieng Keu");
        super.inThongTin();
        System.out.printf("|| %15s", tiengKeu);
    }
    
    
}
