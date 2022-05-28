package com.example.tetUtil;

import java.util.Arrays;
import java.util.List;

public class DemoUtil {

    private String academy="patilSoft";
    private String academyDuplicate=academy;

    private String[] firstThreeLettersOfAlphabet={"A","B","C"};
    private List<String> academyInList = Arrays.asList("luv","2","code");

    public String[] getFirstThreeLettersOfAlphabet(){
        return  firstThreeLettersOfAlphabet;
    }

    public List<String> getAcademyInList(){
        return academyInList;
    }

    public String throwException(int a) throws Exception{
        if(a<0){
            throw new Exception("number should be greater than or equal to 0");
        }
            return "value is greater than or equal to 0";

    }

    public void checkTimeOut()throws InterruptedException{
        System.out.println("I am going to sleep");
        Thread.sleep(2000);
        System.out.println("sleeping over");
    }

    public String getAcademy(){
        return this.academy;
    }
    public String getAcademyDuplicate(){
        return this.academyDuplicate;
    }

    public Boolean isGrater(int a,int b){
        return a>b?Boolean.TRUE:Boolean.FALSE;
    }
}
