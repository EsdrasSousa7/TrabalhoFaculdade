package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;


public class Vetor {
	private Aluno[] alunos = new Aluno[100000];
	private int totalDeAlunos;
	public void adiciona(Aluno aluno) {
		for (int i = 0; i < this.alunos.length; i++) {
			if (this.alunos[i] == null) {
			this.alunos[i] = aluno;
			break;
			}
		}
	}
	public void adiciona(int posicao, Aluno aluno) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao inválida");
			}
			for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
			this.alunos[i + 1] = this.alunos[i];
			}
			this.alunos[posicao] = aluno;
			this.totalDeAlunos++;
			}
			private boolean posicaoValida(int posicao) {
			return posicao >= 0 && posicao <= this.totalDeAlunos;
			}
	public Aluno pega(int posicao) {
		return this.alunos[posicao];
	}
	public void remove(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posicao inválida");
			}
			for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
			this.alunos[i] = this.alunos[i + 1];
			}
			this.totalDeAlunos--;
	}
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.alunos.length; i++) {
			if (aluno == this.alunos[i]) {
			return true;}
			}
		return false;
	}
	public int tamanho() {
		return this.totalDeAlunos;
		}
}
