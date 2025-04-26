package com.example.thiKTNC;

import java.util.ArrayList;
import java.util.List;

public class Service {
    //    Tạo class SanPham gồm các thuộc tính ma - String , ten - String ,
//    namBaoHanh - int, gia - float, soLuong - int, danhMuc - String
//    Tạo class SanPhamService và thực hiện các hàm xóa 1 đối tượng
//    theo mã(1 Điểm)
//    Sử dụng đúng thư viện cần thiết để viết unit test(JUnit) và thực
//    hiện các yêu cầu sau:
//            ● Áp dụng các kỹ thuật test đã học: kỹ thuật biên/ kỹ thuật
//    phân vùng tương đương hãy viết unit test cho chức năng
//“Xóa” 1 đối tượng (2 Điểm) - ( ít nhất 5 unit test)
//
//            3 Điểm
//
//    Validate:
//            ● Kiểm tra mã tồn tại(1 Điểm)
    private List<SanPham> list = new ArrayList<>();

//    SanPham sanPham = new SanPham("ma1","ten1",2025,19000,10,"quan ao");
//    SanPham sanPham1 = new SanPham("ma2","ten1",2025,19000,10,"quan ao");
//    SanPham sanPham2 = new SanPham("ma3","ten1",2025,19000,10,"quan ao");
//    SanPham sanPham3 = new SanPham("ma4","ten1",2025,19000,10,"quan ao");
    public SanPham addAll(SanPham sanPham) throws Exception {
        for (SanPham sp: list
             ) {
            if (sanPham.getMa().equalsIgnoreCase(sp.getMa())){
                throw new Exception("bi trung ma");
            }else{
                list.add(sanPham);
            }

        }
        return sanPham;
    }

    public List<SanPham> xoaTheoMa(String ma){

        for (SanPham sp: list
             ) {
            if (sp.getMa().equalsIgnoreCase(ma)){
                list.remove(sp);
            }
        }
        return list;
    }
}
