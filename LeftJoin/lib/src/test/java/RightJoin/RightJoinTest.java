package RightJoin;

import LeftJoin.LeftJoin;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class RightJoinTest {
    @Test
    void leftJoin(){
        RightJoin leftJoin=new RightJoin();
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


        System.out.println(leftJoin.rightJoin(hLeft,hRight));
        assertEquals("[[Severus: Snap, Tobias], [Harry: Potter, James], [farah: Mohammad, jamal], [Luna: LoveGod, null], [Ahmad: Mohammad, Ibrahim]]",
                leftJoin.rightJoin(hLeft,hRight),
                "should joined two hash maps be right table"
        );
    }
}