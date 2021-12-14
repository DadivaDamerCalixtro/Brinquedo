/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class AcionaBotao {
    public static void main(String [] args){
            Aviao aviao = new Aviao();
            ControleRemoto c = new ControleRemoto(aviao);
            aviao.mover();
    }
}
