public class Person implements Comparable<Person>{

    String name;
    int height;
    int age;

    public Person(String name,int height,int age){

        this.name = name;
        this.height = height;
        this.age = age;

    }

    public int compareTo(Person p){
        if(age==p.age){
            if(height==p.height)
                return 0;

            else if(height>p.height)
                    return -1;
                else
                    return 1;
        }
        else if(age<p.age)
            return -1;
        else
            return 1;

    }

}

