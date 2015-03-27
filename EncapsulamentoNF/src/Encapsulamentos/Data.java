package Encapsulamentos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if(dia > 0 && dia < 32)
			this.dia = dia;
		else
			System.out.println("Dia inexistente.");
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes > 0 && mes < 13)
			this.mes = mes;
		else
			System.out.println("Mês inexistente.");
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
		
}
