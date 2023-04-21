package terceiro_periodo.exercicioBoliche;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Boliche2Test {

	@Test
	public void caracteresValidos() {
		Boliche2 boliche = new Boliche2();
		boolean jogadas = boliche.jogadas("1X901-5642030-/070080");
		Assertions.assertEquals(true, jogadas);
		jogadas = boliche.jogadas("1X9a1-5642030-/070080");
		Assertions.assertEquals(false, jogadas);
		jogadas = boliche.jogadas("0000aabc");
		Assertions.assertEquals(false, jogadas);
	}
	

}
