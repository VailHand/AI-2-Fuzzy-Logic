/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasProgramAI2;

/**
 *
 * @author Kukuh Rahingga P
 */
public class GraphFK {
    private int a, b, c, d, e;
    
    public GraphFK() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    } 

    @Override
    public String toString() {
        return "FK {" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + '}';
    }
    
    
}
