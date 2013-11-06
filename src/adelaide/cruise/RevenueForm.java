/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaide.cruise;

/**
 *
 * @author pgomes
 */
public class RevenueForm {
    private String count;
    private String tt;
    
    public void setCount(String count)
    {
        this.count=count; 
    }
    
    public String getCount()
    {
        return count;
    }
    public void setTotal(String tt)
    {
        this.tt=tt;
    }
    public String getTotal()
    {
        return tt;
    }
}
