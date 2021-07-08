
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class P_TYPE {

    private int id;
    private String name;
    private String description;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
    public P_TYPE(){}
    
    public P_TYPE(Integer id,String name,String description){
        this.id =id;
        this.name =name;
        this.description=description;
    
    
    }
    
    public boolean execTypeQuery(String queryType, P_TYPE type){
        PreparedStatement ps;
        
        if(queryType.equals("add")){
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement("INSERT INTO `Property_Type`( `name`, `description`) VALUES (?,?)");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                
                return(ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        else if(queryType.equals("edit")){
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement("UPDATE `Property_Type` SET `name`=?,`description`=? WHERE id =?");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                ps.setInt(3, type.getId());
                
                return(ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        else if(queryType.equals("remove")){
            try {
                
                ps = THE_CONNECTION.getTheConnection().prepareStatement("DELETE FROM `Property_Type` WHERE `id`=?");
                ps.setInt(1, type.getId());
                
                return(ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Enter correct query(add,edit,remove)", "Invalid Operation", 2);
            return false;
        }
      
    }
    
    public HashMap<String,Integer> getTypesMap(){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        Statement st;
        ResultSet rs;
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM property_type");
            
            P_TYPE type;
            while(rs.next()){
                type = new P_TYPE(rs.getInt(1),rs.getString(2),rs.getString(3));
                map.put(type.getName(), type.getId());
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return map;
        
    }
    
    public P_TYPE getTypeById(Integer id){
         
        PreparedStatement ps;
        ResultSet rs;
        P_TYPE type = new P_TYPE();
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement("SELECT*FROM property_type WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
           
            
            if(rs.next()){
                type.setId(id);
                type.setName(rs.getString(2));
                type.setDescription(rs.getString(3));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(P_TYPE.class.getName()).log(Level.SEVERE, null, ex);
        }  
            return type;
    }
    
    
}
