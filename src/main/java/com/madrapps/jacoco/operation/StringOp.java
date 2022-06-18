package com.madrapps.jacoco.operation;

public class StringOp {

    public boolean endsWith(String source, String chars) {
        return source.endsWith(chars);
    }

    public boolean startsWith(String source, String chars) {
        return source.startsWith(chars);
    }

    public boolean isEmpty(String source) {
        return source.isEmpty();
    }

    public String toUpperCase(String source) {
        return source.toUpperCase();
    }
}
