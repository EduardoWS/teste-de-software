package terceiro_periodo.exercicioBoliche;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Boliche3Test {
	
	Boliche3 boliche;
	@BeforeEach
	void before() {
		boliche = new Boliche3();
	}

	@Test
	void posicaoValida() {
		
		boolean jogadas = boliche.jogadas("X-0000000000000000000");
		Assertions.assertEquals(true, jogadas);
		jogadas = boliche.jogadas("X90000000000000000000");
		Assertions.assertEquals(false, jogadas);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"X-0000000000000000000", "X-X-00000000000000000", "4/0000000000000000000",
							"9/0000000000000000000", "000000000000000000X42", "0000000000000000003/8"})
	void posicoesValidas(String jgds) {
		
		assertTrue(boliche.jogadas(jgds));
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"X20000000000000000000", "X-X100000000000000000", "/40000000000000000000",
							"-X0000000000000000000", "000000000000000000XXX", "000000000000000000/00",
							"0000000000000000000XX", "0000000-0000000000000", "-00000000000000000000",
							"000000000000000000X--", "000000000000000000X0-", "0000000000000000006/-"})
	void posicoesInvalidas(String jgds) {
		
		assertFalse(boliche.jogadas(jgds));
		
	}

}
