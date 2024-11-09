package stos_rpn;
import org.junit.*;

import stos_rpn.Stack;

import static org.junit.Assert.assertEquals;

public class StackTest {
	@Test
	public void testPopAfterPush() {
		Stack stack = new Stack();
		stack.push("napis");
		String result = stack.pop();

		assertEquals("pop after push", "napis", result);
	}

	@Test
	public void testPeekAfterPush(){
		Stack stack = new Stack();
		stack.push("Siemka");
		String result = stack.peek();
		assertEquals("Siemka",result);
	}

	@Test
	public void testDidPopDelete(){
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.pop();
		stack.pop();
		String result = stack.peek();
		assertEquals("A",result);
	}

}
