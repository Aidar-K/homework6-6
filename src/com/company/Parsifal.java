
package com.company;

public class Parsifal<A extends Number> implements Drawable<A> {

    @Override
    public int addition(A a, A b) {
        return a.intValue()+b.intValue();
    }

    @Override
    public long subtract(A a, A b) {
        return a.longValue()-b.longValue();
    }

    @Override
    public double multiplication(A a, A b) {
        return a.doubleValue()*b.doubleValue();
    }

    @Override
    public float division(A a, A b) {
        return a.floatValue()/b.floatValue();
    }
}
