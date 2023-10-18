/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.Jogo;

public class JogoDAO {

    public void insert(Jogo j) {
        String sql = "INSERT INTO jogos (nome, ano, imagem, desenvolvedor, genero) VALUES(?, ?, ?, ?, ?)";

        Connection c = null;
        PreparedStatement pstm = null;

        try {
            c = ConnectionFactory.criarConexao();
            pstm = c.prepareStatement(sql);

            pstm.setString(1, j.getNome());
            pstm.setInt(2, j.getAno());
            pstm.setBytes(3, j.getImagem());
            pstm.setString(4, j.getDesenvolvedor());
     
            pstm.setString(5, j.getGenero());

            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!"+e);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (c != null) {
                    c.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "MDFNBBDJF :/");
            }
        }
    }
}
