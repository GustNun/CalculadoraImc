/* Feito por Gustavo Nunes e Rubem Lima */

package calculadora.imc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestaCalculadoraImc {

	CalculadoraImc calc;

	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}

	@Test
	public void testeAdultoBaixoPesoMuitoGraveMaximo() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(54.72, 1.85, 31, "F"));
	}

	@Test
	public void testeAdultoBaixoPesoGraveMinimo() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(77.00, 2.193, 64, "F"));

	}

	@Test
	public void testeAdultoBaixoPesoGraveMaximo() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(64, 1.941, 64, "M"));

	}

	@Test
	public void testeAdultoBaixoPesoMinimo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(55.00, 1.798, 24, "M"));

	}

	@Test
	public void testeAdultoPesoBaixoMaximo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(65.34, 1.88, 54, "F"));

	}

	@Test
	public void testeAdultoPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(71.00, 1.959, 21, "F"));
	}

	@Test
	public void testeAdultoPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(99.00, 1.9905, 40, "M"));
	}

	@Test
	public void testeAdultoSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(97.04, 1.97, 40, "M"));
	}

	@Test
	public void testeAdultoSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(82.63, 1.66, 45, "M"));
	}

	@Test
	public void testeObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(106.00, 1.87, 25, "F"));
	}

	@Test
	public void testeObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(117.00, 1.8287, 55, "M"));
	}

	@Test
	public void testeObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(78.00, 1.49, 23, "M"));
	}

	@Test
	public void testeObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(159, 1.9941, 30, "F"));
	}

	@Test
	public void testeObesidadeGrauIIIMinimo() {
		Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(160, 2, 30, "M"));

	}

	@Test
	public void testeIdosoBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(59.87, 1.65, 69, "M"));

	}

	@Test
	public void testeIdosoPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(59.90, 1.65, 70, "M"));
	}

	@Test
	public void testeIdosoPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(87.489, 1.8001, 90, "M"));
	}

	@Test
	public void testeIdosoBaixoSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(87.50, 1.80, 80, "M"));
	}

	@Test
	public void testeIsodoSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(86.69, 1.70, 75, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(86.74, 1.70, 90, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(99.96, 1.69, 100, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(100, 1.69, 77, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(102.38, 1.60, 85, "M"));
	}

	@Test
	public void testeIsodoObesidadeGrauIIIMaximo() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(102.41, 1.60, 95, "M"));
	}

	@Test
	public void testeIdosaBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(59.87, 1.65, 90, "F"));

	}

	@Test
	public void testeIdosaPesaNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(59.90, 1.65, 90, "F"));
	}

	@Test
	public void testeIdosaPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(87.489, 1.8001, 70, "F"));
	}

	@Test
	public void testeIdosaSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(87.5, 1.80, 100, "F"));
	}

	@Test
	public void testeIdosaBaixoSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(81.92, 1.60, 76, "F"));
	}

	@Test
	public void testeIdosaObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(81.95, 1.60, 86, "F"));
	}

	@Test
	public void testeIdosaObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(106.9299, 1.70, 97, "F"));
	}

	@Test
	public void testeIsodaObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(106.97, 1.70, 89, "F"));
	}

	@Test
	public void testeIsodaObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(128.60, 1.75, 66, "F"));
	}

	@Test
	public void testeIsodaObesidadeGrauIIIMaximo() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(128.63, 1.75, 78, "F"));
	}

	@Test
	public void testeMenino2anosBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(5.395, 0.6, 2, "M"));
	}

	@Test
	public void testeMenino2anosPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(5.4, 0.6, 2, "M"));
	}

	@Test
	public void testeMenino2anosPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(8.815, 0.7, 2, "M"));
	}

	@Test
	public void testeMenino2anosSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(8.822, 0.7, 2, "M"));
	}

	@Test
	public void testeMenino2anosSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(9.454, 0.7, 2, "M"));
	}

	@Test
	public void testeMenino2anosObesidadeMinimo() {
		Assert.assertEquals("Obesidade", calc.calcularImc(9.458, 0.7, 2, "M"));
	}

	@Test
	public void testeMenino20anosBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(33.79, 1.30, 20, "M"));
	}

	@Test
	public void testeMenino20anosPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(33.85, 1.30, 20, "M"));
	}

	@Test
	public void testeMenino20anosPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(45.62, 1.30, 20, "M"));
	}

	@Test
	public void testeMenino20anoSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(45.63, 1.30, 20, "M"));
	}

	@Test
	public void testeMenino20anosSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(59.36, 1.40, 20, "M"));
	}

	@Test
	public void testeMenino20anosObesidadeMinimo() {
		Assert.assertEquals("Obesidade", calc.calcularImc(59.39, 1.40, 20, "M"));
	}

	@Test
	public void testeMenina2anosBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(11.9, 0.9, 2, "F"));
	}

	@Test
	public void testeMenina2anosPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(11.91, 0.9, 2, "F"));
	}

	@Test
	public void testeMenina2anosPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(14.57, 0.9, 2, "F"));
	}

	@Test
	public void testeMenina2anosSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(14.58, 0.9, 2, "F"));
	}

	@Test
	public void testeMenina2anosSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(16.19, 0.9, 2, "F"));
	}

	@Test
	public void testeMenina2anosObesidadeMinimo() {
		Assert.assertEquals("Obesidade", calc.calcularImc(16.23, 0.9, 2, "F"));
	}

	@Test
	public void testeMenina20anosBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(47.34, 1.60, 20, "F"));
	}

	@Test
	public void testeMenina20anosPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(47.37, 1.60, 20, "F"));
	}

	@Test
	public void testeMenina20anosPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(67.55, 1.60, 20, "F"));
	}

	@Test
	public void testeMenina20anosSobrePesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(67.60, 1.60, 20, "F"));
	}

	@Test
	public void testeMenina20anosSobrePesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(85.73, 1.65, 20, "F"));
	}

	@Test
	public void testeMenina20anosObesidadeMinimo() {
		Assert.assertEquals("Obesidade", calc.calcularImc(85.76, 1.65, 20, "F"));
	}

}