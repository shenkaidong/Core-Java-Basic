package com.antra.corejava.reflection.pojo;

public class A {
    public int id;
    private String name;
    protected boolean flag;

    public A(int id, String name, boolean flag) {
        this.id = id;
        this.name = name;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
