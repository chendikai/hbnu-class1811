package com.dingli.common;

import java.util.Objects;

public class Houyi {
    private String name;
    private int id;

    public Houyi(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "英雄名字: " + this.name + " ;英雄id：" + this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Houyi)) {
            return false;
        } else {
            Houyi houyi = (Houyi) obj;
            return houyi.id == this.id && houyi.name.equals(this.name);
        }

    }

}
