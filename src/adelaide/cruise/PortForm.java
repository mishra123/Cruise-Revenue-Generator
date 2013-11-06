/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaide.cruise;

/**
 * this class gets the values from the GUI and sets those values into the database.
 * @author Pascoal Gomes
 */
public class PortForm
{
    private String c_id;
    private String p_name;
    private String country;
    private String pop;
    private String p_req;
    private String d_fee;
    public void setCID(String c_id)
    {
        this.c_id=c_id;
    }
    public String getCID()
    {
        return c_id;
    }
    public void setName(String p_name)
    {
        this.p_name=p_name;
    }
    public String getName()
    {
        return p_name;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getCountry()
    {
        return country;
    }
    public void setPop(String pop)
    {
        this.pop=pop;
    }
    public String getPop()
    {
        return pop;
    }
    public void setPReq(String p_req)
    {
        this.p_req=p_req;
    }
    public String getPReq()
    {
        return p_req;
    }
    public void setDFee(String d_fee)
    {
        this.d_fee=d_fee;
    }
    public String getDFee()
    {
        return d_fee;
    } 
    
    
}
