/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegrasDeDesconto;

import br.ufes.model.CarrinhoDeCompra;

/**
 *
 * @author Lucas
 */
public interface IDescontosStrategy {
    public double calcula(CarrinhoDeCompra carrinhoDeCompra);
}