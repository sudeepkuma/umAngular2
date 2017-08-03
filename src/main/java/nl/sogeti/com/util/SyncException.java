package nl.sogeti.com.util;

/**
 * This exception is thrown whenever an error occurred during the synchronization with the database.
 * 
 * @author Jasper (c) 26 feb. 2013, Sogeti B.V.
 * @version $Id:$
 */
public class SyncException extends Exception
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -5242165738316179097L;

   public SyncException(String s)
   {
      super(s);
   }

   public SyncException(Exception e)
   {
      super(e);
   }
}
