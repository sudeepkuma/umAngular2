/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Nov 24, 2014 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.comparator;

import java.io.Serializable;
import java.util.Comparator;

import nl.sogeti.com.domain.Conversation;

/**
 * The Class ConversationComparator.
 */
public class ConversationComparator implements Comparator<Conversation>, Serializable
{

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = -8281082027841945211L;

   /*
    * (non-Javadoc)
    * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
    */
   @Override
   public int compare(Conversation one, Conversation other)
   {
      Integer comp = 0;

      comp = InnerCompare.innerCompare(one, other);
      if (comp != null)
      {
         return comp;
      }

      comp = InnerCompare.innerCompare(one.getDate(), other.getDate());
      if (comp != null)
      {
         return comp;
      }

      return other.getDate().compareTo(one.getDate());
   }

}
