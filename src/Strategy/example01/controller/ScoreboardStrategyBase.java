package Strategy.example01.controller;

/**
 * Classes abstratas
 * Pode-se dizer que as classes abstratas servem como “modelo” para outras classes que dela herdem, não podendo ser instanciada por si só. Para ter um objeto de uma classe abstrata é necessário criar uma classe mais especializada herdando dela e então instanciar essa nova classe. Os métodos da classe abstrata devem então serem sobrescritos nas classes filhas.
 * 
 * Por exemplo, é definido que a classe “Animal” seja herdada pelas subclasses “Gato”, “Cachorro”, “Cavalo”, mas ela mesma nunca pode ser instanciada.
 * @author rlatorraca
 *
 */
public abstract class ScoreboardStrategyBase {

	public abstract int calculateScore(int taps, int multiplier);
	public abstract String printNameUser(String firstName, String lastName);
}
