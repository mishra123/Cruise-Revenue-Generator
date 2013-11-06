/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaide.cruise;

/**
 * this class gets the values from the GUI and sets those values into the database.
 * @author Nghia H. Nguyen
 */
public class PassengerForm 
{
    private String c_id;
    private String p_id;
    private String p_name;
    private String add;
    private String nation;
    private String dob;
    private String c_sailed;
    public void setCID(String c_id)
    {
        this.c_id=c_id;
    }
    public String getCID()
    {
        return c_id;
    }
    public void setID(String p_id)
    {
        this.p_id=p_id;
    }
    public String getID()
    {
        return p_id;
    }
    public void setName(String p_name)
    {
        this.p_name=p_name;
    }
    public String getName()
    {
        return p_name;
    }
    public void setAdd(String add)
    {
        this.add=add;
    }
    public String getAdd()
    {
        return add;
    }
    public void setNation(String nation)
    {
        this.nation=nation;
    }
    public String getNation()
    {
        return nation;
    }
    public void setDOB(String dob)
    {
        this.dob=dob;
    }
    public String getDOB()
    {
        return dob;
    }
    public void setSailed(String c_sailed)
    {
        this.c_sailed=c_sailed;
    }
    public String getSailed()
    {
        return c_sailed;
    }
    
}
