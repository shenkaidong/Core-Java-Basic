package com.antra.corejava.serialization;


import java.io.*;
import java.util.Objects;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person("David", 20);
        serialize(p);
        deSerialize();
    }

    private static void serialize(Person p) throws IOException {
        FileOutputStream fos = new FileOutputStream("person.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("Done");
    }

    private static void deSerialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        Person p = (Person) obj;
        System.out.println(p);
//        System.out.println(obj);
    }
}

class Person implements Serializable {
    private static final long serialVersionUID = 2520430922881590684L;
    private transient String name;
    private transient int age;

    private static String CLASS_NAME = "A";
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//
//    private void writeObject(java.io.ObjectOutputStream out)
//            throws IOException {
//        out.defaultWriteObject();
//        System.out.println("Here in write object");
//    }
//    private void readObject(java.io.ObjectInputStream in)
//            throws IOException, ClassNotFoundException{
//        in.defaultReadObject();
//        System.out.println("Here in read object");
//    }
}

