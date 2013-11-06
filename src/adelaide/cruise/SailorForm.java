/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaide.cruise;

/**
 * this class gets the values from the GUI and sets those values into the database.
 * @author Sonali Tharwani
 */
public class SailorForm
{
    private String c_id;
    private String s_id;
    private String s_name;
    private String dob;
    private String nation;
    private String s_visor;
    private String super_name;
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
    public void setDOB(String dob)
    {
        this.dob=dob;
    }
    public String getDOB()
    {
        return dob;
    }
    public void setNation(String nation)
    {
        this.nation=nation;
    }
    public String getNation()
    {
        return nation;
    }
    public void setSupervisor(String s_visor)
    {
        this.s_visor=s_visor;
    }
    public String getSupervisor()
    {
        return s_visor;
    }
    public void setSuperName(String super_name)
    {
        this.super_name=super_name;
    }
    public String getSuperName()
    {
        return super_name;
    }
    
    {
        
    }
     
}
