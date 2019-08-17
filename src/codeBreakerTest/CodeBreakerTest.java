package codeBreakerTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codeBreaker.CodeBreaker;

class CodeBreakerTest {
	CodeBreaker cb;
	@Test
	void testPositionMatch() {
		cb = new CodeBreaker();
		int num[] = new int[] {1,2,3,4};
		String r = cb.confirmar(num);
		assertEquals(" X X X X", r);
	}
	@Test
	void testNoMatch() {
		cb = new CodeBreaker();
		int num[] = new int[] {5,6,7,8};
		String r = cb.confirmar(num);
		assertEquals("", r);
	}
	@Test
	void testAllNumberMatch() {
		cb = new CodeBreaker();
		int num[] = new int[] {3,1,4,2};
		String r = cb.confirmar(num);
		assertEquals(" _ _ _ _", r);
	}
	
	@Test
	void testSomeNumberMatch() {
		cb = new CodeBreaker();
		int num[] = new int[] {2, 1, 4, 5};
		String r = cb.confirmar(num);
		assertEquals(" _ _ _", r);
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
		assertEquals(" X X _ _", r);
	}
	
	@Test
	void testHalfNum_HalfPos() {
		cb = new CodeBreaker();
		int num[] = new int[] {1, 2, 4, 3};
		String r = cb.confirmar(num);
		assertEquals(" X X _ _", r);
	}
	
}
