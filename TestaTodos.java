package Heranca;

public class TestaTodos {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a pregui�a = new Pregui�a();
		
		cachorro.setNome("Hachiko");
		cachorro.setIdade(11);
		cachorro.setSom("Au-au");
		cachorro.setHabilidade("Correr");
		
		cavalo.setNome("Buc�falo");
		cavalo.setIdade(9);
		cavalo.setSom("hinn in in");
		cavalo.setHabilidade("Correr");
		
		pregui�a.setNome("Buttercup");
		pregui�a.setIdade(27);
		pregui�a.setSom("ahh-iiii");
		pregui�a.setHabilidade("Subir em �rvores");
		
		System.out.println("Cachorro");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		System.out.println("Som: " +cachorro.getSom());
		System.out.println("Habilidade: " + cachorro.getHabilidade());
		System.out.println("\nCavalo");
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		System.out.println("Som: " +cavalo.getSom());
		System.out.println("Habilidade: " + cavalo.getHabilidade());
		System.out.println("\nPregui�a");
		System.out.println("Nome: " + pregui�a.getNome());
		System.out.println("Idade: " + pregui�a.getIdade());
		System.out.println("Som: " +pregui�a.getSom());
		System.out.println("Habilidade: " + pregui�a.getHabilidade());
	}
}
