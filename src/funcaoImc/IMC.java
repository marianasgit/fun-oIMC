package funcaoImc;

public class IMC {

	public double altura;
	public int peso;
	public String status;
	public double imc;
	
	public void calcularImc() {
		imc = peso / (altura * altura);
	}
	
	public void obterStatus() {
		if (imc < 18.5) {
			status = "Abaixo do Peso";
		} else if (imc >= 18.5 && imc < 25) {
			status = "Peso Normal";
		} else if (imc >= 25 && imc < 30) {
			status = "Sobrepeso";
		} else if (imc >= 30 && imc < 35) {
			status = "Obesidade Grau I";
		} else if (imc >= 35 && imc < 40) {
			status = "Obesidade Grau II";
		} else {
			status = "Obesidade Grau III ou Morbida";
		}
		
	}	
}
