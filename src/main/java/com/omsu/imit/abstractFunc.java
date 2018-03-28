package com.omsu.imit;

public abstract class abstractFunc implements Function {
    protected double borderA,borderB;
    public double decideFunction(double x){
        return 0;
    }
    public double getBorderA(){
        return borderA;
    }
    public double getBorderB(){
        return borderB;
    }
    public void check(double x){
        if(x<borderA || x>borderB) throw new IllegalArgumentException("Функция не определена!");
    }
}
