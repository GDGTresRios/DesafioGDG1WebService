/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource.dao;

import br.com.gdgtresrios.sicomerciows.resource.models.Configuracao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wanderlei
 */
public class ConfiguracaoDAO {
    
    private static final String SQL_SELECT_ALL = "SELECT id, nome, descricao, logo, mapa, endereco, telefone, versao FROM gdg_centrosul.configuracao";
    
    public List<Configuracao> getAll(){
        
        List<Configuracao> configuracoes = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            
            pstm = conn.prepareStatement(SQL_SELECT_ALL);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                Configuracao c = new Configuracao();
                
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setDescricao(rs.getString("descricao"));
                c.setLogo(rs.getString("logo"));
                c.setMapa(rs.getString("mapa"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                c.setVersao(rs.getString("versao"));
                
                configuracoes.add(c);
            }
            
        }catch(SQLException ex){
            
        } finally{
            ConnectionFactory.close(conn, pstm, rs);
        }
        
        return configuracoes;
    }
    
}
