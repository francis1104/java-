package com.itheima.hf.domain;

public class ClassRoom {
    private String className;
    private String classType;
    private int classCount;

    public ClassRoom() {
    }

    public ClassRoom(String className, String classType, int classCount) {
        this.className = className;
        this.classType = classType;
        this.classCount = classCount;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getClassCount() {
        return classCount;
    }

    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }
}
