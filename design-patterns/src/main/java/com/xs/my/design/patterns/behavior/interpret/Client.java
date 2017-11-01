package com.xs.my.design.patterns.behavior.interpret;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String []args) {
        String inputExpr = "10";
        
        Context context = new Context(inputExpr);
        
        List list = new ArrayList();

        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());

        for (int i=0;i<list.size();i++) {
          AbstractExpression expression = (AbstractExpression)list.get(i);
          expression.interpret(context);
        }
        
        System.out.println(context.getOutput());
    }
}