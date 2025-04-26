import com.example.thiKTNC.service;
import com.example.thiKTNC.student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class testService {
    service service;

    @BeforeEach
    void setUp(){
        service = new service();
    }

    @Test
    public void Test1() throws Exception {
        student student = new student(1,"nguyen van ",20.0,true);
        service.add(student);

        Assert.assertEquals(1,student.getId());
    }

    @AfterEach
    void tearDown(){
        service = null;
    }

}
