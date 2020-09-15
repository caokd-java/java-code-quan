package services;

import models.SinhVien;
import repositories.SinhVienRepo;

import java.util.List;

public class SinhVienService {

    private SinhVienRepo sinhVienRepo = new SinhVienRepo();

    public void add(SinhVien sinhVien) {
        this.sinhVienRepo.add(sinhVien);
    }

    public void edit(SinhVien sinhVien) {

        int position = this.sinhVienRepo.getPosition(sinhVien.getMaSinhVien());

        this.sinhVienRepo.edit(sinhVien, position);
    }

    public void delete(int maSinhVien) {
        int position = this.sinhVienRepo.getPosition(maSinhVien);
        this.sinhVienRepo.delete(position);
    }

    public SinhVien getByMaSinhVien(int maSinhVien) {
        return this.sinhVienRepo.getByMaSinhVien(maSinhVien);
    }

    public List<SinhVien> getAll() {
        return this.sinhVienRepo.getAll();
    }
}
