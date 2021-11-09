package LeftJoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {

    public String leftJoin(HashMap<String,String> h1,HashMap<String,String>h2){

        List<String>list=new ArrayList<>();
        for(String key:h1.keySet()){
            if(h1.containsKey(key)){
                list.add("["+key + ": " + h1.get(key) + ", " + h2.get(key)+"]");
            }
            else{
                list.add("["+key + ": " + h1.get(key) + ", " + null+"]");

            }
        }

        return Arrays.toString(list.toArray());
    }
}
