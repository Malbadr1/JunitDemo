import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @BeforeAll
   static void beforeAll(){
        System.out.println("I will execute the test ");
    };

    @AfterAll
  static void afterAll(){
        System.out.println("I am finished the test ");
    };
   @Test
    void Should_return_user_if_the_nam_contains_special_charachter(){
       System.out.println("this is a first case");
       String actual_result= Demo.Name("ali@");
       String expected_result= "User";
       assertEquals(actual_result,expected_result);
    }
    @Test
    void Should_return_name_if_the_name_not_contains_special_charachter(){
        System.out.println("this is a second case");
        String actual_result= Demo.Name("ali");
        String expected_result= "ali";
        assertEquals(actual_result,expected_result);
    }
}