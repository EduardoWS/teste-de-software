package terceiro_periodo.exercicioBoliche;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Boliche1Test {

	@Test
	public void tem21Jogadas() {
		Boliche1 boliche = new Boliche1();
		boolean jogadas = boliche.jogadas("0".repeat(21));
		Assertions.assertEquals(true, jogadas);
	}

}
