package ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.creator;

import ca.com.rlsp._01creationPatterns.factoryMethod._01SandwichFactory.product.Sandwich;

/**
 * A classe CREATOR declara o método fábrica que retorna novos objetos produto.
 * É importante que o tipo de retorno desse método corresponda à interface do produto.
 *
 * Você pode declarar o método fábrica como abstrato para forçar todas as subclasses a implementar suas próprias
 * versões do método. Como alternativa, o método fábrica base pode retornar algum tipo de produto padrão.
 *
 * Observe que, apesar do nome, a criação de produtos não é a principal responsabilidade do criador.
 * Normalmente, a classe criadora já possui alguma lógica de negócio relacionada aos produtos.
 * O método fábrica ajuda a dissociar essa lógica das classes concretas de produtos. Aqui está uma analogia:
 *     uma grande empresa de desenvolvimento de software pode ter um departamento de treinamento para programadores.
 * No entanto, a principal função da empresa na totalidade ainda é escrever código, não produzir programadores.
 */
public abstract  class SandwichCreatorFactory {

    public abstract Sandwich createSandwich(String type);
}
