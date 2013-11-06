/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adelaide.cruise;
import java.sql.*;

/**
 *
 * @author Pascoal Gomes, Anoop Mishra, Sonali Tharwani, Nghia Hoai
 */
public class AdelaideDB 
{
    Connection con;
    Statement st;
    ResultSet rs;
    String cid;
    public AdelaideDB()
    {
        general();
    }
    /**
     * This method connects to the database anoop12
     */
    public void general()
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:anoop123");
            st=con.createStatement();
        }
        catch(Exception ee)
        {
            System.out.println("In general method, there is an exception : "  +  ee);
        }
    }
    /**
     * This method is used to insert values retrieved from the Cruise class into the cruise table. 
     * @param cruise The object of the CruiseForm class to call methods of that class.
     */
    public void insertCruise(CruiseForm cruise)
    {
        try
        {
            String s="insert into cruise(c_id,c_name,s_date,r_date,dept_port,end_port,cost) values (?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(s);
            ps.setString(1,cruise.getID());
            ps.setString(2,cruise.getName());
            ps.setString(3,cruise.getDate());
            ps.setString(4,cruise.getrDate());
            ps.setString(5,cruise.getDPort());
            ps.setString(6,cruise.getEPort());
            ps.setString(7,cruise.getCost());
            ps.executeUpdate();
           
            
            
        }
        catch(Exception ee)
        {
            System.out.println("Exception in insertCruise method : " +ee);
        }
    }   
    /**
     * this method is used to display the values retrieved from the database through the Cruise class.
     * @param cruise The object of the CruiseForm class to call methods of that class.
     */
    public void displayCruise(CruiseForm cruise)
    {
     try
     {
         
         cid=cruise.getID();
         String s="select * from cruise where c_id = "+cid;
         rs = st.executeQuery(s);
         
             while (rs.next()) {
             cruise.setName(rs.getString("c_name"));
             cruise.setDate(rs.getString("s_date"));
             cruise.setrDate(rs.getString("r_date"));
             cruise.setDPort(rs.getString("dept_port"));
             cruise.setEPort(rs.getString("end_port"));
             cruise.setCost(rs.getString("cost"));
             
          }
         
     }
     catch(Exception ee)
        {
            System.out.println("Exception in displayCruise method : " +ee);
        }
     
    }
    
     /**
     * This method is used to insert values retrieved from the Sailor class into the sailor table. 
     * @param sailor The object of the SailorForm class to call methods of that class.
     */
    public void insertSailor(SailorForm sailor)
    {
        try
        {
            String s="insert into sailor(c_id,s_id,s_name,dob,nation,s_visor,super_name) values (?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(s);
            ps.setString(1,sailor.getCID());
            ps.setString(2,sailor.getID());
            ps.setString(3,sailor.getName());
            ps.setString(4,sailor.getDOB());
            ps.setString(5,sailor.getNation());
            ps.setString(6,sailor.getSupervisor());
            ps.setString(7,sailor.getSuperName());
            ps.executeUpdate();
        }
        catch(Exception ee)
        {
            System.out.println("Exception in insertSailor method : " +ee);
        }
    }
    /**
     * this method is used to display the values retrieved from the database through the Sailor class.
     * @param sailor The object of the SailorForm class to call methods of that class.
     */
      public void displaySailor(SailorForm sailor)
    {
     try
     {
         
         String said=sailor.getID();
         String s="select * from sailor where s_id = "+said;
         rs = st.executeQuery(s);
         
             while (rs.next()) {
             sailor.setName(rs.getString("s_name"));
             sailor.setDOB(rs.getString("dob"));
             sailor.setNation(rs.getString("nation"));
             sailor.setSupervisor(rs.getString("s_visor"));
             sailor.setSuperName(rs.getString("super_name"));
             
             
          }
         
     }
     catch(Exception ee)
        {
            System.out.println("Exception in displaySailor method : " +ee);
        }
     
    } 
     
   /**
     * This method is used to insert values retrieved from the Port class into the port table. 
     * @param port The object of the PortForm class to call methods of that class.
     */
      public void insertPort(PortForm port)
    {
        try
        {
            String s="insert into port(c_id,p_name,country,pop,p_req,d_fee) values (?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(s);
            ps.setString(1,port.getCID());
            ps.setString(2,port.getName());
            ps.setString(3,port.getCountry());
            ps.setString(4,port.getPop());
            ps.setString(5,port.getPReq());
            ps.setString(6,port.getDFee());
            
            ps.executeUpdate();
        }
        catch(Exception ee)
        {
            System.out.println("Exception in insertPort method : " +ee);
        }
    }
      /**
     * this method is used to display the values retrieved from the database through the Port class.
     * @param port The object of the PortForm class to call methods of that class.
     */ 
      
       public void displayPort(PortForm port)
    {
     try
     {
         
         String pn=port.getName();
         String s="select * from port where p_name = "+pn;
         rs = st.executeQuery(s);
         
             while (rs.next()) {
             port.setCountry(rs.getString("p_country"));
             port.setPop(rs.getString("pop"));
             port.setPReq(rs.getString("p_req"));
             port.setDFee(rs.getString("d_fee"));
             
             
             
          }
         
     }
     catch(Exception ee)
        {
            System.out.println("Exception in displayPort method : " +ee);
        }
     
    } 
       
       
       
      /**
     * This method is used to insert values retrieved from the Passenger class into the passenger table. 
     * @param pass The object of the PassengerForm class to call methods of that class.
     */
      
      public void insertPassenger(PassengerForm pass)
    {
        try
        {
            String s="insert into passenger(c_id,p_id,p_name,add,nation,dob,c_sailed) values (?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(s);
            
            ps.setString(1,pass.getCID());
            ps.setString(2,pass.getID());
            ps.setString(3,pass.getName());
            ps.setString(4,pass.getAdd());
            ps.setString(5,pass.getNation());
            ps.setString(6,pass.getDOB());
            ps.setString(7,pass.getSailed());
            ps.executeUpdate();
        }
        catch(Exception ee)
        {
            System.out.println("Exception in insertPassenger method : " +ee);
        }
    }
      /**
     * this method is used to display the values retrieved from the database through the Passenger class.
     * @param passenger The object of the PortForm class to call methods of that class.
     */ 
       public void displayPassenger(PassengerForm passenger)
    {
     try
     {
         
         String pid=passenger.getID();
         String s="select * from passenger where p_id = "+pid;
         rs = st.executeQuery(s);
         
             while (rs.next()) {
             passenger.setName(rs.getString("p_name"));
             passenger.setAdd(rs.getString("add"));
             passenger.setNation(rs.getString("nation"));
             passenger.setDOB(rs.getString("dob"));
             passenger.setSailed(rs.getString("c_sailed"));
             
             
          }
         
     }
     catch(Exception ee)
        {
            System.out.println("Exception in displayPassenger method : " +ee);
        }
     
    } 
      
     /**
     * This method is used to insert values retrieved from the Ship class into the ship table. 
     * @param ship The object of the ShipForm class to call methods of that class.
     */ 
    
      
    public void insertShip(ShipForm ship)
    {
        try
        {
            String s="insert into ship(c_id,s_id,s_name,s_weight,year_built,p_capacity) values (?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(s);
            ps.setString(1,ship.getCID());
            ps.setString(2, ship.getID());
            ps.setString(3,ship.getName());
            ps.setString(4,ship.getWeight());
            ps.setString(5,ship.getYear());
            ps.setString(6,ship.getCapacity());
           
            ps.executeUpdate();
        }
        catch(Exception ee)
        {
            System.out.println("Exception in insertShip method : " +ee);
        }
    }
    
