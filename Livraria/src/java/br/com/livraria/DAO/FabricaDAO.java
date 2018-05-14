/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livraria.DAO;

import br.livraria.util.ConexaoPostgres;

/**
 *
 * @author Helio Kinoshita
 */
public class FabricaDAO {
    
        public static IDAO getLivroDAO() {

        // A lógica de verificação de SGBD não é adequada.
        // Trata-se apenas de um exemplo.
        try {
            ConexaoPostgres.getConexao().close();
            return new LivroDAO();
        } catch (Exception e) {
            return null; 
        }

    }
}
