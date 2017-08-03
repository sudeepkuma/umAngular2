package nl.sogeti.com.util;

/**
 * Thrown whenever a fatal error occurs in a Reader, causing the data to be unusable
 * 
 * @author Jasper (c) 20 feb. 2013, Sogeti B.V.
 * @version $Id:$
 */
public class ReaderException extends Exception
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -621916167270924972L;

   public ReaderException(String s)
   {
      super(s);
   }

   public ReaderException(Exception e)
   {
      super(e);
   }

}
