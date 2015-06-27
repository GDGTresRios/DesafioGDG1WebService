/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource.dao;

import br.com.gdgtresrios.sicomerciows.resource.models.CategoriaEvento;
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
public class CategoriaEventoDAO {

    private static final String SQL_SELECT_ALL = "SELECT id, nome FROM gdg_centrosul.categorias_eventos";
    private static final String SQL_SELECT_BY_ID = "SELECT id, nome FROM gdg_centrosul.categorias_eventos WHERE id = ?";
    private static final String SQL_SELECT_BY_NOME = "SELECT id, nome FROM gdg_centrosul.categorias_eventos WHERE nome like ?";

    public CategoriaEvento getCategoriasEventosByID(int id) {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        CategoriaEvento categoriasEventos = new CategoriaEvento();
        try {
            
            pstm = conn.prepareStatement(SQL_SELECT_BY_ID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                categoriasEventos.setId(rs.getInt("id"));
                categoriasEventos.setNome(rs.getString("nome"));
            }
            
        } catch (SQLException ex) {
        } finally {
            ConnectionFactory.close(conn, pstm, rs);
        }
        
        return categoriasEventos;
        
    }
    
    public List<CategoriaEvento> getAll(){
        
        List<CategoriaEvento> categoriasEventos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            pstm = conn.prepareStatement(SQL_SELECT_ALL);
            rs = pstm.executeQuery();
            
            while (rs.next()){
                
                CategoriaEvento ct = new CategoriaEvento();
                ct.setId(rs.getInt("id"));
                ct.setNome(rs.getString("nome"));
                
                categoriasEventos.add(ct);
            }
        }catch (SQLException ex){
            
        } finally {
          ConnectionFactory.close(conn, pstm, rs);  
        }
        
        return categoriasEventos;
    }
    
    public List<CategoriaEvento> getCategoriasEventosByNome(String nome) {
        
        List<CategoriaEvento> categoriasEventos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            pstm = conn.prepareStatement(SQL_SELECT_BY_NOME);
            pstm.setString(1, nome + "%");
            rs = pstm.executeQuery();
            
            while (rs.next()){
                
                CategoriaEvento ct = new CategoriaEvento();
                ct.setId(rs.getInt("id"));
                ct.setNome(rs.getString("nome"));
                
                categoriasEventos.add(ct);                
            }
                   
        }catch (SQLException ex){
            
        }finally {
            ConnectionFactory.close(conn, pstm, rs);
        }
        
        return categoriasEventos;
    }

}
