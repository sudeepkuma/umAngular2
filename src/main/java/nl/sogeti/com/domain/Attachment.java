/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Apr 15, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

/**
 * The Class Attachment.
 * 
 * @author mkangule (c) Apr 15, 2015, Sogeti B.V.
 * @version $Id:$
 */
public class Attachment
{

   /** The name. */
   private final String name;

   /** The content. */
   private final byte[] content;

   /**
    * Instantiates a new attachment.
    * 
    * @param name the name
    * @param content the content
    */
   public Attachment(String name, byte[] content)
   {
      this.name = name;
      this.content = content.clone();
   }

   /**
    * Gets the name.
    * 
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * Gets the content.
    * 
    * @return the content
    */
   public byte[] getContent()
   {
      return content;
   }

}
