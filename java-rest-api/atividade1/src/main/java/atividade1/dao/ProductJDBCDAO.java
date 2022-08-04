package atividade1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import atividade1.entities.Product;

public class ProductJDBCDAO implements ProductDAO {

    @Override
    public void save(Product entity) {
        Connection con = null;
        try {
            con = ConnectionFactory.getConnection();
            String insert_sql = "insert into products (name, address, terrain, construction, rooms, bathrooms, garage, price) values (?, ?, ?, ?, ?, ?, ?, ?)";
            String update_sql = "update products set name = ?, address = ?, terrain = ?, construction = ?, rooms = ?, bathrooms = ?, garage = ?, price = ? where id = ?";
            PreparedStatement pst;
            if (entity.getId() == 0) {
                pst = con.prepareStatement(insert_sql);
            } else {
                pst = con.prepareStatement(update_sql);
                pst.setInt(9, entity.getId());
            }
			pst.setString(1, entity.getName());
			pst.setString(2, entity.getAddress());
			pst.setDouble(3, entity.getTerrain());
			pst.setDouble(4, entity.getConstruction());
			pst.setInt(5, entity.getRooms());
			pst.setInt(6, entity.getBathrooms());
			pst.setInt(7, entity.getGarage());
			pst.setDouble(8, entity.getPrice());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        Connection con = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "delete from products where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Product find(int id) {
        Connection con = null;
        Product p = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "select * from products where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                p = map(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return p;
    }
 
    @Override
    public List<Product> findAll() {
        Connection con = null;
        List<Product> result = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "select * from products";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            result = new ArrayList<Product>();
            while (rs.next()) {
                Product cl = map(rs);
                result.add(cl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
 
    @Override
    public Product findByName(String str) {
        Connection con = null;
        Product p = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "select * from products where name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, str);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                p = map(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return p;
    }
 
    @Override
    public List<Product> findAllByName(String str) {
        Connection con = null;
        List<Product> result = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "select * from products where name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, str);
            ResultSet rs = pst.executeQuery();
            result = new ArrayList<Product>();
            while (rs.next()) {
                Product cl = map(rs);
                result.add(cl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
 
    private Product map(ResultSet rs) throws SQLException {
        Product p = new Product();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        p.setTerrain(rs.getDouble("terrain"));
        p.setConstruction(rs.getDouble("construction"));
        p.setRooms(rs.getInt("rooms"));
        p.setBathrooms(rs.getInt("bathrooms"));
        p.setGarage(rs.getInt("garage"));
        p.setPrice(rs.getDouble("price"));
        return p;
    }

}
