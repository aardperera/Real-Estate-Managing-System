
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class P_PROPERTY {

    private int id;
    private int type;
    private int squareFeet;
    private int ownerId;
    private String price;
    private String address;
    private int bedrooms;
    private int bathrooms;
    private int age;
    private boolean balcony;
    private boolean pool;
    private boolean backyard;
    private boolean garage;
    private String description;

    public P_PROPERTY() {
    }

    public P_PROPERTY(int id, int type, int squareFeet, int ownerId, String price, String address, int bedrooms, int bathrooms, int age,
            boolean balcony, boolean pool, boolean backyard, boolean garage, String description) {

        this.id = id;
        this.type = type;
        this.squareFeet = squareFeet;
        this.ownerId = ownerId;
        this.price = price;
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.age = age;
        this.balcony = balcony;
        this.backyard = backyard;
        this.pool = pool;
        this.garage = garage;
        this.description = description;


    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the squareFeet
     */
    public int getSquareFeet() {
        return squareFeet;
    }

    /**
     * @param squareFeet the squareFeet to set
     */
    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    /**
     * @return the ownerId
     */
    public int getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId the ownerId to set
     */
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the bedrooms
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     * @param bedrooms the bedrooms to set
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * @return the bathrooms
     */
    public int getBathrooms() {
        return bathrooms;
    }

    /**
     * @param bathrooms the bathrooms to set
     */
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the balcony
     */
    public boolean isBalcony() {
        return balcony;
    }

    /**
     * @param balcone the balcony to set
     */
    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    /**
     * @return the pool
     */
    public boolean isPool() {
        return pool;
    }

    /**
     * @param pool the pool to set
     */
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    /**
     * @return the backyard
     */
    public boolean isBackyard() {
        return backyard;
    }

    /**
     * @param backyard the backyard to set
     */
    public void setBackyard(boolean backyard) {
        this.backyard = backyard;
    }

    /**
     * @return the garage
     */
    public boolean isGarage() {
        return garage;
    }

    /**
     * @param garage the garage to set
     */
    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean addNewProperty(P_PROPERTY property) {
        PreparedStatement ps;

        String addQuery = "INSERT INTO `The_property`(`type`, `square_feet`, `ownerId`, `price`, `address`, `bedrooms`, `bathrooms`, `age`, `balcony`, `pool`, `backyard`, `garage`, `description`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1, property.getType());
            ps.setInt(2, property.getSquareFeet());
            ps.setInt(3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString(5, property.getAddress());
            ps.setInt(6, property.getBedrooms());
            ps.setInt(7, property.getBathrooms());
            ps.setInt(8, property.getAge());
            ps.setBoolean(9, property.isBalcony());
            ps.setBoolean(10, property.isPool());
            ps.setBoolean(11, property.isBackyard());
            ps.setBoolean(12, property.isGarage());
            ps.setString(13, property.getDescription());

            return (ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }




    }

    public boolean editProperty(P_PROPERTY property) {
        PreparedStatement ps;

        String editQuery = "UPDATE `the_property` SET `type`=?,`square_feet`=?,`ownerId`=?,`price`=?,`address`=?,`bedrooms`=?,`bathrooms`=?,`age`=?,`balcony`=?,`pool`=?,`backyard`=?,`garage`=?,`description`=? WHERE `Id`=?";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1, property.getType());
            ps.setInt(2, property.getSquareFeet());
            ps.setInt(3, property.getOwnerId());
            ps.setString(4, property.getPrice());
            ps.setString(5, property.getAddress());
            ps.setInt(6, property.getBedrooms());
            ps.setInt(7, property.getBathrooms());
            ps.setInt(8, property.getAge());
            ps.setBoolean(9, property.isBalcony());
            ps.setBoolean(10, property.isPool());
            ps.setBoolean(11, property.isBackyard());
            ps.setBoolean(12, property.isGarage());
            ps.setString(13, property.getDescription());
            ps.setInt(14, property.getId());

            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {

            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }


    }

    public boolean removeProperty(int propertyId) {
        PreparedStatement ps;

        String removeQuery = "DELETE FROM `the_property` WHERE `Id`=?";

        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(removeQuery);

            ps.setInt(1, propertyId);
            return (ps.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

    }

    public P_PROPERTY findProperty(int propertyId) {

        P_PROPERTY property = null;
        PreparedStatement ps;
        ResultSet rs;

        String searchQuery = "SELECT * FROM `The_property` WHERE `Id`=?";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(searchQuery);
            ps.setInt(1, propertyId);

            rs = ps.executeQuery();

            if (rs.next()) {
                property = new P_PROPERTY(rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerId"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("age"),
                        rs.getBoolean("balcony"),
                        rs.getBoolean("pool"),
                        rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getString("description"));

            }
            return property;
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }

        return property;
        
    }

    public ArrayList<P_PROPERTY> propertiesList() {
        ArrayList<P_PROPERTY> list = new ArrayList<P_PROPERTY>();

        Statement st;
        ResultSet rs;

        String selectQuery = "SELECT * FROM the_property";
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);

            P_PROPERTY property;
            while (rs.next()) {
                property = new P_PROPERTY(rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerId"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("age"),
                        rs.getBoolean("balcony"),
                        rs.getBoolean("pool"),
                        rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getString("description"));

                list.add(property);

            }

        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }


        return list;
    }

    public ArrayList<P_PROPERTY> propertiesListByType(int TypeId) {
        ArrayList<P_PROPERTY> list = new ArrayList<P_PROPERTY>();

        PreparedStatement ps;
        ResultSet rs;

        String selectQuery = "SELECT * FROM the_property WHERE type = ?";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
            ps.setInt(1, TypeId);
            rs = ps.executeQuery();

            P_PROPERTY property;
            while (rs.next()) {
                property = new P_PROPERTY(rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerId"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("age"),
                        rs.getBoolean("balcony"),
                        rs.getBoolean("pool"),
                        rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getString("description"));

                list.add(property);

            }

        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }


        return list;
    }

    public ArrayList<P_PROPERTY> propertiesListByOwner(int ownerId) {
        ArrayList<P_PROPERTY> list = new ArrayList<P_PROPERTY>();

        PreparedStatement ps;
        ResultSet rs;

        String selectQuery = "SELECT * FROM the_property WHERE ownerId = ?";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
            ps.setInt(1, ownerId);
            rs = ps.executeQuery();

            P_PROPERTY property;
            while (rs.next()) {
                property = new P_PROPERTY(rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerId"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("age"),
                        rs.getBoolean("balcony"),
                        rs.getBoolean("pool"),
                        rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getString("description"));

                list.add(property);

            }

        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }


        return list;
    }

    public boolean addImage(int propertyId, String the_image_path) {
        PreparedStatement ps;

        String addQuery = "INSERT INTO `property_images`( `property_id`, `the_image`) VALUES (?,?)";
        try {
            try {
                FileInputStream propertyImage = new FileInputStream(new File(the_image_path));

                ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
                ps.setInt(1, propertyId);
                ps.setBinaryStream(2, propertyImage);


                return (ps.executeUpdate() > 0);
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,ex.getMessage()+ "Invalid File", "Image Error", 2);
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
 }
     public HashMap<byte[],Integer> propertyImagesList(int propertyId) {
         
        HashMap<byte[],Integer> list = new HashMap<byte[],Integer>();

        PreparedStatement ps;
        ResultSet rs;

        String selectQuery = "SELECT * FROM property_images WHERE property_id = ?";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
            ps.setInt(1, propertyId);
            rs = ps.executeQuery();

         
            while (rs.next()) {
                
                list.put(rs.getBytes("the_image"),rs.getInt("Id"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }


        return list;
    }
     public byte[] getImageById(int imageId) {
       
        PreparedStatement ps;
        ResultSet rs;

        String selectQuery = "SELECT the_image FROM property_images WHERE Id = ?";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
            ps.setInt(1, imageId);
            rs = ps.executeQuery();

         
           if(rs.next()) {
                
                return rs.getBytes("the_image");
            }else{
               return null;
           }

        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }


        
    }
     public boolean removePropertyImage(int imageId) {
       
        PreparedStatement ps;
        ResultSet rs;

        String deleteQuery = "DELETE FROM property_images WHERE Id = ?";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            ps.setInt(1, imageId);
            
            return(ps.executeUpdate()>0);
  
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
