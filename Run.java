import controller.SinhVienController;
import models.SinhVien;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        SinhVienController sinhVienController = new SinhVienController();

        sinhVienController.add(new SinhVien(1, "Khuất Đăng", "Cao", "18/06/1995", 1));
        sinhVienController.add(new SinhVien(2, "Kiều Mạnh", "Quan", "18/06/1995", 0));

        List<SinhVien> sinhVienList = sinhVienController.getAll();
        sinhVienList.forEach(item -> {
            System.out.println(item.toString());
        });

        System.out.println("======== EDIT");

        sinhVienController.edit(new SinhVien(1, "Khuất Đăng", "Cao Edit", "18/06/1995", 1));

        sinhVienList.forEach(item -> {
            System.out.println(item.toString());
        });

        System.out.println("======== DELETE");

        sinhVienController.delete(1);

        sinhVienList.forEach(item -> {
            System.out.println(item.toString());
        });
    }
}
