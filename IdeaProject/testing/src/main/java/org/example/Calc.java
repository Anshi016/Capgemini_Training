package org.example;

public class Calc {
    /*
    int add(int a , int b) {
        return a + b;
    }
    */

    /* Using Generic
    public <T extends Number> double add( T a , T b) {
        return a.doubleValue() + b.doubleValue();
    }

     */

    public double add(Object a , Object b){
        double num1 = parseIoDouble(a);
        double num2   = parseIoDouble(b);
        return num1 + num2;
    }

    private double parseIoDouble(Object value) {
        if( value instanceof Number) {
            return ( (Number) value).doubleValue();
        }
        if( value instanceof String) {
            try {
                return Double.parseDouble((String) value);
            } catch( NumberFormatException e) {
                throw new IllegalArgumentException("Enter numbers only");
            }
        }
        throw new IllegalArgumentException(("Enter numbers only"));
    }





}
