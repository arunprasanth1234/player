// Write your code here.
package com.example.player;

public class Player {
    private int id;
    private String name;
    private int jernum;
    private String role;

    public Player(int id, String name, int jernum, String role) {
        this.id = id;
        this.name = name;
        this.jernum = jernum;
        this.role = role;
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

    public int getJerNum() {
        return jernum;
    }

    public void setJerNum(int jernum) {
        this.jernum = jernum;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
