import java.util.*;

public class SortPerson {

    public static void main(String[]args){
        ArrayList<Person> arr=new ArrayList<Person>();
        arr.add(new Person("Joe",170,23));
        arr.add(new Person("James",175,27));
        arr.add(new Person("Jimmy",177,21));
        arr.add(new Person("John",180,22));
        arr.add(new Person("Jasper",168,60));
        arr.add(new Person("Jerk",178,23));

        Collections.sort(arr);
        for(Person p:arr){
            System.out.println(" Name: " + p.name + ","+" Height: " + p.height+ "," + " Age: " + p.age);
        }
    }


}
