package com.luisgomezcaballero.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.luisgomezcaballero.mockitodemo.ChildService;
import com.luisgomezcaballero.mockitodemo.ParentService;

public class ParentServiceTest {

	@Mock
	ChildService childService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCheckCorrectNumber() {
		ParentService parentService = new ParentService();
		parentService.setChildService(childService);
		int testNumber = 123;

		when(childService.check123(testNumber)).thenReturn(1);

		int checkCorrectNumber = parentService.checkCorrectNumber(testNumber);

		assertEquals(checkCorrectNumber, 1);
		verify(childService).check123(testNumber);
	}

}
