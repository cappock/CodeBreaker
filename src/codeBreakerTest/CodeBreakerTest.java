package codeBreakerTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import codeBreaker.CodeBreaker;

class CodeBreakerTest {
	CodeBreaker cb;
	@Test
	void testPositionMatch() {
		cb = new CodeBreaker();
		int num[] = new int[] {1,2,3,4};
		String r = cb.confirmar(num);
		assertEquals("XXXX", r);
	}
	@Test
	void testNoMatch() {
		cb = new CodeBreaker();
		int num[] = new int[] {5,6,7,8};
		String r = cb.confirmar(num);
		assertEquals("    ", r);
	}
	@Test
	void testAllNumberMatch() {
		cb = new CodeBreaker();
		int num[] = new int[] {3,1,4,2};
		String r = cb.confirmar(num);
		assertEquals("____", r);
	}
	
	@Test
	void testSomeNumberMatch() {
		cb = new CodeBreaker();
		int num[] = new int[] {2, 1, 4, 5};
		String r = cb.confirmar(num);
		assertEquals("___ ", r);
	}
	
	@Test
	void testLongerInput() {
		cb = new CodeBreaker();
		int num[] = new int[] {2, 1, 4, 5, 6};
		String r = cb.confirmar(num);
		assertEquals("El array debe ser de 4 digitos", r);
	}
	
	@Test
	void testShorterInput() {
		cb = new CodeBreaker();
		int num[] = new int[] {2, 1, 4};
		String r = cb.confirmar(num);
		assertEquals("El array debe ser de 4 digitos", r);
	}
	
	@Test
	void testHalfPos_HalfNum() {
		cb = new CodeBreaker();
		int num[] = new int[] {1, 2, 4, 3};
		String r = cb.confirmar(num);
		assertEquals("XX__", r);
	}
	
	@Test
	void testHalfNum_HalfPos() {
		cb = new CodeBreaker();
		int num[] = new int[] {1, 2, 4, 3};
		String r = cb.confirmar(num);
		assertEquals("XX__", r);
	}
	
	@Test
	void test_GetOtherNumber() {
		cb = new CodeBreaker(2467);
		int num[] = new int[] {2, 4, 6, 7};
		String r = cb.confirmar(num);
		assertEquals("XXXX", r);
	}
	
	@Test
	void test_Priority() {
		cb = new CodeBreaker();
		int num[] = new int[] {1, 3, 2, 4};
		String r = cb.confirmar(num);
		assertEquals("XX__", r);
	}
	
	@Test
	void test_GetOtherNumberNoMatch() {
		cb = new CodeBreaker(2467);
		int num[] = new int[] {1, 5, 8, 9};
		String r = cb.confirmar(num);
		assertEquals("    ", r);
	}
	@Test
	void test_GetOtherNumberDiffPosition() {
		cb = new CodeBreaker(2467);
		int num[] = new int[] {6, 2, 7, 4};
		String r = cb.confirmar(num);
		assertEquals("____", r);
	}
	
	@Test
	void test_GetOtherNumberSomeMatch() {
		cb = new CodeBreaker(2467);
		int num[] = new int[] {2, 8, 9, 7};
		String r = cb.confirmar(num);
		assertEquals("XX  ", r);
	}
	@Test
	void test_GetOtherNumberSomePosition() {
		cb = new CodeBreaker(2467);
		int num[] = new int[] {8, 2, 7, 9};
		String r = cb.confirmar(num);
		assertEquals("__  ", r);
	}
	@Test
	void test_GetOtherNumberSomePositionAndMatch() {
		cb = new CodeBreaker(2467);
		int num[] = new int[] {2, 4, 7, 6};
		String r = cb.confirmar(num);
		assertEquals("XX__", r);
	}
}
