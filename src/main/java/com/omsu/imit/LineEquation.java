package com.omsu.imit;

public class LineEquation extends abstractFunc {
    private double borderA;
    private double borderB;
    private double[] param = new double[2];
    public LineEquation(double a,double b,double borderA,double borderB){
        if(borderA>borderB) throw new IllegalArgumentException("Некорректный отрезок!");
        super.borderA=borderA;
        super.borderB=borderB;
        param[0]=a;
        param[1]=b;
    }
    public double decideFunction(double x){
       check(x);
        return param[0]*x+param[1];
    }

}
