/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Conexao;
import models.UserModel;

public class DaoUser {

    
    public List<UserModel> getAllUsers() throws ClassNotFoundException {
        Connection con = null;
        Conexao conexao = new Conexao();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from users";
        List<UserModel> lista = new ArrayList<>();
        try {
            con = conexao.conexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UserModel userModel = new UserModel();
                userModel.setIdUser(rs.getInt("id_user"));
                userModel.setUserName(rs.getString("user_name"));
                userModel.setUserEmail(rs.getString("user_email"));
                userModel.setCretedAt(rs.getTimestamp("created_at"));
                userModel.setUpdatedAt(rs.getTimestamp("updated_at"));
                userModel.setDeletedAt(rs.getTimestamp("deleted_at"));
                lista.add(userModel);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexao.desligarConexao(con);
        }
        return lista;
    }

}
