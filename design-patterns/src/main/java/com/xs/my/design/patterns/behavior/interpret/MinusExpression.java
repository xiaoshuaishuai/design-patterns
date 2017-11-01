package com.xs.my.design.patterns.behavior.interpret;

public class MinusExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println("PlusExpression --");
		String input = context.getInput();
		int parsedResult = Integer.parseInt(input);
		parsedResult--;
		context.setInput(String.valueOf(parsedResult));
		context.setOutput(parsedResult);
	}

}
