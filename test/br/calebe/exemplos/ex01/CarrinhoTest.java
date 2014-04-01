package br.calebe.exemplos.ex01;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class CarrinhoTest {

    private Carrinho carrinho;

    @Before
    public void criandoCarrinho() {
        carrinho = new Carrinho();
    }

    @Test(expected = CarrinhoVazioExpected.class)
    public void colocandoZeroProduto() throws CarrinhoVazioExpected {
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{null}, new Object[]{menor});
    }

    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Livro livro = new Livro("Java em 24 horas", 50.00, "José");
        carrinho.add(livro);
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{livro}, new Object[]{menor});
    }

    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        Livro livro = new Livro("Java em 24 horas", 50.00, "José");
        carrinho.add(livro);
        Caneta bic = new Caneta("bic azul", 1.50, "Azul");
        carrinho.add(bic);
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{bic}, new Object[]{menor});
    }

    @Test
    public void identidadeDeProdutos() throws CarrinhoVazioExpected {
        Produto original = new Produto("Java em 24 horas", 50.00);
        carrinho.add(original);
        Produto copia = new Produto("Java em 24 horas", 50.00);
        original = carrinho.menorProduto();
        assertArrayEquals(new Object[]{original}, new Object[]{copia});
    }
}
