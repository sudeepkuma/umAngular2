/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) Feb 23, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.comparator;

/**
 * ????
 *
 * @version $Id:$
 * @author himtiwar (c) Feb 23, 2015, Sogeti B.V.
 */
import java.io.Serializable;
import java.util.Comparator;

import nl.sogeti.com.domain.SelectListItem;

public class SelectListItemComparator implements Serializable,Comparator<SelectListItem>
{
  

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -8120010420312625085L;

   public SelectListItemComparator()
   {
   }

   public int compare(SelectListItem arg0, SelectListItem arg1)
   {
      return arg0.getSelectList().getListCode().compareTo(arg1.getSelectList().getListCode());
   }

  
}
