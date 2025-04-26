import com.example.thiKTNC.SanPham;
import com.example.thiKTNC.Service;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

public class testSP {
    Service service;
    @BeforeEach
    void setUp(){
        service = new Service();
    }

    @Test
    public void Test1() throws Exception {
    SanPham sanPham = new SanPham("ma1","ten1",2025,19000,10,"quan ao");
    SanPham sanPham1 = new SanPham("ma2","ten1",2025,19000,10,"quan ao");
    SanPham sanPham2 = new SanPham("ma3","ten1",2025,19000,10,"quan ao");
    SanPham sanPham3 = new SanPham("ma4","ten1",2025,19000,10,"quan ao");

        SanPham sp = service.addAll(sanPham);
        SanPham sp1 = service.addAll(sanPham1);
        SanPham sp2 = service.addAll(sanPham2);
        SanPham sp3 = service.addAll(sanPham3);

        List<SanPham> kq = service.xoaTheoMa("ma1");

        Assert.assertEquals(3,kq.size());
    }

    @Test
    public void Test2() throws Exception {
        SanPham sanPham = new SanPham("ma1","ten1",2025,19000,10,"quan ao");
        SanPham sanPham1 = new SanPham("ma1","ten1",2025,19000,10,"quan ao");
        SanPham sanPham2 = new SanPham("ma3","ten1",2025,19000,10,"quan ao");
        SanPham sanPham3 = new SanPham("ma4","ten1",2025,19000,10,"quan ao");

        service.addAll(sanPham);
        service.addAll(sanPham1);
        service.addAll(sanPham2);
        service.addAll(sanPham3);
//        List<SanPham> kq = service.addAll(sanPham);
        SanPham sp = service.addAll(sanPham);
        Assert.assertEquals("ma1",sp.getMa());
    }

    @Test
    public void Test3() throws Exception {
        SanPham sanPham = new SanPham("ma1","ten1",2025,19000,10,"quan ao");
        SanPham sanPham1 = new SanPham("ma1","ten1",2025,19000,10,"quan ao");
        SanPham sanPham2 = new SanPham("ma3","ten1",2025,19000,10,"quan ao");
        SanPham sanPham3 = new SanPham("ma4","ten1",2025,19000,10,"quan ao");

        service.addAll(sanPham);
        service.addAll(sanPham1);
        service.addAll(sanPham2);
        service.addAll(sanPham3);
//        List<SanPham> kq = service.addAll(sanPham);
        SanPham sp = service.addAll(sanPham);
        Assert.assertEquals("ma1",sp.getMa());
    }

    @AfterEach
    void tearDown(){
        service = null;
    }
}
