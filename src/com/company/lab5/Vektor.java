package com.company.lab5;
public class Dot
{
    private int x;
    private int y;
    Dot()
    {
        this.x=0;
        this.y=0;
    }
    Dot(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Vector {
    private Dot firstDot=new Dot();
    private Dot secondDot= new Dot();
    private Dot coordinatesVector=new Dot();
    Vector()
    {
    }
    public Dot getFirstDot()
    {
        return firstDot;
    }
    public Dot getSecondDot()
    {
        return secondDot;
    }
    public void setFirstDot(int x, int y) {
        firstDot.setX(x);
        firstDot.setY(y);
    }
    public void setSecondDot(int x, int y) {
        secondDot.setX(x);
        secondDot.setY(y);
    }
    public void setCoordinatesVector()
    {
        this.coordinatesVector.setX(secondDot.getX()-firstDot.getX());
        this.coordinatesVector.setY(secondDot.getY()-firstDot.getY());
    }
    public void setCoordinatesVector(int x, int y)
    {
        coordinatesVector.setX(x);
        coordinatesVector.setY(y);
    }
    public Dot getCoordinatesVector()
    {
        return coordinatesVector;
    }
    public Vector add(Vector vector2)
    {
        Vector res();
        res.firstDot.setX(getCoordinatesVector().getX()+vector2.getCoordinatesVector().getX());
        res.secondDot.setY(getCoordinatesVector().getY()+vector2.getCoordinatesVector().getY());
        res.setCoordinatesVector();

        return res;
    }
    public Vector sub(Vector vector2)
    {
        Vector res();
        res.firstDot.setX(getCoordinatesVector().getX()-vector2.getCoordinatesVector().getX());
        res.secondDot.setY(getCoordinatesVector().getY()-vector2.getCoordinatesVector().getY());
        res.setCoordinatesVector();
        return res;
    }
    public double getLength()
    {
        double length;
        length=Math.sqrt(Math.pow(getCoordinatesVector().getX(),2)+Math.pow(getCoordinatesVector().getY(),2));
        return length;
    }
    public Vector multiplyByNum(int n)
    {
        Vector temp();
        temp.setCoordinatesVector(getCoordinatesVector().getX()*n,getCoordinatesVector().getY()*n );
        return temp;
    }
    public double getAngleWithOY()
    {
        return Math.toDegrees(Math.acos(Math.cos(vector.getCoordinatesVector().getY()/vector.getLength(vector))));
    }
    public double getAngleWithOX()
    {
        return Math.toDegrees(Math.acos(Math.cos(getCoordinatesVector().getX())/getLength()));
    }
    public double getAngleBetweenVector(Vector vector2)
    {
        return Math.toDegrees(Math.cos(getScalarProduct(vector2)/ (getLength()+vector2.getLength())));
    }
    public double getScalarProduct(Vector vector2)
    {
        return (getCoordinatesVector().getX()*vector2.getCoordinatesVector().getY())+ (getCoordinatesVector().getY()*vector2.getCoordinatesVector().getY());
    }


}
