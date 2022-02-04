package com.antra.corejava.reflection.pojo;

public class B {
    private int id;
    public String name;
    private boolean flag;

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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
