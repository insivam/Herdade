package Heranca;

public class TestaTodos {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguiça preguiça = new Preguiça();
		
		cachorro.setNome("Hachiko");
		cachorro.setIdade(11);
		cachorro.setSom("Au-au");
		cachorro.setHabilidade("Correr");
		
		cavalo.setNome("Bucéfalo");
		cavalo.setIdade(9);
		cavalo.setSom("hinn in in");
		cavalo.setHabilidade("Correr");
		
		preguiça.setNome("Buttercup");
		preguiça.setIdade(27);
		preguiça.setSom("ahh-iiii");
		preguiça.setHabilidade("Subir em árvores");
		
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
		System.out.println("\nPreguiça");
		System.out.println("Nome: " + preguiça.getNome());
		System.out.println("Idade: " + preguiça.getIdade());
		System.out.println("Som: " +preguiça.getSom());
		System.out.println("Habilidade: " + preguiça.getHabilidade());
	}
}
