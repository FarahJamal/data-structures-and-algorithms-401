package Queue;

import Animals.Cats;
import Animals.Dogs;
import Queue.Queue;

public class AnimalShelter<T> {

    Queue <T> dogs=new Queue();
    Queue <T> cats=new Queue();
    Queue <T> differentTypes=new Queue<T>();

    public void enQueue(T animal){
    if(animal instanceof Cats){
        cats.enqueue(animal);
    }
    else if(animal instanceof Dogs){
        dogs.enqueue(animal);
    }
    else{
        differentTypes.enqueue(animal);
    }
    }
    public T deQueue(T animal) throws Exception {
        try{
        if(animal.equals("dog")){
            return dogs.dequeue();
        }
        else if(animal.equals("cat")){
            return cats.dequeue();
        }
        else{
            return differentTypes.dequeue();
        }}
        catch (Exception e){
            e.getMessage();
        }
        if (animal == "cat"){
            return (T) "Sorry the cat Shelter is Empty ";

        }else if (animal == "dog"){
            return (T) "Sorry the dog Shelter is Empty ";
        }else {
            if(differentTypes.isEmpty()) {
                return (T) "Sorry our Shelter is Empty  ";
            }
            else{
                return differentTypes.dequeue();

            }
        }
    }

}
