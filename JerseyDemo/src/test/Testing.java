package test;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import junit.framework.Assert;
import mainLogic.Calculator;

public class Testing {
	
	@Test
	public void create(){
        Calculator calculator = mock(Calculator.class);
        when(calculator.addition(4, 3)).thenReturn(6);
        Assert.assertEquals(6, calculator.addition(4, 3));
        
	}
	
	
}
