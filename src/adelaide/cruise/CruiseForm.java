/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaide.cruise;

/**
 * this class gets the values from the GUI and sets those values into the database.
 * @author Pascoal Gomes
 */
public class CruiseForm 
{
    private String c_id;
    private String c_name;
    private String s_date;
    private String r_date;
    private String dept_port;
    private String end_port;
    private String set_cost;
    public void setID(String c_id)
    {
        this.c_id=c_id;
    }
    public String getID()
    {
        return c_id;
    }
    public void setName(String c_name)
    {
        this.c_name=c_name;
    }
    public String getName()
    {
        return c_name;
    }
    public void setDate(String s_date)
    {
        this.s_date=s_date;
    }
    public String getDate()
    {
        return s_date;
    }
    public void setrDate(String r_date)
    {
        this.r_date=r_date;
    }
    public String getrDate()
    {
        return r_date;
    }
    public void setDPort(String dept_port)
    {
        this.dept_port=dept_port;
    }
    public String getDPort()
    {
        return dept_port;
    }
    public void setEPort(String end_port)
    {
        this.end_port=end_port;
    }
    public String getEPort()
    {
        return end_port;
    }
    public void setCost (String set_cost)
    {
        this.set_cost=set_cost;
    }
    public String getCost()
    {
        return set_cost;
    }
}