/**
     * this method is used to display the values retrieved from the database through the Ship class.
     * @param ship The object of the ShipForm class to call methods of that class.
     */     
       public void displayShip(ShipForm ship)
    {
     try
     {
         
         String sid=ship.getID();
         String s="select * from ship where s_id = "+sid;
         rs = st.executeQuery(s);
         
             while (rs.next()) {
             ship.setName(rs.getString("s_name"));
             ship.setWeight(rs.getString("s_weight"));
             ship.setYear(rs.getString("year_built"));
             ship.setCapacity(rs.getString("p_capacity"));
             
             
          }
         
     }
     catch(Exception ee)
        {
            System.out.println("Exception in displayShip method : " +ee);
        }
     
    } 
   
      public void revenue(PassengerForm passenger, RevenueForm rev, CruiseForm cruise)
    {
     try
     {
         
         String crid=passenger.getCID();
         String s="select p_id from passenger where c_id = '"+crid+ "'";
         rs = st.executeQuery(s);
         int count=0;
         while (rs.next()) 
         {
           ++count;
               // Get data from the current row and use it
         }
         String scount=""+count;
         rev.setCount(scount); 
         
         String cost=cruise.getCost();
         int icost = Integer.parseInt("cost");
         int total=icost*count;
         
         String stotal=""+total;
         rev.setTotal(stotal);
         
         
     }
     catch(Exception ee)
        {
            System.out.println("Exception in displayCruise method : " +ee);
        }
     
    }  
      
      
      
      
       
       
}