package com.example.resttesting;

import com.example.tetUtil.DemoUtil;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
@TestMethodOrder(MethodOrderer.MethodName.class)
public class AssertSameNotSame {

    private String academy="patilsoft";
    private String duplicate = academy;

    private static DemoUtil demoUtil;
    @BeforeAll
    public static  void getDemoUtil(){
        demoUtil=new DemoUtil();
    }

    @DisplayName("same and not same")
    @Test
    public void sameOrnotSame(){
        Assertions.assertSame(demoUtil.getAcademy(),demoUtil.getAcademyDuplicate(),"objects should refer to same ");
        Assertions.assertNotSame(demoUtil.getAcademy(),demoUtil.getAcademyDuplicate(),"objects should not refer to the same");
    }

    @DisplayName("True or False")
    @Test
    void testTrueFalse(){
       int gradeOne=10;
       int gradeTwo=5;

       Assertions.assertTrue(demoUtil.isGrater(gradeOne,gradeTwo),"it should be true");
       Assertions.assertFalse(demoUtil.isGrater(gradeTwo,gradeOne),"it should be false");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals(){
        String[] array = {"A","B","C"};
        Assertions.assertArrayEquals(array,demoUtil.getFirstThreeLettersOfAlphabet(),"array elemet must same");
    }

    @DisplayName("Iterable Equals")
    @Test
    void testIterableEquals(){
        List<String> theList= Arrays.asList("luv","2","code");
        Assertions.assertIterableEquals(theList,demoUtil.getAcademyInList(),"array elemet must be same");
    }
    @DisplayName("Line match")
    @Test
    void testLineMatch(){
    List<String> theList= Arrays.asList("luv","2","code");
    Assertions.assertLinesMatch(theList,demoUtil.getAcademyInList(),"array should match");
    }

    @DisplayName("Throw and Does Not Throw")
    @Test
    void testThrowAndDoseNotThrow(){
        Assertions.assertThrows(Exception.class,()->demoUtil.throwException(-1),"should throw exception");
        Assertions.assertDoesNotThrow(()->demoUtil.throwException(1),"Dose not throw exception");
    }
    @DisplayName("TimeOut")
    @Test
    void testTimeOut(){
        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(3),()->demoUtil.checkTimeOut(),"method should be execute in 3 seconds");
    }
}
