/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaide.cruise;

/**
 * this class gets the values from the GUI and sets those values into the database.
 * @author Anoop Mishra
 */
public class ShipForm
{
    private String c_id;
    private String s_id;
    private String s_name;
    private String s_weight;
    private String year;
    private String p_capacity;
    public void setCID(String c_id)
    {
        this.c_id=c_id;
    }
    public String getCID()
    {
        return c_id;
    }
    public void setID(String s_id)
    {
        this.s_id=s_id;
    }
    public String getID()
    {
        return s_id;
    }
    public void setName(String s_name)
    {
        this.s_name=s_name;
    }
    public String getName()
    {
        return s_name;
    }
    public void setWeight(String s_weight)
    {
        this.s_weight=s_weight;
    }
    public String getWeight()
    {
        return s_weight;
    }
    public void setYear(String year)
    {
        this.year=year;
    }
    public String getYear()
    {
        return year;
    }
    public void setCapacity(String p_capacity)
    {
        this.p_capacity=p_capacity;
    }
    public String getCapacity()
    {
        return p_capacity;
    }
   
}
