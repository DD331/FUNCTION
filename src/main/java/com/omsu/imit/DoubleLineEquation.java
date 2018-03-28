package com.omsu.imit;
//hello
public class DoubleLineEquation extends abstractFunc {
    private double[] param = new double[4];
    public DoubleLineEquation(double a,double b,double c,double d,double borderA,double borderB){
        if(borderA>borderB) throw new IllegalArgumentException("Некорректный отрезок!");
        super.borderA=borderA;
        super.borderB=borderB;
        param[0]=a;
        param[1]=b;
        param[2]=c;
        param[3]=d;
    }
    public double decideFunction(double x){
        check(x);
        if((param[2]*x)+param[3]==0) throw new IllegalArgumentException("Невозможно вычислить!");
        return ((param[0]*x)+param[1])/((param[2]*x)+param[3]);
    }
}
