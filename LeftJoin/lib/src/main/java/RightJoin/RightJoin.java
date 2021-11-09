package RightJoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RightJoin {
    public String rightJoin(HashMap<String,String> h1, HashMap<String,String>h2){
        List<String>list = new ArrayList<>();
        for(String key:h2.keySet()){
            if(h2.containsKey(key)){
                list.add("["+key + ": " + h2.get(key) + ", " + h1.get(key)+"]");
            }
            else{
                list.add("["+key + ": " + h2.get(key) + ", " + null+"]");

            }
        }

        return Arrays.toString(list.toArray());
    }
}
