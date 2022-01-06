package com.madrapps.jacoco.operation;

import com.madrapps.jacoco.StringOperation;

public class StringOp implements StringOperation {

    @Override
    public boolean endsWith(String source, String chars) {
        return source.endsWith(chars);
    }

    @Override
    public boolean startsWith(String source, String chars) {
        return source.startsWith(chars);
    }

    public void sampleMethod() {

    }
}
