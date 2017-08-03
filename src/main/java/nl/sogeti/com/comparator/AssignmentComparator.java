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

import nl.sogeti.com.domain.Assignment;

/**
 * TODO: Have {@link Assignment} implement {@link Comparable<Assignment>} and remove this class TODO: This class doesn't even compare based on the actual dates and i dont feel like adding atm.
 * 
 * @author sogeti (c) 25 jun. 2014, Sogeti B.V.
 * @version $Id:$
 */
@SuppressWarnings("serial")
public class AssignmentComparator implements Comparator<Assignment>, Serializable
{

   /*
    * (non-Javadoc)
    * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
    */
   @Override
   public int compare(Assignment one, Assignment other)
   {
      Integer comp = 0;

      comp = InnerCompare.innerCompare(one, other);
      if (comp != null)
      {
         return comp;
      }

      comp = InnerCompare.innerCompare(one.getEnd(), other.getEnd());
      if (comp != null && comp != 0)
      {
         return comp;
      }

      comp = InnerCompare.innerCompare(one.getStart(), other.getStart());
      if (comp != null && comp != 0)
      {
         return comp;
      }
      return Long.compare(one.getId(), other.getId());
   }
}
