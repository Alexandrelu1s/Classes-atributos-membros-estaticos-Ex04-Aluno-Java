package entities;

public class Student {
	private String name;
	private Double n1;
	private Double n2;
	private Double n3;
	
	public Student(String name, Double n1, Double n2, Double n3) {
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}

	public Double getN3() {
		return n3;
	}

	public void setN3(Double n3) {
		this.n3 = n3;
	}
	
	public void finalGrade() {
		Double finalN = n1 + n2 + n3;
		
		if(finalN >= 60) {
			System.out.println("Aluno " + name + " passou." 
					+ "\nNota final = " + finalN);
		}
		else {
			Double missN = 60.0 - finalN;
			System.out.println("Aluno " + name + " não passou."
					+ "\nFaltou " + missN + " pontos");
		}
	}
}
