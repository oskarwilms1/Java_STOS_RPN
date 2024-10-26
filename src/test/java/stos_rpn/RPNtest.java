package stos_rpn;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNtest {
    @Test
    public void CheckAddition(){
        RPN sut = new RPN();
        sut.SetUserInput("10 12 +");
        sut.ConvertToArray();
        sut.Calculate();
        sut.SetResultFromStack();
        int result = sut.getResult();
        assertEquals(22, result);
    }
    
    @Test
    public void CheckMultiplication(){
        RPN sut = new RPN();
        sut.SetUserInput("5 20 *");
        sut.ConvertToArray();
        sut.Calculate();
        sut.SetResultFromStack();
        int result = sut.getResult();
        assertEquals(100, result);
    }
    @Test
    public void CheckSubstraction(){
        RPN sut = new RPN();
        sut.SetUserInput("5 12 -");
        sut.ConvertToArray();
        sut.Calculate();
        sut.SetResultFromStack();
        int result = sut.getResult();
        assertEquals(-7, result);
    }


    @Test
    public void CheckAll(){
        RPN sut = new RPN();
        sut.SetUserInput("5 1 2 + 4 * + 3 -");
        sut.ConvertToArray();
        sut.Calculate();
        sut.SetResultFromStack();
        int result = sut.getResult();
        assertEquals(14, result);
    }


}
