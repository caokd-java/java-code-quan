package controller;

import models.SinhVien;
import services.SinhVienService;

import java.util.List;

public class SinhVienController {

    private SinhVienService sinhVienService = new SinhVienService();

    public void add(SinhVien sinhVien) {
        this.sinhVienService.add(sinhVien);
    }

    public void edit(SinhVien sinhVien) {
        this.sinhVienService.edit(sinhVien);
    }

    public void delete(int maSinhVien) {
        this.sinhVienService.delete(maSinhVien);
    }

    public SinhVien getByMaSinhVien(int maSinhVien) {
        return this.sinhVienService.getByMaSinhVien(maSinhVien);
    }

    public List<SinhVien> getAll() {
        return this.sinhVienService.getAll();
    }
}
