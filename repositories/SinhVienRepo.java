package repositories;

import models.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienRepo {

    private List<SinhVien> sinhVienList = new ArrayList<>();

    /**
     * Add a sinhVien object
     * @param sinhVien
     */
    public void add(SinhVien sinhVien) {
        this.sinhVienList.add(sinhVien);
    }

    /**
     * Edit a exist sinhVien
     * Step 1: remove sinhVien at position which stored
     * Step 2: add sinhVien at position which removed
     * @param sinhVien
     * @param position
     */
    public void edit(SinhVien sinhVien, int position) {
        this.sinhVienList.remove(position);
        this.sinhVienList.add(position, sinhVien);
    }

    /**
     * Delete a sinhVien
     * @param position
     */
    public void delete(int position) {
        this.sinhVienList.remove(position);
    }

    /**
     * Get a sinhVien by maSinhVien
     * @param maSinhVien
     * @return a sinhVien which has maSinhVien map for parameter maSinhVien
     */
    public SinhVien getByMaSinhVien(int maSinhVien) {
        return this.sinhVienList.stream().filter(item -> item.getMaSinhVien() == maSinhVien).findFirst().orElseThrow();
    }

    /**
     * Get all sinhVien
     * @return list sinhVien
     */
    public List<SinhVien> getAll() {
        return this.sinhVienList;
    }

    /**
     * Find a position's sinhVien is stored in array
     * @param maSinhVien maSinhVien
     * @return position is stored in array
     */
    public int getPosition(int maSinhVien) {
        for (int i = 0; i < this.sinhVienList.size(); i++) {
            SinhVien sinhVien = this.sinhVienList.get(i);
            if (sinhVien.getMaSinhVien() == maSinhVien) {
                return i;
            }
        }
        return -1; // nếu không tìm thấy sinh viên nào thì trả về -1
    }
}
