package Queue;

public class DuckDuckGoose<T> {
    Queue <String>myQueue = new Queue();
    String deqValue ="";

    public String duckDuckGoose (String listOfStr [] , int k) throws Exception {


        if (listOfStr.length != 0){
            for (int x=0; x<listOfStr.length; x++){
                myQueue.enqueue (listOfStr[x]);
            }
            //A/B/C

        }else {
            return "No One HERE!!!";
        }
                while (myQueue.size()!=1){

            for (int y =0 ; y< k-1; y++){
        deqValue = myQueue.dequeue();
        myQueue.enqueue(deqValue);
    }
            myQueue.dequeue();

                }

        return "last Person :"+ myQueue.dequeue();
    }

}


