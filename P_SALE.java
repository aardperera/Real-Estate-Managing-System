
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class P_SALE {

    private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;

    public P_SALE(){ }
    
    public P_SALE(int ID, int PROPERTY_ID, int CLIENT_ID, String FINAL_PRICE, String SELLING_DATE ){
        this.id = ID;
        this.propertyId = PROPERTY_ID;
        this.clientId = CLIENT_ID;
        this.finalPrice = FINAL_PRICE;
        this.sellingDate = SELLING_DATE;
        
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
     * @return the propertyId
     */
    public int getPropertyId() {
        return propertyId;
    }

    /**
     * @param propertyId the propertyId to set
     */
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * @return the clientId
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    /**
     * @return the finalPrice
     */
    public String getFinalPrice() {
        return finalPrice;
    }

    /**
     * @param finalPrice the finalPrice to set
     */
    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    /**
     * @return the sellingDate
     */
    public String getSellingDate() {
        return sellingDate;
    }

    /**
     * @param sellingDate the sellingDate to set
     */
    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    
    public boolean addNewSale(P_SALE sale){
        
        PreparedStatement ps;
    
        String addQuery = "INSERT INTO `sale`( `property_id`, `client_id`, `final_price`, `sale_date`) VALUES (?,?,?,?)";
      
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
        
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
           
        
            return (ps.executeUpdate()>0);
        
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
       
            return false;
        }
    }
public boolean editSale(P_SALE sale){
    
     PreparedStatement ps;
    
        String editQuery = "UPDATE `sale` SET `property_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id` = ?";
      
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
        
            ps.setInt(1, sale.getPropertyId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate()); 
            ps.setInt(5, sale.getId());
            return (ps.executeUpdate()>0);
        
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
       
            return false;
        }
    
}
    public boolean deleteSale(int saleId){
     PreparedStatement ps;
    
        String removeQuery = "DELETE FROM `sale` WHERE `Id`=?";
      
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(removeQuery);
        
            ps.setInt(1, saleId);
            return (ps.executeUpdate()>0);
        
        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
       
            return false;
        }
       
    }
    
     public ArrayList<P_SALE> salesList(){

        ArrayList<P_SALE> list = new ArrayList<P_SALE>();

        Statement st;
        ResultSet rs;

        String selectQuery = "SELECT * FROM sale";
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            P_SALE sale;
            while(rs.next()){
                sale = new P_SALE(rs.getInt(1),
                                    rs.getInt(2),
                                    rs.getInt(3),
                                    rs.getString(4),
                                    rs.getString(5));
                list.add(sale);
            
            }

        } catch (SQLException ex) {
            Logger.getLogger(P_SALE.class.getName()).log(Level.SEVERE, null, ex);
        }


        return list;
    }
  
    
}
