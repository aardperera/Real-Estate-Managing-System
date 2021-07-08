
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_OWNER {
   private int id;
   private String firstName;
   private String lastName;
   private String phone;
   private String email;
   private String address;

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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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

    public P_OWNER(){}
    
    public P_OWNER(int id,String firstName,String lastName,String phone,String email,String address){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    public boolean addNewOwner(P_OWNER owner){
        
        PreparedStatement ps;
    
        String addQuery = "INSERT INTO `property_owner`( `fname`, `lname`, `Phone`, `Email`, `Address`) VALUES (?,?,?,?,?)";
      
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
        
            ps.setString(1, owner.getFirstName());
            ps.setString(2, owner.getLastName());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
        
            return (ps.executeUpdate()>0);
        
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
       
            return false;
        }
    }
public boolean editOwnerData(P_OWNER owner){
    
     PreparedStatement ps;
    
        String editQuery = "UPDATE `property_owner` SET `fname`=?,`lname`=?,`Phone`=?,`Email`=?,`Address`=? WHERE `Id`=?";
      
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
        
            ps.setString(1, owner.getFirstName());
            ps.setString(2, owner.getLastName());
            ps.setString(3, owner.getPhone());
            ps.setString(4, owner.getEmail());
            ps.setString(5, owner.getAddress());
            ps.setInt(6, owner.getId());
            return (ps.executeUpdate()>0);
        
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
       
            return false;
        }
    
}
    public boolean deleteOwnerData(int ownerId){
     PreparedStatement ps;
    
        String removeQuery = "DELETE FROM `property_owner` WHERE `Id`=?";
      
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(removeQuery);
        
            ps.setInt(1, ownerId);
            return (ps.executeUpdate()>0);
        
        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
       
            return false;
        }
       
    }
    
    public ArrayList<P_OWNER> ownerList(){

        ArrayList<P_OWNER> list = new ArrayList<P_OWNER>();

        Statement st;
        ResultSet rs;

        String selectQuery = "SELECT * FROM property_owner";
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            P_OWNER owner;
            while(rs.next()){
                owner = new P_OWNER(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6));
                list.add(owner);
            
            }

        } catch (SQLException ex) {
            Logger.getLogger(P_OWNER.class.getName()).log(Level.SEVERE, null, ex);
        }


        return list;
    }
  
}
