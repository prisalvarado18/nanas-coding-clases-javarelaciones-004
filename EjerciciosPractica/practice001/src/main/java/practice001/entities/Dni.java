/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice001.entities;

/**
 *
 * @author palva
 */
public class Dni {
    private char series;
    private int number;

    public Dni(char series, int number) {
        this.series = series;
        this.number = number;
    }

    public char getSeries() {
        return series;
    }

    public void setSeries(char series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
