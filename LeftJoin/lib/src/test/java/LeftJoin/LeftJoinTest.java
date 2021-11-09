package LeftJoin;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinTest {
    @Test
    void leftJoin(){
        LeftJoin leftJoin=new LeftJoin();
        HashMap<String,String> hLeft=new HashMap<>();
        HashMap<String,String>hRight=new HashMap<>();
        hLeft.put("farah","jamal");
        hLeft.put("Severus","Tobias");
        hLeft.put("Harry","James");
        hLeft.put("Ron","Weasley");
        hLeft.put("Ahmad","Ibrahim");

        hRight.put("farah","Mohammad");
        hRight.put("Severus","Snap");
        hRight.put("Harry","Potter");
        hRight.put("Luna","LoveGod");
        hRight.put("Ahmad","Mohammad");


        System.out.println(leftJoin.leftJoin(hLeft,hRight));
        assertEquals("[[Ron: Weasley, null], [Severus: Tobias, Snap], [Harry: James, Potter], [farah: jamal, Mohammad], [Ahmad: Ibrahim, Mohammad]]",
                leftJoin.leftJoin(hLeft,hRight),
                "should joined two hash maps be left table"
        );
    }
}