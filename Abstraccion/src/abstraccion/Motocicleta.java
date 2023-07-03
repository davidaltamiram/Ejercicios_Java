package abstraccion;

public class Motocicleta extends veiculo {
	//26/junio/2023
	
	//Las anotaciones @son "Indicaciones " que le damos a JAva
	@Override
	public void acelerar() {
		System.out.println("La motocicleta está acelerando... ");
		
	}
	
	//La subclase es quien decline cuando y como se sobre escribe el metodo abstracto. ES decir la subclase implementa el metodo	
	
	@Override
	public void frenar() {
		System.out.println("La motocicleta está frenando...");
	}

}
