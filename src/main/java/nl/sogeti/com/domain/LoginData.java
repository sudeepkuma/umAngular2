package nl.sogeti.com.domain;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The Class LoginData to store session data.
 */
@Entity
@Table(name = "logindata")
@AttributeOverride(name = "id", column = @Column(name = "logindata_id"))
public class LoginData extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -6946386695200329999L;

   /** The name. */
   private String name;

   /** The sessionid. */
   private String sessionid;

   /** The logindate. */
   @Temporal(TemporalType.TIMESTAMP)
   private Date logindate;

   /** The logouttime. */
   @Temporal(TemporalType.TIMESTAMP)
   private Date logouttime;

   /** The totaltime. */
   private String totaltime;
   
   private long loginattempts;

   /**
    * Gets the name.
    * 
    * @return the name
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Sets the name.
    * 
    * @param name the new name
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * Gets the sessionid.
    * 
    * @return the sessionid
    */
   public String getSessionid()
   {
      return this.sessionid;
   }

   /**
    * Sets the sessionid.
    * 
    * @param sessionid the new sessionid
    */
   public void setSessionid(String sessionid)
   {
      this.sessionid = sessionid;
   }

   /**
    * Gets the logindate.
    * 
    * @return the logindate
    */
   public Date getLogindate()
   {
      return this.logindate;
   }

   /**
    * Sets the logindate.
    * 
    * @param logindate the new logindate
    */
   public void setLogindate(Date logindate)
   {
      this.logindate = logindate;
   }

   /**
    * Gets the logouttime.
    * 
    * @return the logouttime
    */
   public Date getLogouttime()
   {
      return this.logouttime;
   }

   /**
    * Sets the logouttime.
    * 
    * @param logouttime the new logouttime
    */
   public void setLogouttime(Date logouttime)
   {
      this.logouttime = logouttime;
   }

   /**
    * Gets the totaltime.
    * 
    * @return the totaltime
    */
   public String getTotaltime()
   {
      return this.totaltime;
   }

   /**
    * Sets the totaltime.
    * 
    * @param totaltime the new totaltime
    */
   public void setTotaltime(String totaltime)
   {
      this.totaltime = totaltime;
   }

   /**
    * Get the loginattempts.
    *
    * @return Returns the loginattempts as a long.
    */
   public long getLoginattempts()
   {
      return loginattempts;
   }

   /**
    * Set the loginattempts to the specified value.
    *
    * @param loginattempts The loginattempts to set.
    */
   public void setLoginattempts(long loginattempts)
   {
      this.loginattempts = loginattempts;
   }

}
