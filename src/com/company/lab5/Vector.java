package com.company.lab5;

    public class Vector {
        private double x;
        private double y;
//        private Dot firstDot = new Dot();
//        private Dot secondDot = new Dot();
//        private Dot coordinatesVector = new Dot();
        Vector()
        {
            this.x=0;
            this.y=0;
        }
        Vector(double x, double y)
        {
            this.x=x;
            this.y=y;
        }
//        public Dot getFirstDot() {
//            return firstDot;
//        }
//        public Dot getSecondDot() {
//            return secondDot;
//        }
//        public void setFirstDot(double x, double y) {
//            firstDot.setX(x);
//            firstDot.setY(y);
//        }
//        public void setSecondDot(double x, double y) {
//            secondDot.setX(x);
//            secondDot.setY(y);
//        }
//        public void setCoordinatesVector() {
//            this.coordinatesVector.setX(secondDot.getX() - firstDot.getX());
//            this.coordinatesVector.setY(secondDot.getY() - firstDot.getY());
//        }

        public void setCoordinatesVector(double x, double y) {
            setX(x);
            setY(y);
        }

//        public Dot getCoordinatesVector() {
//            return coordinatesVector;
//        }

        public Vector add(Vector vector2) {
            Vector res = new Vector();
            res.setX(getX() + vector2.getX());
            res.setY(getY() + vector2.getY());
            return res;
        }

        public Vector sub(com.company.lab5.Vector vector2) {
            Vector res = new com.company.lab5.Vector();
            res.setX(getX() - vector2.getX());
            res.setY(getY() - vector2.getY());
            return res;
        }

        public double getLength() {
            double length;
            length = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
            return Math.abs(length);
        }

        public com.company.lab5.Vector multiplyByNum(int n) {
            com.company.lab5.Vector temp = new com.company.lab5.Vector();
            temp.setCoordinatesVector(getX() * n, getY() * n);
            return temp;
        }

        public double getAngleWithOY() {
            return Math.toDegrees(Math.acos(getY() / getLength()));
        }

        public double getAngleWithOX() {
            System.out.println("X="+getX());
            System.out.println("Le="+getLength());
            return Math.toDegrees(Math.acos(getX() / getLength()));
        }

        public double getAngleBetweenVector(Vector vector2) {
            System.out.println("Scalar * "+getScalarProduct(vector2));
            System.out.println("Sum "+(getLength() * vector2.getLength()));

            return Math.toDegrees(Math.acos(getScalarProduct(vector2) / (getLength() * vector2.getLength())));
        }

        public double getScalarProduct(Vector vector2) {
            return (getX() * vector2.getX()) + (getY() * vector2.getY());
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
