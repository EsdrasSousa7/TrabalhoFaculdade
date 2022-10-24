package br.com.caelum.ed;

public class Aluno {
	
		private String nome;
		private int totalDeAlunos;
		private Object[] alunos;
		public String getNome() {
		return nome;
		}
		public void setNome(String nome) {
		this.nome = nome;
		}
		public String toString() {
			if (this.totalDeAlunos == 0) {
				return "[]";
				}
				StringBuilder builder = new StringBuilder();
				builder.append("[");
				for (int i = 0; i < this.totalDeAlunos - 1; i++) {
				builder.append(this.alunos[i]);
				builder.append(", ");}
				builder.append(this.alunos[this.totalDeAlunos - 1]);
				builder.append("]");
				return builder.toString();
		}
		public boolean equals(Object o) {
			Aluno outro = (Aluno)o;
			return this.nome.equals(outro.nome);
			}
}
