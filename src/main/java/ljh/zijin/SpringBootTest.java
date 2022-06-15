package ljh.zijin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("ljh.zijin.dao")
public class SpringBootTest {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest.class,args);
    }
}
