package models;

public class Diem {
    private int maSinhVien;
    private int maMonHoc;
    private int diemSo;

    public Diem() {
    }

    public Diem(int maSinhVien, int maMonHoc, int diemSo) {
        this.maSinhVien = maSinhVien;
        this.maMonHoc = maMonHoc;
        this.diemSo = diemSo;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
    }
}
