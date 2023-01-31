package buoi6;

public class Container {

    private int soLuong;
    private int chieuCao;
    private int chieuRong;
    private String tinhTrang;

    public Container(int soLuong, int chieuCao, int chieuRong, String tinhTrang) {
        this.soLuong = soLuong;
        this.chieuCao = chieuCao;
        this.chieuRong = chieuRong;
        this.tinhTrang = tinhTrang;
    }

    public int laySoLuong() {
        return this.soLuong;
    }

    ;

    public float layChieuCao() {
        return this.chieuCao;
    }

    ;

    public float layChieuRong() {
        return this.chieuRong;
    }

    ;

    public String layDangCoHang() {
        return this.tinhTrang;
    }

    ;

    public void inThongTinContainer() {
        System.out.println("Số lượng Container là: " + laySoLuong());
        System.out.println("Chiều cao Container là: " + layChieuCao());
        System.out.println("Chiều rộng Container là: " + layChieuRong());
        System.out.println("Tình trạng Container là: " + layDangCoHang());
    }

}
